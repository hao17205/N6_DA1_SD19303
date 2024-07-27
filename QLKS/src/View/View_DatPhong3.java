/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.util.ArrayList;
import Model.Model_DSPhong;
import javax.swing.table.DefaultTableModel;
import repositories.Repositories_TTPhong;
import Model.Model_DP3;
import java.util.Date;
import javax.swing.JOptionPane;
import repositories.Repositories_DP3;
import Model.Model_DSPhong;
import view.view_DichVu;
/**
 *
 * @author Chi Dat
 */
public class View_DatPhong3 extends javax.swing.JFrame {
    private Repositories_TTPhong rp_DSP = new Repositories_TTPhong();
    private DefaultTableModel mol = new DefaultTableModel();
    private Repositories_DP3 rp_DP3 = new Repositories_DP3();
    private Repositories_TTPhong rp_TTP = new Repositories_TTPhong();
    private int i =-1 ;

    /**
     * Creates new form View_DatPhong3
     */
    public View_DatPhong3() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.fillTable_DSPhong(rp_DSP.getAll_DSPhong());
        
    }
    // đẩy dữ liệu lên bảng thông tin phòng 
    private void fillTable_DSPhong(ArrayList<Model_DSPhong> list_DSP){
        mol = (DefaultTableModel) tbl_TTPhong.getModel();
        mol.setRowCount(0);
        for (Model_DSPhong dsp : list_DSP) {
            mol.addRow(dsp.toDaTa_DSPhong());
        }
    }
    private void fillTable_TTPhong(ArrayList<Model_DSPhong> list_TTP){
        mol = (DefaultTableModel) tbl_TTPhong.getModel();
        mol.setRowCount(0);
        for (Model_DSPhong tt : list_TTP) {
            mol.addRow(tt.toDaTa_DSPhong());
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_maHDCT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_maPhong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_GiaPhong1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdc_checkIn = new com.toedter.calendar.JDateChooser();
        jdc_checkOut = new com.toedter.calendar.JDateChooser();
        btn_CheckTTKH = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_LoaiPhong = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_soNguoiO = new javax.swing.JTextField();
        btn_TrangChu = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_TongTienPhong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_maHD = new javax.swing.JTextField();
        btn_TaoHDCho = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TTPhong = new javax.swing.JTable();
        btn_TimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Đặt Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("Mã HDCT:");

        jLabel4.setText("Mã Phòng:");

        jLabel5.setText("Giá Phòng:");

        jLabel8.setText("Check In:");

        jLabel9.setText("Check Out:");

        jdc_checkIn.setDateFormatString("yyyy-MM-dd");

        jdc_checkOut.setDateFormatString("yyyy-MM-dd");

        btn_CheckTTKH.setBackground(new java.awt.Color(204, 255, 255));
        btn_CheckTTKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_CheckTTKH.setText("Check Thông Tin Khách Hàng");
        btn_CheckTTKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckTTKHActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("Đặt DV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_Luu.setBackground(new java.awt.Color(204, 255, 255));
        btn_Luu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Luu.setText("Lưu");
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
            }
        });

        jLabel13.setText("Loại Phòng:");

        txt_LoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LoaiPhongActionPerformed(evt);
            }
        });

        jLabel12.setText("Số Người ở:");

        btn_TrangChu.setText("Back");
        btn_TrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TrangChuActionPerformed(evt);
            }
        });

        jLabel14.setText("Tổng Tiền Phòng:");

        jLabel2.setText("Mã HD:");

        btn_TaoHDCho.setBackground(new java.awt.Color(204, 255, 255));
        btn_TaoHDCho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_TaoHDCho.setText("Tạo Hóa Đơn mới");
        btn_TaoHDCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaoHDChoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_CheckTTKH))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_maHD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_maHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jdc_checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_TongTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdc_checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btn_Luu)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_TaoHDCho))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel13))
                                        .addComponent(jLabel12))
                                    .addGap(94, 94, 94)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_GiaPhong1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_soNguoiO, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_TrangChu)
                        .addGap(242, 242, 242)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_maHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_maPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_maHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jdc_checkIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_GiaPhong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jdc_checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_TongTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_soNguoiO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_TaoHDCho)
                                    .addComponent(btn_Luu)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel14)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_CheckTTKH)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TrangChu)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Phòng"));

        tbl_TTPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tầng", "Mã Phòng", "Tình Trạng", "Loại Phòng", "Giá ", "Số người ở", " Mô Tả"
            }
        ));
        tbl_TTPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TTPhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_TTPhong);

        btn_TimKiem.setBackground(new java.awt.Color(204, 255, 255));
        btn_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_TimKiem.setText("Tìm Kiếm ");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_TimKiem)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_TimKiem)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_TTPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TTPhongMouseClicked
        // TODO add your handling code here:
        i = tbl_TTPhong.getSelectedRow();
        this.showData_DSP(i);
        
    }//GEN-LAST:event_tbl_TTPhongMouseClicked

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn lưu thông tin không");
        if(chon == 0){
            Model_DP3 dp3 = this.readForm_DP3();
            if(dp3 != null){
                String maHDCT1 = txt_maHDCT.getText().trim();
                if(rp_DP3.checkTrung_DP3(maHDCT1)){
                    JOptionPane.showMessageDialog(this, "Mã HĐCT đã tồn tại");
                }else{
                    if(rp_DP3.them_DP3(dp3) > 0){
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        //this.fillTable_TTPhong(rp_DSP.getALL_TTSD());
                    }else{
                        JOptionPane.showMessageDialog(this, "thêm thất bại");
                    }
                }
        }else{
                JOptionPane.showMessageDialog(this, "thêm thất bại");
            }
            
       
        
        } 
    }//GEN-LAST:event_btn_LuuActionPerformed

    private void btn_CheckTTKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckTTKHActionPerformed
        // TODO add your handling code here:
        View_QLKH qlkh = new View_QLKH();
        qlkh.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_CheckTTKHActionPerformed

    private void txt_LoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LoaiPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LoaiPhongActionPerformed

    private void btn_TrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TrangChuActionPerformed
        // TODO add your handling code here:
        View_TrangChu tt = new View_TrangChu();
        tt.setVisible(true);
        
    }//GEN-LAST:event_btn_TrangChuActionPerformed

    private void btn_TaoHDChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaoHDChoActionPerformed
        // TODO add your handling code here:
        View_HD3 hd = new View_HD3();
        hd.setVisible(true);
    }//GEN-LAST:event_btn_TaoHDChoActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        // TODO add your handling code here:
        String maPhong = JOptionPane.showInputDialog(this,"Bạn muốn tìm kiếm thông tin");
         if (maPhong != null && !maPhong.trim().isEmpty()) {
        Repositories_TTPhong rp_DSP = new Repositories_TTPhong();
        ArrayList<Model_DSPhong> ketQua = rp_DSP.timKiem_TTPhong(maPhong.trim());

        if (ketQua.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin");
        } else {
            JOptionPane.showMessageDialog(this, "Đã tìm thấy thông tin");
            fillTable_DSPhong(ketQua); // Cập nhật bảng với kết quả tìm kiếm
        }
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm");
    }
        

    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        view.view_DichVu dv = new view_DichVu();
        dv.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(View_DatPhong3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_DatPhong3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_DatPhong3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_DatPhong3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_DatPhong3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CheckTTKH;
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_TaoHDCho;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_TrangChu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc_checkIn;
    private com.toedter.calendar.JDateChooser jdc_checkOut;
    private javax.swing.JTable tbl_TTPhong;
    private javax.swing.JTextField txt_GiaPhong1;
    private javax.swing.JTextField txt_LoaiPhong;
    private javax.swing.JTextField txt_TongTienPhong;
    private javax.swing.JTextField txt_maHD;
    private javax.swing.JTextField txt_maHDCT;
    private javax.swing.JTextField txt_maPhong;
    private javax.swing.JTextField txt_soNguoiO;
    // End of variables declaration//GEN-END:variables
    void showData_DSP(int i){
        txt_GiaPhong1.setText(tbl_TTPhong.getValueAt(i, 4).toString());
        txt_LoaiPhong.setText(tbl_TTPhong.getValueAt(i, 3).toString());
        txt_soNguoiO.setText(tbl_TTPhong.getValueAt(i, 5).toString());
        txt_maPhong.setText(tbl_TTPhong.getValueAt(i, 1).toString());
    }
    private Model_DP3 readForm_DP3(){
        String maHDCT;
        String maHD;
        String maPhong;
        Date checkIn;
        Date checkOut;
        double tongTienPhong;
        
        maHDCT = txt_maHDCT.getText().trim();
        if(maHDCT.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã HDCT");
            txt_maHDCT.requestFocus();
            return null;
        }
        
        maHD = txt_maHD.getText().trim();
        if(maHD.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã hóa đơn");
            txt_maHD.requestFocus();
            return null;
        }
        maPhong = txt_maPhong.getText().trim();
        if(maPhong.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã nhân viên");
            txt_maPhong.requestFocus();
            return null;
        }
      
        checkIn = jdc_checkIn.getDate();
        if(checkIn == null){
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày check In");
            jdc_checkIn.requestFocus();
            return null;
        }
        checkOut = jdc_checkOut.getDate();
        if(checkOut == null){
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày check Out");
            jdc_checkOut.requestFocus();
            return null;
        }
        
        try {
            tongTienPhong = Double.parseDouble(txt_TongTienPhong.getText().trim());
            if(tongTienPhong < 0){
                JOptionPane.showMessageDialog(this, "Tổng Tiền phòng ko hợp lệ");
                txt_TongTienPhong.requestFocus();
                return null;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Tổng tiền phòng phải là số" );
            txt_TongTienPhong.requestFocus();
            return null;
        }
        
        return new Model_DP3(maHDCT, maHD, maPhong, checkIn, checkOut, tongTienPhong);
    }
}