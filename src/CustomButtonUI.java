import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

public class CustomButtonUI extends BasicButtonUI {
    @Override
    public void paint(Graphics g, JComponent c) {
        JButton myButton = ( JButton ) c;
        ButtonModel buttonModel = myButton.getModel ();

        if ( buttonModel.isPressed () || buttonModel.isSelected () || buttonModel.isRollover()) {
            g.setColor ( Color.GRAY );
        }
        else {
            g.setColor ( Color.ORANGE );
        }
        g.fillRect ( 0, 0, c.getWidth (), c.getHeight () );

        super.paint ( g, c );
    }
}