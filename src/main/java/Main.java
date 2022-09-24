import java.sql.*;
// https://zetcode.com/java/postgresql/
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/db01";
        String user = "postgres";
        String password = "easylife";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT VERSION()")) {

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        }
    }
}
