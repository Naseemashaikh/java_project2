
package airlinemanagmentsystem3;
import java.sql.*;
public class Conn {
    //connecting with mysql stp2
    Connection c;
    Statement s;
    public Conn(){
        try{
            //registring the driver step 1
          Class.forName("com.mysql.cj.jdbc.Driver"); 
          c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem","root","Naseema@12345");
          //stemp3 writing statement
          s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
