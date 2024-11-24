import javax.swing.*;
import java.awt.*;
import java.util.*; 
import javax.swing.tree.*;
import java.util.*;
import java.io.*;
public class TreeDemo3 extends JFrame{
    int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
    Color teal= new Color(0,128,128);
    JTree jt;
    JScrollPane jsp;
    TreeDemo3(){
        File directoryPath = new File("C:/");
        String rootFolders[] = directoryPath.list();
        Vector<String[]> vfolders=new Vector<String[]>();
        for(String data:rootFolders){
            File dataPath=new File("C:/"+data+"/");
            vfolders.add(dataPath.list());
        }
        Container co=getContentPane();
        setLayout(new GridLayout(1,1));
            DefaultMutableTreeNode root=new DefaultMutableTreeNode("root");
            for (int i=0;i<rootFolders.length;i++){
                DefaultMutableTreeNode dmt=new DefaultMutableTreeNode(rootFolders[i]);
                root.add(dmt);
                for(int j=0; j<vfolders.size();j++){
                    dmt.add(new DefaultMutableTreeNode(vfolders.get(j)));
                }
            }
        jt=new JTree(root);
        jsp=new JScrollPane(jt,vsb,hsb);
        co.add(jsp);
        co.setBackground(teal);
        setVisible(true);
        setSize(500,500);
        setTitle("TreeDemo3");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args){
        TreeDemo3 td=new TreeDemo3();
    }
}