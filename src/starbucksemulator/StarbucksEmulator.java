package starbucksemulator;

import java.sql.*;

/**
 *
 * @author David
 */
public class StarbucksEmulator {

    public static Order order = new Order();
    public static Statement stmt;
    public static DataMover dm = new DataMover();
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/starbucksDB;create=true"
                ,"dsscientist","ilovemom100%"); //don't worry, fake useless passsword
        stmt = con.createStatement();
        NumberKeyPopup nkp = new NumberKeyPopup("LOGON", stmt, dm);
        nkp.setVisible(true);
        dm.guardDone();
        nkp.dispose();
        System.out.println(dm.getInt());
        ResultSet rs = stmt.executeQuery("SELECT * FROM PartnerInfo");
        while (rs.next()) {
            String s = rs.getString("PartnerNumber");
            int i = rs.getInt("Pin");
            System.out.println(s + " " + i);
        }
        MainInterface mi = new MainInterface(stmt);
        mi.setVisible(true);
    }
    
}
