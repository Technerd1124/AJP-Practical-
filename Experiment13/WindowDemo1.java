import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowDemo1 extends JFrame
{
    WindowDemo1()
    {
        Container co = getContentPane();

        JLabel l1 = new JLabel("Label");

        co.add(l1);

        addWindowListener(new WindowAdapter(){
            public void windowActivated(WindowEvent e){
                l1.setText("Activated");
            } 
            public void windowDeactivated(WindowEvent arg0) {  
                l1.setText("Deactivated");  
            }  
        });

        setLayout(new GridLayout(10,1));
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new WindowDemo1();
    }
} 
