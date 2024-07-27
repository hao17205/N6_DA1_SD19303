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
public class Model_DP3 {
    private String ma_HDCT;
    private String maHD;
    private String maPhong;
    private String maKH;
    private String maNV;
    private String soDienThoai;
    private String diaChi;
    private Date checkIn;
    private Date checkOut;
    private double tienCoc;

    public Model_DP3() {
    }

   

    public Model_DP3(String ma_HDCT, String maHD, String maPhong, String maKH, String maNV, String soDienThoai, String diaChi, Date checkIn, Date checkOut, double tienCoc) {
        this.ma_HDCT = ma_HDCT;
        this.maHD = maHD;
        this.maPhong = maPhong;
        this.maKH = maKH;
        this.maNV = maNV;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.tienCoc = tienCoc;
    }
    

    public String getMa_HDCT() {
        return ma_HDCT;
    }

    public void setMa_HDCT(String ma_HDCT) {
        this.ma_HDCT = ma_HDCT;
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

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }
    
    
}
