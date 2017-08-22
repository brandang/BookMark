import javax.swing.table.AbstractTableModel;

public class CustomListModel extends AbstractTableModel{
    @Override
    public int getRowCount() {
        return 5;
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        /*switch (columnIndex) {
            case 0:
                return rowIndex;
            case 1:
                return "Text for " + rowIndex;
            case 2: // fall through
               *//*Adding button and creating click listener*//*
            case 3:
                final JButton button = new JButton(COLUMN_NAMES[columnIndex]);
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(button),
                                "Button clicked for row " + rowIndex);
                    }
                });
                return button;
            default:
                return "Error";
        }*/
        return null;
    }
}