/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import java.util.ArrayList;
import Model.Model_ChiTietPhong;
/**
 *
 * @author Chi Dat
 */
public class Repositories_ChiTiet {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    public ArrayList<Model_ChiTietPhong> getAll_ChiTietByMaHD(String maHD){
        sql = "select hdct.MA_P,kh.TenKhachHang\n" +
"from HOADONCHITIET hdct INNER JOIN HOADON hd ON hdct.MAHD = hd.MAHD\n" +
"INNER JOIN KHACHHANG kh on hd.MAKH = kh.MAKH \n" +
"where hd.MAHD = ?";
        ArrayList<Model_ChiTietPhong> list_ChiTiet = new ArrayList<>();
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, maHD);
            rs = ps.executeQuery();
            while(rs.next()){
               
                String maP = rs.getString("MA_P");
                String tenKH = rs.getString("TenKhachHang");
                
                Model_ChiTietPhong m = new Model_ChiTietPhong(maP, tenKH);
                list_ChiTiet.add(m);
            }return list_ChiTiet;
                
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
