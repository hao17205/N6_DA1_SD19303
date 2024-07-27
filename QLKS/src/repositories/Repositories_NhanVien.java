/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import java.util.ArrayList;
import Model.Model_NhanVien;

public class Repositories_NhanVien {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    String sql =null;
    
    public ArrayList<Model_NhanVien>getAll_NV(){
    ArrayList<Model_NhanVien> list_NV = new ArrayList<>();
    sql = "select MANV,TenNV,NgaySinh,GioiTinh,SoDienThoai,Email,DiaChi,ChucVu from NHANVIEN";
    
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
             while (rs.next()) {                
                 String maNV;
                 String tenNV;
                 Date ngaySinh;
                 int gioiTinh;
                 String sdt;
                 String email;
                 String diaChi;
                 String chucVu;
                 
                 maNV = rs.getString(1);
                 tenNV = rs.getString(2);
                 ngaySinh = rs.getDate(3);
                 gioiTinh = rs.getInt(4);
                 sdt = rs.getString(5);
                 email = rs.getString(6);
                 diaChi = rs.getString(7);
                 chucVu = rs.getString(8);
                
                Model_NhanVien NV = new  Model_NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sdt, email, diaChi, chucVu);
                 list_NV.add(NV);
            }
             return list_NV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
}
    
    //code nút thêm 
    public int them_NV(Model_NhanVien NV){
        sql = "insert into NHANVIEN(MANV,TenNV,NgaySinh,GioiTinh,SoDienThoai,Email,DiaChi,ChucVu)\n" +
"values(?,?,?,?,?,?,?,?)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setObject(1, NV.getMaNV());
            ps.setObject(2, NV.getTenNV());
            ps.setObject(3, NV.getNgaySinh());
            ps.setObject(4, NV.getGioiTinh());
            ps.setObject(5, NV.getSdt());
            ps.setObject(6, NV.getEmail());
            ps.setObject(7, NV.getDiaChi());
            ps.setObject(8, NV.getChucVu());
            
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        }
    
    //code nút sửa 
    public int sua_NV(String maNV,Model_NhanVien s){
        sql ="update NHANVIEN set TenNV =?,NgaySinh=?,GioiTinh=?,SoDienThoai=?,Email=?,DiaChi=?,ChucVu=?\n" +
"where MANV=?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            
            
            ps.setObject(1, s.getTenNV());
            ps.setObject(2, s.getNgaySinh());
            ps.setObject(3, s.getGioiTinh());
            ps.setObject(4, s.getSdt());
            ps.setObject(5, s.getEmail());
            ps.setObject(6, s.getDiaChi());
            ps.setObject(7, s.getChucVu());
            ps.setObject( 8,maNV);
            
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        }
    
    //code nút xóa
    
    public int xoa_NV(String maNV){
        sql = "delete from NHANVIEN where MANV = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maNV);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        }
    
    //code nút Tìm kiếm
    
   public ArrayList<Model_NhanVien> timKiem( String timKiemNV){
       ArrayList<Model_NhanVien> list_NV = new ArrayList<>();
       sql = "select maNV,TenNV,NgaySinh,GioiTinh,SoDienThoai,Email,DiaChi,ChucVu from NhanVien\n" +
"where maNV like ? or soDienThoai like ? or email like ?";
       
       try {
           con = dbconnect.DBconnect.getConnection();
           ps = con.prepareStatement(sql);
           ps.setString(1,"%" +timKiemNV+"%");
           ps.setString(2,"%" +timKiemNV+"%");
           ps.setString(3,"%" +timKiemNV+"%");
           rs = ps.executeQuery();
           
           while(rs.next()){
                 String maNV;
                 String tenNV;
                 Date ngaySinh;
                 int gioiTinh;
                 String sdt;
                 String email;
                 String diaChi;
                 String chucVu;
                 
                 maNV = rs.getString(1);
                 tenNV = rs.getString(2);
                 ngaySinh = rs.getDate(3);
                 gioiTinh = rs.getInt(4);
                 sdt = rs.getString(5);
                 email = rs.getString(6);
                 diaChi = rs.getString(7);
                 chucVu = rs.getString(8);
                 
                Model_NhanVien NV = new Model_NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sdt, email, diaChi, chucVu);
                list_NV.add(NV);
           }
           return list_NV;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
   
   //Code Check trùng
   
   public String checkTrung(String maNV_Moi, String soDienThoai, String email_moi){
       sql = "select MANV,SoDienThoai,Email from NHANVIEN where MANV = ? or SoDienThoai = ? or Email = ?";
     
       try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, maNV_Moi);
            ps.setString(2, soDienThoai);
            ps.setString(3, email_moi);
            rs = ps.executeQuery();
            
            while(rs.next()){
                if(rs.getString("MaNV").equals(maNV_Moi)){
                    return "Mã Nhân Viên Đã Tồn Tại";
                }
                if(rs.getString("SoDienThoai").equals(soDienThoai)){
                    return "Số Điện Thoại Đã tồn Tại";
                }
                if(rs.getString("Email").equals(email_moi)){
                    return "Email Đã Tồn Tại";
                }
            }
            return null;         
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
}
