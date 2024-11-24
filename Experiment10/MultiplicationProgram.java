import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiplicationProgram extends JFrame implements ActionListener {
    Container co;
    JTextField jtf1, jtf2, jtf3;
    JButton b1, b2;

    MultiplicationProgram() {
        co = getContentPane();

        b1 = new JButton("Multiplication");
        jtf1 = new JTextField();
        jtf2 = new JTextField();
        jtf3 = new JTextField();

        co.add(jtf1);
        co.add(jtf2);
        co.add(b1);
        co.add(jtf3);

        b1.addActionListener(this);

        setLayout(new GridLayout(10, 2));

        setTitle("MultiplicationProgram");
        setSize(500, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        float a = Float.parseFloat(jtf1.getText());
        float b = Float.parseFloat(jtf2.getText());
        jtf3.setText("Result : " + Float.toString((a * b)));
    }

    public static void main(String[] args) {
        new MultiplicationProgram();
    }
}