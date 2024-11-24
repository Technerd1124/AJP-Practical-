import java.sql.*;

class Exp18a {
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
        Exp18a dbconn = new Exp18a();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (Exception e) {
            System.out.println("Error in Loading Driver");
        }
        dbconn.createConnection();
        // dbconn.updateQuery("DROP TABLE Student;");
        dbconn.updateQuery("CREATE TABLE Student (rollno COUNTER PRIMARY KEY, name TEXT(50));");
        dbconn.updateQuery("INSERT INTO Student (name) VALUES( 'Deon')");
        dbconn.updateQuery("INSERT INTO Student (name) VALUES( 'Agares')");
    }
}
