import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MainPanel extends JPanel {

    // The tabs.
    private TabbedPane tabs;

    // The ToolBar at the bottom.
    private ToolBarPanel toolBarPanel;

    /**
     * Constructor.
     */
    public MainPanel() {
        super();
    }

    public void initializeComponents() {
        //TEST
        UIManager.put("TabbedPane.selected", Color.BLACK);

        tabs = new TabbedPane();

        // Fill up the entire window.
        tabs.setInitialSize(Constants.DEFAULT_TABBED_PANE_SIZE);

        JTextArea text = new JTextArea("JDKLSAF");
        JTextArea text2 = new JTextArea("JDKLSAF");
        JTextArea text3 = new JTextArea("JDKLSAF");
        JTextArea text4 = new JTextArea("JDKLSAF");
        JTextArea text5 = new JTextArea("JDKLSAF");

        //TEST
        TabComponent tab1 = new TabComponent("Tab One", Color.black);
        tab1.addBookMark(new BookMarkComponent("Java","Java Projects gdsgj klfhjgklsfd gjdsg" +
                "g fdjasklghjdfakjlg hsadkljg  jaskfh asdljgh sdkljgsdl;kgjsd;g fsdjgl;kasdfjg ilsadg saldgjsdkl" +
                "gjkl;dsfgjlsakd;gjlsk dgjiasl;dghj osidfghsaopig sdioghsdoiag jhsdal;ikgj sd;lgoj sadl;gjsa" +
                "ds ", "www.wtf.com", BookMarkComponent.Types.FILEPATH));
        tab1.addBookMark(new BookMarkComponent("Python","Python Projects", "www.wtf.com", BookMarkComponent.Types.FILEPATH));

        tabs.addTab(tab1.getTabName(), tab1);
        tabs.setMnemonicAt(0, KeyEvent.VK_1);
        tabs.addTab("TabComponent 2", text2);
        tabs.setMnemonicAt(1, KeyEvent.VK_2);
        tabs.addTab("TabComponent 3", text3);
        tabs.setMnemonicAt(2, KeyEvent.VK_3);
        tabs.setFont(Constants.TAB_TITLE_FONT);

        toolBarPanel = new ToolBarPanel();

        /*
        The background of TabbedPane actually takes up the entire panel. However, this is not visually apparent.
        tabs.setOpaque(true);
        tabs.setBackground(Color.red);

        This sets colour of the text.
        tabs.setForeground(Color.red);
         */

        tabs.setForegroundAt(0,  Color.BLUE);

        setLayout(new BorderLayout());
        add(tabs, BorderLayout.CENTER);
        add(toolBarPanel, BorderLayout.SOUTH);

    }

    /**
     * Method that must be called whenever the window is resized.
     */
    public void windowResized() {
        tabs.windowResized();
    }
}