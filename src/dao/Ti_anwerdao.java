package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import db.db;
import entity.Ti;
import entity.Ti_anwer;
import entity.Tiku;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Ti_anwerdao {
    public int insert(Ti_anwer Ti_anwer) {
        Connection conn = db.getConn();
        int i = 0;
        String sql = "insert into jiandati_anwer (username,ti,youranwer,Mark,DoDate) values(?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, Ti_anwer.getUsername());
            pstmt.setString(2, Ti_anwer.getTi());
            pstmt.setString(3, Ti_anwer.getYouranwer());
            pstmt.setString(4,Ti_anwer.getMark());
            pstmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));

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
        String sql = "select * from jiandati_anwer";
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

    public ArrayList<Ti_anwer> getTiku() {
        Connection conn = db.getConn();
        String sql = "select * from jiandati_anwer";
        PreparedStatement pstmt;
        ArrayList<Ti_anwer>  Ti_anwers=new ArrayList<Ti_anwer>();

        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                Ti_anwer Ti_anwer=new Ti_anwer();
                Ti_anwer.setId(rs.getString(1) );
                Ti_anwer.setUsername(rs.getString(2));
                Ti_anwer.setTi(rs.getString(3));
                Ti_anwer.setYouranwer(rs.getString(4));
                Ti_anwer.setMark(rs.getString(5));
                Ti_anwer.setdodate(rs.getString(6));
                Ti_anwers.add(Ti_anwer);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Ti_anwers;
    }

    public ArrayList<Ti_anwer> getownTiku(String username) {
        Connection conn = db.getConn();
        String sql = "select * from jiandati_anwer where jiandati_anwer.username=?";
        PreparedStatement pstmt;
        ArrayList<Ti_anwer>  Ti_anwers=new ArrayList<Ti_anwer>();

        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            pstmt.setString(1,username);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                Ti_anwer Ti_anwer=new Ti_anwer();
                Ti_anwer.setId(rs.getString(1) );
                Ti_anwer.setUsername(rs.getString(2));
                Ti_anwer.setTi(rs.getString(3));
                Ti_anwer.setYouranwer(rs.getString(4));
                Ti_anwer.setMark(rs.getString(5));
                Ti_anwer.setdodate(rs.getString(6));
                Ti_anwers.add(Ti_anwer);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Ti_anwers;
    }

    public int update(String id,String mark) {
        Connection conn = db.getConn();
        int i = 0;
        String sql = "update jiandati_anwer set jiandati_anwer.mark=? where jiandati_anwer.id=?";
        PreparedStatement pstmt;
        //ti.getTi()  ti.getId()
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);

            pstmt.setString(1,mark);
            pstmt.setString(2, id);
            i = pstmt.executeUpdate();
            System.out.println("resutl: " + i);
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
