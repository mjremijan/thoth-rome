package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class RahmannetTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/rahmannet.xml")
        ).findFirst();

        // publication date
        Assert.assertEquals(
            "Fri Apr 21 12:39:00 CDT 2017", String.valueOf(entry.getPublicationDate()));

        // guid
        Assert.assertEquals(
            "tag:blogger.com,1999:blog-37157465.post-580963025382398203", entry.getId());

        // title
        Assert.assertEquals(
            "Servlet 4 Public Review Starts Now!", entry.getTitle());

        // link
        Assert.assertEquals(
            "http://blog.rahmannet.net/2017/04/servlet-4-public-review-starts-now.html", entry.getLink());

        // description
        Assert.assertEquals(
            "Servlet 4 has just posted a public review (this is the last step before the proposed final specification). Servlet 4 is easily one of the most critical components of Java EE 8. The primary aim of Servlet 4 is to bring first-class, core standards based HTTP/2 support to the server-side Java ecosystem. Most of the changes in Servlet 4 (with the exception of things like the server push API) should be transparent to developers and are enforced in terms of requirements for Servlet 4 implementations to fully support HTTP/2. A decent resource to learn more about Servlet 4 and HTTP/2 should be my slide deck (please <a href=\"https://www.slideshare.net/reza_rahman/http2-and-what-it-means-for-the-java-ee-ecosystem\">click here</a> if you can't see the embedded slide deck). You are also welcome to check out the corresponding <a href=\"http://www.captechconsulting.com/videos/http2-and-what-it-means-for-the-java-ee-ecosystem\">screen-cast here</a>.<br /><br /><center><iframe allowfullscreen=\"\" frameborder=\"0\" height=\"485\" marginheight=\"0\" marginwidth=\"0\" scrolling=\"no\" src=\"https://www.slideshare.net/slideshow/embed_code/key/50HAUU2azGq8gd\" style=\"border-width: 1px; border: 1px solid #ccc; margin-bottom: 5px; max-width: 100%;\" width=\"595\"> </iframe> <div style=\"margin-bottom: 5px;\"><strong> <a href=\"https://www.slideshare.net/reza_rahman/http2-and-what-it-means-for-the-java-ee-ecosystem\" target=\"_blank\" title=\"HTTP/2 and What it Means for the Java EE Ecosystem\">HTTP/2 and What it Means for the Java EE Ecosystem</a> </strong> from <strong><a href=\"https://www.slideshare.net/reza_rahman\" target=\"_blank\">Reza Rahman</a></strong> </div></center>You can download and take a look at the draft specification itself from the&nbsp;<a href=\"https://jcp.org/aboutJava/communityprocess/pr/jsr369/index.html\">JCP site</a>. While this is essentially the final stretch for Servlet 4, below are some ways you can still engage (most of it comes directly from the <a href=\"https://glassfish.java.net/adoptajsr\">Adopt-a-JSR page</a> I drafted while still at Oracle). The Servlet 4 specification lead Ed Burns has also asked for specific help in testing out the server-push feature. <a href=\"http://ridingthecrest.com/blog/2017/04/18/please-test-mojarra-2_3_1-with-server-push.html\">His write-up</a> is actually also a great introduction to the feature.<br /><ul><li>You can still join the specification itself as an expert or a contributor. You can do that via the <a href=\"https://www.jcp.org/en/jsr/detail?id=369\">JCP page for the specification</a>.</li><li>You can have your JUG officially support the standard through <a href=\"https://community.oracle.com/community/java/jcp/adopt-a-jsr\">Adopt-a-JSR</a>.</li><li>You can simply join the discussion without any ceremony by subscribing to the&nbsp;<a href=\"https://java.net/projects/servlet-spec/lists\">Servlet specification user alias</a>.</li><li>You can share ideas and feedback, possibly by entering issues in the <a href=\"https://java.net/jira/browse/SERVLET_SPEC\">public issue tracker</a>.</li><li>You can read the public review specification now.</li><li>You can try out the reference implementation now.</li><li>You can write or speak about Servlet 4 now.</li><li>You can encourage others to participate.</li></ul>The next step is up to you. You can be a real part of Java's ongoing success. If you have any questions I am happy to try to help - just drop me a note any time."
            , entry.getContents()
        );
    }
}
