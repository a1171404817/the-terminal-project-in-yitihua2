package dao;

import entity.Student;
import db.db;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
public class studentdao {

    public int insert(Student student) {
        Connection conn = db.getConn();
        int i = 0;
        String sql = "insert into students (Username,Password,Name,Sex,Age) values(?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, student.getUsername());
            pstmt.setString(2, student.getPassword());
            pstmt.setString(3, student.getName());
            pstmt.setString(4, student.getSex());
            pstmt.setString(5, student.getAge());
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
        String sql = "select * from students";
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

    public Student checkUser(String username,String password)
    {   Connection conn = db.getConn();
        String sql = "select * from students where username=? and password=? ";
        PreparedStatement pstmt;
        try {
            pstmt= (PreparedStatement)conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2, password);
            ResultSet rs=pstmt.executeQuery();

            while(rs.next())
            {   System.out.println("我执行到了1");
                Student student=new  Student();
                student.setId(rs.getString(1));
                student.setUsername(rs.getString(2));
                student.setPassword(rs.getString(3));
                student.setSex(rs.getString(4));
                student.setage(rs.getString(5));

                System.out.println(rs.getString(1)+":"+rs.getString(2));

                return student;
            }
            System.out.println("我执行到了2");
            return null;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }

}
