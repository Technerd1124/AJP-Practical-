import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPasswordDemo2 extends JFrame implements ActionListener {
    Container co;
    JPasswordField jp;
    JLabel error;
    JPasswordDemo2(){
        co = getContentPane();

        JTextField jtf = new JTextField();
        jp = new JPasswordField();
        JButton btn = new JButton("Submit");
        error = new JLabel();
        error.setForeground(Color.red);
        jp.setEchoChar('#');
        co.add(new JLabel("Username : "));
        co.add(jtf);
        co.add(new JLabel("Password : "));
        co.add(jp);
        co.add(error);
        co.add(btn);
        btn.addActionListener(this);

        setLayout(new GridLayout(10,1));
        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(jp.getPassword().length < 6){
            error.setText("Password length must be > 6 characters");
        }
    }
    public static void main(String[] args) {
        new JPasswordDemo2();
    }
}
