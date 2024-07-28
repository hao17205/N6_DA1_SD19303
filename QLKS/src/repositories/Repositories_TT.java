package repositories;

import Model.Model_TT;
import dbconnect.DBconnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.crypto.spec.PSource;

public class Repositories_TT {

    //TT
    private Connection con = null;
    private PreparedStatement pr = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_TT> get_TTTT() {
        ArrayList<Model_TT> list_TTTT = new ArrayList<>();
        sql = "select MAHD, MAKH, MANV,SoDienThoai,DiaChi, NgayXuatDon, TienCoc from HOADON\n"
                + "WHERE   TrangThai IS NULL";
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String maNV = rs.getString(3);
                String soDienThoai = rs.getString(4);
                String diaChi = rs.getString(5);
                Date ngayXD = rs.getDate(6);
                double tienCoc = rs.getDouble(7);
                Model_TT m = new Model_TT(maHD, maKH, maNV, soDienThoai, diaChi, ngayXD, tienCoc);
                list_TTTT.add(m);
            }
            return list_TTTT;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // tìm kiếm hóa đơn
    public ArrayList<Model_TT> timKiem_TTTT(String maHD_New) {
        ArrayList<Model_TT> list_TKTTTT = new ArrayList<>();
        sql = "select MAHD, MAKH, MANV, SoDienThoai, DiaChi, NgayXuatDon, TienCoc from HOADON \n"
                + "where (MAHD like ? or MAKH like ? or MANV LIKE ? or SoDienThoai LIKE ? or DiaChi like ?) AND TrangThai IS NULL";
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, '%' + maHD_New + '%');
            pr.setObject(2, '%' + maHD_New + '%');
            pr.setObject(3, '%' + maHD_New + '%');
            pr.setObject(4, '%' + maHD_New + '%');
            pr.setObject(5, '%' + maHD_New + '%');

            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String maNV = rs.getString(3);
                String soDienThoai = rs.getString(4);
                String diaChi = rs.getString(5);
                Date ngayXD = rs.getDate(6);
                double tienCoc = rs.getDouble(7);
                Model_TT m = new Model_TT(maHD, maKH, maNV, soDienThoai, diaChi, ngayXD, tienCoc);
                list_TKTTTT.add(m);
            }
            return list_TKTTTT;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model_TT> getAll_TTP(String maHD_New) {
        ArrayList<Model_TT> list_TTP = new ArrayList<>();
        sql = "SELECT COUNT(MA_HDCT), SUM(TienPhong) FROM HOADONCHITIET WHERE MaHD = ?";
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, maHD_New);
            rs = pr.executeQuery();
            while (rs.next()) {
                int soLP = rs.getInt(1);
                double tongTP = rs.getDouble(2);
                Model_TT m = new Model_TT(soLP, tongTP);
                list_TTP.add(m);
            }
            return list_TTP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model_TT> getAll_TTDV(String maHD_New) {
        ArrayList<Model_TT> list_TTP = new ArrayList<>();
        sql = "SELECT SUM(TongTien) FROM DATDICHVU WHERE MaHD like ? ";
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, '%' + maHD_New + '%');
            rs = pr.executeQuery();
            while (rs.next()) {
                double tongTDV = rs.getDouble(1);
                Model_TT m = new Model_TT(tongTDV);
                list_TTP.add(m);
            }
            return list_TTP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public ArrayList<Model_TT> getTongTienDV_HD() {
        sql = "SELECT SUM(ddv.TongTien) AS TongTienDV FROM HOADON hd JOIN HOADONCHITIET hdct ON hd.MAHD = hdct.MAHD JOIN DatDichVu ddv ON hd.MAHD = ddv.MaHD WHERE hd.TrangThai is Null GROUP BY hd.MAHD;";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                double tongTienDV = rs.getDouble("TongTienDV");

                Model_TT tt = new Model_TT("", "", "", "", "", 0, 0, 0, tongTienDV, 0, "", null, null, 0, 0, 0, 0, null, null, null, null, null, 0);
                listHoaDon.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return listHoaDon;
    }

    public ArrayList<Model_TT> getTongTienPhong_HD() {
        sql = "SELECT COUNT(hdct.MA_HDCT) AS SoLuongChiTiet, SUM(hdct.TienPhong) AS TongTienPhong FROM HOADON hd JOIN HOADONCHITIET hdct ON hd.MAHD = hdct.MaHD WHERE hd.TrangThai is Null;";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            if (rs.next()) {
                int soLuongChiTiet = rs.getInt("SoLuongChiTiet");
                double tongTienPhong = rs.getDouble("TongTienPhong");

                Model_TT tt = new Model_TT("", "", "", "", "", soLuongChiTiet, 0, 0, 0, tongTienPhong, "", null, null, 0, 0, 0, 0, null, null, null, null, null, 0);
                listHoaDon.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return listHoaDon;
    }

    private void closeResources() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pr != null) {
                pr.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public int TT_HD(String maHD, Model_TT s) {
//        sql = "UPDATE HOADON SET MaNV = ?, MAKH = ?, SoDienThoai = ?, DiaChi = ?, SoPhongDat = ?, GiaBanDau = ?, KhuyenMai = ?, TongTienDV = ?, TongTienPhong = ?, TrangThai = ?, NgayXuatDon = ?, NgayThanhToan = ?, TienCoc = ?, TongTien = ?, SoTienCanThanhToan = ? WHERE MAHD = ?";
//
//        try {
//            con = DBconnect.getConnection();
//            pr = con.prepareStatement(sql);
//
//            pr.setString(1, s.getTenNV());
//            pr.setString(2, s.getTenKH());
//            pr.setString(3, s.getSoDienThoai());
//            pr.setString(4, s.getDiaChi());
//            pr.setInt(5, s.getSoPhongDat());
//            pr.setDouble(6, s.getGiaBanDau());
//            pr.setInt(7, s.getKhuyenMai());
//            pr.setDouble(8, s.getTongTienDichVu());
//            pr.setDouble(9, s.getTongTienPhong());
//            pr.setString(10, s.getTrangThai());
//            pr.setDate(11, new java.sql.Date(s.getNgayXuatDon().getTime()));
//            pr.setDate(12, new java.sql.Date(s.getNgayThanhToan().getTime()));
//            pr.setDouble(13, s.getTienCoc());
//            pr.setDouble(14, s.getTongTien());
//            pr.setDouble(15, s.getSoTienCanThanhToan());
//            pr.setString(16, maHD);
//
//            return pr.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return 0;
//        }
//    }
}
