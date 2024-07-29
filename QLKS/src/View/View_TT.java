/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Model_TT;
import repositories.Repositories_HD;
import repositories.Repositories_HDCT;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repositories.Repositories_TT;

/**
 *
 * @author ADMIN
 */
public class View_TT extends javax.swing.JFrame {

    private repositories.Repositories_HD rp_HD = new Repositories_HD();
    private repositories.Repositories_HDCT rp_HDCT = new Repositories_HDCT();
    private repositories.Repositories_TT rp_TT = new Repositories_TT();

    private DefaultTableModel mol = new DefaultTableModel();
    private int i = -1;

    /**
     * Creates new form View_TT
     */
    public View_TT() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.fillTable_HD(rp_HD.getAll_HD());
        this.fillTable_HDCT(rp_HDCT.getAll_HDCT());
        // fillTable TTTT
        this.fillTable_TTTT(rp_TT.get_TTTT());
        // TT
//        this.fillTable_TT(rp_TT.getBasicInfo_HD());
        this.fillTable_TT_DV(rp_TT.getTongTienDV_HD());
        this.fillTable_TT_P(rp_TT.getTongTienPhong_HD());
        //
        cbo_KM.removeAllItems();
        for (int j = 0; j <= 100; j++) {
            cbo_KM.addItem(String.valueOf(j));
        }
        //add cbo
        cbo_KM1.removeAllItems();
        for (int j = 0; j <= 100; j++) {
            cbo_KM1.addItem(String.valueOf(j));
        }

    }

    void fillTable_HD(ArrayList<Model_TT> list_HD) {
        mol = (DefaultTableModel) tbl_HD.getModel();
        mol.setRowCount(0);
        for (Model_TT x : list_HD) {
            Object[] rowData = x.toDataRow_HD();
            for (int i = 0; i < rowData.length; i++) {
                if (rowData[i] == null) {
                    rowData[i] = "";
                }
            }
            mol.addRow(rowData);
        }
    }

    void fillTable_HDCT(ArrayList<Model_TT> list_HDCT) {
        mol = (DefaultTableModel) tbl_HDCT.getModel();
        mol.setRowCount(0);
        for (Model_TT x : list_HDCT) {
            Object[] rowData = x.toDataRow_HDCT();
            for (int i = 0; i < rowData.length; i++) {
                if (rowData[i] == null) {
                    rowData[i] = "";
                }
            }
            mol.addRow(rowData);
        }
    }

    void fillTable_HDCT1(ArrayList<Model_TT> list_HDCT) {
        DefaultTableModel model = (DefaultTableModel) tbl_HDCT1.getModel();
        model.setRowCount(0);
        for (Model_TT x : list_HDCT) {
            Object[] rowData = x.toDataRow_HDCT();
            for (int i = 0; i < rowData.length; i++) {
                if (rowData[i] == null) {
                    rowData[i] = "";
                }
            }
            model.addRow(rowData);
        }
    }

    void fillTable_HD1(ArrayList<Model_TT> listHD) {
        DefaultTableModel model = (DefaultTableModel) tbl_HD1.getModel();
        model.setRowCount(0);

        for (Model_TT tt : listHD) {
            model.addRow(new Object[]{
                tt.getMaHD(),
                tt.getTenNV(),
                tt.getTenKH(),
                tt.getSoDienThoai(),
                tt.getDiaChi(),
                tt.getSoPhongDat(),
                tt.getGiaBanDau(),
                tt.getKhuyenMai(),
                tt.getTongTienDichVu(),
                tt.getTongTienPhong(),
                tt.getTrangThai(),
                tt.getNgayXuatDon(),
                tt.getNgayThanhToan(),
                tt.getThue(),
                tt.getTienCoc(),
                tt.getTongTien(),
                tt.getSoTienCanThanhToan()
            });
        }
    }

    // FillTable bảng thông tin thanh toán
    private void fillTable_TTTT(ArrayList<Model_TT> list) {
        mol = (DefaultTableModel) tbl_ThanhToan.getModel();
        mol.setRowCount(0);
        for (Model_TT x : list) {
            mol.addRow(x.toDaTaRow_TTTT());
        }
    }

    // Fill bảng tổng tiền phòng và số lượng phòng
    private void fillTable_P(ArrayList<Model_TT> list) {
        mol = (DefaultTableModel) tbl_P.getModel();
        mol.setRowCount(0);
        for (Model_TT x : list) {
            mol.addRow(x.toDaTaRow_TTP());
        }
    }

    // Fill bảng tổng tiền các dịch vụ
    private void fillTable_TTDV(ArrayList<Model_TT> list) {
        mol = (DefaultTableModel) tbl_DV.getModel();
        mol.setRowCount(0);
        for (Model_TT x : list) {
            mol.addRow(x.toDaTaRow_TTDV());
        }
    }

    //TT
//    void fillTable_TT(ArrayList<Model_TT> list_TT) {
//        mol = (DefaultTableModel) tbl_ThanhToan.getModel();
//        mol.setRowCount(0);
//        for (Model_TT x : list_TT) {
//            Object[] rowData = x.toDataRow_TT();
//            for (int i = 0; i < rowData.length; i++) {
//                if (rowData[i] == null) {
//                    rowData[i] = "";
//                }
//            }
//            mol.addRow(rowData);
//        }
//    }
//
    void fillTable_TT_DV(ArrayList<Model_TT> list_TT) {
        mol = (DefaultTableModel) tbl_DV.getModel();
        mol.setRowCount(0);
        for (Model_TT x : list_TT) {
            Object[] rowData = x.toDaTaRow_TTDV();
            for (int i = 0; i < rowData.length; i++) {
                if (rowData[i] == null) {
                    rowData[i] = "";
                }
            }
            mol.addRow(rowData);
        }
    }

    void fillTable_TT_P(ArrayList<Model_TT> list_TT) {
        mol = (DefaultTableModel) tbl_P.getModel();
        mol.setRowCount(0);
        for (Model_TT x : list_TT) {
            Object[] rowData = x.toDaTaRow_TTP();
            for (int i = 0; i < rowData.length; i++) {
                if (rowData[i] == null) {
                    rowData[i] = "";
                }
            }
            mol.addRow(rowData);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_MaHD2 = new javax.swing.JTextField();
        txt_MaNV = new javax.swing.JTextField();
        txt_MaKH = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_SDT2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_DC = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jdc_NXD1 = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        jdc_NTT1 = new com.toedter.calendar.JDateChooser();
        jLabel36 = new javax.swing.JLabel();
        txt_SPD = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        rdo_CTT1 = new javax.swing.JRadioButton();
        rdo_DTT1 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        txt_TTP1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_TTDV1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_GBD1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_TTHD = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_KM_T = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_STCTT1 = new javax.swing.JTextField();
        cbo_KM1 = new javax.swing.JComboBox<>();
        btn_TT1 = new javax.swing.JButton();
        txt_TC2 = new javax.swing.JTextField();
        btn_TT = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        txt_TK3 = new javax.swing.JTextField();
        btn_Tk3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ThanhToan = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_DV = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_P = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        btn_C = new javax.swing.JButton();
        btn_HD = new javax.swing.JButton();
        btn_RS3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_MaHD = new javax.swing.JTextField();
        txt_TenNV = new javax.swing.JTextField();
        txt_TenKH = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        txt_SoPD = new javax.swing.JTextField();
        txt_SDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rdo_CTT = new javax.swing.JRadioButton();
        rdo_DTT = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jdc_NXD = new com.toedter.calendar.JDateChooser();
        jdc_NTT = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_GBD = new javax.swing.JTextField();
        txt_TTDV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_TTP = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_T = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_TC = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_TT = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        txt_STCTT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbo_KM = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btn_TK = new javax.swing.JButton();
        txt_TK = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_HD = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_HDCT1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_MaHD1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_MaP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_MaHDCT = new javax.swing.JTextField();
        jdc_CI = new com.toedter.calendar.JDateChooser();
        jdc_CO = new com.toedter.calendar.JDateChooser();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txt_TP = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        txt_TK1 = new javax.swing.JTextField();
        btn_TK1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_HDCT = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_HD1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông Tin Đặt Phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Mã Hóa Đơn:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Mã Khách Hàng:");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText("Mã Nhân Viên:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("Địa Chỉ:");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel32.setText("Số Điện Thoại:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setText("Ngày Xuất Đơn:");

        jdc_NXD1.setDateFormatString("yyyy-MM-dd\n");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setText("Ngày Thanh Toán:");

        jdc_NTT1.setDateFormatString("yyyy-MM-dd");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel36.setText("Số Phòng Đặt:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(txt_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_MaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(txt_MaHD2))))
                .addGap(74, 74, 74)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel36))
                .addGap(25, 25, 25)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_DC, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(txt_SDT2)
                    .addComponent(txt_SPD))
                .addGap(18, 69, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdc_NXD1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jdc_NTT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_MaHD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(txt_DC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(txt_SDT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txt_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdc_NXD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdc_NTT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txt_SPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Trạng Thái Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        buttonGroup2.add(rdo_CTT1);
        rdo_CTT1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdo_CTT1.setSelected(true);
        rdo_CTT1.setText("Chưa Thanh Toán");

        rdo_DTT1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdo_DTT1);
        rdo_DTT1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdo_DTT1.setText("Đã Thanh Toán");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(rdo_DTT1)
                .addGap(327, 327, 327)
                .addComponent(rdo_CTT1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo_DTT1)
                    .addComponent(rdo_CTT1))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thanh Toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setText("Tổng Tiền Phòng:");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("Tổng Tiền Dịch Vụ:");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Giá Ban Đầu:");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Tổng Tiền Hóa Đơn:");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setText("Khuyến Mãi:");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Tiền Cọc:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("Số Tiền Cần Thanh Toán:");

        cbo_KM1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_TT1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_TT1.setForeground(new java.awt.Color(255, 0, 0));
        btn_TT1.setText("Tính Toán");
        btn_TT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TT1ActionPerformed(evt);
            }
        });

        btn_TT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_TT.setForeground(new java.awt.Color(255, 0, 0));
        btn_TT.setText("Thanh Toán");
        btn_TT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_GBD1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(txt_TTP1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_TTDV1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_KM1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TC2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_TT1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_KM_T, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(txt_STCTT1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_TT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txt_TTP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(txt_TTDV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)
                        .addComponent(cbo_KM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_KM_T))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txt_GBD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(txt_TTHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(txt_TC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txt_STCTT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(btn_TT1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_TT)))
                .addGap(10, 10, 10))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Hóa Đơn Chưa Thanh Toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        btn_Tk3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Tk3.setForeground(new java.awt.Color(255, 0, 0));
        btn_Tk3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btn_Tk3.setText(" Tìm Kiếm");
        btn_Tk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Tk3ActionPerformed(evt);
            }
        });

        tbl_ThanhToan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbl_ThanhToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Mã Nhân Viên", "SĐT", "Địa Chỉ", "Ngày Xuất Đơn", "Tiền Cọc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_ThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ThanhToanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_ThanhToanMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_ThanhToan);

        tbl_DV.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbl_DV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Tổng Tiền Dịch Vụ"
            }
        ));
        tbl_DV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DVMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_DV);

        tbl_P.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbl_P.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Số Lượng Phòng", "Tổng Tiền Phòng"
            }
        ));
        tbl_P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbl_P);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(txt_TK3, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btn_Tk3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_TK3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Tk3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        btn_C.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_C.setForeground(new java.awt.Color(255, 0, 0));
        btn_C.setText("Cancel");
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });

        btn_HD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_HD.setForeground(new java.awt.Color(255, 0, 0));
        btn_HD.setText("Hủy Đơn ");
        btn_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HDActionPerformed(evt);
            }
        });

        btn_RS3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_RS3.setForeground(new java.awt.Color(255, 0, 0));
        btn_RS3.setText("Reset");
        btn_RS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RS3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_RS3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_C, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_HD)
                    .addComponent(btn_C)
                    .addComponent(btn_RS3))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thanh Toán", jPanel15);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Mã Hóa Đơn:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Tên Nhân Viên:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Số Điện Thoại:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Địa Chỉ:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Số Phòng Đặt:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Tên Khách Hàng:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_MaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)
                                    .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(287, 287, 287))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(627, 627, 627)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 106, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_SoPD, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txt_SDT)
                    .addComponent(txt_MaHD))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Trạng Thái", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        buttonGroup1.add(rdo_CTT);
        rdo_CTT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdo_CTT.setText("Chưa Thanh Toán");

        buttonGroup1.add(rdo_DTT);
        rdo_DTT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rdo_DTT.setText("Đã Thanh Toán");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(rdo_DTT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdo_CTT)
                .addGap(169, 169, 169))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdo_CTT)
                .addComponent(rdo_DTT))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Ngày Xuất Đơn:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Ngày Thanh Toán:");

        jdc_NXD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jdc_NXD.setDateFormatString("yyyy-MM-dd");
        jdc_NXD.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jdc_NTT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jdc_NTT.setDateFormatString("yyyy-MM-dd");
        jdc_NTT.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jdc_NXD, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jdc_NTT, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdc_NTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdc_NXD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Giá", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Giá Ban Đầu:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Tổng Tiền Dịch Vụ:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Tổng Tiền Phòng:");

        txt_TTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TTPActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Khuyến Mại Tiền:");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Tiền Cọc:");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Tổng Tiền:");

        txt_TT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TTActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(255, 255, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Số Tiền Cần Thanh Toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        txt_STCTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_STCTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_STCTT)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(txt_STCTT, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Khuyến Mại %:");

        cbo_KM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cbo_KM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txt_T, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txt_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(txt_TT, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_GBD, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_TTDV, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txt_TTP, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(txt_TTP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TTDV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_GBD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_TT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_T)
                                .addComponent(jLabel20))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(cbo_KM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Tìm Kiếm Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        btn_TK.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_TK.setForeground(new java.awt.Color(255, 51, 51));
        btn_TK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btn_TK.setText("Tìm Kiếm");
        btn_TK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_TK)
                .addGap(18, 18, 18)
                .addComponent(btn_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_TK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_TK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        tbl_HD.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_HD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Tên NV", "Tên KH", "SDT", "Địa Chỉ", "Số PD", "Giá BD", "Khuyến Mại %", "Tổng TDV", "Tổng TP", "Trạng Thái", "Ngày XD", "Ngày TT", "Khuyến Mại Tiền", "Tiền Cọc", "Tổng Tiền", "Số Tiền Cần TT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_HD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_HDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_HD);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Hóa Đơn Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        tbl_HDCT1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_HDCT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã HDCT", "Mã HD", "Mã P", "Check In", "Check Out", "Tiền Phòng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_HDCT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_HDCT1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_HDCT1);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hóa Đơn", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(153, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Hóa Đơn Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Mã Hóa Dơn Chi Tiết:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Mã Hóa Đơn:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Mã Phòng:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Check In:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Check Out:");

        jdc_CI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jdc_CI.setDateFormatString("yyyy-MM-dd");

        jdc_CO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jdc_CO.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_MaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MaHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_MaP)
                    .addComponent(jdc_CI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdc_CO, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_MaHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_MaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_MaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jdc_CI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdc_CO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(153, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Giá", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("Tiền Phòng:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel23)
                .addGap(84, 84, 84)
                .addComponent(txt_TP, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txt_TP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(153, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Tìm Kiếm Hóa Đơn Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        btn_TK1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_TK1.setForeground(new java.awt.Color(0, 0, 255));
        btn_TK1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btn_TK1.setText("Tìm Kiếm");
        btn_TK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TK1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_TK1, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_TK1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_TK1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_TK1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(153, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Hóa Đơn Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        tbl_HDCT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_HDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã HDCT", "Mã HD", "Mã P", "Check In", "Check Out", "Tiền Phòng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_HDCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_HDCTMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_HDCT);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1461, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(153, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N

        tbl_HD1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_HD1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Tên NV", "Tên KH", "SDT", "Địa Chỉ", "Số PD", "Giá BD", "Khuyến Mại", "Tổng TDV", "Tổng TP", "Trạng Thái", "Ngày XD", "Ngày TT", "Thuế", "Tiền Cọc", "Tổng Tiền", "Số Tiền Cần TT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_HD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_HD1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_HD1);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hóa Đơn Chi Tiết", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TTPActionPerformed

    private void tbl_HDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HDMouseClicked
        // TODO add your handling code here:
        i = tbl_HD.getSelectedRow();
        this.showData_HD(i);
        String maHD = tbl_HD.getValueAt(i, 0).toString();

        fillTable_HDCT1(rp_HDCT.getHDCTByMaHD(maHD));
    }//GEN-LAST:event_tbl_HDMouseClicked

    private void btn_TKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TKActionPerformed
        // TODO add your handling code here:
        String searchTerm = txt_TK.getText().trim();

        if (searchTerm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin để tìm kiếm.");
            return;
        }

        ArrayList<Model_TT> results = rp_HD.timkiem_MHD(searchTerm);

        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả.");
        } else {
            JOptionPane.showMessageDialog(this, "Tìm thấy kết quả - KQ in trên bảng");
            fillTable_HD(results);
        }

    }//GEN-LAST:event_btn_TKActionPerformed

    private void btn_TK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TK1ActionPerformed
        // TODO add your handling code here:
        String searchTerm = txt_TK1.getText().trim();

        if (searchTerm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin để tìm kiếm.");
            return;
        }

        ArrayList<Model_TT> results = rp_HDCT.timkiem_MHDCT(searchTerm);

        if (results.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả.");
        } else {
            JOptionPane.showMessageDialog(this, "Tìm thấy kết quả - KQ in trên bảng");
            this.fillTable_HDCT(results);
        }

    }//GEN-LAST:event_btn_TK1ActionPerformed

    private void tbl_HDCT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HDCT1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_HDCT1MouseClicked

    private void txt_TTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TTActionPerformed

    private void txt_STCTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_STCTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_STCTTActionPerformed

    private void tbl_HDCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HDCTMouseClicked
        // TODO add your handling code here:
        int i = tbl_HDCT.getSelectedRow();

        if (i >= 0) {
            String maHDCT = tbl_HDCT.getValueAt(i, 0).toString();

            ArrayList<Model_TT> list_HD = rp_HD.getHDByMaHDCT(maHDCT);

            this.fillTable_HD1(list_HD);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng hợp lệ.");
        }

    }//GEN-LAST:event_tbl_HDCTMouseClicked

    private void tbl_HD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HD1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_HD1MouseClicked

    private void tbl_DVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DVMouseClicked
        // TODO add your handling code here:
        int i = tbl_DV.getSelectedRow();
        this.showData_TT_DV(i);
        txt_TTDV1.disable();
        txt_KM_T.setText("0");
    }//GEN-LAST:event_tbl_DVMouseClicked

    private void tbl_PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PMouseClicked
        // TODO add your handling code here:
        int i = tbl_P.getSelectedRow();
        this.showData_TT_P(i);
        txt_SPD.disable();
        txt_TTP1.disable();
        txt_KM_T.setText("0");
    }//GEN-LAST:event_tbl_PMouseClicked

    private void tbl_ThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ThanhToanMouseClicked
        // TODO add your handling code here:
        int i = tbl_ThanhToan.getSelectedRow();
        this.showData_TT(i);
        txt_MaHD2.disable();
        txt_MaKH.disable();
        txt_MaNV.disable();
        txt_SDT2.disable();
        txt_DC.disable();
        jdc_NXD1.setEnabled(false);
        txt_TC2.disable();
        txt_GBD1.disable();
        txt_TTHD.disable();
        txt_STCTT1.disable();
        txt_KM_T.setText("0");
    }//GEN-LAST:event_tbl_ThanhToanMouseClicked

    private void tbl_ThanhToanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ThanhToanMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_ThanhToanMouseEntered

    private void btn_Tk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Tk3ActionPerformed
        // TODO add your handling code here:
        String maTK = txt_TK3.getText().trim();
        if (maTK.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập thông tin vào ô tìm kiếm");
        } else {

            ArrayList<Model_TT> KQTK_TTTT = rp_TT.timKiem_TTTT(maTK);
            if (KQTK_TTTT.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có thông tin muốn tìm");
            } else {
                JOptionPane.showMessageDialog(this, "Đã tìm thấy dữ liệu");
                this.fillTable_TTTT(rp_TT.timKiem_TTTT(maTK));
                this.fillTable_P(rp_TT.getAll_TTP(maTK));
                this.fillTable_TTDV(rp_TT.getAll_TTDV(maTK));
            }
        }
    }//GEN-LAST:event_btn_Tk3ActionPerformed

    private void btn_TTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TTActionPerformed
        // TODO add your handling code here:
        int i = tbl_ThanhToan.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn thanh toán không?");
        if (chon == 0) {
            if (i == -1) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng để thanh toán");
            } else {
                if (this.readForm() != null) {
                    String maHD = tbl_ThanhToan.getValueAt(i, 0).toString();
                    if (rp_TT.TT_HD(maHD, this.readForm()) > 0) {
                        JOptionPane.showMessageDialog(this, "Thanh toán thành công");
                        this.fillTable_TTTT(rp_TT.get_TTTT());
                        resetFormAndTable_HD();
                        resetFormAndTable_HDCT();
                    } else {
                        JOptionPane.showMessageDialog(this, "Thanh toán thất bại");
                    }
                }

            }
        }
    }//GEN-LAST:event_btn_TTActionPerformed

    private void btn_HDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HDActionPerformed
        // TODO add your handling code here:
        int i = tbl_ThanhToan.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn hủy đơn này không?");
        if (chon == 0) {
            if (i == -1) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng để hủy đơn");
            } else {
                String maHD = tbl_ThanhToan.getValueAt(i, 0).toString();
                if (rp_TT.HD_TT(maHD) > 0) {
                    JOptionPane.showMessageDialog(this, "Hủy hóa đơn thành công");
                    this.fillTable_TTTT(rp_TT.get_TTTT());
                    resetFormAndTable_HD();
                    resetFormAndTable_HDCT();
                } else {
                    JOptionPane.showMessageDialog(this, "Hủy hóa đơn thất bại");
                }
            }
        }

    }//GEN-LAST:event_btn_HDActionPerformed

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        // TODO add your handling code here:
        View_TrangChu tt5 = new View_TrangChu();
        tt5.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_CActionPerformed

    private void btn_RS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RS3ActionPerformed
        // TODO add your handling code here:
        txt_MaHD2.setText("");
        txt_MaNV.setText("");
        txt_MaKH.setText("");
        txt_SDT2.setText("");
        txt_DC.setText("");
        txt_SPD.setText("");
        jdc_NXD1.setDate(null);
        jdc_NTT1.setDate(null);
        rdo_DTT.setSelected(false);
        rdo_CTT.setSelected(false);
        txt_TTP1.setText("");
        txt_GBD1.setText("");
        txt_TTDV1.setText("");
        txt_TTHD.setText("");
        txt_TC2.setText("");
        txt_STCTT1.setText("");
        cbo_KM.setSelectedIndex(-1);
        this.fillTable_TTTT(rp_TT.get_TTTT());
        this.fillTable_TT_DV(rp_TT.getTongTienDV_HD());
        this.fillTable_TT_P(rp_TT.getTongTienPhong_HD());
    }//GEN-LAST:event_btn_RS3ActionPerformed

    private void btn_TT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TT1ActionPerformed
        // TODO add your handling code here:
        String strTTP = txt_TTP1.getText();
        String strTTDV = txt_TTDV1.getText();
        String strPhanTramKM = cbo_KM1.getSelectedItem() != null ? cbo_KM1.getSelectedItem().toString() : "";
        String strTienKM = txt_KM_T.getText();
        String strTienCoc = txt_TC2.getText();

        double TTP = strTTP.isEmpty() ? 0 : Double.parseDouble(strTTP);
        double TTDV = strTTDV.isEmpty() ? 0 : Double.parseDouble(strTTDV);
        int phanTramKM = strPhanTramKM.isEmpty() ? 0 : Integer.parseInt(strPhanTramKM);
        double tienKM = strTienKM.isEmpty() ? 0 : Double.parseDouble(strTienKM);
        double tienCoc = strTienCoc.isEmpty() ? 0 : Double.parseDouble(strTienCoc);

        double giaBD = TTP + TTDV;
        txt_GBD1.setText(String.valueOf(giaBD));

        double tongTHD = (TTP + TTDV) - (((TTP + TTDV) * phanTramKM) / 100) - tienKM;
        txt_TTHD.setText(String.valueOf(tongTHD));

        double soTPT = ((TTP + TTDV) - (((TTP + TTDV) * phanTramKM) / 100) - tienKM) - tienCoc;
        txt_STCTT1.setText(String.valueOf(soTPT));

    }//GEN-LAST:event_btn_TT1ActionPerformed

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
            java.util.logging.Logger.getLogger(View_TT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_TT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_TT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_TT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_TT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_HD;
    private javax.swing.JButton btn_RS3;
    private javax.swing.JButton btn_TK;
    private javax.swing.JButton btn_TK1;
    private javax.swing.JButton btn_TT;
    private javax.swing.JButton btn_TT1;
    private javax.swing.JButton btn_Tk3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbo_KM;
    private javax.swing.JComboBox<String> cbo_KM1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdc_CI;
    private com.toedter.calendar.JDateChooser jdc_CO;
    private com.toedter.calendar.JDateChooser jdc_NTT;
    private com.toedter.calendar.JDateChooser jdc_NTT1;
    private com.toedter.calendar.JDateChooser jdc_NXD;
    private com.toedter.calendar.JDateChooser jdc_NXD1;
    private javax.swing.JRadioButton rdo_CTT;
    private javax.swing.JRadioButton rdo_CTT1;
    private javax.swing.JRadioButton rdo_DTT;
    private javax.swing.JRadioButton rdo_DTT1;
    private javax.swing.JTable tbl_DV;
    private javax.swing.JTable tbl_HD;
    private javax.swing.JTable tbl_HD1;
    private javax.swing.JTable tbl_HDCT;
    private javax.swing.JTable tbl_HDCT1;
    private javax.swing.JTable tbl_P;
    private javax.swing.JTable tbl_ThanhToan;
    private javax.swing.JTextField txt_DC;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_GBD;
    private javax.swing.JTextField txt_GBD1;
    private javax.swing.JTextField txt_KM_T;
    private javax.swing.JTextField txt_MaHD;
    private javax.swing.JTextField txt_MaHD1;
    private javax.swing.JTextField txt_MaHD2;
    private javax.swing.JTextField txt_MaHDCT;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_MaNV;
    private javax.swing.JTextField txt_MaP;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_SDT2;
    private javax.swing.JTextField txt_SPD;
    private javax.swing.JTextField txt_STCTT;
    private javax.swing.JTextField txt_STCTT1;
    private javax.swing.JTextField txt_SoPD;
    private javax.swing.JTextField txt_T;
    private javax.swing.JTextField txt_TC;
    private javax.swing.JTextField txt_TC2;
    private javax.swing.JTextField txt_TK;
    private javax.swing.JTextField txt_TK1;
    private javax.swing.JTextField txt_TK3;
    private javax.swing.JTextField txt_TP;
    private javax.swing.JTextField txt_TT;
    private javax.swing.JTextField txt_TTDV;
    private javax.swing.JTextField txt_TTDV1;
    private javax.swing.JTextField txt_TTHD;
    private javax.swing.JTextField txt_TTP;
    private javax.swing.JTextField txt_TTP1;
    private javax.swing.JTextField txt_TenKH;
    private javax.swing.JTextField txt_TenNV;
    // End of variables declaration//GEN-END:variables
    void showData_HD(int i) {
        txt_MaHD.setText(tbl_HD.getValueAt(i, 0).toString());
        txt_TenNV.setText(tbl_HD.getValueAt(i, 1).toString());
        txt_TenKH.setText(tbl_HD.getValueAt(i, 2).toString());
        txt_SDT.setText(tbl_HD.getValueAt(i, 3).toString());
        txt_DiaChi.setText(tbl_HD.getValueAt(i, 4).toString());
        txt_SoPD.setText(tbl_HD.getValueAt(i, 5).toString());
        txt_GBD.setText(tbl_HD.getValueAt(i, 6).toString());
        cbo_KM.setSelectedItem(tbl_HD.getValueAt(i, 7).toString());
        txt_TTDV.setText(tbl_HD.getValueAt(i, 8).toString());
        txt_TTP.setText(tbl_HD.getValueAt(i, 9).toString());

        String trangThai = tbl_HD.getValueAt(i, 10) != null ? tbl_HD.getValueAt(i, 10).toString().trim() : "";

        if (trangThai.equalsIgnoreCase("Chưa Thanh Toán") || trangThai.isEmpty()) {
            rdo_CTT.setSelected(true);
        } else {
            rdo_DTT.setSelected(true);
        }

        String ngayXuatDonStr = tbl_HD.getValueAt(i, 11).toString();
        if (!ngayXuatDonStr.isEmpty()) {
            try {
                Date ngayXuatDon = new SimpleDateFormat("yyyy-MM-dd").parse(ngayXuatDonStr);
                jdc_NXD.setDate(ngayXuatDon);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Lỗi định dạng ngày xuất đơn: " + e.getMessage());
                e.printStackTrace();
            }
        }

        String ngayThanhToanStr = tbl_HD.getValueAt(i, 12).toString();
        if (!ngayThanhToanStr.isEmpty()) {
            try {
                Date ngayThanhToan = new SimpleDateFormat("yyyy-MM-dd").parse(ngayThanhToanStr);
                jdc_NTT.setDate(ngayThanhToan);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Lỗi định dạng ngày thanh toán: " + e.getMessage());
                e.printStackTrace();
            }
        }

        txt_T.setText(tbl_HD.getValueAt(i, 13).toString());
        txt_TC.setText(tbl_HD.getValueAt(i, 14).toString());
        txt_TT.setText(tbl_HD.getValueAt(i, 15).toString());
        txt_STCTT.setText(tbl_HD.getValueAt(i, 16).toString());
    }

    void showData_HDCT(int i) {
        txt_MaHDCT.setText(tbl_HDCT.getValueAt(i, 0).toString());
        txt_MaHD1.setText(tbl_HDCT.getValueAt(i, 1).toString());
        txt_MaP.setText(tbl_HDCT.getValueAt(i, 2).toString());

        String checkInStr = tbl_HDCT.getValueAt(i, 3).toString();
        if (!checkInStr.isEmpty()) {
            try {
                Date checkIn = new SimpleDateFormat("yyyy-MM-dd").parse(checkInStr);
                jdc_CI.setDate(checkIn);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Lỗi định dạng ngày check-in: " + e.getMessage());
                e.printStackTrace();
            }
        }

        String checkOutStr = tbl_HDCT.getValueAt(i, 4).toString();
        if (!checkOutStr.isEmpty()) {
            try {
                Date checkOut = new SimpleDateFormat("yyyy-MM-dd").parse(checkOutStr);
                jdc_CO.setDate(checkOut);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Lỗi định dạng ngày check-out: " + e.getMessage());
                e.printStackTrace();
            }
        }

        txt_TP.setText(tbl_HDCT.getValueAt(i, 5).toString());
    }

    //TT
    void showData_TT(int i) {
        txt_MaHD2.setText(tbl_ThanhToan.getValueAt(i, 0).toString());
        txt_MaNV.setText(tbl_ThanhToan.getValueAt(i, 1).toString());
        txt_MaKH.setText(tbl_ThanhToan.getValueAt(i, 2).toString());
        txt_SDT2.setText(tbl_ThanhToan.getValueAt(i, 3).toString());
        txt_DC.setText(tbl_ThanhToan.getValueAt(i, 4).toString());

        String ngayXuatDonStr = tbl_ThanhToan.getValueAt(i, 5).toString();
        if (!ngayXuatDonStr.isEmpty()) {
            try {
                Date ngayXuatDon = new SimpleDateFormat("yyyy-MM-dd").parse(ngayXuatDonStr);
                jdc_NXD1.setDate(ngayXuatDon);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Lỗi định dạng ngày xuất đơn: " + e.getMessage());
                e.printStackTrace();
            }
        }

        txt_TC2.setText(tbl_ThanhToan.getValueAt(i, 6).toString());
    }

    void showData_TT_DV(int i) {
        txt_TTDV1.setText(tbl_DV.getValueAt(i, 0).toString());

    }

    void showData_TT_P(int i) {
        txt_SPD.setText(tbl_P.getValueAt(i, 0).toString());
        txt_TTP1.setText(tbl_P.getValueAt(i, 1).toString());
    }

    Model_TT readForm() {
        int soPhongDat;
        double giaBanDau;
        int khuyenMai;
        String trangThai;
        Date ngayThanhToan = null;
        double tongTien;
        double soTienCanThanhToan;
        double tongTienDV;
        double tongTienPhong;
        double ggT;

        // Kiểm tra và đọc giá trị của SoPhongDat
        String soPhongDatStr = txt_SPD.getText().trim();
        if (soPhongDatStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Số Phòng Đặt");
            return null;
        }
        try {
            soPhongDat = Integer.parseInt(soPhongDatStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số Phòng Đặt phải là một số nguyên.");
            return null;
        }

        // Kiểm tra và đọc giá trị của GiaBanDau
        String giaBanDauStr = txt_GBD1.getText().trim();
        if (giaBanDauStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Giá Bán Đầu");
            return null;
        }
        try {
            giaBanDau = Double.parseDouble(giaBanDauStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá Bán Đầu phải là một số thực.");
            return null;
        }

        // Kiểm tra và đọc giá trị của KhuyenMai
        try {
            khuyenMai = Integer.parseInt(cbo_KM1.getSelectedItem().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Khuyến mãi phải là một số.");
            return null;
        }

        // Kiểm tra và đọc giá trị của TrangThai
        if (rdo_DTT1.isSelected()) {
            trangThai = "Đã Thanh Toán"; // Đã Thanh Toán
        } else if (rdo_CTT1.isSelected()) {
            trangThai = null; // Chưa Thanh Toán
        } else {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Trạng Thái");
            return null;
        }

        // Kiểm tra và đọc giá trị của NgayThanhToan
        ngayThanhToan = jdc_NTT1.getDate();
        if (ngayThanhToan == null) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Ngày Thanh Toán");
            return null;
        }

        // Kiểm tra và đọc giá trị của TongTienPhong
        String tongTienPhongStr = txt_TTP1.getText().trim();
        if (tongTienPhongStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Tổng Tiền Phòng");
            return null;
        }
        try {
            tongTienPhong = Double.parseDouble(tongTienPhongStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tổng Tiền Phòng phải là một số thực.");
            return null;
        }

        // Kiểm tra và đọc giá trị của TongTienDV
        String tongTienDVStr = txt_TTDV1.getText().trim();
        if (tongTienDVStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Tổng Tiền Dịch Vụ");
            return null;
        }
        try {
            tongTienDV = Double.parseDouble(tongTienDVStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tổng Tiền Dịch Vụ phải là một số thực.");
            return null;
        }

        // Kiểm tra và đọc giá trị của TongTien
        String tongTienStr = txt_TTHD.getText().trim();
        if (tongTienStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Tổng Tiền Hóa Đơn");
            return null;
        }
        try {
            tongTien = Double.parseDouble(tongTienStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tổng Tiền Hóa Đơn phải là một số thực.");
            return null;
        }

        // Kiểm tra và đọc giá trị của SoTienCanThanhToan
        String soTienCanThanhToanStr = txt_STCTT1.getText().trim();
        if (soTienCanThanhToanStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Số Tiền Cần Thanh Toán");
            return null;
        }
        try {
            soTienCanThanhToan = Double.parseDouble(soTienCanThanhToanStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số Tiền Cần Thanh Toán phải là một số thực.");
            return null;
        }
        ggT = Double.parseDouble(txt_KM_T.getText().trim());

        return new Model_TT(trangThai, trangThai, trangThai, trangThai, trangThai, soPhongDat, giaBanDau, khuyenMai, tongTienDV, tongTienPhong, trangThai, ngayThanhToan, ngayThanhToan, ggT, ggT, tongTien, soTienCanThanhToan, trangThai, trangThai, trangThai, ngayThanhToan, ngayThanhToan, tongTienPhong);

    }

    void resetFormAndTable_HDCT() {
        // Đặt lại các trường nhập liệu
        txt_MaHDCT.setText("");
        txt_MaHD1.setText("");
        txt_MaP.setText("");
        jdc_CI.setDate(null);
        jdc_CO.setDate(null);
        txt_TP.setText("");

        // Làm mới bảng tbl_HDCT
        this.fillTable_HDCT(rp_HDCT.getAll_HDCT());
    }

    void resetFormAndTable_HD() {
        // Đặt lại các trường nhập liệu
        txt_MaHD.setText("");
        txt_TenNV.setText("");
        txt_TenKH.setText("");
        txt_SDT.setText("");
        txt_DiaChi.setText("");
        txt_SoPD.setText("");
        jdc_NXD.setDate(null);
        jdc_NTT.setDate(null);
        txt_T.setText("");
        rdo_DTT.setSelected(false);
        rdo_CTT.setSelected(false);
        txt_TTP.setText("");
        txt_GBD.setText("");
        txt_TTDV.setText("");
        txt_TTHD.setText("");
        txt_TC.setText("");
        txt_STCTT.setText("");
        cbo_KM.setSelectedIndex(-1);

        // Làm mới bảng tbl_HD
        this.fillTable_HD(rp_HD.getAll_HD());
    }

}
