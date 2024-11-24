import java.sql.*;

class Exp18c {
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

    public void updateQuery(String query) {
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error in updateQuery()");
        }
    }

    public static void main(String[] args) {
        Exp18c dbconn = new Exp18c();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (Exception e) {
            System.out.println("Error in Loading Driver");
        }
        dbconn.createConnection();
        dbconn.updateQuery("DROP TABLE Employee;");
        dbconn.updateQuery("CREATE TABLE Employee (emp_id INTEGER PRIMARY KEY, emp_name VARCHAR(50));");
    }
}
