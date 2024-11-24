import java.awt.*;
import javax.swing.*;

public class JPasswordDemo extends JFrame {
    Container co;
    JPasswordDemo(){
        co = getContentPane();

        JPasswordField jp = new JPasswordField();
        jp.setEchoChar('#');
        co.add(jp);

        setLayout(new GridLayout(10,1));
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JPasswordDemo();
    }
}
