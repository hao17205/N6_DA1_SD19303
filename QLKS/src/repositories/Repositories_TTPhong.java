/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import Model.Model_DSPhong;
import java.util.ArrayList;
import dbconnect.DBconnect;
/**
 *
 * @author Chi Dat
 */
public class Repositories_TTPhong {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model_DSPhong> getAll_DSPhong(){
        ArrayList<Model_DSPhong> list_DSP = new ArrayList<>();
        sql = "select p.Tang,p.MA_P,p.TinhTrang,lp.LoaiPhong,lp.Gia,lp.SONGUOIO,lp.MoTa\n" +
"from PHONG p INNER JOIN LOAIPHONG lp on p.MALP = lp.MALP\n" +
"where p.TinhTrang = N'Trống'";
            try {
                con = DBconnect.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    int tang;
                    String maPhong;
                    String tinhTrang;
                    String loaiPhong;
                    double giaPhong;
                    int soNguoiO;
                    String moTa;
                    
                    tang = rs.getInt(1);
                    maPhong = rs.getString(2);
                    tinhTrang = rs.getString(3);
                    loaiPhong = rs.getString(4);
                    giaPhong = rs.getDouble(5);
                    soNguoiO = rs.getInt(6);
                    moTa = rs.getString(7);
                    
                    Model_DSPhong ds_p = new Model_DSPhong(tang, maPhong, tinhTrang, loaiPhong, giaPhong, soNguoiO, moTa);
                    list_DSP.add(ds_p);
                    
                    
                }return list_DSP;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    public int sua_TT(String maPhong,String tinhTrang){
        sql = "UPDATE PHONG SET TinhTrang = ? WHERE MA_P = ?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, tinhTrang);
            ps.setString(2, maPhong);
            
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
}
