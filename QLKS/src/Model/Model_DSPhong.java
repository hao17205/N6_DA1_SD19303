/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Chi Dat
 */
public class Model_DSPhong {
    private int tang;
    private String maPhong;
    private String tinhTrang;
    private String loaiPhong;
    private double giaPhong;
    private int soNguoiO;
    private String moTa;

    public Model_DSPhong() {
    }

    public Model_DSPhong(int tang, String maPhong, String tinhTrang, String loaiPhong, double giaPhong, int soNguoiO, String moTa) {
        this.tang = tang;
        this.maPhong = maPhong;
        this.tinhTrang = tinhTrang;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.soNguoiO = soNguoiO;
        this.moTa = moTa;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
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
    
    public  Object[] toDaTa_DSPhong(){
        return new Object[]{this.getTang(),this.getMaPhong(),this.getTinhTrang(),this.getLoaiPhong(),this.getGiaPhong()
        ,this.getSoNguoiO(),this.getMoTa()};
    }
}
