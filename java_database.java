JDBC : 

import java.sql.*;

//...................connecting to database:........................

Connection con = null;

String url = "jdbc:mysql://localhost:3306/database_name";
String user = "root";
String password = "psw";

Class.forName("com.mysql.jdbc.Driver");

try
{
	con = DriverManager.getConnection(url,user,password);
}

catch
{
	System.out.println("error in connecting to database" + user + password);
}

// ....................Now creating the query:..........................

String query = "select * from students;"
Statement st = con.createStatement();
ResultSet result = st.executeQuery(query);// for inserting we use "st.executeUpdate(query);"

while(result.next())
{
	System.out.println(result.getString())
}
// ....................close statement and driver:..........................

st.close()
con.close();



