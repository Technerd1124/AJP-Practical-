import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ColorMenu extends Frame{
    ColorMenu(){
        setLayout(new GridLayout(5,5));
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu file=new Menu("File");
        String colors[]={"Red","Blue","Green","Yellow","White","Black"};
        for(String color:colors){
            MenuItem mi=new MenuItem(color);
            if(color=="Black"){
                file.add(mi);
                mi.setEnabled(false);
            }
            else{
                file.add(color);
            }
        }
        mb.add(file);
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
        ColorMenu g= new ColorMenu();
    }
    
}