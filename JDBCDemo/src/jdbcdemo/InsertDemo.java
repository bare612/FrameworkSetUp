package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertDemo {


    public static void main(String[] args)  throws SQLException {

        String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
        String user = "root";
        String password = "Deans5432";

        Connection connection = null;
        Statement statement = null;

        try {
            connection= DriverManager.getConnection(url,user,password);

            statement = connection.createStatement();

            String query = "insert into movie (id, title, release_year, genre, mpaa_rating)"+
                    " values (3, 'Mr Morgan', 1999, 'Drama', 'PG')";
            statement.execute(query);


        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            statement.close();
            connection.close();



        }
    }

}
