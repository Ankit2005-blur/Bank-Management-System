package Bank.Managemnt.System;
//register the driver
//create connection
//create statement
//execute query
//close connection
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    conn()
    {
        try{
           // Class.forName(com.mysql.cj.jdbc.Driver);
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Cricket@123");
             s=c.createStatement();
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
