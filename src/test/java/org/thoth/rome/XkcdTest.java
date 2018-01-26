package org.thoth.rome;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class XkcdTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/xkcd.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Sun Jan 21 23:00:00 CST 2018", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "https://xkcd.com/1945/", entry.getId());

        // title
        Assert.assertEquals(
            "Scientific Paper Graph Quality", entry.getTitle());

        // link
        Assert.assertEquals(
            "https://xkcd.com/1945/", entry.getLink());

        // description
        Assert.assertEquals(
            "<img src=\"https://imgs.xkcd.com/comics/scientific_paper_graph_quality.png\" title=\"The worst are graphs with qualitative, vaguely-labeled axes and very little actual data.\" alt=\"The worst are graphs with qualitative, vaguely-labeled axes and very little actual data.\" />"
            , entry.getContents()
        );
    }


    @Test
    public void test_can_items_be_removed() throws Exception {

        SyndFeed feed = new RssItemRepository(
            new File("src/test/resources/xkcd.xml")
        ).getFeed();

        List<SyndEntry> entries
            = feed.getEntries();

        Assert.assertEquals(4, entries.size());
        Assert.assertEquals("java.util.ArrayList", entries.getClass().getName());

        ListIterator<SyndEntry> iter
            = entries.listIterator();

        while (iter.hasNext()) {
            SyndEntry entry = iter.next(); // need this for remove() to work
            iter.remove();
        }

        entries
            = feed.getEntries();

        Assert.assertEquals(0, entries.size());
    }
}
