/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JoséRobertoFernandes
 */
public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(225, 225, 225));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column < 4) {
                    header.setHorizontalAlignment(JLabel.LEFT);
                }
                if (column == 5) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                if (column != 5) {
                    Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row,
                            column); // Generated from
                                     // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                    com.setBackground(Color.white);
                    setBorder(noFocusBorder);
                    if (isSelected) {
                        com.setForeground(Color.GRAY);
                    } else {
                        com.setForeground(Color.BLACK);
                    }
                    return com;
                } else {
                    StatusType type = (StatusType) value;
                    StatusCell cell = new StatusCell(type);
                    return cell;
                }
            }
        });
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
}
