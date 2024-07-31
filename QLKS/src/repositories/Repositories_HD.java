/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import dbconnect.DBconnect;
import Model.Model_TT;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Repositories_HD {

    private Connection con = null;
    private PreparedStatement pr = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_TT> getAll_HD() {
        sql = "SELECT HD.MAHD, NV.TenNV, KH.TenKhachHang, HD.SoDienThoai, HD.DiaChi, HD.SoPhongDat, HD.GiaBanDau, HD.TongTienDV, HD.TongTienPhong, HD.TrangThai, HD.NgayXuatDon, HD.NgayThanhToan, HD.TienCoc, HD.TongTien, HD.SoTienCanThanhToan\n"
                + "FROM HOADON HD \n"
                + "JOIN KHACHHANG KH ON HD.MAKH = KH.MAKH \n"
                + "JOIN NHANVIEN NV ON HD.MANV = NV.MANV \n";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString("MAHD");
                String tenNV = rs.getString("TenNV");
                String tenKH = rs.getString("TenKhachHang");
                String soDienThoai = rs.getString("SoDienThoai");
                String diaChi = rs.getString("DiaChi");
                int soPhongDat = rs.getInt("SoPhongDat");
                double giaBanDau = rs.getDouble("GiaBanDau");
                double tongTienDV = rs.getDouble("TongTienDV");
                double tongTienPhong = rs.getDouble("TongTienPhong");
                String trangThai = rs.getString("TrangThai");
                Date ngayXuatDon = rs.getDate("NgayXuatDon");
                Date ngayThanhToan = rs.getDate("NgayThanhToan");
                double tienCoc = rs.getDouble("TienCoc");
                double tongTien = rs.getDouble("TongTien");
                double soTienCanThanhToan = rs.getDouble("SoTienCanThanhToan");

                Model_TT tt = new Model_TT(maHD, tenNV, tenKH, soDienThoai, diaChi, soPhongDat, giaBanDau, tongTienDV, tongTienPhong, trangThai, ngayXuatDon, ngayThanhToan, tienCoc, tongTien, soTienCanThanhToan, maHD, maHD, maHD, ngayXuatDon, ngayXuatDon, tienCoc, maHD, maHD, maHD, maHD, tenNV, soPhongDat, tongTien, ngayXuatDon, tongTienDV, maHD, maHD, sql, tongTien, soPhongDat, tongTien);
                listHoaDon.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    public ArrayList<Model_TT> timkiem_MHD(String searchTerm) {
        sql = "SELECT HD.MAHD, NV.TenNV, KH.TenKhachHang, HD.SoDienThoai, HD.DiaChi, HD.SoPhongDat, HD.GiaBanDau, HD.TongTienDV, HD.TongTienPhong, HD.TrangThai, HD.NgayXuatDon, HD.NgayThanhToan, HD.TienCoc, HD.TongTien, HD.SoTienCanThanhToan\n"
                + "FROM HOADON HD\n"
                + "JOIN KHACHHANG KH ON HD.MAKH = KH.MAKH\n"
                + "JOIN NHANVIEN NV ON HD.MANV = NV.MANV\n"
                + "WHERE (HD.MAHD LIKE ? OR HD.SoDienThoai LIKE ? OR KH.TenKhachHang LIKE ? OR NV.TenNV LIKE ?)\n";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, '%' + searchTerm + '%');
            pr.setObject(2, '%' + searchTerm + '%');
            pr.setObject(3, '%' + searchTerm + '%');
            pr.setObject(4, '%' + searchTerm + '%');
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString("MAHD");
                String tenNV = rs.getString("TenNV");
                String tenKH = rs.getString("TenKhachHang");
                String soDienThoai = rs.getString("SoDienThoai");
                String diaChi = rs.getString("DiaChi");
                int soPhongDat = rs.getInt("SoPhongDat");
                double giaBanDau = rs.getDouble("GiaBanDau");
                double tongTienDV = rs.getDouble("TongTienDV");
                double tongTienPhong = rs.getDouble("TongTienPhong");
                String trangThai = rs.getString("TrangThai");
                Date ngayXuatDon = rs.getDate("NgayXuatDon");
                Date ngayThanhToan = rs.getDate("NgayThanhToan");
                double tienCoc = rs.getDouble("TienCoc");
                double tongTien = rs.getDouble("TongTien");
                double soTienCanThanhToan = rs.getDouble("SoTienCanThanhToan");

                Model_TT tt = new Model_TT(maHD, tenNV, tenKH, soDienThoai, diaChi, soPhongDat, giaBanDau, tongTienDV, tongTienPhong, trangThai, ngayXuatDon, ngayThanhToan, tienCoc, tongTien, soTienCanThanhToan, maHD, maHD, maHD, ngayXuatDon, ngayXuatDon, tienCoc, maHD, maHD, maHD, maHD, tenNV, soPhongDat, tongTien, ngayXuatDon, tongTienDV, maHD, maHD, sql, tongTien, soPhongDat, tongTien);
                listHoaDon.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }
}
