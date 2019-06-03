package dao;

import entity.Teacher;
import db.db;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
public class teacherdao {

    public int insert(Teacher teacher) {
        Connection conn = db.getConn();
        int i = 0;
        String sql = "insert into teachers (Username,Password,Name,Sex,Age) values(?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, teacher.getUsername());
            pstmt.setString(2, teacher.getPassword());
            pstmt.setString(3, teacher.getName());
            pstmt.setString(4, teacher.getSex());
            pstmt.setString(5, teacher.getAge());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }


    public Integer getAll() {
        Connection conn = db.getConn();
        String sql = "select * from teachers";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            System.out.println("============================");
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");

                }
                System.out.println("");
            }
            System.out.println("============================");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Teacher checkUser(String username,String password)
    {   Connection conn = db.getConn();
        String sql = "select * from teachers where username=? and password=? ";
        PreparedStatement pstmt;
        try {
            pstmt= (PreparedStatement)conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            ResultSet rs=pstmt.executeQuery();

            while(rs.next())
            {
                Teacher teacher=new  Teacher();
                teacher.setId(rs.getString(1));
                teacher.setUsername(rs.getString(2));
                teacher.setPassword(rs.getString(3));
                teacher.setSex(rs.getString(4));
                teacher.setage(rs.getString(5));



                return teacher;
            }

            return null;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }

}
