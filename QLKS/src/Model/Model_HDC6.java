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
public class Model_HDC6 {
    private String maHD;
    private Date ngayXuatDon;
    private String trangThai;

    public Model_HDC6() {
    }

    public Model_HDC6(String maHD, Date ngayXuatDon, String trangThai) {
        this.maHD = maHD;
        this.ngayXuatDon = ngayXuatDon;
        this.trangThai = trangThai;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayXuatDon() {
        return ngayXuatDon;
    }

    public void setNgayXuatDon(Date ngayXuatDon) {
        this.ngayXuatDon = ngayXuatDon;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] toData_HDC6(){
        return new Object[]{this.getMaHD(),this.ngayXuatDon,this.getTrangThai()};
    }
}
