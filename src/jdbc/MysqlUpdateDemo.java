package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlUpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Java7Sept";
        String username = "root";
        String password = "Bhagyashri@nerkar";
        String updateQuery = "update student set class = 'BE' where name = 'Minal';";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = con.prepareStatement(updateQuery);
            int n = preparedStatement.executeUpdate();
            System.out.println(n + " row/s updated");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
