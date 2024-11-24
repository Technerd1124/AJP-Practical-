import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Grid5x5 extends Frame{
    Grid5x5(){
        

        setLayout(new GridLayout(5,5));
        int count=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                Button b = new Button(Integer.toString(count));
                count++;
                add(b);
            }
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
        Grid5x5 g= new Grid5x5();
    }
    
}