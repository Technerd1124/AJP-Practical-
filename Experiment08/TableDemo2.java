import java.awt.*;
import javax.swing.*;
class TableDemo2 extends JFrame{
    JTable jt;
    JScrollPane js;
    TableDemo2(){
        String colHeads[]={"Name","Percentage","Grade"};
        String data[][]={{"Amanda Knapp","79","C"},{"Zidane Rossi","72","C"}
,{"Willie Palacios","98","A"},{"Alex Christian","58","E"},
{"Khloe Cotton","52","E"},{"Nadeem Green","100","A"},
{"Andreas Patterson","94","A"},{"Yasmin Jennings","77","C"},
{"Akram Mcgill","90","A"},{"Sahib Mcdonnell","44","E"},
{"Zayden Young","80","B"},{"Ayse Blackmore","85","B"},
{"Adina Moon","49","E"},{"Pollyanna Timms","95","A"},
{"Brayden Mack","67","D"},{"Aishah Hartley","65","D"},
{"Aamir Oakley","96","A"},{"Irving Herrera","56","E"},
{"Rayhan Mckenzie","75","C"},{"Montague Crouch","50","E"},
{"Ingrid Mullen","84","B"},{"Madison Benitez","99","A"},
{"Rosie Marin","41","E"},{"Kurtis Ahmad","71","C"},{"Renae Rudd","92","A"},{"Jo Moyer","51","E"},{"Rupert Roche","93","A"},{"Arwen Whitehead","46","E"},{"Lance Curran","89","B"},{"Rhianna Driscoll","55","E"}};
        Container co = getContentPane();
        setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
        jt=new JTable(data,colHeads);
        js=new JScrollPane(jt);
        co.add(js);
        setVisible(true);
        setSize(500,500);
    }
    public static void main(String[] args){
        TableDemo2 sd=
        new TableDemo2();
    } 
}