package starbucksemulator;

import java.sql.*;

/**
 *
 * @author David
 */
public class StarbucksEmulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/starbucksDB;create=true"
                ,"dsscientist","ilovemom100%"); //don't worry, fake useless passsword
        Statement stmt = con.createStatement();
        NumberKeyPopup nkp = new NumberKeyPopup("Logon", stmt);
        nkp.setVisible(true);
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
