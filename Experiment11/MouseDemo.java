import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <APPLET CODE ="MouseDemo" WIDTH=300 HEIGHT=200> </APPLET> */
public class MouseDemo extends Applet implements MouseListener {
    Label l;

    public void init() {
        addMouseListener(this);
        setLayout(null);
        l = new Label("Hello Mouse");
        l.setBounds(50, 150, 200, 100);
        add(l);
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed no. of clicks:" + e.getClickCount() + "at position" + e.getX() + "," + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released; # of clicks:" + e.getClickCount());
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("mouse clicked(# of clicks:" + e.getClickCount());
    }
}
