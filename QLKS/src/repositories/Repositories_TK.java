/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Model.Model_TK;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rinbo
 */
public class Repositories_TK {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    // getall tổng số hóa đơn trong  ngày
    public ArrayList<Model.Model_TK> getALl_THD1N() {
        ArrayList<Model.Model_TK> List_THD1N = new ArrayList<>();
        sql = "SELECT COUNT(MAHD) FROM HOADON WHERE CAST(NgayThanhToan AS DATE) = CAST(GETDATE() AS DATE)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int THD = rs.getInt(1);
                Model.Model_TK m = new Model_TK(THD);
                List_THD1N.add(m);
            }
            return List_THD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // getall tổng số hóa đơn trong tháng
    public ArrayList<Model.Model_TK> getALl_THD1T() {
        ArrayList<Model.Model_TK> List_THD1N = new ArrayList<>();
        sql = "SELECT COUNT(MAHD) FROM HOADON WHERE MONTH(NgayThanhToan) = MONTH(GETDATE()) AND YEAR(NgayXuatDon) = YEAR(GETDATE())";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int THD = rs.getInt(1);
                Model.Model_TK m = new Model_TK(THD);
                List_THD1N.add(m);
            }
            return List_THD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //getall tổng số hóa đơn trong Năm
    public ArrayList<Model.Model_TK> getALl_THDNam() {
        ArrayList<Model.Model_TK> List_THDNam = new ArrayList<>();
        sql = "SELECT COUNT(MAHD) FROM HOADON WHERE YEAR(NgayThanhToan) = YEAR(GETDATE())";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int THD = rs.getInt(1);
                Model.Model_TK m = new Model_TK(THD);
                List_THDNam.add(m);
            }
            return List_THDNam;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // getall tổng doanh thu 1 ngày
    public ArrayList<Model.Model_TK> getALl_TDT1N() {
        ArrayList<Model.Model_TK> List_TDT1N = new ArrayList<>();
        sql = "SELECT SUM(TongTien) AS tong\n"
                + "FROM HOADON\n"
                + "WHERE CAST(NgayThanhToan AS DATE) = CAST(GETDATE() AS DATE)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                double tDT = rs.getDouble(1);
                Model.Model_TK m = new Model_TK(tDT);
                List_TDT1N.add(m);
            }
            return List_TDT1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // getAll tổng doanh thu trong doanh trong tháng
    public ArrayList<Model.Model_TK> getALl_TDT1T() {
        ArrayList<Model.Model_TK> List_TDT1T = new ArrayList<>();
        sql = "SELECT SUM(TongTien) FROM HOADON WHERE MONTH(NgayThanhToan) = MONTH(GETDATE()) AND YEAR(NgayXuatDon) = YEAR(GETDATE())";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                double tDT = rs.getDouble(1);
                Model.Model_TK m = new Model_TK(tDT);
                List_TDT1T.add(m);
            }
            return List_TDT1T;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    // getAll tổng doanh thu trong doanh trong năm

    public ArrayList<Model.Model_TK> getALl_TDTNam() {
        ArrayList<Model.Model_TK> List_TDTNam = new ArrayList<>();
        sql = "SELECT SUM(TongTien) FROM HOADON WHERE YEAR(NgayThanhToan) = YEAR(GETDATE())";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                double tDT = rs.getDouble(1);
                Model.Model_TK m = new Model_TK(tDT);
                List_TDTNam.add(m);
            }
            return List_TDTNam;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // getAll Thông tin các hóa đơn trong 1 ngày
    public ArrayList<Model_TK> getAll_TTHD1N() {
        ArrayList<Model.Model_TK> List_TTHD1N = new ArrayList<>();
        sql = "SELECT MAHD, MAKH, MANV, TrangThai, NgayXuatDon, NgayThanhToan, TongTien FROM HOADON WHERE CAST(NgayThanhToan AS DATE) = CAST(GETDATE() AS DATE)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String maNV = rs.getString(3);
                String trangThai = rs.getString(4);
                Date ngayXD = rs.getDate(5);
                Date ngayTT = rs.getDate(6);
                double tongTien = rs.getDouble(7);
                Model_TK n = new Model_TK(maHD, maKH, maNV, trangThai, ngayXD, ngayTT, tongTien);
                List_TTHD1N.add(n);
            }
            return List_TTHD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // getAll các hóa đơn trong tháng
    public ArrayList<Model_TK> getAll_TTHD1T() {
        ArrayList<Model.Model_TK> List_TTHD1T = new ArrayList<>();
        sql = "SELECT MAHD, MAKH, MANV, TrangThai, NgayXuatDon, NgayThanhToan, TongTien FROM HOADON WHERE MONTH(NgayThanhToan) = MONTH(GETDATE()) AND YEAR(NgayThanhToan) = YEAR(GETDATE())";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String maNV = rs.getString(3);
                String trangThai = rs.getString(4);
                Date ngayXD = rs.getDate(5);
                Date ngayTT = rs.getDate(6);
                double tongTien = rs.getDouble(7);
                Model_TK n = new Model_TK(maHD, maKH, maNV, trangThai, ngayXD, ngayTT, tongTien);
                List_TTHD1T.add(n);
            }
            return List_TTHD1T;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // getAll các hóa đơn trong tháng
    public ArrayList<Model_TK> getAll_TTHDNam() {
        ArrayList<Model.Model_TK> List_TTHDNam = new ArrayList<>();
        sql = "SELECT MAHD, MAKH, MANV, TrangThai, NgayXuatDon, NgayThanhToan, TongTien FROM HOADON where YEAR(NgayThanhToan) = YEAR(GETDATE())";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String maNV = rs.getString(3);
                String trangThai = rs.getString(4);
                Date ngayXD = rs.getDate(5);
                Date ngayTT = rs.getDate(6);
                double tongTien = rs.getDouble(7);
                Model_TK n = new Model_TK(maHD, maKH, maNV, trangThai, ngayXD, ngayTT, tongTien);
                List_TTHDNam.add(n);
            }
            return List_TTHDNam;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //getTopDV
    public ArrayList<Model.Model_TK> get_topDV1N() {
        ArrayList<Model.Model_TK> List_TDV = new ArrayList<>();
        sql = "SELECT top 1 tenDichVu\n"
                + "FROM DATDICHVU\n"
                + "WHERE CAST(NgayDat AS DATE) = CAST(GETDATE() AS DATE)\n"
                + "GROUP BY tenDichVu\n"
                + "ORDER BY sum(SoLuong) DESC;";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String tenDV = rs.getString(1);
                Model.Model_TK m = new Model_TK(tenDV);
                List_TDV.add(m);
            }
            return List_TDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // top Dv tháng
    public ArrayList<Model.Model_TK> get_topDV1T() {
        ArrayList<Model.Model_TK> List_TDV = new ArrayList<>();
        sql = "SELECT top 1 tenDichVu\n"
                + "FROM DATDICHVU\n"
                + "WHERE MONTH(NgayDat) = MONTH(GETDATE()) AND YEAR(NgayDat) = YEAR(GETDATE())\n"
                + "GROUP BY tenDichVu\n"
                + "ORDER BY sum(SoLuong) DESC;";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String tenDV = rs.getString(1);
                Model.Model_TK m = new Model_TK(tenDV);
                List_TDV.add(m);
            }
            return List_TDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // get top DV 1 nam
    public ArrayList<Model.Model_TK> get_topDV1nam() {
        ArrayList<Model.Model_TK> List_TDV = new ArrayList<>();
        sql = "SELECT top 1 tenDichVu\n"
                + "FROM DATDICHVU\n"
                + " WHERE YEAR(NgayDat) = YEAR(GETDATE())\n"
                + "GROUP BY tenDichVu\n"
                + "ORDER BY sum(SoLuong) DESC";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String tenDV = rs.getString(1);
                Model.Model_TK m = new Model_TK(tenDV);
                List_TDV.add(m);
            }
            return List_TDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Chức năng hiển thị thông tin theo thời gian
    //
    // Tìm Kiếm theo thời gian cố định 1 ngày THD
    // Tìm Kiếm theo thời gian cố định 1 ngày THD
    public ArrayList<Model.Model_TK> TimKiem_THD1N(Date ngayThanhToan) {
        ArrayList<Model.Model_TK> List_THD1N = new ArrayList<>();
        sql = "SELECT COUNT(MAHD) FROM HOADON WHERE NgayThanhToan = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ngayThanhToan);
            rs = ps.executeQuery();
            while (rs.next()) {
                int THD = rs.getInt(1);
                Model.Model_TK m = new Model_TK(THD);
                List_THD1N.add(m);
            }
            return List_THD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    // Tìm Kiếm theo thời gian cố định 1 ngày TDT

    public ArrayList<Model.Model_TK> TimKiem_TDT1N(Date ngayThanhToan) {
        ArrayList<Model.Model_TK> List_THD1N = new ArrayList<>();
        sql = "SELECT SUM(TongTien) FROM HOADON WHERE NgayThanhToan = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ngayThanhToan);
            rs = ps.executeQuery();
            while (rs.next()) {
                double tDT = rs.getDouble(1);
                Model.Model_TK m = new Model_TK(tDT);
                List_THD1N.add(m);
            }
            return List_THD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model.Model_TK> TimKiem_TTHD1N(Date ngayThanhToan) {
        ArrayList<Model.Model_TK> List_TTHD1N = new ArrayList<>();
        sql = "SELECT MAHD, MAKH, MANV, TrangThai, NgayXuatDon, NgayThanhToan, TongTien FROM HOADON WHERE NgayThanhToan = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ngayThanhToan);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String maNV = rs.getString(3);
                String trangThai = rs.getString(4);
                Date ngayXD = rs.getDate(5);
                Date ngayTT = rs.getDate(6);
                double tongTien = rs.getDouble(7);
                Model_TK n = new Model_TK(maHD, maKH, maNV, trangThai, ngayXD, ngayTT, tongTien);
                List_TTHD1N.add(n);
            }
            return List_TTHD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model.Model_TK> timKiem_topDV1N(Date ngayDat) {
        ArrayList<Model.Model_TK> List_TDV = new ArrayList<>();
        sql = "SELECT top 1 tenDichVu\n"
                + "FROM DATDICHVU\n"
                + "WHERE NgayDat = ? \n"
                + "GROUP BY tenDichVu\n"
                + "ORDER BY sum(SoLuong) DESC";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ngayDat);
            rs = ps.executeQuery();
            while (rs.next()) {
                String tenDV = rs.getString(1);
                Model.Model_TK m = new Model_TK(tenDV);
                List_TDV.add(m);
            }
            return List_TDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Tìm Kiếm Theo Năm
    public ArrayList<Model.Model_TK> TimKiem_THD1Nam(int nam) {
        ArrayList<Model.Model_TK> List_THD1N = new ArrayList<>();
        sql = "SELECT COUNT(MAHD) FROM HOADON WHERE YEAR(NgayThanhToan)  = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nam);
            rs = ps.executeQuery();
            while (rs.next()) {
                int THD = rs.getInt(1);
                Model.Model_TK m = new Model_TK(THD);
                List_THD1N.add(m);
            }
            return List_THD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model.Model_TK> TimKiem_TDT1Nam(int nam) {
        ArrayList<Model.Model_TK> List_THD1N = new ArrayList<>();
        sql = "SELECT SUM(TongTien) FROM HOADON WHERE YEAR(NgayThanhToan)  = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nam);
            rs = ps.executeQuery();
            while (rs.next()) {
                double tDT = rs.getDouble(1);
                Model.Model_TK m = new Model_TK(tDT);
                List_THD1N.add(m);
            }
            return List_THD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model.Model_TK> TimKiem_TTHD1Nam(int nam) {
        ArrayList<Model.Model_TK> List_TTHD1N = new ArrayList<>();
        sql = "SELECT MAHD, MAKH, MANV, TrangThai, NgayXuatDon, NgayThanhToan, TongTien FROM HOADON WHERE YEAR(NgayThanhToan)  = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nam);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String maNV = rs.getString(3);
                String trangThai = rs.getString(4);
                Date ngayXD = rs.getDate(5);
                Date ngayTT = rs.getDate(6);
                double tongTien = rs.getDouble(7);
                Model_TK n = new Model_TK(maHD, maKH, maNV, trangThai, ngayXD, ngayTT, tongTien);
                List_TTHD1N.add(n);
            }
            return List_TTHD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model.Model_TK> timKiem_topDV1nam(int nam) {
        ArrayList<Model.Model_TK> List_TDV = new ArrayList<>();
        sql = "SELECT top 1 tenDichVu\n"
                + "FROM DATDICHVU\n"
                + "WHERE YEAR(NgayDat)  = ?\n"
                + "GROUP BY tenDichVu\n"
                + "ORDER BY sum(SoLuong) DESC";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nam);
            rs = ps.executeQuery();
            while (rs.next()) {
                String tenDV = rs.getString(1);
                Model.Model_TK m = new Model_TK(tenDV);
                List_TDV.add(m);
            }
            return List_TDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Tìm Kiếm Theo Tháng năm
    public ArrayList<Model.Model_TK> TimKiem_THD1T(int nam, int thang) {
        ArrayList<Model.Model_TK> List_THD1N = new ArrayList<>();
        sql = "SELECT COUNT(MAHD) FROM HOADON WHERE YEAR(NgayThanhToan)  = ? and MONTH(NgayThanhToan) = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nam);
            ps.setObject(2, thang);
            rs = ps.executeQuery();
            while (rs.next()) {
                int THD = rs.getInt(1);
                Model.Model_TK m = new Model_TK(THD);
                List_THD1N.add(m);
            }
            return List_THD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model.Model_TK> TimKiem_TDT1T(int nam, int thang) {
        ArrayList<Model.Model_TK> List_THD1N = new ArrayList<>();
        sql = "SELECT SUM(TongTien) FROM HOADON WHERE YEAR(NgayThanhToan)  = ? and MONTH(NgayThanhToan) = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nam);
            ps.setObject(2, thang);
            rs = ps.executeQuery();
            while (rs.next()) {
                double tDT = rs.getDouble(1);
                Model.Model_TK m = new Model_TK(tDT);
                List_THD1N.add(m);
            }
            return List_THD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model.Model_TK> TimKiem_TTHD1T(int nam, int thang) {
        ArrayList<Model.Model_TK> List_TTHD1N = new ArrayList<>();
        sql = "SELECT MAHD, MAKH, MANV, TrangThai, NgayXuatDon, NgayThanhToan, TongTien FROM HOADON WHERE YEAR(NgayThanhToan)  = ? and MONTH(NgayThanhToan) = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nam);
            ps.setObject(2, thang);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String maNV = rs.getString(3);
                String trangThai = rs.getString(4);
                Date ngayXD = rs.getDate(5);
                Date ngayTT = rs.getDate(6);
                double tongTien = rs.getDouble(7);
                Model_TK n = new Model_TK(maHD, maKH, maNV, trangThai, ngayXD, ngayTT, tongTien);
                List_TTHD1N.add(n);
            }
            return List_TTHD1N;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model.Model_TK> timKiem_topDV1T(int nam, int thang) {
        ArrayList<Model.Model_TK> List_TDV = new ArrayList<>();
        sql = "SELECT top 1 tenDichVu\n"
                + "FROM DATDICHVU\n"
                + "where YEAR(NgayDat)  = ? and MONTH(NgayDat) = ?\n"
                + "GROUP BY tenDichVu\n"
                + "ORDER BY sum(SoLuong) DESC;";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nam);
            ps.setObject(2, thang);
            rs = ps.executeQuery();
            while (rs.next()) {
                String tenDV = rs.getString(1);
                Model.Model_TK m = new Model_TK(tenDV);
                List_TDV.add(m);
            }
            return List_TDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
