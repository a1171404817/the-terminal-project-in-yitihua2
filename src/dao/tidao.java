package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import db.db;
import entity.Tiku;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import entity.*;
public class tidao {

    public int update(Ti ti) {
        Connection conn = db.getConn();
        int i = 0;
        String sql = "update jiandatiku set jiandatiku.ti=? where jiandatiku.id=?";
        PreparedStatement pstmt;
        //ti.getTi()  ti.getId()
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, ti.getTi());
            pstmt.setString(2, ti.getId());
            i = pstmt.executeUpdate();
            System.out.println("resutl: " + i);
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }


    public ArrayList<Ti> getAll() {
        Connection conn = db.getConn();
        String sql = "select * from jiandatiku";
        PreparedStatement pstmt;
        ArrayList<Ti> arti=new ArrayList<Ti>();
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                Ti ti =new Ti();
                    ti.setId(rs.getString(1));
                    ti.setTi(rs.getString(2));

                    arti.add(ti);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arti;
    }


}
