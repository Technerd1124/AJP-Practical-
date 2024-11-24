import java.sql.*;

class Exp18d {
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

    public void printStudents(String where) {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Students WHERE " + where + ";");

            while (resultSet.next()) {
                String employee = "Student " + resultSet.getString("ID") + ":" + "\n\tName : "
                        + resultSet.getString("name") + "\n\tPercentage : " + resultSet.getString("percentage");
                System.out.println(employee);
            }
        } catch (SQLException e) {
            System.out.println("Error in Printing Employees With WHERE Condition");
        }
    }

    public static void main(String[] args) {
        Exp18d dbconn = new Exp18d();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (Exception e) {
            System.out.println("Error in Loading Driver");
        }
        dbconn.createConnection();
        dbconn.printStudents("percentage > 70");
    }
}
