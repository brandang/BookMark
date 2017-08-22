import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MainPanel extends JPanel {

    TabbedPane tabs;

    /**
     * Constructor.
     */
    public MainPanel() {
        super();
    }

    public void initializeComponents() {

        tabs = new TabbedPane();

        // Fill up the entire window.
        tabs.setInitialSize(Constants.DEFAULT_TABBED_PANE_SIZE);

        JTextArea text = new JTextArea("JDKLSAF");
        JTextArea text2 = new JTextArea("JDKLSAF");
        JTextArea text3 = new JTextArea("JDKLSAF");
        JTextArea text4 = new JTextArea("JDKLSAF");
        JTextArea text5 = new JTextArea("JDKLSAF");

        //TEST
        TabComponent tab1 = new TabComponent("Tab One", null);
        tab1.addBookMark(new BookMarkComponent("Test","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Test2","Des", "www.wtf.com", BookMarkComponent.Types.FILEPATH));

        tabs.addTab(tab1.getTabName(), tab1);
        tabs.setMnemonicAt(0, KeyEvent.VK_1);
        tabs.addTab("TabComponent 2", text2);
        tabs.setMnemonicAt(1, KeyEvent.VK_2);
        tabs.addTab("TabComponent 3", text3);
        tabs.setMnemonicAt(2, KeyEvent.VK_3);

        tabs.setFont(Constants.TAB_TITLE_FONT);

        add(tabs);
    }

    /**
     * Method that must be called whenever the window is resized.
     */
    public void windowResized() {
        tabs.windowResized();
    }
}