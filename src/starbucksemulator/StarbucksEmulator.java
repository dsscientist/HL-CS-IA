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
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/starbuckdDB;create=true","dsscientist","ilovemom100%");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM PartnerInfo");
        while (rs.next()) {
            String s = rs.getString("PartnerNumber");
            int i = rs.getInt("Pin");
            System.out.println(s + " " + i);
        }
        MainInterface mi = new MainInterface();
        mi.setVisible(true);
    }
    
    
    public static boolean authenticate(String username, int pin) {
        return true;
        
    }
}
