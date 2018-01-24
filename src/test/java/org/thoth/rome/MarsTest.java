package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class MarsTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/mars.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Thu Jan 18 09:08:22 CST 2018", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "https://www.sciencedaily.com/releases/2018/01/180118100822.htm", entry.getId());

        // title
        Assert.assertEquals(
            "New technique for finding life on Mars", entry.getTitle());

        // link
        Assert.assertEquals(
            "http://feeds.sciencedaily.com/~r/sciencedaily/space_time/mars/~3/Xu09kDtAb2E/180118100822.htm", entry.getLink());

        // description
        Assert.assertEquals(
            "Miniaturized scientific instruments and new microbiology techniques successfully identified and characterized microorganisms living in Arctic permafrost -- one of the closest analogs to Mars on Earth. By avoiding delays that come with having to return samples to a laboratory for analysis, the methodology could also be used on Earth to detect and identify pathogens during epidemics in remote areas.<img src=\"http://feeds.feedburner.com/~r/sciencedaily/space_time/mars/~4/Xu09kDtAb2E\" height=\"1\" width=\"1\" alt=\"\"/>"
            , entry.getContents()
        );
    }
}
