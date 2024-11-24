import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MenuDemo extends Frame{
    MenuDemo(){
        setLayout(new GridLayout(5,5));
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu file=new Menu("File");
        Menu sub=new Menu("Sub-Menu");
        MenuItem m1=new MenuItem("New");
        MenuItem m2=new MenuItem("Open");
        MenuItem subm1=new MenuItem("Save As");
        MenuItem subm2=new MenuItem("Exit");
        mb.add(file);
        file.add(m1);
        file.add(m2);
        file.add(sub);
        sub.add(subm1);
        sub.add(subm2);
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
        MenuDemo g= new MenuDemo();
    }
    
}