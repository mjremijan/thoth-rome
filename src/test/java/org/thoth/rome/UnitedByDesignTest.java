package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class UnitedByDesignTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/united_by_design.xml")
        ).findFirst();

        // feed
        Assert.assertEquals(
            "FB-RSS feed for United By Design", entry.getFeed());

        // author
        Assert.assertEquals(
            "FBRSS.com", entry.getAuthor());

    }
}
