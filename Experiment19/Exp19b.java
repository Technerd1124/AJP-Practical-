import java.sql.*;

class Exp19b {
    public String database = "C:\\Users\\deong\\College\\Java\\Manual-Programs\\Experiment19\\SampleDatabase.accdb";

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

    public void updateQuery(int id, String firstName, String lastName) {
        try {
            PreparedStatement stmt = conn.prepareStatement("insert into student values(?,?,?)");
            stmt.setInt(1, id);
            stmt.setString(2, firstName);
            stmt.setString(3, lastName);
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");
        } catch (SQLException e) {
            System.out.println("Error in updateQuery()");
        }
    }

    public static void main(String[] args) {
        Exp19b dbconn = new Exp19b();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (Exception e) {
            System.out.println("Error in Loading Driver");
        }
        dbconn.createConnection();
        dbconn.updateQuery(101, "Abhishek", "Yadav");
    }
}
