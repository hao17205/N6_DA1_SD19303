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
    private Date checkIn;
    private Date checkOut;
    private double tienPhong;

    public Model_DP3() {
    }

    public Model_DP3(String ma_HDCT, String maHD, String maPhong, Date checkIn, Date checkOut, double tienPhong) {
        this.ma_HDCT = ma_HDCT;
        this.maHD = maHD;
        this.maPhong = maPhong;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.tienPhong = tienPhong;
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

    public double getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(double tienPhong) {
        this.tienPhong = tienPhong;
    }
    
    
    
    
 
    
    
}
