import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Button1to9 extends Frame{
    Button1to9(){
        setLayout(new GridLayout(5,5));
        int count=0;
        for(int i=1; i<=10; i++){
                Button b = new Button(Integer.toString(i));
                add(b);
        }
        setTitle("Grid");
        setVisible(true);
        setSize(500,500);

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String[] args){
        Button1to9 g= new Button1to9();
    }
    
}


