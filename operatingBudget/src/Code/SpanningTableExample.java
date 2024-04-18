/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author IT
 */
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SpanningTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Spanning Table Example");

        JTable table = new JTable(new DefaultTableModel(
                new Object[][]{
                        {"Row 1", "Column 1", "Column 2"},
                        {"Row 2", "Spanned Cell", null},
                        {"Row 3", "Column 3", null}
                },
                new Object[]{"", "Column 1", "Column 2"}
        ));

        // Set cell renderer for the spanned cell
        table.setDefaultRenderer(Object.class, new SpanningTableCellRenderer());

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

class SpanningTableCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if ("Spanned Cell".equals(value)) {
            ((JLabel) component).setHorizontalAlignment(SwingConstants.CENTER);
            ((JLabel) component).setForeground(Color.RED);
            table.getColumnModel().getColumn(column).setMinWidth(0);
            table.getColumnModel().getColumn(column).setMaxWidth(0);
        }
        return component;
    }
}
