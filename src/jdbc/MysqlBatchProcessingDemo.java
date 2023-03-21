package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlBatchProcessingDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java7Sept";
        String username = "root";
        String password = "Bhagyashri@nerkar";
        String insertQuery1 = "insert into student values(6,'Jaya',27,'M.tech','Mumbai');";
        String insertQuery2 = "insert into student values(7,'Pooja',24,'B.tech','Nagpur');";
        String insertQuery3 = "insert into student values(8,'Kavita',26,'B.E.','Vardha');";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement statement = con.createStatement();

        statement.addBatch(insertQuery1);
        statement.addBatch(insertQuery2);
        statement.addBatch(insertQuery3);

        System.out.println("statement.executeBatch()" + statement.executeBatch());
        con.close();
    }
}

