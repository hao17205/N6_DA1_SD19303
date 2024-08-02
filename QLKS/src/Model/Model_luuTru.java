/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rinbo
 */
public class Model_luuTru {
    private static String maNV;
    private static String chucVu;
     private static String tenNV;

    // Phương thức để đặt giá trị
    public static void setMaNV(String value) {
        maNV = value;
    }
    public static void setCV(String value) {
       chucVu = value;
    }
    public static void settenNV(String value) {
       tenNV = value;
    }
    // Phương thức để lấy giá trị
    public static String getMaNV() {
        return maNV;
    }
    public static String getCV() {
        return chucVu;
    }
    public static String gettenNV() {
        return tenNV;
    }
    
}
