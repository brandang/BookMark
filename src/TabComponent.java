import javax.swing.*;
import java.awt.*;

public class TabComponent extends JPanel {

    // Name and colour with which to display.
    private String tabName;
    private Color tabColour;

    // Allow the list of bookmarks to scroll.
    private CustomScrollPane scrollPane;

    // The list of BookMarks.
    private CustomList bookMarkList;


    /**
     * Constructor. Create a tab with specified name and colour.
     * @param tabName The name of the tab.
     * @param tabColour The colour of the tab.
     */
    public TabComponent(String tabName, Color tabColour) {
        setTabName(tabName);
        setTabColour(tabColour);
        initializeComponents();
        setOpaque(false);
//        setBackground(tabColour);
//        setForeground(tabColour);
    }

    private void initializeComponents() {

        /*listModel = new DefaultListModel<>();
        bookMarkComponentList = new JList<>(listModel);
        scrollPane = new JScrollPane(bookMarkComponentList);

        // Get rid of ugly looking border.
        scrollPane.setBorder(null);

        // Make sure it fills up entire space.
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);*/
        /*list = new JTable(new CustomListModel());
        scrollPane = new JScrollPane(list);
        list.setFillsViewportHeight(true);
        TableCellRenderer buttonRenderer = new ListButtonRenderer();*/

        bookMarkList = new CustomList();
        scrollPane = new CustomScrollPane(bookMarkList);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        setOpaque(true);
    }

    public void addBookMark(BookMarkComponent bookMarkComponent) {
//        listModel.addElement(bookMarkComponent);
//        scrollPane.getViewport().add(bookMarkComponent);
        bookMarkList.addBookMark(bookMarkComponent);

    }

    /*  Getters and Setters */

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public Color getTabColour() {
        return tabColour;
    }

    public void setTabColour(Color tabColour) {
        this.tabColour = tabColour;
    }
}