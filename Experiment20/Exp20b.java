import java.sql.*;

public class Exp20b {
    public String database = "C:\\Users\\deong\\College\\Java\\Manual-Programs\\Experiment20\\SampleDatabase.accdb";

    private Connection conn;

    // Create Connection
    public void createConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:ucanaccess://" + database);
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            System.exit(1);
        }
    }

    public void query() {
        try {
            PreparedStatement st = conn.prepareStatement("update student set roll_no = 3 where name = 'Abhishek'");
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error in Query");
        }
    }

    public static void main(String[] args) {
        Exp20b dbconn = new Exp20b();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (Exception e) {
            System.out.println("Error in Loading Driver");
        }
        dbconn.createConnection();
        dbconn.query();

    }
}