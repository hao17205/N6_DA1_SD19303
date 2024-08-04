/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import View.view_DichVu;
import Model.Model_TrangChu;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repositories.Repositories_TrangChu;

public class View_TrangChu extends javax.swing.JFrame {

    private Repositories_TrangChu rp_Phong = new Repositories_TrangChu();
    private DefaultTableModel mol = new DefaultTableModel();
    private int i =-1;
    private String CV = Model.Model_luuTru.getCV();
    public View_TrangChu() {
        initComponents();
        this.setLocationRelativeTo(null);
        cbo_TinhTrangPhong.removeAllItems();
        cbo_TinhTrangPhong.addItem("Trống");
        cbo_TinhTrangPhong.addItem("Đang sửa chữa");
        cbo_LoaiPhong.removeAllItems();
        cbo_LoaiPhong.addItem("Phòng Thường");
        cbo_LoaiPhong.addItem("Vip");
        cbo_LoaiPhong.addItem("Hoàng Đế");
        this.fillTable_Phong(rp_Phong.getAll_TrangChu());
        // add cbo lọc
        cbo_LP_Loc.removeAllItems();
        cbo_TT_Loc.removeAllItems();
        cbo_LP_Loc.addItem("All");
        cbo_LP_Loc.addItem("Phòng Thường");
        cbo_LP_Loc.addItem("Vip");
        cbo_LP_Loc.addItem("Hoàng Đế");
        //tt lọc
        cbo_TT_Loc.addItem("ALL");
        cbo_TT_Loc.addItem("Trống");
        cbo_TT_Loc.addItem("Đang sửa chữa");
        cbo_TT_Loc.addItem("Đang rọn phòng");
        cbo_TT_Loc.addItem("Đang sử dụng");
        // 
        ArrayList list_TT = new ArrayList<>();
        for (int j = 0; j < cbo_TT_Loc.getItemCount(); j++) {
             list_TT.add(cbo_TT_Loc.getItemAt(j).toString());
        
        }
       
    }
    public void fillTable_Phong(ArrayList<Model_TrangChu>list_TT){
        mol = (DefaultTableModel) tbl_Phong.getModel();
        mol.setRowCount(0);
        for (Model_TrangChu x : list_TT) {
            mol.addRow(x.toDaTaRows_Phong());
        }
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_home = new javax.swing.JLabel();
        lb_NhanVien = new javax.swing.JLabel();
        lb_KhachHang = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lb_DichVu = new javax.swing.JLabel();
        lb_ThongKe = new javax.swing.JLabel();
        lb_ThanhToan = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_maPhong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_Tang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_datPhong = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Phong = new javax.swing.JTable();
        txt_timKiem = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_SoNguoiO = new javax.swing.JTextField();
        txt_GiaPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_MaLoaiPhong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbo_LoaiPhong = new javax.swing.JComboBox<>();
        cbo_TinhTrangPhong = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        tbn_xoa = new javax.swing.JButton();
        tbn_sua = new javax.swing.JButton();
        tbn_Them = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_MT = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        tbn_loc = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbo_LP_Loc = new javax.swing.JComboBox<>();
        cbo_TT_Loc = new javax.swing.JComboBox<>();
        jsp_Tang_loc = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRANG CHỦ");

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/qlks.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ KHÁCH SẠN");

        lb_home.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lb_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        lb_home.setText("TRANG CHỦ");
        lb_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_homeMouseExited(evt);
            }
        });

        lb_NhanVien.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lb_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nhân viên.png"))); // NOI18N
        lb_NhanVien.setText("NHÂN VIÊN");
        lb_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_NhanVienMouseClicked(evt);
            }
        });

        lb_KhachHang.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lb_KhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/khách hàng.png"))); // NOI18N
        lb_KhachHang.setText("KHÁCH HÀNG");
        lb_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_KhachHangMouseClicked(evt);
            }
        });

        lb_DichVu.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lb_DichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dich vụ.png"))); // NOI18N
        lb_DichVu.setText("DỊCH VỤ");
        lb_DichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_DichVuMouseClicked(evt);
            }
        });

        lb_ThongKe.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lb_ThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thống kê.png"))); // NOI18N
        lb_ThongKe.setText("THỐNG KÊ");
        lb_ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ThongKeMouseClicked(evt);
            }
        });

        lb_ThanhToan.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lb_ThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thanh toán.png"))); // NOI18N
        lb_ThanhToan.setText("THANH TOÁN");
        lb_ThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ThanhToanMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thoát.png"))); // NOI18N
        jLabel9.setText("Đăng Xuất");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_ThanhToan)
                    .addComponent(lb_NhanVien)
                    .addComponent(lb_ThongKe)
                    .addComponent(lb_DichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_KhachHang)
                    .addComponent(lb_home)
                    .addComponent(jLabel1))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_home)
                .addGap(31, 31, 31)
                .addComponent(lb_NhanVien)
                .addGap(30, 30, 30)
                .addComponent(lb_DichVu)
                .addGap(33, 33, 33)
                .addComponent(lb_KhachHang)
                .addGap(38, 38, 38)
                .addComponent(lb_ThanhToan)
                .addGap(35, 35, 35)
                .addComponent(lb_ThongKe)
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã Phòng:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Tình trạng phòng:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Tầng:");

        btn_datPhong.setBackground(new java.awt.Color(204, 255, 255));
        btn_datPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_datPhong.setText("Đặt Phòng");
        btn_datPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datPhongActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Phòng"));

        tbl_Phong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phòng", "Tầng", "Mã Loại Phòng", "Tình Trạng", "Loại Phòng", "Giá Phòng", "Số Giường", "Mô Tả"
            }
        ));
        tbl_Phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Phong);

        btn_timKiem.setBackground(new java.awt.Color(242, 242, 242));
        btn_timKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_timKiem.setText("Tìm Kiếm");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_timKiem))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Số Giường:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Giá Phòng");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Mã Loại Phòng:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Loại Phòng:");

        cbo_LoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbo_TinhTrangPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_TinhTrangPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_TinhTrangPhongActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbn_xoa.setText("Xóa");
        tbn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_xoaActionPerformed(evt);
            }
        });

        tbn_sua.setText("Sửa");
        tbn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_suaActionPerformed(evt);
            }
        });

        tbn_Them.setText("Thêm");
        tbn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_ThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbn_Them)
                .addGap(31, 31, 31)
                .addComponent(tbn_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(tbn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbn_xoa)
                        .addComponent(tbn_sua)))
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Mô Tả:");

        txt_MT.setColumns(20);
        txt_MT.setRows(5);
        jScrollPane2.setViewportView(txt_MT);

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc Tìm Kiếm"));

        tbn_loc.setText("Lọc");
        tbn_loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_locActionPerformed(evt);
            }
        });

        jLabel8.setText("Tầng:");

        jLabel10.setText("Loại Phòng: ");

        jLabel14.setText("Tình Trạng:");

        cbo_LP_Loc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbo_TT_Loc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_TT_Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_TT_LocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel8))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbo_TT_Loc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jsp_Tang_loc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_LP_Loc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(tbn_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbn_loc)
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jsp_Tang_loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbo_LP_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbo_TT_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_SoNguoiO, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_GiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_MaLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Tang, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_TinhTrangPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(472, 472, 472)
                        .addComponent(btn_datPhong)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Tang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_GiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_SoNguoiO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbo_TinhTrangPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_MaLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_datPhong))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 0));
        jLabel15.setText("QUẢN LÝ PHÒNG");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_ThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ThanhToanMouseClicked
        // TODO add your handling code here:
        View_TT tt = new View_TT();
        tt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lb_ThanhToanMouseClicked

    private void lb_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_homeMouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lb_homeMouseEntered

    private void lb_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_homeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_homeMouseExited

    private void lb_DichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_DichVuMouseClicked
        // TODO add your handling code here:
        view_DichVu dv = new view_DichVu();
        dv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lb_DichVuMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        View_Login lg = new View_Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void lb_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_NhanVienMouseClicked
        // TODO add your handling code here:
        View_NhanVien nv = new View_NhanVien();
        if (CV.equalsIgnoreCase("Quản Lý")) {
             nv.setVisible(true);
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Bạn không đủ thẩm quyền để sử dụng chức năng này");
        }
       
    }//GEN-LAST:event_lb_NhanVienMouseClicked

    private void btn_datPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datPhongActionPerformed
        // TODO add your handling code here:
        View_DatPhong6 dp6 = new View_DatPhong6();
        dp6.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_datPhongActionPerformed

    private void tbl_PhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PhongMouseClicked
       i = tbl_Phong.getSelectedRow();
       this.showData(i);
    }//GEN-LAST:event_tbl_PhongMouseClicked

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
          String maPhong = txt_timKiem.getText().trim();
        if(maPhong.isEmpty()){
            JOptionPane.showMessageDialog(this, "bạn chưa nhập gì dể tìm kiếm");
        }else{
            ArrayList<Model_TrangChu> TimKiem_KH = rp_Phong.timKiemPhong(maPhong);
            if(TimKiem_KH.isEmpty()){
                JOptionPane.showMessageDialog(this, "thông tin không tồn tại");            
            }else{
                JOptionPane.showMessageDialog(this, "Đã tìm thấy thông tin");
                this.fillTable_Phong(rp_Phong.timKiemPhong(maPhong));
            }
        }
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void lb_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_KhachHangMouseClicked
        // TODO add your handling code here:
        View_QLKH qlks = new View_QLKH();
        qlks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lb_KhachHangMouseClicked

    private void lb_ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ThongKeMouseClicked
        // TODO add your handling code here:
        View_ThongKe tk = new View_ThongKe();
        if (CV.equalsIgnoreCase("Quản Lý")) {
             tk.setVisible(true);
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Bạn không đủ thẩm quyền để sử dụng chức năng này");
        }
       
       
    }//GEN-LAST:event_lb_ThongKeMouseClicked

    private void tbn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_ThemActionPerformed
        // TODO add your handling code here
        View_ThemPhong TP = new View_ThemPhong();
        TP.setDefaultCloseOperation(TP.DISPOSE_ON_CLOSE);       
         TP.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            // Cập nhật bảng sau khi cửa sổ được đóng
            fillTable_Phong(rp_Phong.getAll_TrangChu());
        }
    });
        TP.setVisible(true);
    }//GEN-LAST:event_tbn_ThemActionPerformed

    private void tbn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_suaActionPerformed
        // TODO add your handling code here:
        i = tbl_Phong.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Phòng");
        }else{
            String maP = tbl_Phong.getValueAt(i, 0).toString();
            if (this.readForm_TC()!= null) {
                if (rp_Phong.sua_TC(maP, this.readForm_TC())>0) {
                    JOptionPane.showMessageDialog(this, "cập nhật thành công");
                    this.fillTable_Phong(rp_Phong.getAll_TrangChu());
                }else{
                    JOptionPane.showMessageDialog(this, "gặp bug rồi gọi cho thằng code chức năng này ngay");
                }
            }
        }
    }//GEN-LAST:event_tbn_suaActionPerformed

    private void cbo_TinhTrangPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_TinhTrangPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_TinhTrangPhongActionPerformed

    private void tbn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_xoaActionPerformed
        // TODO add your handling code here:
        i = tbl_Phong.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "Xóa Phòng có thể làm mất dữ liệu ở 1 số hóa đơn liên quan tới phòng, bạn có chắc chắn muốn xóa");
        if (chon ==0) {
            if (i == -1) {
                JOptionPane.showMessageDialog(this, "bạn chưa chọn phòng muốn xóa");
            }else{
                String maP = tbl_Phong.getValueAt(i, 0).toString();
                if (this.readForm_TC()!= null) {
                    if (rp_Phong.xoa_TC(maP)>0) {
                        JOptionPane.showMessageDialog(this, "Xóa thành công");
                        this.fillTable_Phong(rp_Phong.getAll_TrangChu());
                    }else{
                        JOptionPane.showMessageDialog(this, "bạn đã gặp bug, vui lòng liên hệ ngay cho thằng code chức năng này qua SĐT 0397639827");
                    }
                }
            }
        }
    }//GEN-LAST:event_tbn_xoaActionPerformed

    private void tbn_locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_locActionPerformed
        // TODO add your handling code here:
        int tang_L = Integer.parseInt(String.valueOf(jsp_Tang_loc.getValue()));
        String loaiPhong_L = cbo_LP_Loc.getSelectedItem().toString();
        String tinhTrang_L = cbo_TT_Loc.getSelectedItem().toString();
        
         ArrayList list_TT = new ArrayList<>();
        for (int j = 0; j < cbo_TT_Loc.getItemCount(); j++) {
             list_TT.add(cbo_TT_Loc.getItemAt(j).toString());
        
        }
        
        ArrayList list_LP = new ArrayList();
        for (int j = 0; j < cbo_LP_Loc.getItemCount(); j++) {
             list_LP.add(cbo_LP_Loc.getItemAt(j).toString());
        }
        ArrayList<Model_TrangChu> KQTK = null;
        
        if (tang_L<0) {
            JOptionPane.showMessageDialog(this, "Dữ liệu không hợp lệ");
        }else{
            if (tang_L == 0 && loaiPhong_L.equalsIgnoreCase("All") && tinhTrang_L.equalsIgnoreCase("All")) {
            // không lọc gì
            KQTK = rp_Phong.getAll_TrangChu();
            if (KQTK.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có phòng nào có kết quả muốn lọc");
            }else{
                this.fillTable_Phong(KQTK);
            }
            
            
            //this.fillTable_Phong(rp_Phong.getAll_TrangChu());
        }else if(loaiPhong_L.equalsIgnoreCase("All") && tinhTrang_L.equalsIgnoreCase("All")){
// trường hợp chỉ lọc tầng
          KQTK = rp_Phong.Loc_chiLT(tang_L);
            if (KQTK.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có phòng nào có kết quả muốn lọc");
            }else{
                this.fillTable_Phong(KQTK);
            }
         //   fillTable_Phong(rp_Phong.Loc_chiLT(tang_L));
        }else if (tang_L == 0 && loaiPhong_L.equalsIgnoreCase("All") ) {
        // trường hợp chỉ lọc tình trạng
        KQTK = rp_Phong.Loc_TT(tinhTrang_L);
            if (KQTK.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có phòng nào có kết quả muốn lọc");
            }else{
                this.fillTable_Phong(KQTK);
            }
          //  fillTable_Phong(rp_Phong.Loc_TT(tinhTrang_L));
        }else if (tang_L == 0 && tinhTrang_L.equalsIgnoreCase("All")) {
        // trường hợp chỉ lọc loại phòng
        KQTK = rp_Phong.Loc_LP(loaiPhong_L);
            if (KQTK.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có phòng nào có kết quả muốn lọc");
            }else{
                this.fillTable_Phong(KQTK);
            }
          //  this.fillTable_Phong(rp_Phong.Loc_LP(loaiPhong_L));
        }else if (tang_L == 0) {
            //trường hợp không lọc tầng
            KQTK = rp_Phong.Loc_truTang(loaiPhong_L, tinhTrang_L);
            if (KQTK.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có phòng nào có kết quả muốn lọc");
            }else{
                this.fillTable_Phong(KQTK);
            }
           
        }else if(tinhTrang_L.equalsIgnoreCase("All")){
            //trường hợp không lọc tình trạng
           KQTK = rp_Phong.Loc_truTT(tang_L, loaiPhong_L);
            if (KQTK.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có phòng nào có kết quả muốn lọc");
            }else{
                this.fillTable_Phong(KQTK);
            }
           //this.fillTable_Phong(rp_Phong.Loc_truTT(tang_L, loaiPhong_L));
            
        }else if(loaiPhong_L.equalsIgnoreCase("All")){
            //trường hợp không lọc loại phòng
            KQTK = rp_Phong.Loc_truLP(tang_L, tinhTrang_L);
            if (KQTK.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có phòng nào có kết quả muốn lọc");
            }else{
                this.fillTable_Phong(KQTK);
            }
           // this.fillTable_Phong(rp_Phong.Loc_truLP(tang_L, tinhTrang_L)); 
            
        }else  if (tang_L > 0 && list_LP.contains(loaiPhong_L) && list_TT.contains(tinhTrang_L)) {
        // trường hợp lọc cả 3
        KQTK = rp_Phong.Loc_C3(tang_L, tinhTrang_L, loaiPhong_L);
        if (KQTK.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có phòng nào có kết quả muốn lọc");
            }else{
                this.fillTable_Phong(KQTK);
            }
           // this.fillTable_Phong(rp_Phong.Loc_C3(tang_L, tinhTrang_L, loaiPhong_L));
        }
        }
        
        
        // không lọc gì
        
    }//GEN-LAST:event_tbn_locActionPerformed

    private void cbo_TT_LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_TT_LocActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbo_TT_LocActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_datPhong;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_LP_Loc;
    private javax.swing.JComboBox<String> cbo_LoaiPhong;
    private javax.swing.JComboBox<String> cbo_TT_Loc;
    private javax.swing.JComboBox<String> cbo_TinhTrangPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jsp_Tang_loc;
    private javax.swing.JLabel lb_DichVu;
    private javax.swing.JLabel lb_KhachHang;
    private javax.swing.JLabel lb_NhanVien;
    private javax.swing.JLabel lb_ThanhToan;
    private javax.swing.JLabel lb_ThongKe;
    private javax.swing.JLabel lb_home;
    private javax.swing.JTable tbl_Phong;
    private javax.swing.JButton tbn_Them;
    private javax.swing.JButton tbn_loc;
    private javax.swing.JButton tbn_sua;
    private javax.swing.JButton tbn_xoa;
    private javax.swing.JTextField txt_GiaPhong;
    private javax.swing.JTextArea txt_MT;
    private javax.swing.JTextField txt_MaLoaiPhong;
    private javax.swing.JTextField txt_SoNguoiO;
    private javax.swing.JTextField txt_Tang;
    private javax.swing.JTextField txt_maPhong;
    private javax.swing.JTextField txt_timKiem;
    // End of variables declaration//GEN-END:variables

    private void showData(int i){
        txt_maPhong.setText(tbl_Phong.getValueAt(i, 0).toString());
        txt_Tang.setText(tbl_Phong.getValueAt(i, 1).toString());
        txt_MaLoaiPhong.setText(tbl_Phong.getValueAt(i, 2).toString());
        cbo_TinhTrangPhong.setSelectedItem(tbl_Phong.getValueAt(i,3).toString());
        cbo_LoaiPhong.setSelectedItem(tbl_Phong.getValueAt(i, 4).toString());
        txt_GiaPhong.setText(tbl_Phong.getValueAt(i, 5).toString());
        txt_SoNguoiO.setText(tbl_Phong.getValueAt(i, 6).toString());
        txt_MT.setText(tbl_Phong.getValueAt(i, 7).toString());
        cbo_LoaiPhong.setEnabled(false);
        txt_maPhong.setEnabled(false);
         txt_GiaPhong.setEnabled(false);
        txt_SoNguoiO.setEnabled(false);
         txt_MT.setEnabled(false);
        txt_Tang.setEnabled(false);
        txt_MaLoaiPhong.setEnabled(false);
    }
    private Model_TrangChu readForm_TC(){
        String maP = txt_maPhong.getText().trim();
        int tang = Integer.parseInt(txt_Tang.getText().trim().toString());
        String maLP = txt_MaLoaiPhong.getText().trim();
        String tinhTrang = cbo_TinhTrangPhong.getSelectedItem().toString();
        return new Model_TrangChu(maP, tang, maLP, tinhTrang);
    }
  
  
  
    

    
}
