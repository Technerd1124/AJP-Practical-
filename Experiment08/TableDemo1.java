import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.util.*;

class TableDemo1 extends JFrame {
    JTable jt;
    JScrollPane js;

    TableDemo1() {
        String colHeads[] = { "ID", "Name", "Salary" };
        String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
        Container co = getContentPane();
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jt = new JTable(data, colHeads);
        js = new JScrollPane(jt);
        co.add(js);
        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        TableDemo1 sd = new TableDemo1();
    }
}