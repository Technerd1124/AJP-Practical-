import java.util.*;
import java.awt.*;
import javax.swing.*;
public class ProgressDemo extends JFrame{
    JProgressBar jp;
    void ProgressBarTimer(){
        try{
            int i=0;
            while(i<=100){
                jp.setValue(i);
                Thread.sleep(500);
                i+=20;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    ProgressDemo(){
        Container co=getContentPane();
        setLayout(null);
        jp=new JProgressBar(0,100);
        jp.setStringPainted(true);
        jp.setBounds(40,50,200,30);
        co.add(jp);
        setVisible(true);
        setSize(300,200);
        setTitle("ProgressDemo");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args){
        ProgressDemo td=new ProgressDemo();
        td.ProgressBarTimer();
    }
    
}