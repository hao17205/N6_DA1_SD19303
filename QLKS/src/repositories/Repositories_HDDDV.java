/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Model.Model_TT;
import dbconnect.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class Repositories_HDDDV {

    private Connection con = null;
    private PreparedStatement pr = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_TT> getAll_DatDichVu() {
        sql = "SELECT MaHD, Ma_DDV, MA_P, MADV, TenDichVu, SoLuong, Gia, NgayDat, TongTien FROM DatDichVu";
        ArrayList<Model_TT> listDatDichVu = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString("MaHD");
                String maDDV = rs.getString("Ma_DDV");
                String maP = rs.getString("MA_P");
                String maDV = rs.getString("MADV");
                String tenDichVu = rs.getString("TenDichVu");
                int soLuong = rs.getInt("SoLuong");
                double gia = rs.getDouble("Gia");
                Date ngayDat = rs.getDate("NgayDat");
                double tongTien = rs.getDouble("TongTien");

                Model_TT ddv = new Model_TT(maHD, maDV, tenDichVu, tenDichVu, maHD, soLuong, gia, tongTien, tongTien, tenDichVu, ngayDat, ngayDat, gia, tongTien, tongTien, maHD, maDDV, maP, ngayDat, ngayDat, tongTien, maDDV, maDDV, maDDV, maDV, maDV, soLuong, gia, ngayDat, tongTien, maDV, maDV, sql, tongTien, soLuong, tongTien);
                listDatDichVu.add(ddv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listDatDichVu;
    }

    public ArrayList<Model_TT> timkiem_DatDichVu(String searchTerm) {
        sql = "SELECT MaHD, Ma_DDV, MA_P, MADV, TenDichVu, SoLuong, Gia, NgayDat, TongTien\n"
                + "FROM DATDICHVU\n"
                + "WHERE MaHD LIKE ? OR Ma_DDV LIKE ? OR MA_P LIKE ? OR MADV LIKE ? OR TenDichVu LIKE ?\n";
        ArrayList<Model_TT> listDatDichVu = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, '%' + searchTerm + '%');
            pr.setObject(2, '%' + searchTerm + '%');
            pr.setObject(3, '%' + searchTerm + '%');
            pr.setObject(4, '%' + searchTerm + '%');
            pr.setObject(5, '%' + searchTerm + '%');
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString("MaHD");
                String maDDV = rs.getString("Ma_DDV");
                String maP = rs.getString("MA_P");
                String maDV = rs.getString("MADV");
                String tenDichVu = rs.getString("TenDichVu");
                int soLuong = rs.getInt("SoLuong");
                double gia = rs.getDouble("Gia");
                Date ngayDat = rs.getDate("NgayDat");
                double tongTien = rs.getDouble("TongTien");

                Model_TT ddv = new Model_TT(maHD, maDV, tenDichVu, tenDichVu, maHD, soLuong, gia, tongTien, tongTien, tenDichVu, ngayDat, ngayDat, gia, tongTien, tongTien, maHD, maDDV, maP, ngayDat, ngayDat, tongTien, maDDV, maDDV, maDDV, maDV, maDV, soLuong, gia, ngayDat, tongTien, maDV, maDV, sql, tongTien, soLuong, tongTien);
                listDatDichVu.add(ddv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDatDichVu;
    }

    public ArrayList<Model_TT> getHDDDVbyMaHD(String maHD) {
        String sql = "SELECT MaHD, Ma_DDV, MA_P, MADV, TenDichVu, SoLuong, Gia, NgayDat, TongTien FROM DatDichVu WHERE MaHD = ?";
        ArrayList<Model_TT> listDatDichVu = new ArrayList<>();

        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setString(1, maHD);
            rs = pr.executeQuery();

            while (rs.next()) {
                // Lấy dữ liệu từ ResultSet
                String ma_DDV = rs.getString("Ma_DDV");
                String ma_P = rs.getString("MA_P");
                String maDV = rs.getString("MADV");
                String tenDichVu = rs.getString("TenDichVu");
                int soLuong = rs.getInt("SoLuong");
                double gia = rs.getDouble("Gia");
                Date ngayDat = rs.getDate("NgayDat");
                double tongTien = rs.getDouble("TongTien");

                Model_TT ddv = new Model_TT(maHD, maDV, tenDichVu, tenDichVu, maHD, soLuong, gia, tongTien, tongTien, tenDichVu, ngayDat, ngayDat, gia, tongTien, tongTien, maHD, ma_DDV, ma_P, ngayDat, ngayDat, tongTien, maHD, ma_DDV, ma_P, maDV, tenDichVu, soLuong, gia, ngayDat, tongTien, maDV, maDV, sql, tongTien, soLuong, tongTien);

                // Thêm vào danh sách
                listDatDichVu.add(ddv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listDatDichVu;
    }

}
