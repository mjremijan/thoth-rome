package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class PlutoTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/pluto.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Wed Dec 06 09:31:47 CST 2017", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "https://blogs.nasa.gov/pluto/?p=574", entry.getId());

        // title
        Assert.assertEquals(
            "The PI’s Perspective: Wrapping up 2017 En Route to Our Next Flyby", entry.getTitle());

        // link
        Assert.assertEquals(
            "https://blogs.nasa.gov/pluto/2017/12/06/the-pis-perspective-wrapping-up-2017-en-route-to-our-next-flyby/", entry.getLink());

        // description
        Assert.assertEquals(
            "<figure id=\"attachment_578\" style=\"width: 840px\" class=\"wp-caption aligncenter\"><a href=\"https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/nh_MU69.png\"><img class=\"size-large wp-image-578\" src=\"https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/nh_MU69-1024x438.png\" alt=\"2019 New Horizons Close Flyby of a KBO\" width=\"840\" height=\"359\" srcset=\"https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/nh_MU69-1024x438.png 1024w, https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/nh_MU69-300x128.png 300w, https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/nh_MU69-1200x513.png 1200w\" sizes=\"(max-width: 709px) 85vw, (max-width: 909px) 67vw, (max-width: 1362px) 62vw, 840px\" /></a><figcaption class=\"wp-caption-text\">New Horizons will fly by its next exploration target, a distant Kuiper Belt object called 2014 MU69, on Jan. 1, 2019. Credit: Roman Tkachenko</figcaption></figure>\n" +
"<p>New Horizons is in good health and cruising closer each day to its next encounter: a flyby of the Kuiper Belt object (KBO) 2014 MU69 (or “MU69” for short). If you follow our mission, you likely know that flyby will occur on New Year’s Eve and New Year’s Day 2019, which is just barely over a year from now!</p>\n" +
"<p>As I write this, New Horizons is wrapping up an active period that began when the spacecraft emerged from hibernation mode in September. But soon, on Dec. 21, we’ll put the spacecraft back in hibernation, where it will remain until June 4, 2018. After June 4 the spacecraft will stay “awake” until late in 2020, long after the MU69 flyby, when all of the data from that flyby have reached Earth.</p>\n" +
"<p>But before we put New Horizons into hibernation this month, we have some important work ahead. We’ll observe five more KBOs with the onboard LORRI telescope/imager to learn about their surface properties, satellite systems and rotation periods. This work is part of a larger set of observations of 25-35 Kuiper Belt objects from 2016 to 2020 on this extended mission. Learning about these KBOs from close range and at angles that we cannot observe from Earth makes will give us key context for the more detailed studies we’ll make of MU69 from a thousand times closer than we can study any other KBO. In addition to that LORRI imaging of these objects, we’re continuing our nearly round-the-clock observations of the charged particle and dust environment of the Kuiper Belt—both before and while New Horizons hibernates.</p>\n" +
"<p>Also right ahead is a 2.5-minute engine burn planned for Dec. 9 (yes, a Saturday). This maneuver will both refine our course and optimize our flyby arrival time at MU69, by setting closest approach to 5:33 Universal Time (12:33 a.m. Eastern Standard Time) on Jan. 1, 2019. Flying by at that time provides better visibility by the antennas of NASA’s Deep Space Network, which will attempt to reflect radar waves off the surface of MU69 for New Horizons to receive. If it succeeds, that difficult experiment will help us determine the surface reflectivity and roughness of MU69 at radar wavelengths—something that has been successfully applied to study asteroids, comets, planetary satellites and even some planets, including Pluto, which New Horizons observed the same way in 2015.</p>\n" +
"<p>Our Pluto observation set a record for the most distant object ever studied with radar —shattering the previous record by over 300 percent! If our radar experiment is successful on the much-smaller MU69 (which is perhaps 30 kilometers [19 miles] in diameter—tiny compared to Pluto’s almost 2,400-kilometer [1,480-mile] diameter), then we’ll break our own record, something unlikely to be surpassed for decades.</p>\n" +
"<p>Since hibernating, New Horizons requires less attention from mission control than when we’re in active operations. This will allow our mission team to focus fully on planning the detailed sequences that will tell New Horizons how to make every scientific observation of MU69 during its close-range pass in the days surrounding Jan. 1, 2019.</p>\n" +
"<figure id=\"attachment_577\" style=\"width: 840px\" class=\"wp-caption aligncenter\"><a href=\"https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/MU69Meeting.jpg\"><img class=\"size-large wp-image-577\" src=\"https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/MU69Meeting-1024x425.jpg\" alt=\"People at the MU69 flyby planning meeting.\" width=\"840\" height=\"349\" srcset=\"https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/MU69Meeting-1024x425.jpg 1024w, https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/MU69Meeting-300x125.jpg 300w, https://blogs.nasa.gov/pluto/wp-content/uploads/sites/253/2017/12/MU69Meeting-1200x499.jpg 1200w\" sizes=\"(max-width: 709px) 85vw, (max-width: 909px) 67vw, (max-width: 1362px) 62vw, 840px\" /></a><figcaption class=\"wp-caption-text\">MU69 flyby planning meetings, like this small one recently held in at Southwest Research Institute in Boulder, Colorado, are well under way. Credit: Alan Stern/SwRI</figcaption></figure>\n" +
"<p>The year ahead will also include many observations of other KBOs, more study of the Sun’s heliosphere with our dust and plasma instruments &#8212; SDC, PEPSSI, and SWAP, and our Alice ultraviolet spectrometer &#8212; as well as all the remaining flyby planning for MU69.</p>\n" +
"<p>MU69 flyby operations will begin with distant navigation imaging to help us accurately home in on our target; that work will start in late August or September and will continue until literally 48 hours before flyby. Our navigation teams at KinetX and NASA’s Jet Propulsion Lab JPL will use those navigation images to compute the engine burns to further refine our course toward our planned closest approach point just 3,500 kilometers, or about 2,175 miles, from MU69. That’s more than three times as close as we flew by Pluto, which should make for spectacular MU69 images and other data!</p>\n" +
"<p>Additionally, beginning in the final weeks of 2018, we’ll search for moons or dust structures around MU69 that could harm New Horizons if we were to collide with them during our 32,000-miles-per-hour flyby. If hazards that threaten the spacecraft are found, we can burn our engines to divert to a farther flyby, with a closest approach of 10,000 kilometers (about 6,200 miles), which should be safer.</p>\n" +
"<p>Well, that’s my update for now. For more mission news, stay tuned to NASA websites, our own project website, and our social media channels, which are listed below so you can bookmark them.</p>\n" +
"<p>I’ll write again early next year. Until then, I hope you have a safe and productive finish to 2017, a happy new year, and that you’ll keep on exploring—just as we do!</p>\n" +
"<p><em>-Alan Stern</em></p>\n" +
"<p>There are many ways to follow New Horizons news and commentary on social media! You can find others by searching on the Web.<br />\n" +
"• <a href=\"https://www.nasa.gov/mission_pages/newhorizons/main/index.html\">NASA&#8217;s New Horizons website</a><br />\n" +
"• <a href=\"http://pluto.jhuapl.edu\">New Horizons mission website</a><br />\n" +
"• NASA <a href=\"https://twitter.com/NASANewHorizons\">New Horizons on Twitter</a><br />\n" +
"• <a href=\"https://twitter.com/newhorizons2015\">PI Alan Stern on Twitter</a><br />\n" +
"• <a href=\"https://www.facebook.com/new.horizons1\">New Horizons on Facebook</a><br />\n" +
"• <a href=\"http://pluto.jhuapl.edu/News-Center/Subscribe/index.php\">New Horizons E-News signup</a></p>\n" +
""
            , entry.getContents()
        );
    }
}
