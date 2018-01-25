package org.thoth.rome;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import java.io.File;
import java.util.Date;
import java.util.Optional;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class RssItemRepository {

    protected File feedFile;

    public RssItemRepository(File feedFile) {
        this.feedFile = feedFile;
    }

    public RssItem findFirst() throws Exception {
        SyndFeedInput input
            = new SyndFeedInput();

        SyndFeed feed
            = input.build(new XmlReader(feedFile));

        SyndEntry entry
            = feed.getEntries().stream().findFirst().get();

        // Feed title
        Optional<String> feedTitle = Optional.ofNullable(feed.getTitle());

        // ID
        Optional<String> id = Optional.ofNullable(entry.getUri());

        // ID
        Optional<String> author = Optional.ofNullable(entry.getAuthor());

        // Title
        Optional<String> title = Optional.ofNullable(entry.getTitle());

        // Link
        Optional<String> link = Optional.ofNullable(entry.getLink());

        // Publication Date
        Optional<Date> publicationDate = Optional.ofNullable(entry.getPublishedDate());

        // Contents
        StringBuilder sp = new StringBuilder();
        if (entry.getContents() != null && !entry.getContents().isEmpty()) {
            entry.getContents().stream()
                .forEach(sc -> sp.append(sc.getValue()));
        }
        else
        if (entry.getDescription() != null) {
            sp.append(entry.getDescription().getValue());
        }
        Optional<String> contents = (sp.length() > 0) ? Optional.of(sp.toString()) : Optional.empty();

        return new RssItem(
              id.orElseThrow(() -> new RssException("No <guid> value"))
            , feedTitle.orElseThrow(() -> new RssException("No <channel><title> value"))
            , author.orElse(null)
            , title.orElseThrow(() -> new RssException("No <title> value"))
            , link.orElseThrow(() -> new RssException("No <link> value"))
            , publicationDate.orElse(null)
            , contents.orElseThrow(() -> new RssException("No <content> or <description> values"))
        );
    }
}
