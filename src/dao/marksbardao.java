package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import db.db;
import entity.marksbar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class marksbardao {

    public int insert(marksbar marksbar) {
        Connection conn = db.getConn();
        int i = 0;
        String sql = "insert into marksbar (username,sdate,mark) values(?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, marksbar.getUsername());
            pstmt.setString(2, marksbar.getsdate());
            pstmt.setString(3,   marksbar.getmark());

            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public ArrayList<marksbar> getmarksbar() {
        Connection conn = db.getConn();
        String sql = "select * from marksbar";
        PreparedStatement pstmt;
        ArrayList<marksbar>  armarksbar=new ArrayList<marksbar>();

        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                marksbar marksbar=new marksbar();
                marksbar.setId(rs.getString(1) );
                marksbar.setUsername(rs.getString(2));
                marksbar.setsdate(rs.getString(3));
                marksbar.setmark(rs.getString(4));

                armarksbar.add(marksbar);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return armarksbar;
    }

    public Integer getAll() {
        Connection conn = db.getConn();
        String sql = "select * from marksbar";
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
}
