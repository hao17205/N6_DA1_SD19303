/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author rinbo
 */
public class Model_DichVu {

    private String maDV;
    private String tenDV;
    private double gia;
    private String loaiDV;
    private String moTa;

    public Model_DichVu() {
    }

    public Model_DichVu(String maDV, String tenDV, double gia, String loaiDV, String moTa) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.gia = gia;
        this.loaiDV = loaiDV;
        this.moTa = moTa;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(String loaiDV) {
        this.loaiDV = loaiDV;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Object[] toDaTaRow_DV() {
        return new Object[]{this.maDV, this.tenDV, this.gia, this.loaiDV, this.moTa

        };
    }
    // cho bảng TT hóa Đơn
    private String maHD;
    private String maP;
    private String tenKH;
    private String sDT;
    private String CCCD;

    public Model_DichVu(String maHD, String maP, String tenKH, String sDT, String CCCD) {
        this.maHD = maHD;
        this.maP = maP;
        this.tenKH = tenKH;
        this.sDT = sDT;
        this.CCCD = CCCD;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Object[] toDaTaRow_TTHDDV() {
        return new Object[]{this.maHD, this.maP, this.tenKH, this.sDT, this.CCCD};
    }
    // model để đặt dịch vụ
    private String maDDV;
    private int soLuong;
    private Date ngayDat;
    private double tongTien;

    public Model_DichVu(String maDDV, String maP, String maDV, String tenDV, int soLuong, double gia,  double tongTien, String maHD) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.gia = gia;
        this.maHD = maHD;
        this.maP = maP;
        this.maDDV = maDDV;
        this.soLuong = soLuong;
        
        this.tongTien = tongTien;
    }
    
    public Model_DichVu(String maP, String maDV, String tenDV, int soLuong, double gia,  double tongTien, String maHD) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.gia = gia;
        this.maHD = maHD;
        this.maP = maP;
        
        this.soLuong = soLuong;
        
        this.tongTien = tongTien;
    }

    public String getMaDDV() {
        return maDDV;
    }

    public void setMaDDV(String maDDV) {
        this.maDDV = maDDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
    public Object[] toDaTaRow_DDV(){
        return new Object[]{this.maDDV, this.maP, this.maDV, this.tenDV, this.soLuong, this.gia, this.ngayDat, this.tongTien, this.maHD};
    }
    // checkTrung mã đặt dịch vụ

    public Model_DichVu(String maDDV) {
        this.maDDV = maDDV;
    }
    // hủy dịch vụ đã đặt

    public Model_DichVu(String maDDV, String maP,String maDV, String tenDV, int soLuong,double gia, Date ngayDat, double tongTien, String maHD) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.gia = gia;
        this.maHD = maHD;
        this.maP = maP;
        this.maDDV = maDDV;
        this.soLuong = soLuong;
        this.ngayDat = ngayDat;
        this.tongTien = tongTien;
    }
    
}
