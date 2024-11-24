import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgressOnCheck extends JFrame implements ItemListener {
    JProgressBar jp;
    JCheckBox jcb1, jcb2;
    int i = 0;
    ProgressOnCheck() {
        Container co = getContentPane();
        setLayout(new FlowLayout(FlowLayout.CENTER));
        jp = new JProgressBar(0, 100);
        jcb1 = new JCheckBox("50%");
        jcb2 = new JCheckBox("50%");
        jp.setStringPainted(true);
        jp.setBounds(40, 50, 200, 30);
        co.add(jp);
        co.add(jcb1);
        co.add(jcb2);
        jcb1.addItemListener(this);
        jcb2.addItemListener(this);
        setVisible(true);
        setSize(300, 200);
        setTitle("ProgressOnCheck");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent ie) {
        if (jcb1.isSelected() && jcb2.isSelected()) {
            i = 100;
        } else if (jcb1.isSelected() || jcb2.isSelected()) {
            i = 50;
        } else {
            i = 0;
        }
        jp.setValue(i);
    }
    public static void main(String[] args) {
        new ProgressOnCheck();
    }
}


