package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import db.db;
import entity.Tiku;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class tikudao {

    public int insert(Tiku tiku) {
        Connection conn = db.getConn();
        int i = 0;
        String sql = "insert into tiku (username,ti,rightanwer,youranwer,Mark,DoDate) values(?,?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, tiku.getUsername());
            pstmt.setString(2, tiku.getTi());
            pstmt.setString(3, tiku.getRightAnwer());
            pstmt.setString(4, tiku.getYourAnwer());
            pstmt.setString(5, tiku.getMark());
            pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    public ArrayList<Tiku> getTiku() {
        Connection conn = db.getConn();
        String sql = "select * from tiku";
        PreparedStatement pstmt;
        ArrayList<Tiku>  tikus=new ArrayList<Tiku>();

        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                Tiku tiku=new Tiku();
                tiku.setId(rs.getString(1) );
                tiku.setUsername(rs.getString(2));
                tiku.setTi(rs.getString(3));
                tiku.setRightAnwer(rs.getString(4));
                tiku.setYourAnwer(rs.getString(5));
                tiku.setMark(rs.getString(6));
                tiku.setDoDate(rs.getString(7));
                tikus.add(tiku);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tikus;
    }

    public Integer getAll() {
        Connection conn = db.getConn();
        String sql = "select * from tiku";
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

    public ArrayList<Tiku> getownTiku(String username) {
        Connection conn = db.getConn();
        String sql = "select * from tiku WHERE tiku.username=?";
        PreparedStatement pstmt;
        ArrayList<Tiku>  tikus=new ArrayList<Tiku>();

        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            pstmt.setString(1,username);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                Tiku tiku=new Tiku();
                tiku.setId(rs.getString(1) );
                tiku.setUsername(rs.getString(2));
                tiku.setTi(rs.getString(3));
                tiku.setRightAnwer(rs.getString(4));
                tiku.setYourAnwer(rs.getString(5));
                tiku.setMark(rs.getString(6));
                tiku.setDoDate(rs.getString(7));
                tikus.add(tiku);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tikus;
    }
}
