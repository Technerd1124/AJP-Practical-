import java.awt.*;
import java.awt.event.*;

public class WelcomeToJava extends Frame{
    WelcomeToJava(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        Label l = new Label("Welcome To Java");
        add(l); 

        setTitle("Welcome To Java");
        setVisible(true);
        setSize(500,100);

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String[] args){
        WelcomeToJava w= new WelcomeToJava();
    }
}