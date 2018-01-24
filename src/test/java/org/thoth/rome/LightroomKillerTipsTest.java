package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class LightroomKillerTipsTest {

    @Test
    public void testMe() throws Exception {

        RssItem item = new RssItemRepository(
            new File("src/test/resources/lightroom_killer_tips.xml")
        ).findFirst();

        // guid
        Assert.assertEquals(
            "https://lightroomkillertips.com/?p=10392", item.getId());

        // title
        Assert.assertEquals(
            "Keeping Lightroom Classic’s Files in Check: Part 1", item.getTitle());

        // link
        Assert.assertEquals(
            "https://lightroomkillertips.com/keeping-lightroom-classics-files-check-part-1/", item.getLink());

        // pubDate
        Assert.assertEquals(
            "Wed Jan 24 02:00:33 CST 2018", item.getPublicationDate().toString());

        // description
        Assert.assertEquals(
            "<p>As Lightroom Classic users we focus on the job it does with our photos, both in terms of managing them and processing them, but it is worth taking a moment to think about the footprint the Classic-related files leave on our computers, which when left unchecked only continues to grow over time.</p>\n" +
"<p><em>Disclaimer: Let&#8217;s just acknowledge that in the grand scheme of things your photos and videos will require far more storage space than your Lightroom catalog and its related files ever will. However, because this is so obvious we all take steps to manage our disk space relating to our photo storage. The files related to running (and backing up) Lightroom tend to accumulate in the background, and it isn&#8217;t until we find ourselves running short on disk space that we start to wonder what is going on behind the scenes. My goal is to simply shed a little light on the subject so that you can make the decisions you need for your system. There is not a one-size-fits all answer here, and you shouldn&#8217;t just run out and make changes to your setup if you aren&#8217;t having any problems. I just want you to be more fully in the driver&#8217;s seat as you make decisions down the road. </em></p>\n" +
"<p>When you look under Lightroom&#8217;s hood you find that there are a number of files that work in concert to make Lightroom function, and all of these require some amount of hard disk space. By default, all of these files exist on your startup drive, and for many of us that drive is already chock-full of lot&#8217;s of other files too. Increasingly our startup drives are solid state drives for improved performance, which tend to be smaller in storage capacity. This combination of factors can leave some of us running low on free space, which becomes a performance drag of its own. Let&#8217;s take a closer look at what these files are, where they can be found, and what you might be able to do to manage them over time.</p>\n" +
"<h3>The Catalog</h3>\n" +
"<p>As the most important of all of the Lightroom-related files this is a great place to start. By default the catalog is created within a folder named Lightroom within your Pictures folder. If you are not sure where your catalog is located you can go to Lightroom &#62; Catalog Settings &#62; General (PC: Edit &#62; Catalog Settings) and find its name and location displayed along with other important information about the catalog itself. Click the Show button to open a new file browser window with that folder selected.</p>\n" +
"<p><a href=\"https://lightroomkillertips.com/wp-content/uploads/2018/01/filecheck_01.jpg\" class=\"fancyboxgroup\" rel=\"gallery-10392\"><img class=\"aligncenter size-large wp-image-10400\" src=\"https://lightroomkillertips.com/wp-content/uploads/2018/01/filecheck_01-1024x707.jpg\" alt=\"\" width=\"838\" height=\"579\" srcset=\"https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_01-1024x707.jpg 1024w, https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_01-300x207.jpg 300w, https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_01-768x530.jpg 768w, https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_01.jpg 1316w\" sizes=\"(max-width: 838px) 100vw, 838px\" /></a></p>\n" +
"<p>All of the work you do in Lightroom is automatically stored in that catalog file, and as a result the file size of the catalog grows over time. The size in bytes of that catalog file will depend on how many photos you have imported and how much work you have done on those photos. This catalog, managing about 30,000 images, is about 515 MB, which is not much of a disk space issue. My main catalog on my desktop is over 3GB and manages over 150,000 images.</p>\n" +
"<p>However, there&#8217;s a saying in backpacking that &#8220;every ounce counts,&#8221; so for some people shaving some megabytes off their catalog might be attractive, but what can you do? The easiest thing to do is to run the File &#62; Optimize Catalog function. Those with really large catalogs are the only ones likely to see any real difference in file size as a result, but those are also the people most likely to be interested in reducing its file size (and possibly improving performance). There is no harm in doing it, so give it a try.</p>\n" +
"<h3>Managing Catalog Backups</h3>\n" +
"<p>While Classic doesn&#8217;t have a function to back up your photos it does have an automated mechanism for creating backup copies of the catalog file on a regular basis. If you go back to Catalog Settings &#62; General you can configure Lightroom to periodically create an exact copy of the catalog file on a schedule of your choosing. The next time you exit Lightroom on that schedule you will be prompted to run the catalog backup process, and it is only on that dialog box that you can choose where you want the backup copy created (ideally you&#8217;d choose a different drive than the one used for your working catalog). Worth noting that as of Lightroom CC 2015/6 we have the ability to adjust that schedule from the Back Up Catalog dialog box too.</p>\n" +
"<p><a href=\"https://lightroomkillertips.com/wp-content/uploads/2018/01/filecheck_02.jpg\" class=\"fancyboxgroup\" rel=\"gallery-10392\"><img class=\"aligncenter size-large wp-image-10398\" src=\"https://lightroomkillertips.com/wp-content/uploads/2018/01/filecheck_02-1024x498.jpg\" alt=\"\" width=\"838\" height=\"408\" srcset=\"https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_02-1024x498.jpg 1024w, https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_02-300x146.jpg 300w, https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_02-768x374.jpg 768w, https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_02-578x280.jpg 578w, https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_02.jpg 1048w\" sizes=\"(max-width: 838px) 100vw, 838px\" /></a></p>\n" +
"<p>Each time this process runs an exact copy of your catalog (the .lrcat file) at that moment in time is created in the backup location, and then (as of Lightroom CC 2015/6) the backup copy is compressed into a zip file as a way to reduce disk space (and to keep people from opening a backup copy of the catalog by mistake).</p>\n" +
"<p>Using this backup feature can help protect you against data loss through drive failure (if they are being saved to a different drive) or catalog corruption (which is rare, but can happen and is not always obvious at first), and I highly recommend using it, but even though the backup copies are now compressed, Lightroom will continue to keep creating them until the chosen destination drive is full. Each time the process runs a new (compressed) copy of the catalog is created and there it will remain until the user (you) removes them. This is easy to do, but I&#8217;ve encountered many people who have never given it a second thought and have every backup copy of the catalog ever created still sitting in that folder.</p>\n" +
"<p>I periodically go to the folder where they are created using my file browser and delete all but the most recent few. If you think about it, should you ever need to restore a backup catalog you would choose the most recent one right? But what if the data you were hoping to retrieve wasn&#8217;t in the most recent catalog copy, wouldn&#8217;t it be nice to have a few iterative versions on hand to go back through? Yes, this is more redundant redundancy, but I personally enjoy the peace of mind of having them around. The really important part is that you need to be in control and not let automated tasks run unchecked. You may just have gigabytes of drive space waiting to be reclaimed.</p>\n" +
"<p><strong>Important public service announcement</strong>, before you go deleting all of your old backup copies make sure you know where your working catalog is located first (this is shown on that Catalog Settings panel we saw earlier) and that it is not somehow located among your backups. You&#8217;d be surprised how many people I&#8217;ve encountered who only discovered their catalog was among their backups after they deleted it by mistake. How could this happen? The Default Catalog setting found in Preferences &#62; General is usually to blame. By default, it is set to Load most recent catalog, so all it takes is a curious user opening an old backup copy of a catalog, then closing Lightroom to set that old backup copy as the &#8220;most recent&#8221; and the next time that person launches Lightroom that backup copy opens. Please take a moment to change your Default Catalog preference to anything other than Load most recent!</p>\n" +
"<p><a href=\"https://lightroomkillertips.com/wp-content/uploads/2018/01/filecheck_03.jpg\" class=\"fancyboxgroup\" rel=\"gallery-10392\"><img class=\"aligncenter size-large wp-image-10397\" src=\"https://lightroomkillertips.com/wp-content/uploads/2018/01/filecheck_03-1024x826.jpg\" alt=\"\" width=\"838\" height=\"676\" srcset=\"https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_03-1024x826.jpg 1024w, https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_03-300x242.jpg 300w, https://4bcokm12bvu948gi7312gnab-wpengine.netdna-ssl.com/wp-content/uploads/2018/01/filecheck_03-768x619.jpg 768w\" sizes=\"(max-width: 838px) 100vw, 838px\" /></a></p>\n" +
"<p>I&#8217;ll wrap this up in next week&#8217;s post with a look at Classic&#8217;s preview caches. See you then!</p>\n" +
"<p>The post <a rel=\"nofollow\" href=\"https://lightroomkillertips.com/keeping-lightroom-classics-files-check-part-1/\">Keeping Lightroom Classic&#8217;s Files in Check: Part 1</a> appeared first on <a rel=\"nofollow\" href=\"https://lightroomkillertips.com\">Lightroom Killer Tips</a>.</p>\n"
            , item.getContents()
        );
    }
}
