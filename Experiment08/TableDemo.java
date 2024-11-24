import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.util.*;

class TableDemo extends JFrame {
    JTable jt;
    JScrollPane js;

    TableDemo() {
        String colHeads[] = { "Numbers", "Alphabets" };
        String data[][] = new String[26][2];
        for (int i = 1; i < 26; i++) {
            char c = (char) (i + 64);
            data[i][0] = Integer.toString(i);
            data[i][1] = Character.toString(c);
        }
        Container co = getContentPane();
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jt = new JTable(data, colHeads);
        js = new JScrollPane(jt);
        co.add(js);
        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new TableDemo();
    }
}