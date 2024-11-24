import java.awt.*;
import java.awt.event.*;

class CaptionButtons extends Frame{
    CaptionButtons(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        int x=500,y=100;

        Button ok,reset,cancel;

        ok=new Button("OK");
        reset=new Button("RESET");
        cancel=new Button("CANCEL");

        add(ok);
        add(reset);
        add(cancel);

        setTitle("CaptionButtons");
        setVisible(true);
        setSize(x,y);

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String[] args){
        CaptionButtons w= new CaptionButtons();
    }
}