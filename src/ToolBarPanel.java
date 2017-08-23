import javax.swing.*;
import java.awt.*;

public class ToolBarPanel extends JPanel {

    JButton createBookMarkButton;

    public ToolBarPanel() {
        super();
        initializeComponents();
    }

    private void initializeComponents() {

        /*
        When gbc.fill = GridBagConstraints.HORIZONTAL, and the preferred width is 0, each component will be sized
        solely according to it`s weight.
         */
        createBookMarkButton = new JButton(Constants.CREATE_NEW_BOOKMARK_BUTTON_TEXT);
        /*
        The ToolBarPanel`s size is dependent on it`s children, so set the height accordingly.
         */
        createBookMarkButton.setPreferredSize(new Dimension(0, Constants.TOOLBAR_HEIGHT));

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        add(createBookMarkButton, gbc);
    }
}