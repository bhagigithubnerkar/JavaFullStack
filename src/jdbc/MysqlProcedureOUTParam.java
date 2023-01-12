package jdbc;

import java.sql.*;

/**
 * mysql> create procedure get_max_age(OUT maxage int)
 * begin
 * select MAX(age) into maxage from student;
 * end;
 * /
 * <p>
 * mysql> select @A
 * /
 *
 * @A 27
 * 1 row in set (0.00 sec)
 */

public class MysqlProcedureOUTParam {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java7Sept";
        String username = "root";
        String password = "Bhagyashri@nerkar";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        CallableStatement cs = con.prepareCall("{call get_max_age(?)}");
        cs.setInt(1, 27);
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
        }
        con.close();
    }
}
