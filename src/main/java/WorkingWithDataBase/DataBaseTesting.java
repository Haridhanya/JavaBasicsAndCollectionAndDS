package WorkingWithDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Install Xampp
 * Start apache and plsql
 * From the local host ,go to phpmyadmin
 * Create new DataBase and create New Tvble
 * Add column nad values for Testing
 * Now Table and Db is ready
 * Add dependency foy mysql connector
 * Then Write the Code
 */



public class DataBaseTesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Conn=DriverManager.getConnection("jdbc:mysql://root@localhost/haritesting");
		Statement st=Conn.createStatement();
		ResultSet result=st.executeQuery("SELECT * FROM users");
		while(result.next()) {
		System.out.println("user : "+result.getString(1)+"-->role : "+result.getString(2));
		}
		

	}

}
