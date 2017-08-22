import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 * The only purpose of this class is to create and display the main
 * window.
 * Implements Runnable, to run in a separate thread.
 */
public class GUIMain implements Runnable {

    public static void main(String[] args) {
        GUIMain main = new GUIMain();
        SwingUtilities.invokeLater(main);

        // Reduce flickering when resizing window.
        System.setProperty("sun.java2d.noddraw", Boolean.TRUE.toString());
    }

    @Override
    public void run() {

        // Application window.
        JFrame mainFrame = new JFrame(Constants.WINDOW_NAME);

        // Set up window.
        mainFrame.setPreferredSize(Constants.DEFAULT_WINDOW_SIZE);
        mainFrame.setMinimumSize(Constants.MINIMUM_WINDOW_SIZE);
        mainFrame.setFocusable(true);
        mainFrame.requestFocus();

        // Custom panel to display in the window.
        MainPanel mainPanel = new MainPanel();

        // Set layout.
        mainFrame.getContentPane().setLayout(new BorderLayout());
        mainFrame.getContentPane().add(mainPanel, BorderLayout.CENTER);

        // Set look and feel.
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }

        SwingUtilities.updateComponentTreeUI(mainFrame);

        mainFrame.setResizable(true);

        mainFrame.add(mainPanel);

        mainPanel.initializeComponents();

        // Close the program upon exit.
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Arrange components.
        mainFrame.pack();

        mainFrame.setVisible(true);

        // Add listener that gets called whenever window is resized.
        mainFrame.addComponentListener(new ComponentListener() {

            public void componentResized(ComponentEvent e) {
                // Let panels know it was resized.
                mainPanel.windowResized();
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                // Let panels know it was resized. Window is considered to have moved when user clicks on maximize or
                // minimize.
                mainPanel.windowResized();
            }

            @Override
            public void componentShown(ComponentEvent e) {
            }

            @Override
            public void componentHidden(ComponentEvent e) {
            }
        });
    }
}