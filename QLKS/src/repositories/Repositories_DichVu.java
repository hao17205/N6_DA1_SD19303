/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.*;
import java.util.ArrayList;
import model.Model_DichVu;


/**
 *
 * @author rinbo
 */
public class Repositories_DichVu {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private String sql = null;

    public ArrayList<model.Model_DichVu> getAll_DV() {
        ArrayList<model.Model_DichVu> list_DV = new ArrayList<>();
        sql = "SELECT MADV, TenDichVu, Gia, LoaiDichVu, MoTa FROM DICHVU";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maDV = rs.getString(1);
                String tenDV = rs.getString(2);
                double gia = rs.getDouble(3);
                String loaiDV = rs.getString(4);
                String moTa = rs.getString(5);

                model.Model_DichVu m = new Model_DichVu(maDV, tenDV, gia, loaiDV, moTa);
                list_DV.add(m);
            }
            return list_DV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int them_DV(Model_DichVu m) {
        sql = "INSERT INTO DICHVU(MADV, TenDichVu, Gia, LoaiDichVu, MoTa)\n"
                + "VALUES(?,?,?,?,?)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMaDV());
            ps.setObject(2, m.getTenDV());
            ps.setObject(3, m.getGia());
            ps.setObject(4, m.getLoaiDV());
            ps.setObject(5, m.getMoTa());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int sua_DV(String maDV, Model_DichVu m) {
        sql = "UPDATE DICHVU\n"
                + "SET TenDichVu = ?, Gia = ?, LoaiDichVu = ?, MoTa = ?\n"
                + "WHERE MADV = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTenDV());
            ps.setObject(2, m.getGia());
            ps.setObject(3, m.getLoaiDV());
            ps.setObject(4, m.getMoTa());
            ps.setObject(5, maDV);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int xoa(String maDV) {
        sql = "delete from DICHVU where MADV = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maDV);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ArrayList<model.Model_DichVu> timKiem(String timKiem) {
        ArrayList<model.Model_DichVu> list_DV = new ArrayList<>();
        sql = "SELECT MADV, TenDichVu, Gia,  LoaiDichVu, MoTa FROM DICHVU WHERE MADV LIKE ? or TenDichVu like ? or gia like ? or MoTa like ? or LoaiDichVu like ?";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + timKiem + "%");
            ps.setString(2, "%" + timKiem + "%");
            ps.setString(3, "%" + timKiem + "%");
            ps.setString(4, "%" + timKiem + "%");
            ps.setString(5, "%" + timKiem + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String maDV = rs.getString(1);
                String tenDV = rs.getString(2);
                double gia = rs.getDouble(3);
                String loaiDV = rs.getString(4);
                String moTa = rs.getString(5);

                model.Model_DichVu m = new Model_DichVu(maDV, tenDV, gia, loaiDV, moTa);
                list_DV.add(m);
            }
            return list_DV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
//check trùng ở bảng DV

    public String checkTrung(String maDV_moi) {
        sql = "select MADV,TenDichVu,Gia,MoTa,LoaiDichVu from DICHVU where MADV like ?";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, maDV_moi);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("MaDV").equals(maDV_moi)) {
                    return "Mã Dịch Vụ Đã Tồn Tại !";
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    // Form Đặt Dịch vụ

    public ArrayList<Model_DichVu> getAll_HDDDV() {
        ArrayList<Model_DichVu> list_HDDDV = new ArrayList<>();
        sql = "SELECT HOADON.MAHD, MA_P, TenKhachHang, HOADON.SoDienThoai, CCCD \n"
                + "FROM HOADON, HOADONCHITIET, KHACHHANG \n"
                + "WHERE HOADON.MAHD = HOADONCHITIET.MAHD and HOADON.MAKH = KHACHHANG.MAKH and TrangThai like N'%Chưa Thanh Toán%'";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maP = rs.getString(2);
                String tenKH = rs.getString(3);
                String sDT = rs.getString(4);
                String CCCD = rs.getString(5);
                Model_DichVu m = new Model_DichVu(maHD, maP, tenKH, sDT, CCCD);
                list_HDDDV.add(m);

            }
            return list_HDDDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int them_DDV(Model_DichVu m) {
        sql = "insert into DATDICHVU(MA_DDV, MA_P, MADV, TenDichVu, SoLuong ,Gia, NgayDat, TongTien, MaHD)\n"
                + "values(SUBSTRING(CAST(NEWID() AS varchar(36)), 1, 8),?,?,?,?,?,GETDATE(),?,?)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setObject(1, m.getMaP());
            ps.setObject(2, m.getMaDV());
            ps.setObject(3, m.getTenDV());
            ps.setObject(4, m.getSoLuong());
            ps.setObject(5, m.getGia());
            ps.setObject(6, m.getTongTien());
            ps.setObject(7, m.getMaHD());

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    // Tìm kiếm hóa đơn

    public ArrayList<Model_DichVu> TK_HDTrongDDV(String maTK) {
        ArrayList<Model_DichVu> list_TKHDTDDV = new ArrayList<>();
        sql = "SELECT HOADON.MAHD, MA_P, TenKhachHang, HOADON.SoDienThoai, CCCD \n"
                + "FROM HOADON, HOADONCHITIET, KHACHHANG \n"
                + "WHERE HOADON.MAHD = HOADONCHITIET.MAHD and HOADON.MAKH = KHACHHANG.MAKH and TrangThai TrangThai like N'%Chưa Thanh Toán%' AND (HOADON.MAHD LIKE ? OR MA_P LIKE ? OR TenKhachHang LIKE ? OR HOADON.SoDienThoai LIKE ? OR CCCD LIKE ?)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, '%' + maTK + '%');
            ps.setObject(2, '%' + maTK + '%');
            ps.setObject(3, '%' + maTK + '%');
            ps.setObject(4, '%' + maTK + '%');
            ps.setObject(5, '%' + maTK + '%');
            rs = ps.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maP = rs.getString(2);
                String tenKH = rs.getString(3);
                String sDT = rs.getString(4);
                String CCCD = rs.getString(5);
                Model_DichVu m = new Model_DichVu(maHD, maP, tenKH, sDT, CCCD);
                list_TKHDTDDV.add(m);
            }
            return list_TKHDTDDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String checkTrung_DDV(String maDDV_moi) {
        sql = "select MA_DDV from DATDICHVU where MA_DDV like ?";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, maDDV_moi);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("MA_DDV").equals(maDDV_moi)) {
                    return "Mã Dịch Vụ Đã Tồn Tại !";
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Repositories_DichVu() {
    }

    //FillTAble cho bảng hủy dv
    public ArrayList<Model_DichVu> getALL_HDV() {
        ArrayList<Model_DichVu> list_HDV = new ArrayList<>();
        sql = "select MA_DDV, MA_P, MADV, TenDichVu, SoLuong, Gia, NgayDat, DATDICHVU.TongTien, DATDICHVU.MaHD from DATDICHVU, HOADON where DATDICHVU.MaHD = HOADON.MAHD and TrangThai like N'%Chưa Thanh Toán%'";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maDDV = rs.getString(1);
                String maP = rs.getString(2);
                String maDV = rs.getString(3);
                String tenDV = rs.getString(4);
                int soL = rs.getInt(5);
                double gia = rs.getDouble(6);
                Date ngayDat = rs.getDate(7);
                double tongTien = rs.getDouble(8);
                String maHD = rs.getString(9);
                Model_DichVu m = new Model_DichVu(maDDV, maP, maDV, tenDV, soL, gia, ngayDat, tongTien, maHD);
                list_HDV.add(m);
            }
            return list_HDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    // tìm kiếm cho bảng hủy dịch vụ
    public ArrayList<Model_DichVu> timKiem_HDV(String maTK1) {
        ArrayList<Model_DichVu> list_HDV = new ArrayList<>();
        sql = "select MA_DDV, MA_P, MADV, TenDichVu, SoLuong, Gia, NgayDat, DATDICHVU.TongTien, DATDICHVU.MaHD from DATDICHVU, HOADON \n" +
"where DATDICHVU.MaHD = HOADON.MAHD and  TrangThai like N'%Chưa Thanh Toán%' and (MA_DDV like ? or MA_P like ? or MADV like ? or TenDichVu like ? or SoLuong like ? or DATDICHVU.TongTien like ? or DATDICHVU.MaHD like ? or NgayDat like ?)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, '%' +maTK1+'%');
            ps.setObject(2, '%' +maTK1+'%');
            ps.setObject(3, '%' +maTK1+'%');
            ps.setObject(4, '%' +maTK1+'%');
            ps.setObject(5, '%' +maTK1+'%');
            ps.setObject(6, '%' +maTK1+'%');
            ps.setObject(7, '%' +maTK1+'%');
            ps.setObject(8, '%' +maTK1+'%');
            
            rs = ps.executeQuery();
            while (rs.next()) {
                String maDDV = rs.getString(1);
                String maP = rs.getString(2);
                String maDV = rs.getString(3);
                String tenDV = rs.getString(4);
                int soL = rs.getInt(5);
                double gia = rs.getDouble(6);
                Date ngayDat = rs.getDate(7);
                double tongTien = rs.getDouble(8);
                String maHD = rs.getString(9);
                Model_DichVu m = new Model_DichVu(maDDV, maP, maDV, tenDV, soL, gia, ngayDat, tongTien, maHD);
                list_HDV.add(m);
            }
            return list_HDV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    // Hủy Dịch Vụ
    public int huyDV(String maDDV) {
        sql = "delete from DATDICHVU where MA_DDV = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maDDV);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
