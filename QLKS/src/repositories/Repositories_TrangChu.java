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
    public ArrayList<Model_TrangChu> getAll_TrangChu(){
        sql = "select MA_P,TinhTrang,Tang from PHONG";
        ArrayList<Model_TrangChu> list = new ArrayList<>();
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String maPhong;
                String tinhTrang;
                int tang;
                maPhong = rs.getString(1);
                tinhTrang = rs.getString(2);
                tang = rs.getInt(3);
                Model_TrangChu m = new Model_TrangChu(maPhong, tinhTrang, tang);
                list.add(m);
                
            }return list;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
   
    
    //code nút thêm
    
    public int them_TC(Model_TrangChu tc) {
    sql = "insert into PHONG(MA_P,TinhTrang,Tang) values(?,?,?)";
    try {
        con = dbconnect.DBconnect.getConnection();
        ps = con.prepareStatement(sql);
        ps.setObject(1, tc.getMaPhong());
        ps.setObject(2, tc.getTinhTrang());
        ps.setObject(3, tc.getTang());
        return ps.executeUpdate();
       
       
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
  //Code nút sửa 
    public int sua_TC(String maPhong,Model_TrangChu tc){
        sql = "update PHONG set TinhTrang = ?,Tang = ?\n" +
"where MA_P = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            
          
            ps.setObject(1, tc.getTinhTrang());
            ps.setObject(2, tc.getTang());
            ps.setObject(3, maPhong);
            
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
    public ArrayList<Model_TrangChu> timKiem(String maPhong_moi){
        ArrayList<Model_TrangChu> list = new ArrayList<>();
        
        sql = "select MA_P,TinhTrang,Tang from PHONG\n" +
"where MA_P like ? or TinhTrang like ? or Tang like ?\n" +
"";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1,'%'+maPhong_moi + '%');
            ps.setObject(2,'%'+maPhong_moi + '%');
            ps.setObject(3,'%'+maPhong_moi + '%');
            rs = ps.executeQuery();
            while(rs.next()){
                String maPhong;
                String tinhTrang;
                int tang;
                maPhong = rs.getString(1);
                tinhTrang = rs.getString(2);
                tang = rs.getInt(3);
                Model_TrangChu m = new Model_TrangChu(maPhong, tinhTrang, tang);
                list.add(m);
                
            }return list;
          
                    
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
