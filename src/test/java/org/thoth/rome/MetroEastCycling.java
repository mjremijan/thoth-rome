package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class MetroEastCycling {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/metro_east_cycling.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Mon Oct 02 12:51:49 CDT 2017", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "http://metroeastcyclin.proboards.com/thread/1401/october-2-2017-3221", entry.getId());

        // title
        Assert.assertEquals(
            "October 2, 2017", entry.getTitle());

        // link
        Assert.assertEquals(
            "http://metroeastcyclin.proboards.com/thread/1401/october-2-2017", entry.getLink());

        // description
        Assert.assertEquals(
            "Last reply by Steve Rhodes on Mon, 02 Oct 2017 17:51:49 +0000"
            , entry.getContents()
        );

    }
}
