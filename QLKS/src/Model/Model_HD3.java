/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Chi Dat
 */
public class Model_HD3 {
    private String maHD;
    private String maNV;
    private String maKH;
    private String soDienThoai;
    private String diaChi;
    private double tienCoc;

    public Model_HD3() {
    }

    public Model_HD3(String maHD, String maNV, String maKH, String soDienThoai, String diaChi, double tienCoc) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maKH = maKH;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.tienCoc = tienCoc;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
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

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }
    
    
            
    
}
