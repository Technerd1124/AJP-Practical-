import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo0 extends JFrame implements KeyListener {
    JLabel label;

    KeyEventDemo0() {
        Container co = getContentPane();

        label = new JLabel();
        JTextArea ta = new JTextArea();

        co.add(ta);
        co.add(label);

        ta.addKeyListener(this);

        setSize(500, 500);
        setLayout(new GridLayout(2, 1));
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new KeyEventDemo0();
    }
}