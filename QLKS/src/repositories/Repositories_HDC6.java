/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import Model.Model_HDC6;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Chi Dat
 */
public class Repositories_HDC6 {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    public ArrayList<Model_HDC6> getAll_HDC6(){
        sql = "select MAHD,NgayXuatDon,TrangThai from HOADON\n" +
"where TrangThai like N'Chưa Thanh Toán'";
        ArrayList<Model_HDC6> list_HDC = new ArrayList<>();
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String maHD;
                Date ngayXuatDon;
                String trangThai;
                
                maHD = rs.getString(1);
                ngayXuatDon = rs.getDate(2);
                trangThai = rs.getString(3);
                Model_HDC6 hdc = new Model_HDC6(maHD, ngayXuatDon, trangThai);
                list_HDC.add(hdc);
            }return list_HDC;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
                
    }
    public int them_HDC6(){
        sql = "insert into HOADON(MAHD,NgayXuatDon,TrangThai)\n" +
"values(SUBSTRING(CAST(NEWID() AS varchar(36)), 1, 8),GETDATE(),N'Chưa Thanh Toán')";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
