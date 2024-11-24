import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDemo2 extends JFrame implements MouseMotionListener
{
    Container  co;
    JLabel l1;
    JLabel l2;
    MouseDemo2() {
        co = getContentPane();
        
        l1 = new JLabel("Mouse Moved : None");
        l2 = new JLabel("Mouse Dragged : None");
        
        co.add(l1);
        co.add(l2);
        co.addMouseMotionListener(this);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        setSize(500,500);
    }
    public void mouseDragged(MouseEvent e) {
        l1.setText("Mouse Dragged : " + e.getX() + ", " + e.getY());
    }
    public void mouseMoved(MouseEvent e) {
        l2.setText("Mouse Moved : " + e.getX() + ", " + e.getY());
    }
    public static void main(String[] args) {
        new MouseDemo2();        
    }
}
