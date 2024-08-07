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
import repositories.Repositories_HDDDV;
import repositories.Repositories_TT;

/**
 *
 * @author ADMIN
 */
public class View_TT extends javax.swing.JFrame {

    private repositories.Repositories_HD rp_HD = new Repositories_HD();
    private repositories.Repositories_HDCT rp_HDCT = new Repositories_HDCT();
    private repositories.Repositories_HDDDV rp_HDDDV = new Repositories_HDDDV();

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
        this.fillTable_HDDDV(rp_HDDDV.getAll_DatDichVu());

        this.fillTable_TTTT(rp_TT.get_TTTT());
        this.fillTable_TT_DV(rp_TT.getTongTienDV_HD());
        this.fillTable_TT_P(rp_TT.getTongTienPhong_HD());

//        cbo_TrangThai.removeAllItems();
//        cbo_TrangThai.addItem("Đã Thanh Toán");
//        cbo_TrangThai.addItem("Chưa Thanh Toán");

    }

    void fillTable_HD(ArrayList<Model_TT> list_HD) {
        mol = (DefaultTableModel) tbl_HD.getModel();
        mol.setRowCount(0);
        for (Model_TT x : list_HD) {
            Object[] rowData = x.toDataRow_HD();
            for (int i = 0; i < rowData.length; i++) {
                if (rowData[i] == null) {
                    rowData[i] = ""; // Thay thế giá trị null bằng chuỗi trống
                }
            }
            mol.addRow(rowData);
        }
    }

    void fillTable_HDCT(ArrayList<Model_TT> list_HDCT) {
        DefaultTableModel model = (DefaultTableModel) tbl_HDCT.getModel();
        model.setRowCount(0);

        for (Model_TT tt : list_HDCT) {
            model.addRow(new Object[]{
                tt.getMaHDCT(),
                tt.getMaHD_HDCT(),
                tt.getMaP(),
                tt.getCheckIn(),
                tt.getCheckOut(),
                tt.getTienPhong()
            });
        }
    }

    private void fillTable_HDDDV(ArrayList<Model_TT> list) {
        DefaultTableModel model = (DefaultTableModel) tbl_DDV.getModel();
        model.setRowCount(0);

        for (Model_TT tt : list) {
            model.addRow(new Object[]{
                tt.getMaHD_HDDDV(),
                tt.getMaDDDV(),
                tt.getMaP_HDDDV(),
                tt.getMaDV(),
                tt.getTenDV(),
                tt.getSoLuong(),
                tt.getGia(),
                tt.getNgayDat(),
                tt.getTongTien_HDDDV()
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
        jLabel28 = new javax.swing.JLabel();
        txt_TTHD = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txt_STCTT1 = new javax.swing.JTextField();
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
        jPanel7 = new javax.swing.JPanel();
        btn_TK = new javax.swing.JButton();
        txt_TK = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_HD = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_HDCT = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_DDV = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_C1 = new javax.swing.JButton();

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

        txt_DC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DCActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setText("Ngày Xuất Đơn:");

        jdc_NXD1.setDateFormatString("yyyy-MM-dd\n");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setText("Ngày Thanh Toán:");

        jdc_NTT1.setDateFormatString("yyyy-MM-dd");
        jdc_NTT1.setDate(new Date());
        jdc_NTT1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdc_NTT1PropertyChange(evt);
            }
        });

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
                .addGap(18, 103, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdc_NXD1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jdc_NTT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
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

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Tổng Tiền Hóa Đơn:");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Tiền Cọc:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("Số Tiền Cần Thanh Toán:");

        btn_TT1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_TT1.setForeground(new java.awt.Color(255, 0, 0));
        btn_TT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calculator.png"))); // NOI18N
        btn_TT1.setText("Tính Toán");
        btn_TT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TT1ActionPerformed(evt);
            }
        });

        btn_TT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_TT.setForeground(new java.awt.Color(255, 0, 0));
        btn_TT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand.png"))); // NOI18N
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
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_TTP1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(txt_TC2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_TTDV1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txt_TTHD)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(txt_STCTT1)))
                .addGap(97, 97, 97)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_TT1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(353, 353, 353))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_TT1)
                .addGap(18, 18, 18)
                .addComponent(btn_TT)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txt_TTP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txt_TTDV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txt_TTHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(txt_TC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txt_STCTT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Hóa Đơn Chưa Thanh Toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        txt_TK3.setForeground(new java.awt.Color(255, 0, 0));
        txt_TK3.setToolTipText("");

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
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TK3, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(62, 62, 62)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Tk3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TK3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Tk3))
                .addGap(12, 12, 12)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        btn_C.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_C.setForeground(new java.awt.Color(255, 0, 0));
        btn_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_1.png"))); // NOI18N
        btn_C.setText("Cancel");
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });

        btn_HD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_HD.setForeground(new java.awt.Color(255, 0, 0));
        btn_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cancel Order.png"))); // NOI18N
        btn_HD.setText("Hủy Đơn ");
        btn_HD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HDActionPerformed(evt);
            }
        });

        btn_RS3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_RS3.setForeground(new java.awt.Color(255, 0, 0));
        btn_RS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_RS3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_C, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_HD)
                    .addComponent(btn_C)
                    .addComponent(btn_RS3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(331, 331, 331)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thanh Toán", jPanel15);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

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
                .addComponent(txt_TK, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Tên NV", "Tên KH", "SDT", "Địa Chỉ", "Số PD", "Tổng TDV", "Tổng TP", "Trạng Thái", "Ngày XD", "Ngày TT", "Tiền Cọc", "Tổng Tiền", "Số Tiền Cần TT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Hóa Đơn Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

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
        jScrollPane3.setViewportView(tbl_HDCT);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 204));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Đặt Dịch Vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        tbl_DDV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_DDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã DDV", "Mã P", "Mã DV", "Tên DV", "Số Lượng", "Giá", "Ngày Đặt", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_DDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DDVMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tbl_DDV);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 204));

        btn_C1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_C1.setForeground(new java.awt.Color(255, 0, 0));
        btn_C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel_1.png"))); // NOI18N
        btn_C1.setText("Cancel");
        btn_C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_C1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_C1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(677, 677, 677)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Hóa Đơn", jPanel1);

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

    private void tbl_HDCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HDCTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_HDCTMouseClicked

    private void tbl_HDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HDMouseClicked
        // TODO add your handling code here:
        i = tbl_HD.getSelectedRow();

        if (i >= 0) {
            String maHD = tbl_HD.getValueAt(i, 0).toString();

            ArrayList<Model_TT> list_HDCT = rp_HDCT.getHDCTByMaHD(maHD);
            ArrayList<Model_TT> list_HDDDV = rp_HDDDV.getHDDDVbyMaHD(maHD);

            this.fillTable_HDCT(list_HDCT);
            this.fillTable_HDDDV(list_HDDDV);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng hợp lệ.");
        }

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

    private void btn_RS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RS3ActionPerformed
        // TODO add your handling code here:
        txt_MaHD2.setText("");
        txt_MaNV.setText("");
        txt_MaKH.setText("");
        txt_SDT2.setText("");
        txt_DC.setText("");
        txt_SPD.setText("");
        jdc_NXD1.setDate(null);
        rdo_DTT1.setSelected(false);
        rdo_CTT1.setSelected(false);
        txt_TTP1.setText("");
        txt_TTDV1.setText("");
        txt_TTHD.setText("");
        txt_TC2.setText("");
        txt_STCTT1.setText("");
        this.fillTable_TTTT(rp_TT.get_TTTT());
        this.fillTable_TT_DV(rp_TT.getTongTienDV_HD());
        this.fillTable_TT_P(rp_TT.getTongTienPhong_HD());
    }//GEN-LAST:event_btn_RS3ActionPerformed

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
                    resetForm();
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

    private void tbl_PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PMouseClicked
        // TODO add your handling code here:
        int i = tbl_P.getSelectedRow();
        this.showData_TT_P(i);
        txt_SPD.disable();
        txt_TTP1.disable();
    }//GEN-LAST:event_tbl_PMouseClicked

    private void tbl_DVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DVMouseClicked
        // TODO add your handling code here:
        int i = tbl_DV.getSelectedRow();
        this.showData_TT_DV(i);
        txt_TTDV1.disable();
    }//GEN-LAST:event_tbl_DVMouseClicked

    private void tbl_ThanhToanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ThanhToanMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_ThanhToanMouseEntered

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
        jdc_NTT1.setEnabled(false);
        txt_TC2.disable();
        txt_TTHD.disable();
        txt_STCTT1.disable();
        String maHD = tbl_ThanhToan.getValueAt(i, 0).toString();
        this.fillTable_P(rp_TT.getAll_TTP(maHD));
        this.fillTable_TTDV(rp_TT.getAll_TTDV(maHD));
    }//GEN-LAST:event_tbl_ThanhToanMouseClicked

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
                        resetForm();
                    } else {
                        JOptionPane.showMessageDialog(this, "Thanh toán thất bại");
                    }
                }

            }
        }
    }//GEN-LAST:event_btn_TTActionPerformed

    private void btn_TT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TT1ActionPerformed
        // TODO add your handling code here:
        double TTP = Double.parseDouble(txt_TTP1.getText().toString());
        double TTDV = Double.parseDouble(txt_TTDV1.getText().toString());
        double tienCoc = Double.parseDouble(txt_TC2.getText().toString());
        double tongTien = TTP + TTDV;
        double TPT = (TTP + TTDV) - tienCoc;
        txt_TTHD.setText(String.valueOf(tongTien));
        txt_STCTT1.setText(String.valueOf(TPT));

    }//GEN-LAST:event_btn_TT1ActionPerformed

    private void txt_DCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DCActionPerformed

    private void jdc_NTT1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdc_NTT1PropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jdc_NTT1PropertyChange

    private void tbl_DDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DDVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_DDVMouseClicked

    private void btn_C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C1ActionPerformed
        // TODO add your handling code here:
        View_TrangChu tt5 = new View_TrangChu();
        tt5.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_C1ActionPerformed

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
    private javax.swing.JButton btn_C1;
    private javax.swing.JButton btn_HD;
    private javax.swing.JButton btn_RS3;
    private javax.swing.JButton btn_TK;
    private javax.swing.JButton btn_TT;
    private javax.swing.JButton btn_TT1;
    private javax.swing.JButton btn_Tk3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdc_NTT1;
    private com.toedter.calendar.JDateChooser jdc_NXD1;
    private javax.swing.JRadioButton rdo_CTT1;
    private javax.swing.JRadioButton rdo_DTT1;
    private javax.swing.JTable tbl_DDV;
    private javax.swing.JTable tbl_DV;
    private javax.swing.JTable tbl_HD;
    private javax.swing.JTable tbl_HDCT;
    private javax.swing.JTable tbl_P;
    private javax.swing.JTable tbl_ThanhToan;
    private javax.swing.JTextField txt_DC;
    private javax.swing.JTextField txt_MaHD2;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_MaNV;
    private javax.swing.JTextField txt_SDT2;
    private javax.swing.JTextField txt_SPD;
    private javax.swing.JTextField txt_STCTT1;
    private javax.swing.JTextField txt_TC2;
    private javax.swing.JTextField txt_TK;
    private javax.swing.JTextField txt_TK3;
    private javax.swing.JTextField txt_TTDV1;
    private javax.swing.JTextField txt_TTHD;
    private javax.swing.JTextField txt_TTP1;
    // End of variables declaration//GEN-END:variables

    //TT
    void showData_TT(int i) {
        // Kiểm tra và gán giá trị từ bảng vào các trường
        Object value;

        value = tbl_ThanhToan.getValueAt(i, 0);
        txt_MaHD2.setText(value != null ? value.toString() : "");

        value = tbl_ThanhToan.getValueAt(i, 1);
        txt_MaNV.setText(value != null ? value.toString() : "");

        value = tbl_ThanhToan.getValueAt(i, 2);
        txt_MaKH.setText(value != null ? value.toString() : "");

        value = tbl_ThanhToan.getValueAt(i, 3);
        txt_SDT2.setText(value != null ? value.toString() : "");

        value = tbl_ThanhToan.getValueAt(i, 4);
        txt_DC.setText(value != null ? value.toString() : "");

        // Kiểm tra và gán giá trị cho jdc_NXD1
        value = tbl_ThanhToan.getValueAt(i, 5);
        if (value != null && !value.toString().isEmpty()) {
            try {
                Date ngayXuatDon = new SimpleDateFormat("yyyy-MM-dd").parse(value.toString());
                jdc_NXD1.setDate(ngayXuatDon);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Lỗi định dạng ngày xuất đơn: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            jdc_NXD1.setDate(null);
        }

        value = tbl_ThanhToan.getValueAt(i, 6);
        txt_TC2.setText(value != null ? value.toString() : "");
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
        String trangThai;
        Date ngayThanhToan;
        double tongTien;
        double soTienCanThanhToan;
        double tongTienDV;
        double tongTienPhong;

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

        // Kiểm tra và đọc giá trị của TrangThai
        if (rdo_DTT1.isSelected()) {
            trangThai = "Đã Thanh Toán"; // Đã Thanh Toán
        } else if (rdo_CTT1.isSelected()) {
            trangThai = "Chưa Thanh Toán"; // Chưa Thanh Toán
        } else {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Trạng Thái");
            return null;
        }

        // Kiểm tra và đọc giá trị của NgayThanhToan
        ngayThanhToan = jdc_NTT1.getDate();
        if (ngayThanhToan == null) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày thanh toán.");
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
        return new Model_TT(trangThai, trangThai, trangThai, trangThai, trangThai, soPhongDat, tongTienDV, tongTienDV, tongTienPhong, trangThai, ngayThanhToan, ngayThanhToan, tongTienDV, tongTien, soTienCanThanhToan, trangThai, trangThai, trangThai, ngayThanhToan, ngayThanhToan, tongTienPhong, trangThai, trangThai, trangThai, trangThai, trangThai, soPhongDat, tongTien, ngayThanhToan, tongTienDV, trangThai, trangThai, trangThai, tongTienDV, ABORT, tongTien);
    }

    void resetForm() {
        this.fillTable_HD(rp_HD.getAll_HD());
        this.fillTable_HDCT(rp_HDCT.getAll_HDCT());
        this.fillTable_HDDDV(rp_HDDDV.getAll_DatDichVu());
    }
}
