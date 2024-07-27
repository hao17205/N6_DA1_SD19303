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
public class Model_KM {
    private String maKM;
    private String tenKM;
    private double pTGG;
    private Date ngayBD;
    private Date ngayKT;
    private String moTa;

    public Model_KM() {
    }

    public Model_KM(String maKM, String tenKM, double pTGG, Date ngayBD, Date ngayKT, String moTa) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.pTGG = pTGG;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.moTa = moTa;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public double getpTGG() {
        return pTGG;
    }

    public void setpTGG(double pTGG) {
        this.pTGG = pTGG;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

   public Object[] toDaTaRow_KM(){
       return new Object[]{this.maKM, this.tenKM, this.pTGG, this.ngayBD, this.ngayKT, this.moTa}; 
   }
    
}
