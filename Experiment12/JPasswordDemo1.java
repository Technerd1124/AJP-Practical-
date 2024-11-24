import java.awt.*;
import javax.swing.*;

public class JPasswordDemo1 extends JFrame {
    Container co;
    JPasswordDemo1(){
        co = getContentPane();

        JTextField jtf = new JTextField();
        JPasswordField jp = new JPasswordField();
        jp.setEchoChar('#');
        co.add(new JLabel("Username : "));
        co.add(jtf);
        co.add(new JLabel("Password : "));
        co.add(jp);
        co.add(new JButton("Submit"));

        setLayout(new GridLayout(10,1));
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JPasswordDemo1();
    }
}
