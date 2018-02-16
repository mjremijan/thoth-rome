package org.thoth.rome;

import java.util.Date;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class RssItem {
    protected String id;
    protected String feed;
    protected String author;
    protected String title;
    protected String link;
    protected Date publicationDate;
    protected String contents;
    protected String creator;

    public RssItem(String id, String feed, String author, String title, String link, Date publicationDate, String contents) {
        this.id = id;
        this.feed = feed;
        this.author = author;
        this.title = title;
        this.link = link;
        this.publicationDate = publicationDate;
        this.contents = contents;
    }

    public RssItem(String id, String feed, String author, String title, String link, Date publicationDate, String contents, String creator) {
        this(id, feed, author, title, link, publicationDate, contents);
        this.creator = creator;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getContents() {
        return contents;
    }

    public String getAuthor() {
        return author;
    }

    public String getFeed() {
        return feed;
    }

    public String getCreator() {
        return creator;
    }

}
