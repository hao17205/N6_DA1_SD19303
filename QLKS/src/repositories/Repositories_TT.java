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
        sql = "SELECT MAHD, MAKH, MANV, SoDienThoai, DiaChi, NgayXuatDon, TienCoc \n"
                + "FROM HOADON \n"
                + "WHERE TrangThai IS NULL OR TrangThai = N'Chưa Thanh Toán'";
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
        sql = "SELECT MAHD, MAKH, MANV, SoDienThoai, DiaChi, NgayXuatDon, TienCoc \n"
                + "FROM HOADON \n"
                + "WHERE (MAHD LIKE ? OR MAKH LIKE ? OR MANV LIKE ? OR SoDienThoai LIKE ? OR DiaChi LIKE ?) \n"
                + "AND (TrangThai IS NULL OR TrangThai = N'Chưa Thanh Toán')";
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

                Model_TT tt = new Model_TT(tongTienDV);
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

                Model_TT tt = new Model_TT(soLuongChiTiet, tongTienPhong);
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

    public int TT_HD(String maHD, Model_TT s) {
        sql = "UPDATE HOADON\n"
                + "SET  SoPhongDat = ?, TrangThai = ?,  NgayThanhToan = ?,  TongTien = ?, SoTienCanThanhToan = ?, TongTienDV = ?, TongTienPhong = ?\n"
                + "WHERE MAHD = ?";

        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, s.getSoPhongDat());
            pr.setObject(2, s.getTrangThai());
            pr.setObject(3, s.getNgayThanhToan());
            pr.setObject(4, s.getTongTien());
            pr.setObject(5, s.getSoTienCanThanhToan());
            pr.setObject(6, s.getTongTienDichVu());
            pr.setObject(7, s.getTongTienPhong());
            pr.setObject(8, maHD);

            int result = pr.executeUpdate();

            if (result > 0) {
                // Giả sử bạn cần lấy Ma_P từ bảng HOADONCHITIET hoặc bảng khác
                ArrayList<String> list_MP = getMaPFromHoaDonChiTiet(maHD);
                if (list_MP != null) {
                    Repositories_TTPhong rp_TTPhong = new Repositories_TTPhong();
                    for (String x : list_MP) {
                        rp_TTPhong.sua_TT(x, "Đang rọn phòng");
                    }

                }
            }

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private ArrayList<String> getMaPFromHoaDonChiTiet(String maHD) {
        ArrayList<String> list_MP = new ArrayList<>();
        String sql = "SELECT Ma_P FROM HOADONCHITIET WHERE MaHD = ?";
        try {
            pr = con.prepareStatement(sql);
            pr.setObject(1, maHD);
            rs = pr.executeQuery();
            while (rs.next()) {
                list_MP.add(rs.getString("Ma_P"));
            }
            return list_MP;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int HD_TT(String maHD) {
        String sql_HDCT = "DELETE FROM HoaDonChiTiet WHERE MaHD = ?";
        String sql_DDV = "DELETE FROM DatDichVu WHERE MaHD = ?";
        String sql_HD = "DELETE FROM HoaDon WHERE MaHD = ?";

        try {
            con = DBconnect.getConnection();
            con.setAutoCommit(false);

            // Lấy Ma_P từ bảng HOADONCHITIET
            ArrayList<String> list_MP = getMaPFromHoaDonChiTiet(maHD);

            // Xóa các bản ghi trong bảng HoaDonChiTiet
            pr = con.prepareStatement(sql_HDCT);
            pr.setObject(1, maHD);
            pr.executeUpdate();

            // Xóa các bản ghi trong bảng DatDichVu
            pr = con.prepareStatement(sql_DDV);
            pr.setObject(1, maHD);
            pr.executeUpdate();

            // Xóa bản ghi trong bảng HoaDon
            pr = con.prepareStatement(sql_HD);
            pr.setObject(1, maHD);
            int result = pr.executeUpdate();

            if (result > 0 && list_MP != null) {
                Repositories_TTPhong rp_TTPhong = new Repositories_TTPhong();

                for (String x : list_MP) {
                    rp_TTPhong.sua_TT(x, "Trống");
                }
            }

            con.commit(); // Commit transaction
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
