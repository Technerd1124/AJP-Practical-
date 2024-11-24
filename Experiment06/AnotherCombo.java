import java.awt.*;
import java.util.*;
import javax.swing.*;

public class AnotherCombo extends JFrame{
// Declaration
    JComboBox jcb1,jcb2;

    AnotherCombo(){
    // Data Variables
        String[] subjects={"Kerala","Uttar Pradesh","Punjab","Maharashtra"};
        

    // Get Container
        Container co= getContentPane();

    //  Create and Add Components    
        jcb1 = new JComboBox(subjects);
      
    // Add Components to Container
        co.add(jcb1);

    // Customize Container
        co.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

        setVisible(true);       
        setSize(500,500);
        setTitle("Combo's2");       
    }
    public static void main(String[] args){
        new AnotherCombo();
    }
    
}
