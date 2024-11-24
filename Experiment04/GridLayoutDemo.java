import java.awt.*;
import java.awt.event.*;

class GridLayoutDemo extends Frame{
    GridLayoutDemo(){
        setLayout(new GridLayout(3,2,10,10));
        int n=5;
        for(int i=1; i<=n; i++){
                Button b=new Button("Button "+Integer.toString(i));
                add(b);
        }
      

        setTitle("GridLayoutDemo");
        setVisible(true);
        setSize(400,200);

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    
    public static void main(String[] args){
        GridLayoutDemo gd=new GridLayoutDemo();
    }
}