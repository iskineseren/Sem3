import java.sql.*;

public class Dao {


    public static void opretforbindelse() throws ClassNotFoundException {
        String brugernavn = "1111111111";
        String kode ="1";

        Connection conn = null;
        ResultSet resultset=null;
        try {

            //conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sund", "root", "KODEORD");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\iskin\\Desktop\\Hospital09.db");
            //Afprøvning sqlite*/


            String query    =   "SELECT efternavn FROM Patient WHERE cpr=" + brugernavn + " AND kode=" + kode ;

            Statement statement = conn.createStatement();
            resultset = statement.executeQuery(query);
            String efternavn = resultset.getString("efternavn");
            System.out.println("dette er de fundne resultater " +efternavn);

            System.out.println("Der er oprettet forbindelse" + conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

   /* private void hentbruger() throws SQLException {
        String brugernavn = "1111111111";
        String kode ="1";

        String query    =   "SELECT* FROM Patient WHERE cpr=" + brugernavn + " AND kode=" + kode ;

        Statement statement = conn.createStatement();
        resultset = statement.executeQuery(query);
        System.out.println(resultset);

    }*/


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Dao d = new Dao();
        d.opretforbindelse();

    }
}
