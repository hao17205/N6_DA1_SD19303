/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author rinbo
 */
public class Model_TK {

    // TT bảng tổng hoá đơn
    private int tongHD;

    public Model_TK(int tongHD) {
        this.tongHD = tongHD;
    }

    public int getTongHD() {
        return tongHD;
    }

    public void setTongHD(int tongHD) {
        this.tongHD = tongHD;
    }

    public Object[] toDaTaRow_THD() {
        return new Object[]{this.tongHD};
    }
    // TT bảng tổng doanh thu
    private double tongDT;

    public Model_TK(double tongDT) {
        this.tongDT = tongDT;
    }

    public double getTongDT() {
        return tongDT;
    }

    public void setTongDT(double tongDT) {
        this.tongDT = tongDT;
    }
    
    public Object[] toDaTaRow_TDT() {
        return new Object[]{this.tongDT};
    }
    
    //TT bảng các thông tin hóa đơn
    private String maHD;
    private String maKH;
    private String maNV;
    private String trangThai;
    private Date ngayXuatDon;
    private Date ngayThanhToan;
    private double tongTien;

    public Model_TK() {
    }

    public Model_TK(String maHD, String maKH, String maNV, String trangThai, Date ngayXuatDon, Date ngayThanhToan, double tongTien) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.trangThai = trangThai;
        this.ngayXuatDon = ngayXuatDon;
        this.ngayThanhToan = ngayThanhToan;
        this.tongTien = tongTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayXuatDon() {
        return ngayXuatDon;
    }

    public void setNgayXuatDon(Date ngayXuatDon) {
        this.ngayXuatDon = ngayXuatDon;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    public Object[] toDaTaRow_ThongTin() {
        return new Object[]{this.maHD, this.maKH, this.maNV, this.trangThai, this.ngayXuatDon, this.ngayThanhToan, this.tongTien};
    }
    // làm thêm top dịch vụ
   private String tenDV; 

    public Model_TK(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }
    public Object[] toDaTaRow_TDV(){
        return new Object[]{this.tenDV};
    }
}
