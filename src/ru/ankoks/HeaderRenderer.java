/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ankoks;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author AntonK
 */
public class HeaderRenderer extends DefaultTableCellRenderer {

    Color bkgndColor, fgndColor;

    public HeaderRenderer(Color bkgnd, Color foregnd) {
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

        return cell;
    }
}
