package electricity.billing.system;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Conn {

    Connection c;
    Statement s;
    Conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "Est.19xx");
            s = c.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
