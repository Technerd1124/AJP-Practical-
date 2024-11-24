import java.awt.*;
import java.applet.*;

public class Form extends Applet{
    // Component Declaration
    Label l1,l2,l3,l4;
    TextField tf1,tf2;
    TextArea ta1;
    Button b1;
    public void init(){
    // Layout
        setLayout(new GridLayout(20,2));

    // Label
        l1=new Label("Name");
        l2=new Label("Class");
        l3=new Label("Address");
        l4=new Label();

    // TextField
        tf1=new TextField();
        tf2=new TextField();
        
    // TextArea
        ta1=new TextArea();
    // Button
        b1=new Button("Submit");

    // Adding Components to Applet
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(ta1);
        add(l4);
        add(b1);
    }
}
/* <applet code="Form" width=500 height=500></applet> */