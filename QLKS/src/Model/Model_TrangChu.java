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
    String maPhong;
    String tinhTrang;
    int tang;

    public Model_TrangChu() {
    }

    public Model_TrangChu(String maPhong, String tinhTrang, int tang) {
        this.maPhong = maPhong;
        this.tinhTrang = tinhTrang;
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

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    
    public Object[] toData_TrangChu(){
        return new Object[]{this.getMaPhong(),this.getTinhTrang(),this.getTang()};
    }

    
    
    
}
