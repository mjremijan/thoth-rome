package org.thoth.rome;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

/**
 *  *
 *  * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 
 */
public class ChristianFaithAtWorkTest {

    @Test
    public void testMe() throws Exception {

        RssItem item = new RssItemRepository(
            new File("src/test/resources/christian_faith_at_work.xml")
        ).findFirst();

        // guid
        Assert.assertEquals(
            "http://christianfaithatwork.com/?p=3882", item.getId());

        // title
        Assert.assertEquals(
            "Are You Still On The Right Path? – Part 2", item.getTitle());

        // link
        Assert.assertEquals(
            "https://www.christianfaithatwork.com/are-you-still-on-the-right-path-part-2/", item.getLink());

        // pubDate
        Assert.assertEquals(
            "Tue Nov 21 20:30:48 CST 2017", item.getPublicationDate().toString());

        // description
        Assert.assertEquals(
            "<p><em>In my <a title=\"Are You Still On The Right Path?\" href=\"http://christianfaithatwork.com/are-you-still-on-the-right-path/\" target=\"_blank\" rel=\"noopener\">last post</a> (you really need to read it!), I explained how Pastor Julio, a man I had just met, had listened to <a title=\"How God Led A Complete Overhaul of Our Business\" href=\"http://christianfaithatwork.com/how-god-led-a-complete-overhaul-of-our-business/\" target=\"_blank\" rel=\"noopener\">my story</a> about following God&#8217;s lead in my <a title=\"About The Author\" href=\"http://christianfaithatwork.com/about-2/the-author/\" target=\"_blank\" rel=\"noopener\">family business</a>. He listened to me tell him how I knew I was on the right path and committed to it regardless of the cost. He paid attention while I described the hardship I was enduring. Then he asked if he could give me some advice.</em></p><a href=\"https://www.christianfaithatwork.com/are-you-still-on-the-right-path-part-2/\"><img width=\"760\" height=\"507\" src=\"https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-760x507.jpg\" class=\"featured-image wp-post-image\" alt=\"right path\" srcset=\"https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-760x507.jpg 760w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-300x200.jpg 300w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-768x512.jpg 768w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-1024x683.jpg 1024w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-610x407.jpg 610w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-518x345.jpg 518w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-250x166.jpg 250w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-82x55.jpg 82w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-600x400.jpg 600w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939-550x367.jpg 550w, https://www.christianfaithatwork.com/wp-content/uploads/2017/11/iStock-491874939.jpg 1254w\" sizes=\"(max-width: 760px) 100vw, 760px\" /></a>\n" +
"<p><span id=\"more-3882\"></span></p>\n" +
"<p>He proceeded to tell me that he truly believed God had called me to make the changes I made. He agreed with my determination to persevere despite the tough conditions. But then he told me that he thought I was missing a key ingredient. He told me that it appeared I had <strong>stopped listening to God</strong>.</p>\n" +
"<h3>Stopped Listening?</h3>\n" +
"<p>At first, I stiffened. There was no way I had stopped listening! I was so sure he was wrong about this that I almost stopped listening to him!</p>\n" +
"<p>Yet he pointed out examples of my refusal to listen to other godly people. He showed me how I was clearly taking God&#8217;s initial instructions and executing them, but at the same time I was not listening for further instructions. I was assuming God would never change my path.</p>\n" +
"<h3>Examples From Scripture</h3>\n" +
"<p>To make it easier for me to understand, he reminded me of a couple of examples from Scripture. First, he reminded me of the time Mary and Joseph had taken Jesus to the temple in Jerusalem. This was clearly God&#8217;s will for them to do this. They had started on the right path. However, on the return trip, it took them several days before they realized He was not with them. Instead, He was still at the temple talking with the teachers (<a title=\"Luke 2:41-50\" href=\"http://www.biblegateway.com/passage/?search=luke%202:41-50&#38;version=NIV\" target=\"_blank\" rel=\"noopener\">Luke 2:41-50</a>).</p>\n" +
"<p>The next example Julio gave was the story of Abraham and his son Isaac. After waiting for many years to have their own son, Abraham and Sarah were blessed with Isaac. When Isaac was a young boy, God told Abraham to take him to the top of the mountain and offer him as a burnt offering! Abraham proceeded to do as God told him. He took the right path.</p>\n" +
"<p>However, at the very moment that he was about to slaughter Isaac, the Angel of the Lord stopped him. Though God had told Abraham to offer Isaac as a sacrifice, it turned out it was only a test of Abraham&#8217;s commitment to God (<a title=\"Genesis 22:1-19\" href=\"http://www.biblegateway.com/passage/?search=genesis%2022:1-19&#38;version=NIV\" target=\"_blank\" rel=\"noopener\">Genesis 22:1-19</a>).</p>\n" +
"<h3>My Situation</h3>\n" +
"<p>Julio took these two examples and applied them to my situation. He explained again that he agreed that I was originally on the right path &#8211; that God had called me to do what I was doing. At the same time, he felt I was proceeding almost blindly in that original direction. It was possible, he said, that Jesus was no longer &#8220;with me on the trip&#8221; or that God had been trying to get my attention for a direction change. Either way, Julio showed me that I was not listening carefully enough to know it if either case were true.</p>\n" +
"<p>I sat there absorbing his words. I wanted to argue, but I knew he was right. I was so set on carrying out my orders that I was not prepared for a change in direction. My journey had become more about my determination to be obedient than actually being in God&#8217;s will. I had turned it into an effort to prove my strength of resolve.</p>\n" +
"<h3>My Reaction</h3>\n" +
"<p>The first thing I did was to go to my Dad and apologize. I explained that I was not yet changing direction, but that I had recognized my stubbornness. I committed to him that I would be open to listening for God to speak, either directly to me or through the counsel of other wise and godly men.</p>\n" +
"<p>Then I committed to a renewed attitude in prayer. I began praying that God would show me the right path. If I was still on the right path, I asked for strength to continue. If I had left the right path, I asked for guidance to get back to it. My posture in prayer effectively went from an aggressive three-point stance to prostrate and face-down. I was determined to listen to that still, small voice.</p>\n" +
"<h3>The Right Path!</h3>\n" +
"<p>The cool thing? I was still on the right path! I am more certain of that now, because I started listening. The more I listened, the more God confirmed that I was headed in the right direction. Although I knew it was God that started me on that path, I had clearly lost connection with Him and had taken over the wheel.</p>\n" +
"<p>Thanks to Pastor Julio, I was back in the passenger seat and loving it! The struggle on the path did not go away immediately, but much of the stress did.</p>\n" +
"<p><strong><em>Has this ever happened to you?</em></strong></p>\n" +
"<p><strong><em>Did you get back on the right path or are you still driving?</em></strong></p>\n" +
"<p><strong><em>What are you going to do about it?</em></strong></p>\n" +
"<hr />\n" +
"<p><em>Photo by <a href=\"https://www.istockphoto.com/portfolio/izustun?mediatype=photography&#38;excludenudity=true&#38;sort=best\">izustun / iStock</a></em></p>\n" +
"<div class=\"getnoticed-rssad\"><a href=\"http://www.christianfaithatwork.com/17bps/\" target=\"_blank\"><img src=\"http://www.christianfaithatwork.com/wp-content/uploads/2016/04/17bps.png\" alt=\"17 Biblical Principles For Success\" style=\"max-width:100%;height:auto\"></a></div>"
            , item.getContents()
        );

        // creator
        Assert.assertEquals("Chris Patton", item.getCreator());
    }
}
