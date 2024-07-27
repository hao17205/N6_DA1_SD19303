package repositories;

import Model.Model_TT;
import dbconnect.DBconnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Repositories_TT {
    //TT
    private Connection con = null;
    private PreparedStatement pr = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_TT> getBasicInfo_HD() {
        sql = "SELECT MAHD, MAKH, MaNV, SoDienThoai, DiaChi, NgayXuatDon, TienCoc FROM HOADON WHERE TrangThai is Null;";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString("MAHD");
                String maKH = rs.getString("MAKH");
                String maNV = rs.getString("MaNV");
                String soDienThoai = rs.getString("SoDienThoai");
                String diaChi = rs.getString("DiaChi");
                Date ngayXuatDon = rs.getDate("NgayXuatDon");
                double tienCoc = rs.getDouble("TienCoc");

                Model_TT tt = new Model_TT(maHD, maNV, maKH, soDienThoai, diaChi, 0, tienCoc, 0, tienCoc, tienCoc, diaChi, ngayXuatDon, ngayXuatDon, tienCoc, tienCoc, tienCoc, tienCoc, maHD, maHD, maNV, ngayXuatDon, ngayXuatDon, tienCoc);
                listHoaDon.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return listHoaDon;
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
}
//