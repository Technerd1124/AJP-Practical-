import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDemo0 extends JFrame implements MouseListener
{
    Container  co;
    MouseDemo()
    {
        co = getContentPane();
        co.addMouseListener(this);
        setVisible(true);
        setSize(500,500);
    }
    public void mousePressed(MouseEvent e)
    {
        co.setBackground(Color.red);
    }
    public void mouseReleased(MouseEvent e)
    {
        co.setBackground(Color.blue);
    }
    public void mouseEntered(MouseEvent e)
    {
        co.setBackground(Color.yellow);
    }
    public void mouseExited(MouseEvent e)
    {
        co.setBackground(Color.black);
    }
    public void mouseClicked(MouseEvent e)
    {
        co.setBackground(Color.green);
    }
    public static void main(String[] args) {
        new MouseDemo0 ();        
    }
}
