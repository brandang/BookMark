import java.awt.*;

/*
A class for storing all of the Constants required in the program.
 */
public class Constants {

    /*  Strings   */

    // The title to display on the Window.
    final public static String WINDOW_NAME = "BookMark";

    // The text to display on the Create New BookMark button in the Toolbar.
    final public static String CREATE_NEW_BOOKMARK_BUTTON_TEXT = "Create new BookMark";


    /*  Numbers and Dimensions */

    // The default size of the window.
    final public static Dimension DEFAULT_WINDOW_SIZE = new Dimension(1000,800);

    // The minimum size of the window.
    final public static Dimension MINIMUM_WINDOW_SIZE = new Dimension(500,500);

    // The margins between the tabbed pane and the window.
    final public static int TABBED_PANE_MARGINS = 20;

    // Calculate default size of the tabbed pane based on the margins.
    final public static Dimension DEFAULT_TABBED_PANE_SIZE = new Dimension(DEFAULT_WINDOW_SIZE.width -
            (TABBED_PANE_MARGINS * 2), DEFAULT_WINDOW_SIZE.height - (TABBED_PANE_MARGINS * 2));

    // How fast scrolling works using the mouse wheel.
    final public static int SCROLL_SPEED = 16;

    // The width of the scrollbar.
    final public static int SCROLL_BAR_WIDTH = 5;

    // The height of each BookMarkComponent.
    final public static int BOOKMARK_COMPONENT_HEIGHT = 100;

    // The height of the name and the description labels that appear in each BookMark.
    final public static int BOOKMARK_LABELS_HEIGHT = 70;

    // The height of each Toolbar.
    final public static int TOOLBAR_HEIGHT = 50;


    /*  Fonts   */

    // Font for the tab titles.
    final public static Font TAB_TITLE_FONT = new Font("Segoe UI Light", Font.PLAIN, 16);

    // Font for the name of each BookMark.
    final public static Font BOOKMARK_NAME_FONT = new Font("Segoe UI Light", Font.PLAIN, 30);

    // Font for the description of each BookMark.
    final public static Font BOOKMARK_DESCRIPTION_FONT = new Font("Segoe UI Light", Font.PLAIN, 16);


    /*  Colours */

    // Possible colours for the tabs.
    final public static Color TAB_COLOUR_1 = new Color(165, 255, 238);
}