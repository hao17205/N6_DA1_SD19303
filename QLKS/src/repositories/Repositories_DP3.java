/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import Model.Model_DP3;




/**
 *
 * @author Chi Dat
 */
public class Repositories_DP3 {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = "";
    
    public int them_DP3(Model_DP3 dp3){
        String sql1 = "insert into HOADON(MAHD,MAKH,MANV,SoDienThoai,DiaChi,TienCoc) values(?,?,?,?,?,?)";
        String sql2 = "insert into HOADONCHITIET(MA_HDCT,MAHD,MA_P,CheckIn,CheckOut) values(?,?,?,?,?)";
        
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql1);
            ps.setString(1, dp3.getMaHD());
            ps.setString(2, dp3.getMaKH());
            ps.setString(3, dp3.getMaNV());
            ps.setString(4, dp3.getSoDienThoai());
            ps.setString(5, dp3.getDiaChi());
            ps.setDouble(6, dp3.getTienCoc());
            ps.executeUpdate();
            ps = con.prepareStatement(sql2);
            ps.setString(1, dp3.getMa_HDCT());
            ps.setString(2, dp3.getMaHD());
            ps.setString(3, dp3.getMaPhong());
            ps.setDate(4, new java.sql.Date(dp3.getCheckIn().getTime()));
            ps.setDate(5, new java.sql.Date(dp3.getCheckIn().getTime()));
            ps.executeUpdate();
            
            Repositories_TTPhong rp_TTPhong = new Repositories_TTPhong();
            rp_TTPhong.sua_TT(dp3.getMaPhong(), "Đang sử dụng");
            
            return 1;
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
}
