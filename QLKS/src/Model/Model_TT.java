/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Model_TT {

    //HD
    private String maHD;
    private String tenNV;
    private String tenKH;
    private String soDienThoai;
    private String diaChi;
    private int soPhongDat;
    private double giaBanDau;
    private int khuyenMai;
    private double tongTienDichVu;
    private double tongTienPhong;
    private String trangThai;
    private Date ngayXuatDon;
    private Date ngayThanhToan;
    private double thue;
    private double tienCoc;
    private double tongTien;
    private double soTienCanThanhToan;

    //HDCT
    private String maHDCT;
    private String maHD_HDCT;
    private String maP;
    private Date checkIn;
    private Date checkOut;
    private double tienPhong;

    public Model_TT() {
    }

    public Model_TT(String maHD, String tenNV, String tenKH, String soDienThoai, String diaChi, int soPhongDat, double giaBanDau, int khuyenMai, double tongTienDichVu, double tongTienPhong, String trangThai, Date ngayXuatDon, Date ngayThanhToan, double thue, double tienCoc, double tongTien, double soTienCanThanhToan, String maHDCT, String maHD_HDCT, String maP, Date checkIn, Date checkOut, double tienPhong) {
        this.maHD = maHD;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.soPhongDat = soPhongDat;
        this.giaBanDau = giaBanDau;
        this.khuyenMai = khuyenMai;
        this.tongTienDichVu = tongTienDichVu;
        this.tongTienPhong = tongTienPhong;
        this.trangThai = trangThai;
        this.ngayXuatDon = ngayXuatDon;
        this.ngayThanhToan = ngayThanhToan;
        this.thue = thue;
        this.tienCoc = tienCoc;
        this.tongTien = tongTien;
        this.soTienCanThanhToan = soTienCanThanhToan;
        this.maHDCT = maHDCT;
        this.maHD_HDCT = maHD_HDCT;
        this.maP = maP;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.tienPhong = tienPhong;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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

    public int getSoPhongDat() {
        return soPhongDat;
    }

    public void setSoPhongDat(int soPhongDat) {
        this.soPhongDat = soPhongDat;
    }

    public double getGiaBanDau() {
        return giaBanDau;
    }

    public void setGiaBanDau(double giaBanDau) {
        this.giaBanDau = giaBanDau;
    }

    public int getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(int khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public double getTongTienDichVu() {
        return tongTienDichVu;
    }

    public void setTongTienDichVu(double tongTienDichVu) {
        this.tongTienDichVu = tongTienDichVu;
    }

    public double getTongTienPhong() {
        return tongTienPhong;
    }

    public void setTongTienPhong(double tongTienPhong) {
        this.tongTienPhong = tongTienPhong;
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

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getSoTienCanThanhToan() {
        return soTienCanThanhToan;
    }

    public void setSoTienCanThanhToan(double soTienCanThanhToan) {
        this.soTienCanThanhToan = soTienCanThanhToan;
    }

    public String getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(String maHDCT) {
        this.maHDCT = maHDCT;
    }

    public String getMaHD_HDCT() {
        return maHD_HDCT;
    }

    public void setMaHD_HDCT(String maHD_HDCT) {
        this.maHD_HDCT = maHD_HDCT;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
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

    public Object[] toDataRow_HD() {
        return new Object[]{
            this.getMaHD() == null ? "" : this.getMaHD(),
            this.getTenNV() == null ? "" : this.getTenNV(),
            this.getTenKH() == null ? "" : this.getTenKH(),
            this.getSoDienThoai() == null ? "" : this.getSoDienThoai(),
            this.getDiaChi() == null ? "" : this.getDiaChi(),
            this.getSoPhongDat(),
            this.getGiaBanDau(),
            this.getKhuyenMai(),
            this.getTongTienDichVu(),
            this.getTongTienPhong(),
            this.getTrangThai() == null ? "" : this.getTrangThai(),
            this.getNgayXuatDon() == null ? "" : this.getNgayXuatDon().toString(),
            this.getNgayThanhToan() == null ? "" : this.getNgayThanhToan().toString(),
            this.getThue(),
            this.getTienCoc(),
            this.getTongTien(),
            this.getSoTienCanThanhToan()
        };
    }

    public Object[] toDataRow_HDCT() {
        return new Object[]{
            this.getMaHDCT() == null ? "" : this.getMaHDCT(),
            this.getMaHD_HDCT() == null ? "" : this.getMaHD_HDCT(),
            this.getMaP() == null ? "" : this.getMaP(),
            this.getCheckIn() == null ? "" : this.getCheckIn().toString(),
            this.getCheckOut() == null ? "" : this.getCheckOut().toString(),
            this.getTienPhong()
        };
    }

    public Object[] toDataRow_TT() {
        return new Object[]{
            this.getMaHD() == null ? "" : this.getMaHD(),
            this.getTenNV() == null ? "" : this.getTenNV(),
            this.getTenKH() == null ? "" : this.getTenKH(),
            this.getSoDienThoai() == null ? "" : this.getSoDienThoai(),
            this.getDiaChi() == null ? "" : this.getDiaChi(),
            this.getNgayXuatDon() == null ? "" : this.getNgayXuatDon().toString(),
            this.getThue()
        };
    }

    public Object[] toDataRow_TT_DV() {
        return new Object[]{
            this.getTongTienDichVu()
        };
    }

    public Object[] toDataRow_TT_P() {
        return new Object[]{
            this.getSoPhongDat(),
            this.getTongTienPhong()
        };
    }
}
