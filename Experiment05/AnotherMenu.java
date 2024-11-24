import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class AnotherMenu extends Frame{
    AnotherMenu(){
        setLayout(new GridLayout(5,5));
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu file=new Menu("File");
        MenuShortcut ms1=new MenuShortcut(KeyEvent.VK_X);
        MenuShortcut ms2=new MenuShortcut(KeyEvent.VK_S,true);
        MenuShortcut ms3=new MenuShortcut(KeyEvent.VK_O);
        MenuShortcut ms4=new MenuShortcut(KeyEvent.VK_N);

        MenuItem m1=new MenuItem("New",ms4);
        MenuItem m2=new MenuItem("Open",ms3);
        MenuItem m3=new MenuItem("Save As",ms2);
        MenuItem m4=new MenuItem("Exit",ms1);

        mb.add(file);
        file.add(m1);
        file.add(m2);
        file.add(m3);
        file.addSeparator();
        file.add(m4);

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
        AnotherMenu g= new AnotherMenu();
    }
}
