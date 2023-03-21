package jdbc;

import java.sql.*;

public class MysqlProcedureIN_OUTParam {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java7Sept";
        String username = "root";
        String password = "Bhagyashri@nerkar";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        CallableStatement cs = con.prepareCall("{ call getStudentByNameAndCity(?,?)}");

        cs.setString(1, "Kavita");
        cs.setString(2, "Pune");

        ResultSet rs = cs.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
        }

        CallableStatement cs1 = con.prepareCall("{call get_max_age(?)}");
        cs1.setInt(1, 27);
        ResultSet rs1 = cs1.executeQuery();

        while (rs1.next()) {
            System.out.println(rs1.getInt(1));
        }
        con.close();
    }

}

