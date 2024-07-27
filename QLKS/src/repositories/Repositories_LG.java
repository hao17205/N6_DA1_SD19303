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

}
