/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import dbconnect.DBconnect;
import Model.Model_TT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Repositories_HDCT {

    private Connection con = null;
    private PreparedStatement pr = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_TT> getAll_HDCT() {
        sql = "SELECT HDCT.MA_HDCT, HDCT.MAHD, HDCT.MA_P, HDCT.CheckIn, HDCT.CheckOut, HDCT.TienPhong \n"
                + "FROM HOADONCHITIET HDCT \n"
                + "JOIN HOADON HD ON HDCT.MAHD = HD.MAHD \n";
        ArrayList<Model_TT> listHoaDonChiTiet = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHDCT = rs.getString("MA_HDCT");
                String maHD = rs.getString("MAHD");
                String maP = rs.getString("MA_P");
                Date checkIn = rs.getDate("CheckIn");
                Date checkOut = rs.getDate("CheckOut");
                double tienPhong = rs.getDouble("TienPhong");

                Model_TT tt = new Model_TT(maP, maP, maP, maP, maP, 0, tienPhong, 0, tienPhong, tienPhong, maP, checkOut, checkOut, tienPhong, tienPhong, tienPhong, tienPhong, maHDCT, maHD, maP, checkIn, checkOut, tienPhong);
                listHoaDonChiTiet.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDonChiTiet;
    }

    public ArrayList<Model_TT> timkiem_MHDCT(String searchTerm) {
        String sql = "SELECT HDCT.MA_HDCT, HDCT.MAHD, HDCT.MA_P, HDCT.CheckIn, HDCT.CheckOut, HDCT.TienPhong \n"
                + "FROM HOADONCHITIET HDCT \n"
                + "JOIN HOADON HD ON HDCT.MAHD = HD.MAHD \n"
                + "WHERE (HDCT.MA_HDCT LIKE ? OR HDCT.MAHD LIKE ? OR HDCT.MA_P LIKE ?) \n";

        ArrayList<Model_TT> listHoaDonChiTiet = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            String searchPattern = '%' + searchTerm + '%';
            pr.setString(1, searchPattern);
            pr.setString(2, searchPattern);
            pr.setString(3, searchPattern);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHDCT = rs.getString("MA_HDCT");
                String maHD = rs.getString("MAHD");
                String maP = rs.getString("MA_P");
                Date checkIn = rs.getDate("CheckIn");
                Date checkOut = rs.getDate("CheckOut");
                double tienPhong = rs.getDouble("TienPhong");

                Model_TT tt = new Model_TT(maHD, maP, maP, searchTerm, maHD, 0, tienPhong, 0, tienPhong, tienPhong, maHD, checkOut, checkOut, tienPhong, tienPhong, tienPhong, tienPhong, maHDCT, maHDCT, maP, checkIn, checkOut, tienPhong);
                listHoaDonChiTiet.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDonChiTiet;
    }

    public ArrayList<Model_TT> getHDCTByMaHD(String maHD) {
        sql = "SELECT HDCT.MA_HDCT, HDCT.MAHD, HDCT.MA_P, HDCT.CheckIn, HDCT.CheckOut, HDCT.TienPhong \n"
                + "FROM HOADONCHITIET HDCT \n"
                + "JOIN HOADON HD ON HDCT.MAHD = HD.MAHD \n"
                + "WHERE HDCT.MAHD = ? \n";

        ArrayList<Model_TT> listHoaDonChiTiet = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setString(1, maHD);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHDCT = rs.getString("MA_HDCT");
                String maP = rs.getString("MA_P");
                Date checkIn = rs.getDate("CheckIn");
                Date checkOut = rs.getDate("CheckOut");
                double tienPhong = rs.getDouble("TienPhong");

                Model_TT tt = new Model_TT(maHD, maP, maP, maP, maHD, 0, tienPhong, 0, tienPhong, tienPhong, maHD, checkOut, checkOut, tienPhong, tienPhong, tienPhong, tienPhong, maHDCT, maHD, maP, checkIn, checkOut, tienPhong);
                listHoaDonChiTiet.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDonChiTiet;
    }
}