/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import view.view_DichVu;
import Model.Model_TrangChu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repositories.Repositories_TrangChu;

public class View_TrangChu extends javax.swing.JFrame {

    private Repositories_TrangChu rp = new Repositories_TrangChu();
    private DefaultTableModel mol = new DefaultTableModel();
    private int i =-1;
    public View_TrangChu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    private void fillTable(ArrayList<Model_TrangChu>list){
        mol = (DefaultTableModel) tbl_bang.getModel();
        mol.setRowCount(0);
        for (Model_TrangChu x : list) {
            mol.addRow(x.toDataRow());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_home = new javax.swing.JLabel();
        lb_NhanVien = new javax.swing.JLabel();
        lb_KhachHang = new javax.swing.JLabel();
        lb_KhuyenMai = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lb_DichVu = new javax.swing.JLabel();
        lb_ThongKe = new javax.swing.JLabel();
        lb_ThanhToan = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_maPhong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bang = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txt_tang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_tinhTrangPhong = new javax.swing.JTextField();
        btn_xoa = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btn_datPhong = new javax.swing.JButton();
        txt_gia = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        txt_timKiem = new javax.swing.JTextField();
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

        lb_KhuyenMai.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lb_KhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sale.png"))); // NOI18N
        lb_KhuyenMai.setText("KHUYẾN MẠI");

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
        jLabel9.setText("THOÁT");
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
                    .addComponent(lb_KhuyenMai)
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
                .addGap(33, 33, 33)
                .addComponent(lb_KhuyenMai)
                .addGap(33, 33, 33)
                .addComponent(lb_ThanhToan)
                .addGap(18, 18, 18)
                .addComponent(lb_ThongKe)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã Phòng:");

        tbl_bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phòng", "Tình Trạng Phòng", "Tầng", "Giá", "null", "Title 6", "Title 7"
            }
        ));
        tbl_bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bang);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Tình trạng phòng:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Tầng:");

        btn_xoa.setBackground(new java.awt.Color(255, 51, 51));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_them.setBackground(new java.awt.Color(0, 255, 255));
        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_them.setForeground(new java.awt.Color(51, 51, 51));
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setBackground(new java.awt.Color(51, 255, 51));
        btn_sua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Giá:");

        btn_datPhong.setBackground(new java.awt.Color(255, 0, 255));
        btn_datPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_datPhong.setForeground(new java.awt.Color(242, 242, 242));
        btn_datPhong.setText("Đặt Phòng");
        btn_datPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datPhongActionPerformed(evt);
            }
        });

        txt_gia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_giaActionPerformed(evt);
            }
        });

        btn_timKiem.setBackground(new java.awt.Color(242, 242, 242));
        btn_timKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_timKiem.setText("Tìm Kiếm");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tinhTrangPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tang, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(420, 420, 420)
                                .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btn_them)
                            .addGap(18, 18, 18)
                            .addComponent(btn_sua)
                            .addGap(18, 18, 18)
                            .addComponent(btn_xoa)
                            .addGap(528, 528, 528)
                            .addComponent(btn_datPhong))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_timKiem)
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem)
                    .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_tinhTrangPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_tang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txt_gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoa)
                    .addComponent(btn_sua)
                    .addComponent(btn_them)
                    .addComponent(btn_datPhong))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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
                .addGap(336, 336, 336)
                .addComponent(jLabel15)
                .addContainerGap(680, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void lb_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_NhanVienMouseClicked
        // TODO add your handling code here:
        View_NhanVien nv = new View_NhanVien();
        nv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lb_NhanVienMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
      i = tbl_bang.getSelectedRow();
      
      if(i == -1){
          JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Dòng Để Xóa");
      }
      else{
          String maPhong = tbl_bang.getValueAt(i, 0).toString();
          if(rp.xoa_TC(maPhong)>0){
              JOptionPane.showMessageDialog(this, "Xóa Thành Công");
              this.fillTable(rp.getAll_TC());
          }
          else{
            JOptionPane.showMessageDialog(this, "Xóa Thất Bại");      
                  }
      }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_datPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datPhongActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btn_datPhongActionPerformed

    private void txt_giaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_giaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_giaActionPerformed

    private void tbl_bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bangMouseClicked
       i = tbl_bang.getSelectedRow();
       this.showData(i);
    }//GEN-LAST:event_tbl_bangMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
       if(this.readFrom() != null){
           if(rp.them_TC(this.readFrom())>0){
               JOptionPane.showMessageDialog(this, "Thêm Thành Công");
               this.fillTable(rp.getAll_TC());
           }
           else{
               JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
           }    
       }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        i = tbl_bang.getSelectedRow();
        if(i == -1){
          JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Dòng Để Sửa");
       }
        else{
            String maPhong = tbl_bang.getValueAt(i, 0).toString();
             if(rp.sua_TC(maPhong, this.readFrom())> 0){
                JOptionPane.showMessageDialog(this, "Sửa Thành Công");
                 this.fillTable(rp.getAll_TC());
             }
             else{
                JOptionPane.showMessageDialog(this, "Sửa Thất Bại");  
                     }
                }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
       String maPhong = txt_timKiem.getText().trim();
       if(maPhong.isEmpty()){
           JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Mã Phòng Để Tìm Kiếm");
       }
       else{
           ArrayList<Model_TrangChu> TrangChu = rp.timKiem(maPhong);
           if(TrangChu.isEmpty()){
               JOptionPane.showMessageDialog(this, "Không Có Dữ Lệu!");
           }
           else{
               JOptionPane.showMessageDialog(this, "Đã Tìm Thấy Dữ Liệu");
               this.fillTable(TrangChu);
           }
       }
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void lb_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_KhachHangMouseClicked
        // TODO add your handling code here:
        View_QLKH qlks = new View_QLKH();
        qlks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lb_KhachHangMouseClicked

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
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_DichVu;
    private javax.swing.JLabel lb_KhachHang;
    private javax.swing.JLabel lb_KhuyenMai;
    private javax.swing.JLabel lb_NhanVien;
    private javax.swing.JLabel lb_ThanhToan;
    private javax.swing.JLabel lb_ThongKe;
    private javax.swing.JLabel lb_home;
    private javax.swing.JTable tbl_bang;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_maPhong;
    private javax.swing.JTextField txt_tang;
    private javax.swing.JTextField txt_timKiem;
    private javax.swing.JTextField txt_tinhTrangPhong;
    // End of variables declaration//GEN-END:variables

    private void showData(int i){
        txt_maPhong.setText(tbl_bang.getValueAt(i, 0).toString());
        txt_tinhTrangPhong.setText(tbl_bang.getValueAt(i, 1).toString());
        txt_tang.setText(tbl_bang.getValueAt(i, 2).toString());
        txt_gia.setText(tbl_bang.getValueAt(i, 3).toString());
    }
    
    private Model_TrangChu readFrom(){
        String maPhong;
        String tinhTrang;
        int tang;
        float gia;
        
        maPhong = txt_maPhong.getText().trim();
        tinhTrang = txt_tinhTrangPhong.getText().trim();
        tang = Integer.parseInt(txt_tang.getText().trim().toString());
        gia = Float.parseFloat(txt_gia.getText().trim().toString());
        
        return new Model_TrangChu(maPhong, tinhTrang, tang, gia);
    }
    
    private void discope() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
