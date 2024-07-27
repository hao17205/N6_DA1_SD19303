/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Model_QLKH {
    private String maKhachHang;
    private String hoTen;
    private Date ngaySinh;
    private String Cccd;
    private String Sdt;
    private String Email;
    private int gioiTinh;
    private String diaChi;

    public Model_QLKH() {
    }

    public Model_QLKH(String maKhachHang, String hoTen, Date ngaySinh, String Cccd, String Sdt, String Email, int gioiTinh, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.Cccd = Cccd;
        this.Sdt = Sdt;
        this.Email = Email;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCccd() {
        return Cccd;
    }

    public void setCccd(String Cccd) {
        this.Cccd = Cccd;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

      
    public Object[] toDataRow_KH(){
        return new Object[]{this.getMaKhachHang(), this.getHoTen(), this.getNgaySinh(), this.getCccd(), this.getSdt(), this.getEmail(), this.getGioiTinh()==1?"Nam":"Nữ", this.getDiaChi()};
    }
    
}
