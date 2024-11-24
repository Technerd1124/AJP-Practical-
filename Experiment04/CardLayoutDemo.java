package Experiment04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo extends JFrame implements ActionListener {
    CardLayout card;
    JButton b1, b2, b3;
    Container c;

    CardLayoutDemo() {
        c = getContentPane();
        card = new CardLayout(40, 30);
        c.setLayout(card);
        b1 = new JButton("Apple");
        b2 = new JButton("Boy");
        b3 = new JButton("Car");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.add("a", b1);
        c.add("b", b2);
        c.add("c", b3);
        setVisible(true);
        setSize(500, 500);
    }

    public void actionPerformed(ActionEvent ae) {
        card.next(c);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}