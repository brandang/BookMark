import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class TabComponent extends JPanel {

    // Name and colour with which to display.
    private String tabName;
    private Color tabColour;

    // The list to display book marks.
    private JList bookMarkComponentList;
    // Contents of the JList.
    private DefaultListModel<BookMarkComponent> listModel;

    // The list of bookmarks.
    private JTable list;
    // Allow the list to scroll.
    private JScrollPane scrollPane;


    /**
     * Constructor. Create a tab with specified name and colour.
     * @param tabName The name of the tab.
     * @param tabColour The colour of the tab.
     */
    public TabComponent(String tabName, Color tabColour) {
        setTabName(tabName);
        setTabColour(tabColour);
        initializeComponents();
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
        list = new JTable(new CustomListModel());
        scrollPane = new JScrollPane(list);
        list.setFillsViewportHeight(true);
        TableCellRenderer buttonRenderer = new ListButtonRenderer();

    }

    public void addBookMark(BookMarkComponent bookMarkComponent) {
//        listModel.addElement(bookMarkComponent);
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