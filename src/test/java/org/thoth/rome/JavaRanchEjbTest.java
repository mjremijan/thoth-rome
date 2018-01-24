package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class JavaRanchEjbTest {

    @Test
    public void testMe() throws Exception {

        RssItem entry = new RssItemRepository(
            new File("src/test/resources/java_ranch_ejb.xml")
        ).findFirst();

        // guid
        Assert.assertEquals(
            "https://coderanch.com/forums/posts/preList/689854/3238025", entry.getId());

        // title
        Assert.assertEquals(
            "Named CDI Bean with Interceptor - Memory Leak", entry.getTitle());

        // link
        Assert.assertEquals(
            "https://coderanch.com/forums/posts/preList/689854/3238025", entry.getLink());

        // publicationDate
        Assert.assertNull(
            entry.getPublicationDate());

        // description
        Assert.assertEquals(
            "In my project (JEE 6, JBoss 7.1, JDK 1.7), I have several @Named CDI, all inheriting from a common @ConversationScoped abstract class.\n" +
"<br /> \n" +
"<br /> I've noticed that if I define an interceptor and I apply this interceptor to the same abstract (thus, applying it by inheritance to all the CDI beans mentioned before), it happens that:\n" +
"<br /> \n" +
"<br /> the method this.getClass() called on an instance returns the proxy class and no more the class itself;\n" +
"<br /> the performance of the application is dramatically getting worse, both during the initial startup both during the normal activity; it seems that the amount of memory used by the application has increased a lot, simply adding this interceptor.\n" +
"<br /> I'm a little confused, because it looks like applying the interceptor makes the beans \"managed\", whereas they all should be seen as \"managed\" also without the interceptor, since they already were \"named\".\n" +
"<br /> \n" +
"<br /> What am i missing? Did anyone have the same problem about performance? Is there something I can check?\n" +
"<br /> \n" +
"<br /> Thanks in advance for your help."
            , entry.getContents()
        );
    }
}
