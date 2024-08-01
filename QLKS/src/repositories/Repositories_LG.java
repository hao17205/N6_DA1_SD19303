/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Model.Model_LG;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Repositories_LG {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public boolean checkTrung_taiKhoan(String tenDangNhap, String matKhau) {
        String sql = "SELECT * FROM TAIKHOAN WHERE TenDangNhap = ? AND MatKhau = ?";
        try (Connection con = dbconnect.DBconnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, tenDangNhap);
            ps.setString(2, matKhau);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); // Trả về true nếu có kết quả, tức là đăng nhập hợp lệ
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Nếu có lỗi xảy ra, xem như không thành công
        }
    }
    public String getMNV(String taiKhoan, String matKhau1){
        
        sql = "select MANV from TAIKHOAN, NHANVIEN where TAIKHOAN.MATK = NHANVIEN.MATK and TenDangNhap like ? and MatKhau like ?";
        String maNV = null;
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, '%'+taiKhoan+'%');
            ps.setObject(2, '%'+matKhau1+'%');
            rs =ps.executeQuery();
            if (rs.next()) {               
              maNV = rs.getString("MANV");
     
           }
            return maNV;
                
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
