import javax.swing.*;
import java.awt.*;
import java.util.*; 
import javax.swing.tree.*;
import java.util.*;

public class TreeDemo2 extends JFrame{
    int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
    Color teal= new Color(0,128,128);
    JTree jt;
    JScrollPane jsp;

    TreeDemo2(){
        String[] javaClasses={"AWT","Swing"};
        String[][] data={{"Label","Button","Checkbox","Choice","List","TextField","TextArea"},{"JLabel","JButton","JCheckBox","JComboBox","JRadioButton","JTextField",
"JScrollPane","JTable"}};
        Container co=getContentPane();
        setLayout(new GridLayout(1,1));
            DefaultMutableTreeNode root=new DefaultMutableTreeNode("Java");
            for (int i=0;i<javaClasses.length;i++){
                DefaultMutableTreeNode dmt=new DefaultMutableTreeNode(javaClasses[i]);
                root.add(dmt);
                for(int j=0; j<data[i].length;j++){
                    dmt.add(new DefaultMutableTreeNode(data[i][j]));
                }
            }
        jt=new JTree(root);
        jsp=new JScrollPane(jt,vsb,hsb);
        co.add(jsp);
        co.setBackground(teal);
        setVisible(true);
        setSize(500,500);
        setTitle("TreeDemo2");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
    }
    public static void main(String[] args){
        TreeDemo2 td=new TreeDemo2();
    }
    
}
