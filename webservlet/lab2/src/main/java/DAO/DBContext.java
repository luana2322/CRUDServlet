package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
protected Connection c=null;

public DBContext() {
	
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
String url = "jdbc:MySQl://localhost:3306/student";
String username = "root";
String password = "";
c = DriverManager.getConnection(url, username, password);




} catch (Exception e) {
	e.printStackTrace();
	// TODO: handle exception
}
}

}
