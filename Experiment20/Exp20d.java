import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exp20d {
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

    public void updateQuery(String query) {
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error in updateQuery()");
        }
    }

    public void insertQuery(String id, String name, float price) {
        try {
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Product (ID, Name, Price) VALUES(?,?,?);");
            statement.setString(1, id);
            statement.setString(2, name);
            statement.setFloat(3, price);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error in insertQuery()");
        }
    }

    public void selectQuery(String query) {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String product = "Product " + resultSet.getString("ID") + ":" + "\n\tName : "
                        + resultSet.getString("name") + "\n\tPrice : " + resultSet.getFloat("price");
                System.out.println(product);
            }
        } catch (SQLException e) {
            System.out.println("Error in Printing With WHERE Condition");
        }
    }

    public static void main(String[] args) {
        Exp20d dbconn = new Exp20d();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (Exception e) {
            System.out.println("Error in Loading Driver");
        }
        dbconn.createConnection();

        dbconn.updateQuery("DROP TABLE Product;");
        dbconn.updateQuery("CREATE TABLE Product (ID VARCHAR(10), name VARCHAR(50), price FLOAT);");
        dbconn.insertQuery("P1234", "abc", 300);
        dbconn.insertQuery("P1234", "abc", 900);
        dbconn.insertQuery("P1234", "abc", 700);
        dbconn.selectQuery("SELECT ID , name , price FROM Product WHERE price > 500 AND ID = 'P1234';");

    }

}
