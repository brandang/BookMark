import java.awt.*;

/*
A class for storing all of the Constants required in the program.
 */
public class Constants {

    // The title to display on the Window.
    final public static String WINDOW_NAME = "BookMark";

    // The default size of the window.
    final public static Dimension DEFAULT_WINDOW_SIZE = new Dimension(1000,800);

    // The minimum size of the window.
    final public static Dimension MINIMUM_WINDOW_SIZE = new Dimension(500,500);

    // The margins between the tabbed pane and the window.
    final public static int TABBED_PANE_MARGINS = 20;

    // Calculate default size of the tabbed pane based on the margins.
    final public static Dimension DEFAULT_TABBED_PANE_SIZE = new Dimension(DEFAULT_WINDOW_SIZE.width -
            (TABBED_PANE_MARGINS * 2), DEFAULT_WINDOW_SIZE.height - (TABBED_PANE_MARGINS * 2));

    // Font for the tab titles.
    final public static Font TAB_TITLE_FONT = new Font("Segoe UI Light", Font.PLAIN, 16);

    // Possible colours for the tabs.
    final public static Color TAB_COLOUR_1 = new Color(165, 255, 238);
}