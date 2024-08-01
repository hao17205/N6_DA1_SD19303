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
    public int them_HD6(Model_HD3 hd6){
        sql = "insert into HOADON(MAHD,MAKH,MANV,SoDienThoai,DiaChi,TienCoc) values(?,?,?,?,?,?)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, hd6.getMaHD());
            ps.setObject(2, hd6.getMaKH());
            ps.setObject(3, hd6.getMaNV());
            ps.setObject(4, hd6.getSoDienThoai());
            ps.setObject(5, hd6.getDiaChi());
            ps.setObject(6, hd6.getTienCoc());
            return ps.executeUpdate();
                    
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
