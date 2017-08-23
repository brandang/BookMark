import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BookMarkComponent extends JPanel {

    //TEST
    boolean debug = false;

    public static enum Types {HYPERLINK, FILEPATH}
    private Types bookMarkType;
    private String name;
    private String description;
    private String link;

    // Labels for displaying name and description of the bookmark.
    private JLabel nameLabel;
    private JLabel descriptionLabel;

    // The button on which to put the labels.
    private JButton button;

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
        initializeComponents();
    }

    private void initializeComponents() {
        /*
        Note that setting preferred sizes for components actually behaves like setting minimum size. If the window is
        resized so that it is not large enough to accomodate the preferred sizes, some components will be cut off.

        When the width is set to 0, and gbc.fill = GridBagConstraints.HORIZONTAL, each component will take up space
        solely depending on its weightx.

        Sometimes, it will not work properly if height is set over a certain value.
         */

        nameLabel = new JLabel(getName());
        nameLabel.setFont(Constants.BOOKMARK_NAME_FONT);
        nameLabel.setPreferredSize(new Dimension(0,70));

        descriptionLabel = new JLabel();
        descriptionLabel.setFont(Constants.BOOKMARK_DESCRIPTION_FONT);
        descriptionLabel.setPreferredSize(new Dimension(0,70));
        /*
        Use HTML to ensure that text takes up multiple lines, if necessary.
         */
        descriptionLabel.setText("<html>" + getDescription() + "</html>");

        /*
        Layout text on the button using GridBagLayout. It allows us to specify the sizes of each component on the
        button in relation to each other.
         */
        JButton button = new JButton();
        /*
        Setting the width component of the preferred size to 0 means that it does not set the minimum size: therefore,
        the button will not be cut off when window resizes. Setting the height of the button works fine.
         */
        button.setPreferredSize(new Dimension(0, Constants.BOOKMARK_COMPONENT_HEIGHT));
        button.setLayout(new GridBagLayout());
        button.setUI(new CustomButtonUI());
        GridBagConstraints gbc = new GridBagConstraints();

        // Resize horizontally, but not vertically.
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // Padding/margins.
        gbc.insets = new Insets(10,20,10,20);

        JCheckBox checkBox = new JCheckBox();
        gbc.gridx = 0;
        gbc.gridy = 0;
        // Setting weight to 0 means component will take up minimal space.
        gbc.weightx = 0;
        checkBox.setBorder(null);
        button.add(checkBox, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        button.add(nameLabel, gbc);

        gbc.gridx = 2;
        gbc.weightx = 1.5;
        button.add(descriptionLabel, gbc);

        setLayout(new BorderLayout());
        add(button, BorderLayout.CENTER);
//        setBorder(border);

        //TEST
        setOpaque(true);
//        setBackground(Color.red);
//        setForeground(Color.red);

        if (debug) {
            Border border = BorderFactory.createLineBorder(Color.black, 1);
            nameLabel.setBorder(border);
            descriptionLabel.setBorder(border);
        }

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