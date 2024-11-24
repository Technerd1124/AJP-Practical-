import java.awt.*;
import java.awt.event.*;

class BorderLayoutDemo extends Frame{
    BorderLayoutDemo(){
        setLayout(new BorderLayout(10,10));

        Button north=new Button("North");
        Button south=new Button("South");
        Button east=new Button("East");
        Button west=new Button("West");
        Button center=new Button("Center");

        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);

        setTitle("BorderLayoutDemo");
        setVisible(true);
        setSize(400,400);

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String[] args){
        BorderLayoutDemo bd=new BorderLayoutDemo();
    }
}
