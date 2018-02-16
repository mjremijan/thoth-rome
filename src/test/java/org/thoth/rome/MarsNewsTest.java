package org.thoth.rome;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import java.io.File;
import org.jdom2.Element;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class MarsNewsTest {

    @Test
    public void testMe() throws Exception {

        SyndFeedInput input
            = new SyndFeedInput();

        XmlReader reader
            = new XmlReader(new File("src/test/resources/mars_news.xml"));

        SyndFeed feed
            = input.build(reader);

        SyndEntry entry
            = feed.getEntries().stream().findFirst().get();

        Assert.assertEquals("Did surface life evolve on Mars? Newly published research casts increased doubt", entry.getTitle());

        System.out.printf("%s %n", entry);

        Element element
            = entry.getForeignMarkup().stream().findFirst().get();

        System.out.printf("%s %n", element);

        Assert.assertEquals(
            "thumbnail"
            , element.getName()
        );

        Assert.assertEquals(
            "https://www.sciencedaily.com/images/2018/02/180206100338-large.jpg"
            , element.getAttribute("url").getValue()
        );
    }

}
