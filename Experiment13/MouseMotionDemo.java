import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotionDemo extends JFrame{
    MouseMotionDemo(){

        Container co = getContentPane();
        JLabel l1 = new JLabel("Mouse Dragged : None");

        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent me){
                l1.setText("Mouse Dragged : (" + me.getX() + 
                ", " + me.getY() + ")");
            }
        });

        co.add(l1);

        setTitle("Mouse");
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MouseMotionDemo();
    }
}
