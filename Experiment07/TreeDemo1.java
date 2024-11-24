import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
import java.util.*;

public class TreeDemo extends JFrame{
    int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
    Color teal= new Color(0,128,128);
    JTree jt;
    JScrollPane jsp;

    TreeDemo(){
        String states[]={"Maharashtra"};
        String cities[][]={{"Mumbai","Pune","Nashik","Nagpur"}};
        Container co=getContentPane();
        setLayout(new GridLayout(1,1));
            DefaultMutableTreeNode root=new DefaultMutableTreeNode("India");
            for (int i=0;i<states.length;i++){
                DefaultMutableTreeNode dmt=new DefaultMutableTreeNode(states[i]);
                root.add(dmt);
                for(int j=0; j<cities[i].length;j++){
                    dmt.add(new DefaultMutableTreeNode(cities[i][j]));
                }
            }
            root.add(new DefaultMutableTreeNode("Gujarati"));
        jt=new JTree(root);
        jsp=new JScrollPane(jt,vsb,hsb);

        co.add(jsp);
        co.setBackground(teal);

        setVisible(true);
        setSize(500,500);
        setTitle("TreeDemo");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
    }
    public static void main(String[] args){
        TreeDemo td=new TreeDemo();
    }    
}
