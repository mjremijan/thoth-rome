package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class OrionTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/orion.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Tue Apr 26 16:48:24 CDT 2016", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "https://blogs.nasa.gov/orion/?p=819", entry.getId());

        // title
        Assert.assertEquals(
            "Orion Team Makes Headway Stateside and Abroad", entry.getTitle());

        // link
        Assert.assertEquals(
            "https://blogs.nasa.gov/orion/2016/04/26/orion-team-makes-headway-stateside-and-abroad/", entry.getLink());

        // description
        Assert.assertEquals(
            "<figure id=\"attachment_821\" style=\"width: 900px\" class=\"wp-caption alignnone\"><img class=\"size-full wp-image-821\" src=\"https://blogs.nasa.gov/orion/wp-content/uploads/sites/239/2016/04/orion_combo.jpg\" alt=\"The Orion Crew Module and Service Module\" width=\"900\" height=\"506\" srcset=\"https://blogs.nasa.gov/orion/wp-content/uploads/sites/239/2016/04/orion_combo.jpg 900w, https://blogs.nasa.gov/orion/wp-content/uploads/sites/239/2016/04/orion_combo-300x169.jpg 300w, https://blogs.nasa.gov/orion/wp-content/uploads/sites/239/2016/04/orion_combo-480x270.jpg 480w, https://blogs.nasa.gov/orion/wp-content/uploads/sites/239/2016/04/orion_combo-624x351.jpg 624w\" sizes=\"(max-width: 709px) 85vw, (max-width: 909px) 67vw, (max-width: 1362px) 62vw, 840px\" /><figcaption class=\"wp-caption-text\">The Orion crew module is hoisted above a test fixture at Kennedy Space Center in Florida (left); the service module flight model for Exploration Mission-1 arrives in Germany.</figcaption></figure>\n" +
"<p>Engineers building spacecraft are used to a bit of pressure, but the team assembling and testing Orion at locations across the United States and abroad are preparing for the kind of pressure they like.</p>\n" +
"<p>In the Neil Armstrong Operations &#38; Checkout Building at NASA’s Kennedy Space Center in Florida, where Orion’s crew module is being assembled, a team from NASA and Lockheed Martin is getting ready for Orion’s proof pressure testing, an evaluation that will help verify the structural integrity of Orion’s underlying structure known as the pressure vessel. The work is an important milestone on Orion’s journey toward its mission beyond the moon atop the Space Launch System rocket in 2018. Last week, the team <a href=\"https://www.flickr.com/photos/nasakennedy/albums/72157664052441771\">moved it to a new testing structure</a> in advance of the evaluation.</p>\n" +
"<p>At NASA Glenn’s Plum Brook Station in Ohio, engineers started testing a structural representation of the service module <a href=\"https://www.nasa.gov/image-feature/nasa-blasts-orion-service-module-with-giant-horns\">with sound pressure and vibration</a> to make sure the component, which powers, propels, cools and provides consumables like air and water in space for Orion, can withstand the noise and shaking of launch. Meanwhile, at Langley Research Center in Hampton, Virginia, engineers are already in the thick of a series of tests that began earlier this month where a representative Orion crew capsule with <a href=\"https://www.nasa.gov/feature/langley/test-dummies-to-help-assess-crew-safety-in-orion\">crash test dummies</a> inside is dropped in Langley’s Hydro Impact Basin to understand what the spacecraft and astronauts may experience when landing in the Pacific Ocean after deep-space missions. Langley engineers have already completed three tests in the series and will next add spacesuits and helmets to the test dummies inside to gather more data.</p>\n" +
"<p>While the stateside team continues to put the crew module through its technical paces, the European team manufacturing Orion’s service module has also been making progress. This week the first flight module of the Orion service module, provided by ESA (European Space Agency), was delivered by Thales Alenia Space to the Airbus Defence and Space, which is building it, to its location in Bremen, Germany. There, elements of the service module will be integrated before it’s shipped to Florida for integration with the rest of the Orion spacecraft early next year.</p>\n" +
""
            , entry.getContents()
        );
    }
}
