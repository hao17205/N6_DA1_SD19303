/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Chi Dat
 */
public class Model_ChiTietPhong {
    
    private String maHD;
    private String maPhong;
    private String tenKH;
   

    public Model_ChiTietPhong() {
    }

    public Model_ChiTietPhong(String maHD, String maPhong, String tenKH) {
        this.maHD = maHD;
        this.maPhong = maPhong;
        this.tenKH = tenKH;
    }

    public Model_ChiTietPhong(String maPhong, String tenKH) {
        this.maPhong = maPhong;
        this.tenKH = tenKH;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    

    
    public Object[] toData_ChiTiet(){
        return new Object[]{this.getMaPhong(),this.getTenKH()};
    }
    
    
    
}
