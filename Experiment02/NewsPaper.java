import java.awt.*;
import java.applet.*;

public class NewsPaper extends Applet{
    List l;
    public void init(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        l=new List(4,true);
        String items[]={"Amar Ujala","Dainik Jagran","Dainik Navajyoti","Hari Bhoomi"};
        for(String item:items){
            l.add(item);
        }           
        add(l);
    }
}
/*<applet code="NewsPaper.class" width=500 height=500 ></applet> */