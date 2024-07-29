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
    String sql= null;
    public ArrayList<Model_TrangChu> getAll(){
      sql = "select p.MA_P,p.MALP,p.TinhTrang,p.Tang,lp.Gia,lp.LoaiPhong,lp.SONGUOIO,lp.MoTa \n" +
"from PHONG p inner join LOAIPHONG lp on p.MALP = lp.MALP  " ;
        ArrayList<Model_TrangChu> list_TT = new ArrayList<>();
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String maPhong;
                String maLoaiPhong;
                String tinhTrang;
                int tang;
                double gia;
                String loaiPhong;
                int soNguoiO;
                String moTa;
                
                maPhong = rs.getString(1);
                maLoaiPhong = rs.getString(2);
                tinhTrang = rs.getString(3);
                tang = rs.getInt(4);
                gia = rs.getDouble(5);
                loaiPhong = rs.getString(6);
                soNguoiO = rs.getInt(7);
                moTa = rs.getString(8);
                Model_TrangChu tc = new Model_TrangChu(maPhong, maLoaiPhong, tinhTrang, tang, gia, loaiPhong, soNguoiO, moTa);
                list_TT.add(tc);
            }return list_TT;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
   
    
    //code nút thêm
    
    public int them_TC(Model_TrangChu tc) {
    String sql1 = "insert into LOAIPHONG(MALP,Gia,LoaiPhong,SONGUOIO,MoTa) values(?,?,?,?,?)";
    String sql2 = "insert into PHONG(MA_P,MALP,TinhTrang,Tang) values(?,?,?,?)";
    try {
        con = dbconnect.DBconnect.getConnection();
        
        // Chèn vào bảng LOAIPHONG trước
        ps = con.prepareStatement(sql1);
        ps.setObject(1, tc.getMaLoaiPhong());
        ps.setObject(2, tc.getGia());
        ps.setObject(3, tc.getLoaiPhong());
        ps.setObject(4, tc.getSoNguoiO());
        ps.setObject(5, tc.getMoTa());
        ps.executeUpdate();
        
        // Sau đó chèn vào bảng PHONG
        ps = con.prepareStatement(sql2);
        ps.setObject(1, tc.getMaPhong());
        ps.setObject(2, tc.getMaLoaiPhong());
        ps.setObject(3, tc.getTinhTrang());
        ps.setObject(4, tc.getTang());
        ps.executeUpdate();
        
        return 1;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
  //Code nút sửa 
    public int sua_TC(String maPhong,Model_TrangChu tc){
        sql = "update PHONG\n" +
"set TinhTrang=?,Tang=?,Gia=?\n" +
"where MA_P =?";
        
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            
          
            ps.setObject(1, tc.getTinhTrang());
            ps.setObject(2, tc.getTang());
            ps.setObject(3, tc.getGia());
            ps.setObject(4, maPhong);
            
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
   // code nút xóa
    public int xoa_TC(String maPhong){
        sql = "delete from PHONG where MA_P=?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setObject(1, maPhong);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        
    }
    
    //code nút tìm Kiếm
//    public ArrayList<Model_TrangChu> timKiem(String maPhong_moi){
//        ArrayList<Model_TrangChu> list_TC = new ArrayList<>();
//        
//        sql = "select MA_P,TinhTrang,Tang,Gia from PHONG where MA_P like ?";
//        try {
//            con = dbconnect.DBconnect.getConnection();
//            ps = con.prepareStatement(sql);
//            ps.setObject(1, maPhong_moi);
//            rs = ps.executeQuery();
//            
//            while(rs.next()){
//                String maPhong;
//                String tinhTrang;
//                int tang;
//                float gia;
//                
//                maPhong = rs.getString(1);
//                tinhTrang = rs.getString(2);
//                tang = rs.getInt(3);
//                gia = rs.getFloat(4); 
//                
//                //odel_TrangChu tc = new Model_TrangChu(maPhong, tinhTrang, tang, gia);
//                list_TC.add(tc);
//            }
//            return list_TC;
//                    
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
