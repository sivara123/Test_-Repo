package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","employee","siva123");
			if (connection != null) {
				System.out.println("DataBase connection Success");
			}else {
				System.out.println("DataBase connection Failed");
			}
			Statement statement = connection.createStatement();
			
			String create_database ="create database Company";

			String use_create_database = "use Company";
			
			String create_table ="create table Employeedata ("+"Empcode int(5),"+ "EmpName varchar(5)," + "Emppage int(5)," + "Empsalary int(5))";
		
			String insert_values = "insert into empdata values " + "(101,'Jenny',25,10000),"+"(102,'Jacky',30,20000),"+ "(103,'Joe  ',20,40000)," 
			
				                	+ "(103,'Joe',20,40000)," +"(104,'John ',40,80000)," +"(105,'Shameer',25,90000)";                            
					                                               
					                                              
			statement.execute(create_database);
			statement.execute(use_create_database);
			statement.execute(create_table);
			statement.execute(insert_values);
			
			String select = "select * from Company";

			ResultSet rs = statement.executeQuery(select);
		     while (rs.next()) {
		    	 System.out.println(rs.getInt("Empcode")+ "  " + rs.getString("EmpName")+"    "+ rs.getInt("Emppage")+"     "+rs.getInt("Empsalary"));

			}
		     connection.close();	
		
	}

}
 