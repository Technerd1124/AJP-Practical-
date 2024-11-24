import java.sql.*;

public class Exp19c {
    public String database = "C:\\Users\\deong\\College\\Java\\Manual-Programs\\Experiment19\\MSBTE.accdb";

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

    public void selectQuery() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID, first_name, last_name FROM Student;");
            System.out.println("--------------------------------------");
            System.out.printf("%5s | %13s | %13s\n", "ID", "FirstName", "LastName");
            System.out.println("--------------------------------------");
            while (rs.next()) {
                System.out.printf("%5s | %13s |%13s\n", Integer.toString(rs.getInt("ID")), rs.getString("first_name"),
                        rs.getString("last_name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error in selectQuery()");
        }
    }

    public static void main(String[] args) {
        Exp19c dbconn = new Exp19c();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (Exception e) {
            System.out.println("Error in Loading Driver");
        }
        dbconn.createConnection();
        dbconn.selectQuery();
    }
}
