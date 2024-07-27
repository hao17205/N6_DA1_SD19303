/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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

    
    
    public Object[] toDaTaRow_DV(){
        return new Object[]{ this.maDV, this.tenDV, this.gia, this.loaiDV, this.moTa
            
        };
    }
}
