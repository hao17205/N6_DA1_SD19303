/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author acer
 */
public class Model_TrangChu {
    private String maPhong;
    private String maLoaiPhong;
    private String tinhTrang;
    private int tang;
    private double gia;
    private String loaiPhong;
    private int soNguoiO;
    private String moTa;

    public Model_TrangChu() {
    }

    public Model_TrangChu(String maPhong, String maLoaiPhong, String tinhTrang, int tang, double gia, String loaiPhong, int soNguoiO, String moTa) {
        this.maPhong = maPhong;
        this.maLoaiPhong = maLoaiPhong;
        this.tinhTrang = tinhTrang;
        this.tang = tang;
        this.gia = gia;
        this.loaiPhong = loaiPhong;
        this.soNguoiO = soNguoiO;
        this.moTa = moTa;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSoNguoiO() {
        return soNguoiO;
    }

    public void setSoNguoiO(int soNguoiO) {
        this.soNguoiO = soNguoiO;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    

   

   

    
    
    public Object[] toDataRow_P(){
        return new Object[] {this.getMaPhong(),this.getMaLoaiPhong(),this.getTinhTrang(),this.getTang(),this.getGia(),
        this.getLoaiPhong(),this.getSoNguoiO(),this.getMoTa()};
    }
    


    
    
    
}
