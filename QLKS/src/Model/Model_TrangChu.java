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
    private int tang;
    private String maLP;
    private String tinhTrang;
    private String loaiPhong;
    private double giaPhong;
    private int soNguoio;
    private String moTa;

    public Model_TrangChu() {
    }

    public Model_TrangChu(String maPhong, int tang, String maLP, String tinhTrang, String loaiPhong, double giaPhong, int soNguoio, String moTa) {
        this.maPhong = maPhong;
        this.tang = tang;
        this.maLP = maLP;
        this.tinhTrang = tinhTrang;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.soNguoio = soNguoio;
        this.moTa = moTa;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public String getMaLP() {
        return maLP;
    }

    public void setMaLP(String maLP) {
        this.maLP = maLP;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public int getSoNguoio() {
        return soNguoio;
    }

    public void setSoNguoio(int soNguoio) {
        this.soNguoio = soNguoio;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    public Object[] toDaTaRows_Phong(){
        return new Object[]{this.getMaPhong(),this.getTang(),this.getMaLP(),this.getTinhTrang(),this.getLoaiPhong(),
        this.getGiaPhong(),this.getSoNguoio(),this.getMoTa()};
    }
    // sửa
    public Model_TrangChu(String maPhong, int tang, String maLP, String tinhTrang) {
        this.maPhong = maPhong;
        this.tang = tang;
        this.maLP = maLP;
        this.tinhTrang = tinhTrang;
    }
    // loại phòng

    public Model_TrangChu(String maLP, String loaiPhong, double giaPhong, String moTa) {
        this.maLP = maLP;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.moTa = moTa;
    }
    public Object[] toDaTaRows_LP(){
        return new Object[]{this.maLP, this.loaiPhong, this.giaPhong, this.moTa};
    }

    public Model_TrangChu(String maPhong) {
        this.maPhong = maPhong;
    }

    public Model_TrangChu(int tang, String tinhTrang, String loaiPhong) {
        this.tang = tang;
        this.tinhTrang = tinhTrang;
        this.loaiPhong = loaiPhong;
    }
    
    
    
}
