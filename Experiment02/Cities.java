import java.awt.*;
import java.applet.*;

public class Cities extends Applet{
    List l;
    public void init(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        l=new List();
        String items[]={"Mumbai","Delhi","Bangalore","Hyderabad","Ahemdabad","Chennai","Kolkata","Surat","Pune","Jaipur"};
        for(String item:items){
            l.add(item);
        }           
        add(l);
    }
}
/*<applet code="Cities.class" width=500 height=500 ></applet> */