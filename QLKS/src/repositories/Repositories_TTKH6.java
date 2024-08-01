/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*; 
import java.util.ArrayList;
import Model.Model_DatPhong;
/**
 *
 * @author Chi Dat
 */
public class Repositories_TTKH6 {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model_DatPhong> getAll_KH(){
        sql = "select MAKH,TenKhachHang,NgaySinh,CCCD,SoDienThoai,Email,GioiTinh,DiaChi from KHACHHANG";
        ArrayList<Model_DatPhong> list_KH = new ArrayList<>();
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String maKH;
                String tenKH;
                Date ngaySinh;
                String soCccd;
                String sDT;
                String eMail;
                int gioiTinh;
                String DiaChi;
                maKH = rs.getString(1);
                tenKH = rs.getString(2);
                ngaySinh = rs.getDate(3);
                soCccd = rs.getString(4);
                sDT = rs.getString(5);
                eMail = rs.getString(6);
                gioiTinh = rs.getInt(7);
                DiaChi = rs.getString(8);
                Model_DatPhong dp = new Model_DatPhong(maKH, tenKH, ngaySinh, soCccd, DiaChi, eMail, gioiTinh, DiaChi);
                list_KH.add(dp);
   
            }return list_KH;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Model_DatPhong> timKiem_KH(String maKH1){
        sql = "select MAKH,TenKhachHang,NgaySinh,CCCD,SoDienThoai,Email,GioiTinh,DiaChi \n" +
"from KHACHHANG where MAKH like ? or TenKhachHang like ? or CCCD like ? or SoDienThoai like ? or Email like ?";
        ArrayList<Model_DatPhong> list_KH = new ArrayList<>();
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, "%" + maKH1 + "%");
            ps.setObject(2, "%" + maKH1 + "%");
            ps.setObject(3, "%" + maKH1 + "%");
            ps.setObject(4, "%" +  maKH1+ "%");
            ps.setObject(5, "%" +  maKH1+ "%");
            rs = ps.executeQuery();
            while(rs.next()){
                String maKH;
                String tenKH;
                Date ngaySinh;
                String soCccd;
                String sDT;
                String eMail;
                int gioiTinh;
                String DiaChi;
                maKH = rs.getString(1);
                tenKH = rs.getString(2);
                ngaySinh = rs.getDate(3);
                soCccd = rs.getString(4);
                sDT = rs.getString(5);
                eMail = rs.getString(6);
                gioiTinh = rs.getInt(7);
                DiaChi = rs.getString(8);
                Model_DatPhong dp = new Model_DatPhong(maKH, tenKH, ngaySinh, soCccd, DiaChi, eMail, gioiTinh, DiaChi);
                list_KH.add(dp);
   
            }return list_KH;   
        } catch (Exception e) {
                e.printStackTrace();
                return null;
                
                }
        
         
    }
}
