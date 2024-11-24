import java.awt.*;
import java.applet.*;

public class AppChoiceList extends Applet{

    public void init(){
        List l = new List();

        l.add("Summer");
        l.add("Winter");
        l.add("Rainy");

        add(l);
    }
    public void paint(){}

}

// <applet code="AppChoiceList.java" width=300 height=300></applet>