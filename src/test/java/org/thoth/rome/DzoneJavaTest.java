package org.thoth.rome;

import com.rometools.rome.feed.synd.SyndFeed;
import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class DzoneJavaTest {

    @Test
    public void testTwo() throws Exception {

        SyndFeed feed = new RssItemRepository(new File("src/test/resources/dzone_java.xml")).getFeed();
        Assert.assertEquals(
            "https://dzone.com/java-jdk-development-tutorials-tools-news"
            ,feed.getLink()
        );

    }
    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/dzone_java.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Wed Jan 24 11:01:01 CST 2018", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "https://dzone.com/articles/1997003", entry.getId());

        // title
        Assert.assertEquals(
            "This Week in Spring: AWS, Cloud Native, and Spring Boot 2", entry.getTitle());

        // link
        Assert.assertEquals(
            "https://dzone.com/articles/this-week-in-spring-january-23rd-2018?utm_medium=feed&utm_source=feedpress.me&utm_campaign=Feed%3A+dzone%2Fjava", entry.getLink());

        // description
        Assert.assertEquals(
            "<p pid=\"1\">Hi, Spring fans! Welcome to another installment of <em>This Week In Spring</em>. This week I’m in Los Angeles (warm!) talking to customers and then it’s off to Chicago (not warm!). There’s so much good stuff to cover this week so let’s get to it!</p>\n" +
"<ul>\n" +
" <li>In PCF 2.0, the application runtime is now joined by an enterprise-grade Kubernetes service, called Pivotal Container Service, and a new Functions-as-a-Service offering, Pivotal Function Service. <a href=\"https://content.pivotal.io/podcasts/pcf-2-0-brings-kubernetes-functions-to-the-pivotal-platform-ep-54?_lrsc=8640ca61-b02e-473e-8be9-a376c2d951ed\" target=\"_blank\">Pivotal’s Jared Ruckle joins Jeff and Dormain for a look at PCF 2.0 in this new podcast</a></li>\n" +
" <li><a href=\"https://github.com/spring-cloud/spring-cloud-sleuth#distributed-tracing-with-brave\" target=\"_blank\">Spring Cloud Sleuth now integrates with Brave</a> and it’s an exciting time for distributed tracing.</li>\n" +
" <li>Spring Cloud Vault lead Mark Paluch <a href=\"https://github.com/spring-projects/spring-vault/commit/28ff17d4f8cbd09114bb9f2a841ac51aa24402bc\" target=\"_blank\">has integrated Spring Security with Spring Cloud Vault</a></li>\n" +
" <li>It’s been a busy week for the Spring Cloud Sleuth team! This commit makes <a href=\"https://github.com/spring-cloud/spring-cloud-sleuth/commit/22d91bac247e8273fa93ffe05f50179182425f72\" target=\"_blank\">Spring Cloud Sleuth OpenTracing-compatible</a></li>\n" +
" <li>Support for <a href=\"https://github.com/micrometer-metrics/micrometer/pull/228\" target=\"_blank\">integrating Micrometer (think SLF4J, but for metrics) with Jersey 2 (a JAX-RS implementation) has just landed</a>!</li>\n" +
" <li>The <a href=\"https://github.com/awslabs/aws-serverless-java-container/releases/tag/aws-serverless-java-container-0.9\" target=\"_blank\">new release of AWS’ Java container for serverless</a> supports activation <a href=\"https://github.com/awslabs/aws-serverless-java-container/issues/88\" target=\"_blank\">of Spring profiles</a>. Anyway, this is cool. But use <a href=\"https://github.com/spring-cloud/spring-cloud-function/tree/master/spring-cloud-function-adapters/spring-cloud-function-adapter-aws\" target=\"_blank\">Spring Cloud Function and the AWS adapter</a>; it’s a cleaner integration.</li>\n" +
" <li>The Spring Boot support for VS Code <a href=\"https://twitter.com/azurefriday/status/955593853888733184?ref_src=twcamp%5Eshare%7Ctwsrc%5Eios%7Ctwgr%5Ecom.blork.Pinner.AddBookmarkExtension\" target=\"_blank\">features in this week’s installment of “Azure Fridays”</a></li>\n" +
" <li>This is <a href=\"http://techprehension.com/2018/01/21/10-must-read-books-for-every-micro-services-and-cloud-native-professional/\" target=\"_blank\">an interesting list of ten books people building microservices and cloud native applications should read</a>. I’m pleased that the book, <em>Cloud Native Java</em>, is in the list.</li>\n" +
" <li>Paweł Urban has a nice post on how <a href=\"https://medium.com/@urbanpawel/receive-spring-boot-exception-alerts-via-email-using-logstash-c29b83368275\" target=\"_blank\">to receive Spring Boot error alerts by email with Logstash</a></li>\n" +
" <li>Spring Boot lead Phillip Webb <a href=\"https://twitter.com/springcentral/status/955516012383813632\" target=\"_blank\">tweeted on the exciting progress of Spring Boot 2.0 so far</a>: There have been 17 weeks of work, 6099 commits, and 1153 issues closed! WOW!</li>\n" +
" <li>This is a great look at <a href=\"https://javax0.wordpress.com/2018/01/10/java-9-module-services/\" target=\"_blank\">Java’s service loader mechanism</a>, and in particular, it looks at how the service loader mechanism in Java 9 modules works. It also looks, incidentally, at how Spring itself does component scanning on the classpath.</li>\n" +
" <li>Spring Test lead and JUnit project lead Sam Brannen <a href=\"http://junit.org/junit5/docs/snapshot/user-guide/#extensions-registration-programmatic\" target=\"_blank\">has just debuted support for programmatic extension registration via @RegisterExtension in the upcoming #JUnit 5.1 release</a>! This bodes well for future integrations in Spring projects like Spring REST Docs. JUnit 5 is an exciting horizon for application developers. Learn more about it <a href=\"https://www.youtube.com/watch?time_continue=1&amp;v=-mIrA5cVfZ4\" target=\"_blank\">by watching Sam’s JavaOne 2017 talk</a>.</li>\n" +
" <li>This isn’t specifically to do with Spring, itself, <a href=\"https://marxsoftware.blogspot.de/2018/01/schopenhauers-law-immutability.html?m=1\" target=\"_blank\">but it’s an interesting look at the differences between immutable and unmodifiable in the upcoming JDK 10</a>. Check it out!</li>\n" +
" <li><a href=\"https://blog.takipi.com/pivotal-cloud-foundry-vs-kubernetes-choosing-the-right-cloud-native-application-deployment-platform/?_lrsc=a9da2d09-785e-40fd-bb30-d5762c6c5848\" target=\"_blank\">This is an oldie-but-a-goodie</a>: it looks at when to choose Pivotal Cloud Foundry, Kubernetes, or both.</li>\n" +
" <li>Richard Seroter and Jeff Hammond’s SpringOne Platform 2017 talk <a href=\"https://www.infoq.com/presentations/pcf-2-future\" target=\"_blank\">introducing Pivotal Cloud Foundry 2.0 is now up on InfoQ</a></li>\n" +
" <li>The Spring Data team has contributed a <a href=\"https://github.com/buschmais/jqa-spring-plugin/pull/15\" target=\"_blank\">lot of small improvements to the JQAssistant project plugin for Spring</a>. <a href=\"https://jqassistant.org/\" target=\"_blank\">JQAssistant</a> supports scanning and validating Java-based projects. This new support looks very promising.</li>\n" +
" <li>What should <a href=\"https://bit.ly/2mLVHtq\" target=\"_blank\">your monitoring architecture include</a>? Cloud Foundry talks all about it in the 2018 Dzone Guide to DevOps</li>\n" +
" <li>Hibernate ORM 5.3.0.Beta1 has been <a href=\"http://in.relation.to/2018/01/18/hibernate-orm-530-beta1-release/\" target=\"_blank\">released with support for #JPA 2.2.</a></li>\n" +
" <li>Dr. Mark Pollack just <a href=\"https://twitter.com/springcentral/status/954397044302426114\" target=\"_blank\">announced Spring Cloud Skipper 1.0 RC1</a>.</li>\n" +
" <li>This Polish-language look at <a href=\"https://codecouple.pl/2018/01/19/26-spring-boot-consumer-driven-contract/\" target=\"_blank\">Spring Cloud Contract looks very interesting</a></li>\n" +
" <li><a href=\"https://twitter.com/pivotal/status/953694959378448385\" target=\"_blank\">@pivotal tweeted</a>: ‘Maybe we should regularly play a “Where in the world is @starbuxman?” game in 2018?’ Indeed, 2018 is starting to move in gear and I’ll be bringing Spring wherever I can. <a href=\"https://twitter.com/starbuxman/status/953577456492937216\" target=\"_blank\">Find me in these cities</a></li>\n" +
" <li>Spring Cloud ninja Ryan Baxter just announced <a href=\"https://twitter.com/springcentral/status/953690920595070976\" target=\"_blank\">Spring Cloud Edgware Service Release 1 (SR1) has been released.</a>. The new release is jam-packed with new released. Check ’em out!</li>\n" +
" <li>This post — introducing Spring Boot — was voted one <a href=\"https://www.ibm.com/developerworks/java/library/j-spring-boot-basics-perry/index.html\" target=\"_blank\">of IBM DeveloperWorks’ top 2017 posts</a></li>\n" +
" <li>Spring Data lead <a href=\"https://github.com/synyx/hades/commit/09d2f72\" target=\"_blank\">Oliver Gierke celebrates the tenth anniversary</a> of the first commits that would eventually become Spring Data JPA. Happy birthday Spring Data JPA (then called “Hades”)!!</li>\n" +
" <li>Project Reactor lead Simon Basl&eacute; introduces better error handling, an upcoming feature of Reactor 3.2, <a href=\"https://twitter.com/springcentral/status/953350596857229312\" target=\"_blank\">that’s now available in milestone releases</a></li>\n" +
" <li>Check out the new <a href=\"https://twitter.com/springcentral/status/953348839125131264\" target=\"_blank\">Spring Session for Apache Geode and Pivotal Gemfire releases</a>!</li>\n" +
" <li>Get trained on Cloud Foundry in this <em>free</em>&nbsp;<a href=\"https://www.edx.org/course/introduction-cloud-foundry-cloud-native-linuxfoundationx-lfs132x#!?_lrsc=3b7be921-f2cf-4716-9876-e5a96fdc824f&amp;utm_source=employee-social&amp;utm_medium=twitter&amp;utm_campaign=employee_advocacy\" target=\"_blank\">Cloud Foundry course offered by the Linux Foundation</a></li>\n" +
"</ul></p>"
            , entry.getContents()
        );
    }
}
