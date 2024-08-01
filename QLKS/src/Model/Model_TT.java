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
    private double tongTienDichVu;
    private double tongTienPhong;
    private String trangThai;
    private Date ngayXuatDon;
    private Date ngayThanhToan;
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

    //HDDDV
    private String maHD_HDDDV;
    private String maDDDV;
    private String maP_HDDDV;
    private String maDV;
    private String tenDV;
    private int soLuong;
    private double gia;
    private Date ngayDat;
    private double tongTien_HDDDV;

    public Model_TT() {
    }

    public Model_TT(String maHD, String tenNV, String tenKH, String soDienThoai, String diaChi, int soPhongDat, double giaBanDau, double tongTienDichVu, double tongTienPhong, String trangThai, Date ngayXuatDon, Date ngayThanhToan, double tienCoc, double tongTien, double soTienCanThanhToan, String maHDCT, String maHD_HDCT, String maP, Date checkIn, Date checkOut, double tienPhong, String maHD_HDDDV, String maDDDV, String maP_HDDDV, String maDV, String tenDV, int soLuong, double gia, Date ngayDat, double tongTien_HDDDV, String maKH, String maNV, String sDT, double tongTDV, int soLP, double tongTP) {
        this.maHD = maHD;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.soPhongDat = soPhongDat;
        this.tongTienDichVu = tongTienDichVu;
        this.tongTienPhong = tongTienPhong;
        this.trangThai = trangThai;
        this.ngayXuatDon = ngayXuatDon;
        this.ngayThanhToan = ngayThanhToan;
        this.tienCoc = tienCoc;
        this.tongTien = tongTien;
        this.soTienCanThanhToan = soTienCanThanhToan;
        this.maHDCT = maHDCT;
        this.maHD_HDCT = maHD_HDCT;
        this.maP = maP;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.tienPhong = tienPhong;
        this.maHD_HDDDV = maHD_HDDDV;
        this.maDDDV = maDDDV;
        this.maP_HDDDV = maP_HDDDV;
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.soLuong = soLuong;
        this.gia = gia;
        this.ngayDat = ngayDat;
        this.tongTien_HDDDV = tongTien_HDDDV;
        this.maKH = maKH;
        this.maNV = maNV;
        this.sDT = sDT;
        this.tongTDV = tongTDV;
        this.soLP = soLP;
        this.tongTP = tongTP;
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

    public String getMaHD_HDDDV() {
        return maHD_HDDDV;
    }

    public void setMaHD_HDDDV(String maHD_HDDDV) {
        this.maHD_HDDDV = maHD_HDDDV;
    }

    public String getMaDDDV() {
        return maDDDV;
    }

    public void setMaDDDV(String maDDDV) {
        this.maDDDV = maDDDV;
    }

    public String getMaP_HDDDV() {
        return maP_HDDDV;
    }

    public void setMaP_HDDDV(String maP_HDDDV) {
        this.maP_HDDDV = maP_HDDDV;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public double getTongTien_HDDDV() {
        return tongTien_HDDDV;
    }

    public void setTongTien_HDDDV(double tongTien_HDDDV) {
        this.tongTien_HDDDV = tongTien_HDDDV;
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

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public double getTongTDV() {
        return tongTDV;
    }

    public void setTongTDV(double tongTDV) {
        this.tongTDV = tongTDV;
    }

    public int getSoLP() {
        return soLP;
    }

    public void setSoLP(int soLP) {
        this.soLP = soLP;
    }

    public double getTongTP() {
        return tongTP;
    }

    public void setTongTP(double tongTP) {
        this.tongTP = tongTP;
    }
    
    
    public Object[] toDataRow_HD() {
        return new Object[]{
            this.getMaHD() == null ? "" : this.getMaHD(),
            this.getTenNV() == null ? "" : this.getTenNV(),
            this.getTenKH() == null ? "" : this.getTenKH(),
            this.getSoDienThoai() == null ? "" : this.getSoDienThoai(),
            this.getDiaChi() == null ? "" : this.getDiaChi(),
            this.getSoPhongDat(),
            this.getTongTienDichVu(),
            this.getTongTienPhong(),
            this.getTrangThai(),
            this.getNgayXuatDon() == null ? "" : this.getNgayXuatDon().toString(),
            this.getNgayThanhToan() == null ? "" : this.getNgayThanhToan().toString(),
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

    public Object[] toDataRow_HDDDV() {
        return new Object[]{
            this.maHD_HDDDV == null ? "" : this.maHD_HDDDV,
            this.maDDDV == null ? "" : this.maDDDV,
            this.maP_HDDDV == null ? "" : this.maP_HDDDV,
            this.maDV == null ? "" : this.maDV,
            this.tenDV == null ? "" : this.tenDV,
            this.soLuong,
            this.gia,
            this.ngayDat == null ? "" : this.ngayDat.toString(),
            this.tongTien_HDDDV
        };
    }

    // ok 
    // star
    private String maKH;
    private String maNV;
    private String sDT;

    public Model_TT(String maHD, String maKH, String maNV, String soDienThoai, String diaChi, Date ngayXuatDon, double tienCoc) {
        this.maHD = maHD;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ngayXuatDon = ngayXuatDon;
        this.tienCoc = tienCoc;
        this.maKH = maKH;
        this.maNV = maNV;
    }

    public Object[] toDaTaRow_TTTT() {
        return new Object[]{this.maHD, this.maKH, this.maNV, this.soDienThoai, this.diaChi, this.ngayXuatDon, this.tienCoc};
    }
    // cho bảng tổng dịch vụ
    private double tongTDV;

    public Model_TT(double tongTDV) {
        this.tongTDV = tongTDV;
    }

    public Object[] toDaTaRow_TTDV() {
        return new Object[]{this.tongTDV};
    }
    // cho bảng tổng tiền phòng
    private int soLP;
    private double tongTP;

    public Model_TT(int soLP, double tongTP) {
        this.soLP = soLP;
        this.tongTP = tongTP;
    }

    public Object[] toDaTaRow_TTP() {
        return new Object[]{this.soLP, this.tongTP};
    }

}
