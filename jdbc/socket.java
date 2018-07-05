package socket;

import java.sql.*;
import oracle.jdbc.driver.*;

class socket
{
public static void main (String args [])
throws SQLException
{
// Load the Oracle JDBC driver
DriverManager.registerDriver
(new oracle.jdbc.driver.OracleDriver());
Connection conn = DriverManager.getConnection
("jdbc:oracle:thin:@10.16.25.150:1521:orcl","test","test");

// Create Oracle DatabaseMetaData object
DatabaseMetaData meta = conn.getMetaData ();

// gets driver info:
System.out.println("JDBC driver version is " + meta.getDriverVersion());
System.out.println("Database is connected");
}
}