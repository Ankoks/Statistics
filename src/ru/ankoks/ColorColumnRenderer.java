/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ankoks;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author AntonK
 */
class ColorColumnRenderer extends DefaultTableCellRenderer {

    Color bkgndColor, fgndColor;

    public ColorColumnRenderer(Color bkgnd, Color foregnd) {
        super();
        bkgndColor = bkgnd;
        fgndColor = foregnd;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        Component cell = super.getTableCellRendererComponent(table,
                value, isSelected, hasFocus, row, column);
        
        cell.setBackground(bkgndColor);
        cell.setForeground(fgndColor);

        super.setHorizontalAlignment(CENTER);
        
        MatteBorder border = new MatteBorder(1, 0, 0, 0, Color.WHITE);
        if (cell instanceof JComponent) {
            ((JComponent) cell).setBorder(border);
        }

        return cell;
    }
}
