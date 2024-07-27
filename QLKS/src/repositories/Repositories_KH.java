/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Model.Model_QLKH;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Repositories_KH {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_QLKH> getAll_KH() {
        ArrayList<Model_QLKH> list_KhachHang = new ArrayList<>();

        sql = "Select MAKH, TenKhachHang, NgaySinh, CCCD, SoDienThoai, Email, GioiTinh, DiaChi from KHACHHANG";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String maKhachHang;
                String hoTen;
                Date ngaySinh;
                String Cccd;
                String Sdt;
                String Email;
                int gioiTinh;
                String diaChi;

                maKhachHang = rs.getString(1);
                hoTen = rs.getString(2);
                ngaySinh = rs.getDate(3);
                Cccd = rs.getString(4);
                Sdt = rs.getString(5);
                Email = rs.getString(6);
                gioiTinh = rs.getInt(7);
                diaChi = rs.getString(8);

                Model_QLKH m = new Model_QLKH(maKhachHang, hoTen, ngaySinh, Cccd, Sdt, Email, gioiTinh, diaChi);
                list_KhachHang.add(m);
            }
            return list_KhachHang;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int them_KH(Model_QLKH m) {
        sql = "insert into KHACHHANG(MAKH, TenKhachHang, NgaySinh, CCCD, SoDienThoai, Email, GioiTinh, DiaChi )\n"
                + "values(?,?,?,?,?,?,?,?)";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMaKhachHang());
            ps.setObject(2, m.getHoTen());
            ps.setObject(3, m.getNgaySinh());
            ps.setObject(4, m.getCccd());
            ps.setObject(5, m.getSdt());
            ps.setObject(6, m.getEmail());
            ps.setObject(7, m.getGioiTinh());
            ps.setObject(8, m.getDiaChi());

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int xoa_KH(String maKhachhang) {
        sql = "Delete  from KHACHHANG where MAKH = ?";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maKhachhang);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int sua_KH(String maKhachHang, Model_QLKH m) {
        sql = "Update KHACHHANG set TenKhachHang = ?, NgaySinh =?, CCCD = ?, SoDienThoai = ?, Email = ?, GioiTinh = ?,DiaChi = ? where MAKH = ?";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);

            ps.setObject(1, m.getHoTen());
            ps.setObject(2, m.getNgaySinh());
            ps.setObject(3, m.getCccd());
            ps.setObject(4, m.getSdt());
            ps.setObject(5, m.getEmail());
            ps.setObject(6, m.getGioiTinh());
            ps.setObject(7, m.getDiaChi());
            ps.setObject(8, maKhachHang);

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ArrayList<Model_QLKH> timKiem_KH(String timKiemKhachHang) {
        ArrayList<Model_QLKH> list_KH = new ArrayList<>();
        sql = "select MAKH, TenKhachHang , NgaySinh, CCCD , SoDienThoai , Email , GioiTinh ,DiaChi from KHACHHANG\n"
                + "where MAKH like ? or SoDienThoai like ? or Email like ? or CCCD like ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%" + timKiemKhachHang + "%");
            ps.setObject(2, "%" + timKiemKhachHang + "%");
            ps.setObject(3, "%" + timKiemKhachHang + "%");
            ps.setObject(4, "%" + timKiemKhachHang + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                String maKhachHang;
                String hoTen;
                Date ngaySinh;
                String Cccd;
                String Sdt;
                String Email;
                int gioiTinh;
                String diaChi;

                maKhachHang = rs.getString(1);
                hoTen = rs.getString(2);
                ngaySinh = rs.getDate(3);
                Cccd = rs.getString(4);
                Sdt = rs.getString(5);
                Email = rs.getString(6);
                gioiTinh = rs.getInt(7);
                diaChi = rs.getString(8);

                Model_QLKH m = new Model_QLKH(maKhachHang, hoTen, ngaySinh, Cccd, Sdt, Email, gioiTinh, diaChi);
                list_KH.add(m);
            }
            return list_KH;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String checkTrung_KH(String maKhachHang_moi, String soDienThoai, String cccd, String email) {
        sql = "SELECT MAKH, SoDienThoai, CCCD, Email FROM KHACHHANG WHERE MAKH = ? OR SoDienThoai = ? OR CCCD = ? OR Email = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, maKhachHang_moi);
            ps.setString(2, soDienThoai);
            ps.setString(3, cccd);
            ps.setString(4, email);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("MAKH").equals(maKhachHang_moi)) {
                    return "Mã khách hàng đã tồn tại!";
                }
                if (rs.getString("SoDienThoai").equals(soDienThoai)) {
                    return "Số điện thoại đã tồn tại!";
                }
                if (rs.getString("CCCD").equals(cccd)) {
                    return "Căn cước công dân đã tồn tại!";
                }
                if (rs.getString("Email").equals(email)) {
                    return "Email đã tồn tại!";
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return "Có lỗi xảy ra khi kiểm tra dữ liệu.";
        }
    }

}
