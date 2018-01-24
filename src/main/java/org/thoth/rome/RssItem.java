package org.thoth.rome;

import java.util.Date;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class RssItem {
    protected String id;
    protected String title;
    protected String link;
    protected Date publicationDate;
    protected String contents;

    public RssItem(String id, String title, String link, Date publicationDate, String contents) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.publicationDate = publicationDate;
        this.contents = contents;
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


}