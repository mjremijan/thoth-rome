package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class WebbFeaturesTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/webb_features.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Wed Jan 10 11:09:00 CST 2018", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "http://www.nasa.gov/feature/goddard/2018/webb-telescope-s-houston-highlights", entry.getId());

        // title
        Assert.assertEquals(
            "Webb Telescope’s Houston Highlights", entry.getTitle());

        // link
        Assert.assertEquals(
            "http://www.nasa.gov/feature/goddard/2018/webb-telescope-s-houston-highlights", entry.getLink());

        // description
        Assert.assertEquals(
            "With NASA’s James Webb Space Telescope’s approximately nine-month stay in Texas coming to an end, now is a good time to reflect on the memories it made in the Lone Star State."
            , entry.getContents()
        );
    }
}
