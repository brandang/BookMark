import javax.swing.*;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

public class CustomTabbedPaneUI extends BasicTabbedPaneUI {


    private class ScrollableTabPanel extends JPanel implements UIResource {
        public ScrollableTabPanel() {
            setLayout(null);
        }

        public void paintComponent(Graphics g) {

            super.paintComponent(g);


            g.setColor(Color.red);
            Rectangle bounds = tabPane.getBounds();
            g.fillRect((int)bounds.getX(), (int)bounds.getY(), (int)bounds.getWidth(), (int)bounds.getHeight());

        }
    }


}