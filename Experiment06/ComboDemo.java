import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboDemo extends JFrame implements ItemListener{
    JComboBox jcb1,jcb2;
    JLabel l;
    ComboDemo(){
        String[] subjects={"Solapur","Pune","Mumbai","Bangalore"};
        Container co= getContentPane();
        jcb1 = new JComboBox(subjects);
        jcb1.addItemListener(this);
        l= new JLabel();
        l.setPreferredSize(new Dimension(250,100));
        co.add(jcb1); 
        co.add(l);
        co.setLayout(new FlowLayout());
	setVisible(true);       
        setSize(500,500);
        setTitle("Combo's");       
    }

    public void itemStateChanged(ItemEvent e){
        l.setText("You are in "+jcb1.getSelectedItem());
    }

    public static void main(String[] args){
        new ComboDemo();
    }
    
}