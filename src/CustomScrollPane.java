import javax.swing.*;
import java.awt.*;

public class CustomScrollPane extends JScrollPane {

    public CustomScrollPane(Component component) {
        super(component);

        // Customize looks.
        setBorder(null);
        // Set up the scroll bar.
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        getVerticalScrollBar().setUnitIncrement(Constants.SCROLL_SPEED);
        getVerticalScrollBar().setPreferredSize(new Dimension(Constants.SCROLL_BAR_WIDTH,0));

    }
}