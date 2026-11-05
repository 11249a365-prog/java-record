/*
Experiment 10(a) - Handling Backend Connectivity for Data Retrieval

Aim:
To retrieve student records from MySQL using JDBC and ResultSet.

Algorithm:
1. Run setup.sql on a MySQL server to create the sample database, table and records.
2. Read the connection URL, username and password from environment variables.
3. Connect using DriverManager and create a Statement.
4. Execute SELECT with records ordered by roll number.
5. Read each row using ResultSet and display its values.
6. Close the connection, statement and result set automatically; handle SQLException.

Compile and run (from this folder):
Requirements: JDK 8+, MySQL Server 8.0+ and MySQL Connector/J compatible with
the selected JDK and server. Store the driver JAR outside this repository.
From this folder, open the MySQL client: mysql -u YOUR_USERNAME -p
Enter the password when prompted, then run: SOURCE setup.sql;
Exit the MySQL client before running the Java commands below.
Set environment variables in your shell without committing their values:
JAVA_LAB_DB_URL = jdbc:mysql://localhost:3306/java_lab
JAVA_LAB_DB_USER = your database username
JAVA_LAB_DB_PASSWORD = your database password
Compile: javac Main.java
Run on Windows (replace the external JAR path):
java -cp ".;C:\path\to\mysql-connector-j.jar" Main

Code:
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = System.getenv("JAVA_LAB_DB_URL");
        String user = System.getenv("JAVA_LAB_DB_USER");
        String password = System.getenv("JAVA_LAB_DB_PASSWORD");
        if (url == null || user == null || password == null) {
            System.out.println("Set JAVA_LAB_DB_URL, JAVA_LAB_DB_USER and JAVA_LAB_DB_PASSWORD.");
            return;
        }
        String query = "SELECT roll_no, name, marks FROM students ORDER BY roll_no";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet records = statement.executeQuery(query)) {
            System.out.println("Roll No | Name | Marks");
            while (records.next()) {
                System.out.println(records.getInt("roll_no") + " | "
                        + records.getString("name") + " | " + records.getInt("marks"));
            }
        } catch (SQLException exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}

/*
Output:
JDBC retrieval was not verified: no MySQL connection, credentials or external Connector/J driver were configured. The missing-configuration message was verified.

Verified run without database configuration:
Set JAVA_LAB_DB_URL, JAVA_LAB_DB_USER and JAVA_LAB_DB_PASSWORD.
*/
