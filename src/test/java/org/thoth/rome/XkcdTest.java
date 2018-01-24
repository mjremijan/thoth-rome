package org.thoth.rome;

import java.io.File;
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
}
