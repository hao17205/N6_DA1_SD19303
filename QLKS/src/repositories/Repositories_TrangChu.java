/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.*;
import Model.Model_TrangChu;
import java.util.ArrayList;

public class Repositories_TrangChu {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    String sql = null;

    public ArrayList<Model_TrangChu> getAll_TrangChu() {
        sql = "select p.MA_P,p.Tang,lp.MALP,p.TinhTrang,lp.LoaiPhong,lp.Gia,lp.SONGUOIO,lp.MoTa \n"
                + "from PHONG p INNER JOIN LOAIPHONG lp on p.MALP = lp.MALP";
        ArrayList<Model_TrangChu> list_Phong = new ArrayList<>();
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maPhong = rs.getString(1);
                int tang = rs.getInt(2);
                String maLP = rs.getString(3);
                String tinhTrang = rs.getString(4);
                String loaiPhong = rs.getString(5);
                double giaPhong = rs.getDouble(6);
                int soNGuoio = rs.getInt(7);
                String moTa = rs.getString(8);
                Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNGuoio, moTa);
                list_Phong.add(phong);
            }
            return list_Phong;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model_TrangChu> timKiemPhong(String timKiemPhong) {
        ArrayList<Model_TrangChu> list_TimPhong = new ArrayList<>();
        sql = "select p.MA_P,p.Tang,lp.MALP,p.TinhTrang,lp.LoaiPhong,lp.Gia,lp.SONGUOIO,lp.MoTa \n"
                + "from PHONG p INNER JOIN LOAIPHONG lp on p.MALP = lp.MALP\n"
                + "where p.MA_P like ? or TinhTrang like ? or LoaiPhong like ? or Gia like ? or MoTa like ? ";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, '%' + timKiemPhong + '%');
            ps.setString(2, '%' + timKiemPhong + '%');
            ps.setString(3, '%' + timKiemPhong + '%');
            ps.setString(4, '%' + timKiemPhong + '%');
            ps.setString(5, '%' + timKiemPhong + '%');
            rs = ps.executeQuery();
            while (rs.next()) {
                String maPhong = rs.getString(1);
                int tang = rs.getInt(2);
                String maLP = rs.getString(3);
                String tinhTrang = rs.getString(4);
                String loaiPhong = rs.getString(5);
                double giaPhong = rs.getDouble(6);
                int soNGuoio = rs.getInt(7);
                String moTa = rs.getString(8);
                Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNGuoio, moTa);
                list_TimPhong.add(phong);
            }
            return list_TimPhong;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //Code nút sửa 
    public int sua_TC(String maP, Model_TrangChu m) {
        sql = "UPDATE PHONG\n"
                + "SET TinhTrang = ?\n"
                + "WHERE MA_P = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTinhTrang());
                ps.setObject(2, maP);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int xoa_TC(String maP) {
        sql = "delete from PHONG where MA_P = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maP);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    // trường hợp lọc cả 3
   public ArrayList<Model_TrangChu> Loc_C3(int tang_l, String tinhTrang_l, String loaiPhong_L) {
    ArrayList<Model_TrangChu> list_TimPhong = new ArrayList<>();
    sql = "SELECT MA_P, Tang, PHONG.MALP, TinhTrang, LoaiPhong, Gia, SONGUOIO, MoTa " +
          "FROM PHONG " +
          "INNER JOIN LOAIPHONG ON PHONG.MALP = LOAIPHONG.MALP " +
          "WHERE Tang = ? AND LoaiPhong LIKE ? AND TinhTrang LIKE ?";
    try {
        con = dbconnect.DBconnect.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, tang_l);
        ps.setString(2, '%' + loaiPhong_L + '%');
        ps.setString(3, '%' + tinhTrang_l + '%');
        rs = ps.executeQuery();
        while (rs.next()) {
            String maPhong = rs.getString(1);
            int tang = rs.getInt(2);
            String maLP = rs.getString(3);
            String tinhTrang = rs.getString(4);
            String loaiPhong = rs.getString(5);
            double giaPhong = rs.getDouble(6);
            int soNGuoio = rs.getInt(7);
            String moTa = rs.getString(8);
            Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNGuoio, moTa);
            list_TimPhong.add(phong);
        }
        return list_TimPhong;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
   }
    // trường hợp không lọc tầng
    public ArrayList<Model_TrangChu> Loc_truTang(String loaiPhong_L, String tinhTrang_l) {
    ArrayList<Model_TrangChu> list_TimPhong = new ArrayList<>();
    sql = "SELECT MA_P, Tang, PHONG.MALP, TinhTrang, LoaiPhong, Gia, SONGUOIO, MoTa " +
          "FROM PHONG " +
          "INNER JOIN LOAIPHONG ON PHONG.MALP = LOAIPHONG.MALP " +
          "WHERE LoaiPhong LIKE ? AND TinhTrang = ?";
    try {
        con = dbconnect.DBconnect.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, '%' + loaiPhong_L + '%');  
        ps.setString(2, tinhTrang_l);
        rs = ps.executeQuery();
        while (rs.next()) {
            String maPhong = rs.getString(1);
            int tang = rs.getInt(2);
            String maLP = rs.getString(3);
            String tinhTrang = rs.getString(4);
            String loaiPhong = rs.getString(5);
            double giaPhong = rs.getDouble(6);
            int soNguoiO = rs.getInt(7);
            String moTa = rs.getString(8);
            Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNguoiO, moTa);
            list_TimPhong.add(phong);
        }
        return list_TimPhong;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
    }
    // không lọc tình trạng
    public ArrayList<Model_TrangChu> Loc_truTT(int tang_l, String loaiPhong_L) {
    ArrayList<Model_TrangChu> list_TimPhong = new ArrayList<>();
    sql = "SELECT MA_P, Tang, PHONG.MALP, TinhTrang, LoaiPhong, Gia, SONGUOIO, MoTa " +
          "FROM PHONG " +
          "INNER JOIN LOAIPHONG ON PHONG.MALP = LOAIPHONG.MALP " +
          "WHERE Tang = ? AND LoaiPhong LIKE ?";
    try {
        con = dbconnect.DBconnect.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, tang_l);
        ps.setString(2, '%' + loaiPhong_L + '%');
        rs = ps.executeQuery();
        while (rs.next()) {
            String maPhong = rs.getString("MA_P");
            int tang = rs.getInt("Tang");
            String maLP = rs.getString("MALP");
            String tinhTrang = rs.getString("TinhTrang");
            String loaiPhong = rs.getString("LoaiPhong");
            double giaPhong = rs.getDouble("Gia");
            int soNguoiO = rs.getInt("SONGUOIO");
            String moTa = rs.getString("MoTa");
            Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNguoiO, moTa);
            list_TimPhong.add(phong);
        }
        return list_TimPhong;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
    }
    // không loc loại phòng
    public ArrayList<Model_TrangChu> Loc_truLP(int tang_l, String tinhTrang_l) {
    ArrayList<Model_TrangChu> list_TimPhong = new ArrayList<>();
    sql = "SELECT MA_P, Tang, PHONG.MALP, TinhTrang, LoaiPhong, Gia, SONGUOIO, MoTa " +
          "FROM PHONG " +
          "INNER JOIN LOAIPHONG ON PHONG.MALP = LOAIPHONG.MALP " +
          "WHERE Tang = ? AND TinhTrang like ?";
    try {
        con = dbconnect.DBconnect.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, tang_l);
        ps.setString(2, tinhTrang_l );
        rs = ps.executeQuery();
        while (rs.next()) {
            String maPhong = rs.getString("MA_P");
            int tang = rs.getInt("Tang");
            String maLP = rs.getString("MALP");
            String tinhTrang = rs.getString("TinhTrang");
            String loaiPhong = rs.getString("LoaiPhong");
            double giaPhong = rs.getDouble("Gia");
            int soNguoiO = rs.getInt("SONGUOIO");
            String moTa = rs.getString("MoTa");
            Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNguoiO, moTa);
            list_TimPhong.add(phong);
        }
        return list_TimPhong;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    } 
    }
    // chỉ lọc tầng
    public ArrayList<Model_TrangChu> Loc_chiLT (int tang_l) {
        ArrayList<Model_TrangChu> list_TimPhong = new ArrayList<>();
        sql = "select MA_P, Tang, PHONG.MALP, TinhTrang, LoaiPhong, Gia, SONGUOIO, MoTa from PHONG, LOAIPHONG where PHONG.MALP = LOAIPHONG.MALP and Tang = ? ";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,  tang_l );                
            rs = ps.executeQuery();
            while (rs.next()) {
                String maPhong = rs.getString(1);
                int tang = rs.getInt(2);
                String maLP = rs.getString(3);
                String tinhTrang = rs.getString(4);
                String loaiPhong = rs.getString(5);
                double giaPhong = rs.getDouble(6);
                int soNGuoio = rs.getInt(7);
                String moTa = rs.getString(8);
                Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNGuoio, moTa);
                list_TimPhong.add(phong);
            }
            return list_TimPhong;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    // chỉ lọc loại phòng
    public ArrayList<Model_TrangChu> Loc_LP ( String loaiPhong_L) {
        ArrayList<Model_TrangChu> list_TimPhong = new ArrayList<>();
        sql = "select MA_P, Tang, PHONG.MALP, TinhTrang, LoaiPhong, Gia, SONGUOIO, MoTa  from PHONG, LOAIPHONG  where PHONG.MALP = LOAIPHONG.MALP and LOAIPHONG like ? ";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
           
          
            ps.setString(1, '%' + loaiPhong_L + '%');           
            rs = ps.executeQuery();
            while (rs.next()) {
                String maPhong = rs.getString(1);
                int tang = rs.getInt(2);
                String maLP = rs.getString(3);
                String tinhTrang = rs.getString(4);
                String loaiPhong = rs.getString(5);
                double giaPhong = rs.getDouble(6);
                int soNGuoio = rs.getInt(7);
                String moTa = rs.getString(8);
                Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNGuoio, moTa);
                list_TimPhong.add(phong);
            }
            return list_TimPhong;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    // chỉ lọc tình trạng
    public ArrayList<Model_TrangChu> Loc_TT ( String tinhTrang_l) {
        ArrayList<Model_TrangChu> list_TimPhong = new ArrayList<>();
        sql = "select MA_P, Tang, PHONG.MALP, TinhTrang, LoaiPhong, Gia, SONGUOIO, MoTa from PHONG, LOAIPHONG where PHONG.MALP = LOAIPHONG.MALP  and TinhTrang like ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
           
            ps.setString(1, '%' + tinhTrang_l + '%');
                     
            rs = ps.executeQuery();
            while (rs.next()) {
                String maPhong = rs.getString(1);
                int tang = rs.getInt(2);
                String maLP = rs.getString(3);
                String tinhTrang = rs.getString(4);
                String loaiPhong = rs.getString(5);
                double giaPhong = rs.getDouble(6);
                int soNGuoio = rs.getInt(7);
                String moTa = rs.getString(8);
                Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNGuoio, moTa);
                list_TimPhong.add(phong);
            }
            return list_TimPhong;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
