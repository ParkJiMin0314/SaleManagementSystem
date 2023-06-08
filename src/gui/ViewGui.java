package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Menu;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import sale.SaleManagement;


public class ViewGui extends JPanel {
    WindowFrame frame;
    SaleManagement sale;

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();

    public ViewGui(WindowFrame frame, SaleManagement sale) {
        this.frame = frame;
        this.sale = sale;
        
        int size = sale.size();
        System.out.println(size);

        System.out.println("*****" + sale.size() + "*****");
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("name");
        model.addColumn("phonenumber");
        model.addColumn("hamburger");
        model.addColumn("juice");



        System.out.println("----------1---------");
        for (int i = 0; i < size; i++) {
            Vector<Object> row = new Vector<Object>();

            sale.Menu si = sale.get(i);
            row.add(si.getName());
            row.add(si.getPhoneNumber());
            row.add(si.getHamburger());
            row.add(si.getJuice());
            model.addRow(row);
           

        }
        System.out.println("----------2---------");

        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        this.add(sp);

    }
}