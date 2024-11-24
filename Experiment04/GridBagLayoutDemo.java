import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridBagLayoutDemo extends JFrame {

    GridBagLayoutDemo() {
        Container co = getContentPane();

        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());

        gbc.insets = new Insets(5, 5, 5, 5);

        String labels[] = { "Name", "Description" };
        for (int i = 0; i < 2; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            co.add(new JLabel(labels[i]), gbc);
        }

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JTextField textField = new JTextField(20);
        co.add(textField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        JTextArea textarea = new JTextArea(10, 20);
        gbc.gridwidth = 2;
        co.add(textarea, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        co.add(new JButton("Submit"), gbc);

        setVisible(true);
        setSize(500, 500);
        setTitle("Grid Bag Layout");
    }

    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}
