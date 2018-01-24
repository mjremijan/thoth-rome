package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class KeplerTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/kepler.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Thu Jan 11 15:42:00 CST 2018", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "http://www.nasa.gov/feature/jpl/multi-planet-system-found-through-crowdsourcing", entry.getId());

        // title
        Assert.assertEquals(
            "Multi-planet System Found Through Crowdsourcing", entry.getTitle());

        // link
        Assert.assertEquals(
            "http://www.nasa.gov/feature/jpl/multi-planet-system-found-through-crowdsourcing", entry.getLink());

        // description
        Assert.assertEquals(
            "A system of at least five exoplanets has been discovered by citizen scientists through a project called Exoplanet Explorers."
            , entry.getContents()
        );
    }
}
