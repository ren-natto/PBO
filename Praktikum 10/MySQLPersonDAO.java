import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LENOVO
 */
public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person p) throws Exception {
        String name = p.getName();
        
//        Create connection
//         using the new driven class
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo", "root", "@Natto2005");
         
         String query = "INSERT INTO person(name) VALUES ('" + name + "')";
         System.out.println(query);
         java.sql.Statement s = con.createStatement();
         s.executeUpdate(query);
         
         con.close();
    }
}