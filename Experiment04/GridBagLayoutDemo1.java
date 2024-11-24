import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridBagLayoutDemo1 extends JFrame {
    int buttons[][] = { { 0, 0 }, { 1, 0 }, { 0, 1 }, { 1, 1 } };
    String buttonLabels[] = { "One", "Two", "Three", "Four" };

    GridBagLayoutDemo1() {
        Container co = getContentPane();

        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);

        for (int i = 0; i < buttons.length; i++) {
            gbc.gridx = buttons[i][0];
            gbc.gridy = buttons[i][1];
            co.add(new JButton("Button " + buttonLabels[i]), gbc);
        }

        gbc.insets = new Insets(10, 5, 5, 5);
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 3;
        co.add(new JButton("Button Five"), gbc);

        setVisible(true);
        setSize(500, 500);
        setTitle("Grid Bag Layout");
    }

    public static void main(String[] args) {
        new GridBagLayoutDemo1();
    }
}
