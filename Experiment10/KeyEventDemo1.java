import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo1 extends JFrame implements KeyListener {
    int vsb = JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
    int hsb = JScrollPane.HORIZONTAL_SCROLLBAR_NEVER;
    Container co;
    JTextArea ta;

    KeyEventDemo1() {
        co = getContentPane();

        ta = new JTextArea(10, 25);
        ta.setEnabled(false);
        ta.setBackground(Color.black);
        JScrollPane jsp = new JScrollPane(ta, vsb, hsb);

        addKeyListener(this);

        co.add(jsp);

        setSize(500, 500);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
    }

    public void keyReleased(KeyEvent ke) {
        String c;
        int k = ke.getKeyCode();
        switch (k) {
            case KeyEvent.VK_ALT:
                c = "ALT";
                break;
            case KeyEvent.VK_CONTROL:
                c = "CTRL";
                break;
            case KeyEvent.VK_SHIFT:
                c = "SHIFT";
                break;
            default:
                c = "" + ke.getKeyChar();
                break;

        }
        String str = ta.getText() + "\n" + c + " was RELEASED";
        ta.setText(str);
    }

    public void keyPressed(KeyEvent ke) {
        String c;
        int k = ke.getKeyCode();
        switch (k) {
            case KeyEvent.VK_ALT:
                c = "ALT";
                break;
            case KeyEvent.VK_CONTROL:
                c = "CTRL";
                break;
            case KeyEvent.VK_SHIFT:
                c = "SHIFT";
                break;
            default:
                c = "" + ke.getKeyChar();
                break;

        }
        String str = ta.getText() + "\n" + c + " was PRESSED";
        ta.setText(str);
    }

    public void keyTyped(KeyEvent ke) {
        String c;
        int k = ke.getKeyCode();
        switch (k) {
            case KeyEvent.VK_ALT:
                c = "ALT";
                break;
            case KeyEvent.VK_CONTROL:
                c = "CTRL";
                break;
            case KeyEvent.VK_SHIFT:
                c = "SHIFT";
                break;
            default:
                c = "" + ke.getKeyChar();
                break;

        }
        String str = ta.getText() + "\n" + c + " was TYPED";
        ta.setText(str);
    }

    public static void main(String[] args) {
        new KeyEventDemo1();
    }
}