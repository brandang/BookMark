import javax.swing.*;

public class BookMarkComponent extends JComponent {

    public static enum Types {HYPERLINK, FILEPATH}
    private Types bookMarkType;
    private String name;
    private String description;
    private String link;

    // Labels for displaying name and description of the bookmark.
    private JLabel nameLabel;
    private JLabel descriptionLabel;

    /**
     * Constructor.
     * @param name The name of the bookmark.
     * @param description The description of the reminder.
     * @param link The filepath or hyperlink.
     * @param bookMarkType The type of the bookmark, either HYPERLINK or FILEPATH.
     */
    public BookMarkComponent(String name, String description, String link, Types bookMarkType) {
        setName(name);
        setDescription(description);
        setLink(link);
        setBookMarkType(bookMarkType);
    }

    //TEST

    @Override
    public String toString() {
        return getName();
    }

    /*  Getters and setters */

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Types getBookMarkType() {
        return bookMarkType;
    }

    public void setBookMarkType(Types bookMarkType) {
        this.bookMarkType = bookMarkType;
    }
}