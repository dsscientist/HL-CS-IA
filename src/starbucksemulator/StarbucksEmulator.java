package starbucksemulator;

import java.sql.*;

/**
 *
 * @author David
 */
public class StarbucksEmulator {

    public static Order order = new Order();
    public static Connection con;
    public static Statement stmt;
    public static DataMover dm = new DataMover();
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/starbucksDB;create=true"
                ,"dsscientist","ilovemom100%"); //don't worry, fake useless passsword
        stmt = con.createStatement();
        //NumberKeyPopup nkp = new NumberKeyPopup("LOGON", stmt, dm);
        //nkp.setVisible(true);
        //dm.guardDone();
        //nkp.dispose();
        MainInterface mi = new MainInterface(stmt, order);
        mi.setVisible(true);
    }
    
}
