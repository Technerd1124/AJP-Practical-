import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ScrollDemo extends JFrame{
    int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
    JComponent jc;
    JPanel jpanel;
    JScrollPane jsp;
    ScrollDemo(){
        Container co= getContentPane();
 
        jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(20,20));

        jsp=new JScrollPane(jpanel,vsb,hsb);
        
        int val=1;
        for(int i=0; i<20;i++){
             for(int j=0;j<20;j++){
                 jpanel.add(new Button(Integer.toString(j)));
             }
        }
        co.add(jsp);
        co.setLayout(new GridLayout());
        setVisible(true);       
        setSize(500,500);
        setTitle("Combo's");
        
    }
    public static void main(String[] args){
        ScrollDemo sd = new ScrollDemo();
    }
    
}
