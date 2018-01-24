package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class FbrssTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/fbrss.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Wed Jan 24 11:34:04 CST 2018", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "323163431045395_1924315434263512", entry.getId());

        // title
        Assert.assertEquals(
            "Photo - “more importantly, you said employee of the month....where does my picture go?”    So here you go Brian Phillips!", entry.getTitle());

        // link
        Assert.assertEquals(
            "https://www.facebook.com/Bikesurgeon/photos/a.685380711490330.1073741828.323163431045395/1924314594263596/?type=3", entry.getLink());

        // description
        Assert.assertEquals(
            "<a href=\"https://www.facebook.com/Bikesurgeon/photos/a.685380711490330.1073741828.323163431045395/1924314594263596/?type=3\"><img height=\"130\" src=\"https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/27066792_1924314594263596_6412823230527962362_n.jpg?oh=9cd3e9a6fbc7aab251306e76013893e2&oe=5AF2D9F1\"></a><br><br>“more importantly, you said employee of the month....where does my picture go?”    So here you go Brian Phillips!"
            , entry.getContents()
        );
    }
}
