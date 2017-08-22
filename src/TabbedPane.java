import javax.swing.*;
import java.awt.*;

public class TabbedPane extends JTabbedPane {

    // The size of the tabbed pane.
    private Dimension size;

    /**
     * Constructor. Automatically adds listener to resize Tabbed Pane based on size of window.
     */
    public TabbedPane() {
        super();
    }

    /**
     * Set the initial size of the tabbed pane.
     * @param initialSize The dimensions.
     */
    public void setInitialSize(Dimension initialSize) {
        size = initialSize;
        setPreferredSize(size);
    }


    /**
     * Method that must be called whenever the window is resized.
     */
    public void windowResized() {

        // Get the root frame of this TabbedPane.
        JFrame frame = (JFrame)SwingUtilities.getRoot(TabbedPane.this);
        Dimension parentDimensions = frame.getSize();

        // Calculate new size according to new window size and margins.
        int newWidth = (int) (parentDimensions.getWidth() - (Constants.TABBED_PANE_MARGINS * 2));
        int newHeight = (int) (parentDimensions.getHeight() - (Constants.TABBED_PANE_MARGINS * 2));

        // Set the new size.
        size.setSize(new Dimension(newWidth, newHeight));
        TabbedPane.this.setPreferredSize(size);
    }
}