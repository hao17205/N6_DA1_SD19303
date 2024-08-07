/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package View;

import Model.Model_TK;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repositories.Repositories_TK;

/**
 *
 * @author rinbo
 */
public class View_ThongKe extends javax.swing.JFrame {
    private repositories.Repositories_TK rp = new Repositories_TK();
    private DefaultTableModel mol = new DefaultTableModel();
    
    /** Creates new form View_ThongKe */
    public View_ThongKe() {
        initComponents();
        this.setLocationRelativeTo(null);
        // tong hóa đơn trong ngày
        this.fillTable_THD1N(rp.getALl_THD1N());
        //tong hóa đơn trong tháng
        this.fillTable_THD1T(rp.getALl_THD1T());
        //tong hóa đơn trong nam
        this.fillTable_THDNam(rp.getALl_THDNam());
        // tong Doanh thu trong ngày
        this.fillTable_TDT1N(rp.getALl_TDT1N());
        // tổng doanh thu trong tháng
        this.fillTable_TDT1T(rp.getALl_TDT1T());
        // tổng doanh thu trong năm
        this.fillTable_TDTNam(rp.getALl_TDTNam());
        // thông tin các hóa đơn trong ngày
        this.fillTable_TTHD1N(rp.getAll_TTHD1N());
        // thông tin các hóa đơn trong tháng
        this.fillTable_TTHD1T(rp.getAll_TTHD1T());
        // thông tin các hóa đơn trong tháng
        this.fillTable_TTHDNam(rp.getAll_TTHDNam());
        // top DV trong ngày
        this.fillTable_TDV1N(rp.get_topDV1N());
        // top DV trong tháng
        this.fillTable_TDV1T(rp.get_topDV1T());
        // top dv nam
       this.fillTable_TDV1nam(rp.get_topDV1nam());
        
        cbo_thang.removeAllItems();
        for (int i = 1; i <= 12; i++) {
            cbo_thang.addItem(String.valueOf(i));
        }
    }
    //fill table tổng hóa đơn trong 1 ngày
    private void fillTable_THD1N(ArrayList<Model.Model_TK> list){
        mol = (DefaultTableModel) tbl_THD1N.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
            mol.addRow(x.toDaTaRow_THD());
        }
    }
    // Fill Table tổng hóa đơn trong tháng
    private void fillTable_THD1T(ArrayList<Model.Model_TK> list){
        mol = (DefaultTableModel) tbl_THD1T.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
            mol.addRow(x.toDaTaRow_THD());
        }
    }
    // Fill Table tổng hóa đơn trong năm
    private void fillTable_THDNam(ArrayList<Model.Model_TK> list){
        mol = (DefaultTableModel) tbl_THDNam.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
            mol.addRow(x.toDaTaRow_THD());
        }
    }
    
    // Fill Table tổng doanh thu 1 ngày
    private void fillTable_TDT1N(ArrayList<Model.Model_TK> list){
        mol = (DefaultTableModel) tbl_TDT1N.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
            mol.addRow(x.toDaTaRow_TDT());
        }
    }
    // Tổng doanh thu trong tháng
    private void fillTable_TDT1T(ArrayList<Model.Model_TK> list){
        mol = (DefaultTableModel) tbl_TDT1T.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
            mol.addRow(x.toDaTaRow_TDT());
        }
    }
    // Tổng doanh thu trong năm
    private void fillTable_TDTNam(ArrayList<Model.Model_TK> list){
        mol = (DefaultTableModel) tbl_TDTNam.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
            mol.addRow(x.toDaTaRow_TDT());
        }
    }
    
    // FillTable thông tin các hóa đơn trong ngày
    private void fillTable_TTHD1N(ArrayList<Model.Model_TK> list){
        mol = (DefaultTableModel) tbl_TTHD1N.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
            mol.addRow(x.toDaTaRow_ThongTin());
        }
    }
    // FillTable  thông tin các hóa đơn trong tháng
    private void fillTable_TTHD1T(ArrayList<Model.Model_TK> list){
        mol = (DefaultTableModel) tbl_TTHD1T.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
            mol.addRow(x.toDaTaRow_ThongTin());
        }
    }
    // FillTable  thông tin các hóa đơn trong Năm
    private void fillTable_TTHDNam(ArrayList<Model.Model_TK> list){
        mol = (DefaultTableModel) tbl_TTHDNam.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
            mol.addRow(x.toDaTaRow_ThongTin());
        }
    }
    // fillTable topDV 1N
    private void fillTable_TDV1N(ArrayList<Model_TK> list){
        mol = (DefaultTableModel) tbl_TopDVN1N.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
           mol.addRow(x.toDaTaRow_TDV());
        }
    }
    // fillTable topDV 1tháng
    private void fillTable_TDV1T(ArrayList<Model_TK> list){
        mol = (DefaultTableModel) tbl_TopDVN1T.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
           mol.addRow(x.toDaTaRow_TDV());
        }
    }
    // fillTable topDV 1 nam
    private void fillTable_TDV1nam(ArrayList<Model_TK> list){
        mol = (DefaultTableModel) tbl_TDVnam.getModel();
        mol.setRowCount(0);
        for (Model_TK x : list) {
           mol.addRow(x.toDaTaRow_TDV());
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TDT1N = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_THD1N = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_TTHD1N = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jdc_1NCD = new com.toedter.calendar.JDateChooser();
        tbl_1NCT = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_TopDVN1N = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_TTHD1T = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_TDT1T = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_THD1T = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jyc_nam = new com.toedter.calendar.JYearChooser();
        tbn_XNNam = new javax.swing.JButton();
        cbo_thang = new javax.swing.JComboBox<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbl_TopDVN1T = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_THDNam = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_TTHDNam = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_TDTNam = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jyc_Nam1 = new com.toedter.calendar.JYearChooser();
        tbn_XNY = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbl_TDVnam = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        tbl_TDT1N.setBackground(new java.awt.Color(255, 0, 0));
        tbl_TDT1N.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tbl_TDT1N.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Tổng Doanh Thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_TDT1N.setRowHeight(100);
        jScrollPane1.setViewportView(tbl_TDT1N);

        tbl_THD1N.setBackground(new java.awt.Color(51, 51, 255));
        tbl_THD1N.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tbl_THD1N.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Tổng Số Hóa Đơn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_THD1N.setRowHeight(100);
        jScrollPane2.setViewportView(tbl_THD1N);

        tbl_TTHD1N.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn ", "Mã Khách Hàng", "Mã Nhân Viên", "Trạng Thái", "Ngày Xuất Đơn", "Ngày Thanh Toán", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_TTHD1N);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống kê theo thời gian cố định"));

        jdc_1NCD.setDateFormatString("yyyy-MM-dd");

        tbl_1NCT.setText("Xác Nhận");
        tbl_1NCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_1NCTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jdc_1NCD, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbl_1NCT)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbl_1NCT, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdc_1NCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Trở lại Trang Chủ"));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbl_TopDVN1N.setBackground(new java.awt.Color(0, 204, 153));
        tbl_TopDVN1N.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tbl_TopDVN1N.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Dịch Vụ Được Dùng Nhiều Nhất"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_TopDVN1N.setRowHeight(100);
        jScrollPane10.setViewportView(tbl_TopDVN1N);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Thống kê trong ngày", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));

        tbl_TTHD1T.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Mã Nhân Viên", "Trạng Thái", "Ngày Xuất Đơn", "Ngày Thanh Toán", "Tổng Tền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbl_TTHD1T);

        tbl_TDT1T.setBackground(new java.awt.Color(255, 0, 0));
        tbl_TDT1T.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tbl_TDT1T.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Tổng Doanh Thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_TDT1T.setRowHeight(100);
        jScrollPane7.setViewportView(tbl_TDT1T);

        tbl_THD1T.setBackground(new java.awt.Color(51, 51, 255));
        tbl_THD1T.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tbl_THD1T.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Tổng số Hóa Đơn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_THD1T.setRowHeight(100);
        jScrollPane8.setViewportView(tbl_THD1T);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống kê theo thời gian cụ thể"));

        tbn_XNNam.setText("Xác Nhận");
        tbn_XNNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_XNNamActionPerformed(evt);
            }
        });

        cbo_thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_thang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_thangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jyc_nam, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(cbo_thang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(tbn_XNNam)
                .addGap(24, 24, 24))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(cbo_thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jyc_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbn_XNNam)
                .addContainerGap())
        );

        tbl_TopDVN1T.setBackground(new java.awt.Color(0, 204, 153));
        tbl_TopDVN1T.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tbl_TopDVN1T.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Dịch Vụ Được Dùng Nhiều Nhất"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_TopDVN1T.setRowHeight(100);
        jScrollPane11.setViewportView(tbl_TopDVN1T);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Thống kê trong tháng", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 51, 255));

        tbl_THDNam.setBackground(new java.awt.Color(51, 51, 255));
        tbl_THDNam.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tbl_THDNam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Tống Số Hóa Đơn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_THDNam.setRowHeight(100);
        jScrollPane5.setViewportView(tbl_THDNam);

        tbl_TTHDNam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Mã Nhân Viên", "Trạng Thái", "Ngày Xuất Đơn", "Ngày Thanh Toán", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tbl_TTHDNam);

        tbl_TDTNam.setBackground(new java.awt.Color(255, 0, 0));
        tbl_TDTNam.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tbl_TDTNam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Tổng Doanh Thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_TDTNam.setRowHeight(100);
        jScrollPane9.setViewportView(tbl_TDTNam);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống Kê Trong Năm"));

        tbn_XNY.setText("Xác Nhận");
        tbn_XNY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_XNYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jyc_Nam1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(tbn_XNY)
                .addGap(25, 25, 25))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jyc_Nam1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tbn_XNY)
        );

        tbl_TDVnam.setBackground(new java.awt.Color(0, 204, 153));
        tbl_TDVnam.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tbl_TDVnam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Dịch Vụ Được Dùng Nhiều Nhất"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_TDVnam.setRowHeight(100);
        jScrollPane12.setViewportView(tbl_TDVnam);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Thống kê theo năm", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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

    private void tbl_1NCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_1NCTActionPerformed
        // TODO add your handling code here:
       Date ngayThanhToan = jdc_1NCD.getDate();
        if (ngayThanhToan == null) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày muốn thống kê");
        } else {
            ArrayList<Model_TK> TDT1N = rp.TimKiem_TDT1N(ngayThanhToan);
            ArrayList<Model_TK> THD1N = rp.TimKiem_THD1N(ngayThanhToan);
            ArrayList<Model_TK> TTHD1N = rp.TimKiem_TTHD1N(ngayThanhToan);
            if (TDT1N == null || THD1N == null || TTHD1N == null) {
                JOptionPane.showMessageDialog(this, "Không Thu Được gì trong ngày này");
            } else {
                JOptionPane.showMessageDialog(this, "Đang Thống KÊ......");
                this.fillTable_THD1N(THD1N);
                this.fillTable_TDT1N(TDT1N);
                this.fillTable_TTHD1N(TTHD1N);
                this.fillTable_TDV1N(rp.timKiem_topDV1N(ngayThanhToan));
            }

        }
    }//GEN-LAST:event_tbl_1NCTActionPerformed

    private void tbn_XNNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_XNNamActionPerformed
        // TODO add your handling code here:
        int thang = Integer.parseInt(cbo_thang.getSelectedItem().toString());
        int nam = jyc_nam.getYear();
         String checKNam = String.valueOf(nam);
        if (checKNam.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn năm");
            jyc_nam.requestFocus();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Đang Thống Kê.....");
            this.fillTable_THD1T(rp.TimKiem_THD1T(nam, thang));
            this.fillTable_TDT1T(rp.TimKiem_TDT1T(nam, thang));
            this.fillTable_TTHD1T(rp.TimKiem_TTHD1T(nam, thang));
            this.fillTable_TDV1T(rp.timKiem_topDV1T(nam, thang));
        }
        
    }//GEN-LAST:event_tbn_XNNamActionPerformed

    private void cbo_thangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_thangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_thangActionPerformed

    private void tbn_XNYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_XNYActionPerformed
        // TODO add your handling code here:
        int nam = jyc_Nam1.getYear();
        JOptionPane.showMessageDialog(this, "Đang Thống KÊ......");
        this.fillTable_TDTNam(rp.TimKiem_TDT1Nam(nam));
        this.fillTable_THDNam(rp.TimKiem_THD1Nam(nam));
        this.fillTable_TTHDNam(rp.TimKiem_TTHD1Nam(nam));
        this.fillTable_TDV1nam(rp.timKiem_topDV1nam(nam));
    }//GEN-LAST:event_tbn_XNYActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        View_TrangChu tc = new View_TrangChu();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(View_ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_thang;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdc_1NCD;
    private com.toedter.calendar.JYearChooser jyc_Nam1;
    private com.toedter.calendar.JYearChooser jyc_nam;
    private javax.swing.JButton tbl_1NCT;
    private javax.swing.JTable tbl_TDT1N;
    private javax.swing.JTable tbl_TDT1T;
    private javax.swing.JTable tbl_TDTNam;
    private javax.swing.JTable tbl_TDVnam;
    private javax.swing.JTable tbl_THD1N;
    private javax.swing.JTable tbl_THD1T;
    private javax.swing.JTable tbl_THDNam;
    private javax.swing.JTable tbl_TTHD1N;
    private javax.swing.JTable tbl_TTHD1T;
    private javax.swing.JTable tbl_TTHDNam;
    private javax.swing.JTable tbl_TopDVN1N;
    private javax.swing.JTable tbl_TopDVN1T;
    private javax.swing.JButton tbn_XNNam;
    private javax.swing.JButton tbn_XNY;
    // End of variables declaration//GEN-END:variables

}
