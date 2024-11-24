import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgressOnButton extends JFrame implements ActionListener {
    JProgressBar jp;
    JButton b1;

    void progressBarBegin() {
        try {
            int i = 0;
            while (i <= 100) {
                jp.setValue(i);
                jp.paintImmediately(0, 0, 200, 25);
                Thread.sleep(500);
                i += 20;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    ProgressOnButton() {
        Container co = getContentPane();
        setLayout(new FlowLayout(FlowLayout.CENTER));
        jp = new JProgressBar(0, 100);
        b1 = new JButton("Start");
        jp.setStringPainted(true);
        jp.setBounds(40, 50, 200, 30);
        co.add(jp);
        co.add(b1);
        b1.addActionListener(this);
        setVisible(true);
        setSize(300, 200);
        setTitle("ProgressOnButton");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        progressBarBegin();
    }

    public static void main(String[] args) {
        new ProgressOnButton();
    }
}
