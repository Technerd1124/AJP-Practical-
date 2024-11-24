import java.awt.*;
import java.awt.event.*;
public class WindowDemo
{
    Frame f;
    WindowDemo()
    {
        f=new Frame("Window Adapter");
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        });
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new WindowDemo();
    }
} 
