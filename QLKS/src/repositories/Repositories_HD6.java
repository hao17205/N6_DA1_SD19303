/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import Model.Model_HD3;
/**
 *
 * @author Chi Dat
 */
public class Repositories_HD6 {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    public int sua_HD6(String maHD1,Model_HD3 hd6){
        sql = "update HOADON set MAKH = ? , MANV = ? , SoDienThoai = ? , DiaChi = ? , TienCoc = ?\n" +
"where MAHD = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, hd6.getMaKH());
            ps.setObject(2, hd6.getMaNV());
            ps.setObject(3, hd6.getSoDienThoai());
            ps.setObject(4, hd6.getDiaChi());
            ps.setObject(5, hd6.getTienCoc());
            ps.setObject(6, maHD1);
            
      
            return ps.executeUpdate();
                    
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
