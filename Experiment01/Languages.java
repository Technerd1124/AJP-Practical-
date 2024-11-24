import java.awt.*;
import java.awt.event.*;

class Languages extends Frame{
    Languages(){
        setLayout(null);
        int x=500,y=500;

        String languages[]={"Mandarin Chinese","Spanish","English","Hindi/Urdu","Arabic","Bengali","Portuguese","Russian","Japanese","German","Javanese","Punjabi","Wu","French","Telugu","Vietnamese","Marathi","Korean","Tamil","Italian","Turkish","Cantonese/Yue"
        };

        List l = new List(10,true);
        l.setBounds(x-450,y-450,x-100,y-100);

        for (String language: languages){
            l.add(language);
        }

        add(l);

        setTitle("Languages");
        setVisible(true);
        setSize(x,y);

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
    }
    public static void main(String[] args){
        Languages w= new Languages();
    }
}