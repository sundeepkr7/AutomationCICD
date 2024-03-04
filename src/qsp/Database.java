package qsp;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Database {
	
	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(null);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet47","root","root");
		Statement state = con.createStatement();
		String query ="select * from students";
		ResultSet result = state.executeQuery(query);
		con.close();
		

	}

}
