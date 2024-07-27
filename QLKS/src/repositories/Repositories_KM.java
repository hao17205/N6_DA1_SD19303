/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.*;
import java.util.ArrayList;
import model.Model_KM;
import java.util.Date;

/**
 *
 * @author rinbo
 */
public class Repositories_KM {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<model.Model_KM> getAll_KM() {
        ArrayList<model.Model_KM> list_KM = new ArrayList<>();
        sql = "SELECT MAKM, TenKhuyenMai, PhanTramGiamGia, NgayBatDau, NgayKetThuc, Mota FROM KHUYENMAI";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maKM = rs.getString(1);
                String tenKM = rs.getString(2);
                double pTGG = rs.getDouble(3);
                Date ngayBD = rs.getDate(4);
                Date ngayKT = rs.getDate(5);
                String moTa = rs.getString(6);
                Model_KM m = new Model_KM(maKM, tenKM, pTGG, ngayBD, ngayKT, moTa);
                list_KM.add(m);
            }
            return list_KM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int them_KM(model.Model_KM m) {
        sql = "insert into KHUYENMAI(MAKM, TenKhuyenMai, PhanTramGiamGia, NgayBatDau,NgayKetThuc, Mota)\n"
                + "values(?,?,?,?,?,?)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMaKM());
            ps.setObject(2, m.getTenKM());
            ps.setObject(3, m.getpTGG());
            ps.setObject(4, m.getNgayBD());
            ps.setObject(5, m.getNgayKT());
            ps.setObject(6, m.getMoTa());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int sua_KM(String maKM, Model_KM m) {
        sql = "UPDATE KHUYENMAI \n"
                + "SET TenKhuyenMai = ?, PhanTramGiamGia = ?, NgayBatDau = ?, NgayKetThuc = ?, Mota = ?\n"
                + "WHERE MAKM = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTenKM());
            ps.setObject(2, m.getpTGG());
            ps.setObject(3, m.getNgayBD());
            ps.setObject(4, m.getNgayKT());
            ps.setObject(5, m.getMoTa());
            ps.setObject(6, maKM);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int xoa_KM(String maKM) {
        sql = "DELETE FROM KHUYENMAI WHERE MAKM = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maKM);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ArrayList<Model_KM> timKiem_KM(String maTK) {
        ArrayList<model.Model_KM> list_KM = new ArrayList<>();
        sql = "select MAKM, TenKhuyenMai, PhanTramGiamGia, NgayBatDau, NgayKetThuc, Mota from KHUYENMAI	WHERE MAKM like ? or PhanTramGiamGia like ? or TenKhuyenMai like ? or Mota like ?";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + maTK + "%");
            ps.setObject(2, "%" + maTK + "%");
            ps.setObject(3, "%" + maTK + "%");
            ps.setObject(4, "%" + maTK + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String maKM = rs.getString(1);
                String tenKM = rs.getString(2);
                double pTGG = rs.getDouble(3);
                Date ngayBD = rs.getDate(4);
                Date ngayKT = rs.getDate(5);
                String moTa = rs.getString(6);
                Model_KM m = new Model_KM(maKM, tenKM, pTGG, ngayBD, ngayKT, moTa);
                list_KM.add(m);
            }
            return list_KM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Model_KM checkTrung_KM(String maKM_New) {
        sql = "SELECT MAKM, TenKhuyenMai, PhanTramGiamGia, NgayBatDau, NgayKetThuc, Mota FROM KHUYENMAI WHERE MAKM = ?";
        Model_KM kM = null;
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maKM_New);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maKM = rs.getString(1);
                String tenKM = rs.getString(2);
                double pTGG = rs.getDouble(3);
                Date ngayBD = rs.getDate(4);
                Date ngayKT = rs.getDate(5);
                String moTa = rs.getString(6);
                kM = new Model_KM(maKM, tenKM, pTGG, ngayBD, ngayKT, moTa);

            }
            return kM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // tìm kiếm theo khoảng thời gian
    public ArrayList<Model_KM> timKiem_KMTKTG(Date ngayStar, Date ngayEnd) {
        ArrayList<model.Model_KM> list_KM = new ArrayList<>();
        sql = "select MAKM, TenKhuyenMai, PhanTramGiamGia, NgayBatDau, NgayKetThuc, Mota \n"
                + "from KHUYENMAI \n"
                + "where NgayBatDau >= ? and NgayKetThuc <= ?;";

        try {
            con = dbconnect.DBconnect.getConnection();
             java.sql.Date sqlNgayStart = new java.sql.Date(ngayStar.getTime());
            java.sql.Date sqlNgayEnd = new java.sql.Date(ngayEnd.getTime());
            ps = con.prepareStatement(sql);
            ps.setDate(1, sqlNgayEnd);
            ps.setDate(2, sqlNgayEnd);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maKM = rs.getString(1);
                String tenKM = rs.getString(2);
                double pTGG = rs.getDouble(3);
                Date ngayBD = rs.getDate(4);
                Date ngayKT = rs.getDate(5);
                String moTa = rs.getString(6);
                Model_KM m = new Model_KM(maKM, tenKM, pTGG, ngayBD, ngayKT, moTa);
                list_KM.add(m);
            }
            return list_KM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
