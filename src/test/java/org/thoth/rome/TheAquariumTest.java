package org.thoth.rome;

import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class TheAquariumTest {

    @Test
    public void testMe() throws Exception {

        RssItemRepository repository
            = new RssItemRepository(new File("src/test/resources/the_aquarium.xml"));

        RssItem entry = repository.findFirst();

        // link
        Assert.assertEquals(
            "https://blogs.oracle.com/theaquarium/compendium/rss", repository.getFeed().getLink());

        // publication date
        Assert.assertEquals(
            "Thu Sep 28 19:30:00 CDT 2017", String.valueOf(entry.getPublicationDate()));
           //Fri, 29 Sep 2017 00:30:00 +0000

        //UTC zone id
        ZoneId utcZoneId = ZoneId.of("UTC");

        //1. Convert Date -> Instant
        Instant publicationInstant = entry.getPublicationDate().toInstant();
        System.out.println(publicationInstant.toString());

        //2. datetime
        ZonedDateTime publicationZonedDateTime = publicationInstant.atZone(utcZoneId);
        System.out.println(publicationZonedDateTime.toString());

        //3. localdate
        LocalDate publicationLocalDate = publicationInstant.atZone(utcZoneId).toLocalDate();
        System.out.println(publicationLocalDate.toString());

        Instant now = Instant.now();
        System.out.printf("NOW: %s%n", now.toString());

        // guid
        Assert.assertEquals(
            "https://blogs.oracle.com/theaquarium/ee4j-eclipse-enterprise-for-java", entry.getId());

        // title
        Assert.assertEquals(
            "EE4J - Eclipse Enterprise for Java", entry.getTitle());

        // link
        Assert.assertEquals(
            "https://blogs.oracle.com/theaquarium/ee4j-eclipse-enterprise-for-java", entry.getLink());

        // description
        Assert.assertEquals(
            "<p>A lot of progress has been made since we have announced, 2 weeks ago, <a href=\"https://blogs.oracle.com/theaquarium/opening-up-ee-update\">our intent to move the Java EE development to the Eclipse Foundation</a>. Today, we are thrilled to announce EE4J (Eclipse Enterprise for Java), a new top level Eclipse project that will host this initiative.</p>\n" +
"\n" +
"<p>We are just at the beginning of this effort. Oracle, IBM, Red Hat and the Eclipse Foundation are actively collaborating to move as quickly as possible despite all the tasks that need to be tackled. We also plan to rapidly engage additional community members to help us. And as Mike Milinkovich (Eclipse) says in his <a href=\"https://mmilinkov.wordpress.com/2017/09/28/introducing-ee4j\">announcement</a>&nbsp;&quot;<em>it is a massive but exciting undertaking</em>&quot;!&nbsp;</p>\n" +
"\n" +
"<p>We are working on a FAQ that should be published soon. In the meantime, please read the <a href=\"https://projects.eclipse.org/projects/ee4j/charter\">EE4J draft charter</a>. You are also encouraged to participate in the <a href=\"https://dev.eclipse.org/mailman/listinfo/ee4j-community\">ee4j-community</a>&nbsp;discussions.</p>\n" +
"            "
            , entry.getContents()
        );
    }
}
