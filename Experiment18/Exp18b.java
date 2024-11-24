import java.sql.*;

public class Exp18b {
    public String database = "C:\\Users\\deong\\College\\Java\\Manual-Programs\\Experiment18\\SampleDatabase.accdb";

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

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Close Connection Failed ?");
        }
    }

    public void query() throws SQLException {
        Statement st = conn.createStatement();
        String str = "select * from student";
        ResultSet rs = st.executeQuery(str);
        String text = " ";
        System.out.println("Roll Number \t Name");
        while (rs.next()) {
            text = text + rs.getInt(1) + "\t" + rs.getString(2) + "\n";
        }
        System.out.print(text);
    }

    public static void main(String[] args) throws SQLException {

        Exp18b dbconn = new Exp18b();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (Exception e) {
            System.out.println("Error in Loading Driver");
        }
        dbconn.createConnection();
        System.out.println("Connection to the database created");
        dbconn.query();
    }
}
