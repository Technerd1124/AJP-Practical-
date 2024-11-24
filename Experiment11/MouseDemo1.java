import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDemo1 extends JFrame implements MouseListener
{
    Container  co;
    int counter = 0;
    JLabel label;
    MouseDemo1() {
        co = getContentPane();
        label = new JLabel("Counter : "  + counter);
        co.add(label);
        co.addMouseListener(this);
        co.setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        setSize(500,200);
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void mouseClicked(MouseEvent e) {
        counter++;
        label.setText("Counter : " + counter);
    }
    public static void main(String[] args) {
        new MouseDemo1();        
    }
}
