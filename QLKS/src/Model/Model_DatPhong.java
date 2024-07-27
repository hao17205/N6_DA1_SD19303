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
public class Model_DatPhong {
    private String maKH;
    private String tenKH;
    private Date NgaySinh;
    private String soCCCD;
    private String soDienThoai;
    private String eMail;
    private int gioiTinh;
    private String diaChi;

    public Model_DatPhong() {
    }

    public Model_DatPhong(String maKH, String tenKH, Date NgaySinh, String soCCCD, String soDienThoai, String eMail, int gioiTinh, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.NgaySinh = NgaySinh;
        this.soCCCD = soCCCD;
        this.soDienThoai = soDienThoai;
        this.eMail = eMail;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    
    
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public Object[] toDataRows_KH1(){
        return new Object[]{this.getMaKH(),this.getTenKH(),this.getNgaySinh(),this.getSoCCCD(),this.getSoDienThoai()
        ,this.geteMail(),this.getGioiTinh() == 1 ? "Nam" : "Nữ",this.getDiaChi()};
    }
    
    
    
    
}
