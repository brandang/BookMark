import javax.swing.*;
import java.awt.*;

public class CustomList extends JPanel {

    private JPanel list;
    private JPanel container;

    public CustomList() {
        initialize();
    }

    private void initialize() {
        /*
        In order to make the list scroll, and not resize based on the size of each item in the list, there has to
        be a GridLayout inside of a BorderLayout. BorderLayout also allows us to fill the parent with the list item.
        It does this because since there is no component at BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST,
        and BorderLayout.EAST, BorderLayout.CENTER will automatically take up the entire space.

        ****
        BorderLayout.North has to be used because CENTER will adjust the size of each component to fit on the screen
        meaning the scrollbar does not work.
         */
        setLayout(new BorderLayout());

        container = new JPanel();
        container.setLayout(new BorderLayout());

        list = new JPanel();

        /*
        This sets the colour of the content pane.
        setBackground(Color.red);
        setForeground(Color.red);
         */


        GridLayout gridLayout = new GridLayout(0,1);
        list.setLayout(gridLayout);
        container.add(list, BorderLayout.CENTER);
//        add(container);
        add(list,BorderLayout.NORTH);

    }

    public void addBookMark(BookMarkComponent bookMarkComponent) {
        list.add(bookMarkComponent);
    }
}