/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom9.AgencyStoreManager;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import static nhom9.AgencyStoreManager.BillNotes.MaPhieuXuatField;


/**
 *
 * @author honkaiwaifu
 */
public class ReportSalesMonth extends javax.swing.JFrame {
    Connection con = NewConnection.getConnection();
    PreparedStatement ps, ps1, ps2;
    ResultSet rs, rs1, rs2;
    DefaultTableModel d, d1;
    /**
     * Creates new form BaoCaoDoanhSo
     */
    public ReportSalesMonth() {
        initComponents();
        madllist();
        user_load();
    }
    public void madllist() {
        NameField.setEditable(false);
        MaDLList.removeAllItems();
        MaDLList.addItem("Chọn mã đại lý");
        //danh sách các mã đại lý
        try {
            ps = con.prepareStatement("SELECT MaDaiLy FROM DaiLy");
            rs = ps.executeQuery();
            while (rs.next()) {
               String maDaiLy = rs.getString("MaDaiLy");
               MaDLList.addItem(maDaiLy);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillNotes.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MaDLList = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MonthList = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        DOANHSOTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(240, 228, 75));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BÁO CÁO DOANH SỐ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã đại lý");

        MaDLList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MaDLList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn mã đại lý", " " }));
        MaDLList.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                MaDLListPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên đại lý");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tháng");

        MonthList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MonthList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn tháng", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        DOANHSOTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đại lý", "Tháng", "Số phiếu xuất", "Tổng trị giá", "Tỉ lệ"
            }
        ));
        jScrollPane1.setViewportView(DOANHSOTable);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Làm mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Thoát");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Xuất ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Cập nhật");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MaDLList, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NameField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MonthList, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MaDLList, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MonthList, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameField)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //load bảng
    public void user_load() {
        int c;
        try {           
            ps1 = con.prepareStatement("SELECT * FROM DOANHSO ");
            rs1 = ps1.executeQuery();
            
            ResultSetMetaData rad = rs1.getMetaData();
            c = rad.getColumnCount();
            
            d = (DefaultTableModel)DOANHSOTable.getModel();
            d.setRowCount(0);
            
            while (rs1.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs1.getString("MaDaiLy"));
                    v2.add(rs1.getString("Thang"));
                    v2.add(rs1.getString("SoPhieuXuat"));
                    v2.add(rs1.getString("TongTriGia"));
                    v2.add(rs1.getString("TiLe"));                    
                }
                d.addRow(v2);
            }
             d.fireTableDataChanged();
            
        } catch (SQLException ex) {
            Logger.getLogger(BillNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    //load tên đại lý
    private void MaDLListPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_MaDLListPopupMenuWillBecomeInvisible
        String madl = MaDLList.getSelectedItem().toString();
        try {
            ps = con.prepareStatement("SELECT TenDaiLy FROM DAILY WHERE MaDaiLy = ? ");
            ps.setString(1, madl);
            rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("TenDaiLy");
                NameField.setText(String.valueOf(name));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
                                             
    }//GEN-LAST:event_MaDLListPopupMenuWillBecomeInvisible
    //khá khó ở đoạn này 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String madl, month;
        madl = MaDLList.getSelectedItem().toString();
        month = MonthList.getSelectedItem().toString();
        
        try {
            ps = con.prepareStatement("select COUNT(MaPhieuXuat) AS XUATHIEN, SUM(TongTien) AS TOTAL "
                    + "from PHIEUXUATHANG WHERE MaDaiLy = ? AND MONTH(NgayLapPhieu) = ? ");
            ps.setString(1, madl);
            ps.setString(2, month);
            rs = ps.executeQuery();
            if (rs.next()) {
                int defcount = rs.getInt("XUATHIEN");
                int defsum = rs.getInt("TOTAL");
                String spx = Integer.toString(defcount);
                String total = Integer.toString(defsum);
                ps1 = con.prepareStatement("INSERT INTO DOANHSO(MaDaiLy, Thang, SoPhieuXuat, TongTriGia)"
                        + "VALUES (?,?,?,?)");
                ps1.setString(1, madl);
                ps1.setString(2, month);
                ps1.setString(3, spx);
                ps1.setString(4, total);
                ps1.executeUpdate();
                //ps1.setString(5, null);
                JOptionPane.showMessageDialog(this,"Thành công","Đại lý",JOptionPane.INFORMATION_MESSAGE);
          
                user_load();
                madllist();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReportSalesMonth.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed
    //làm mới
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MaDLList.setSelectedItem(0);
        MonthList.setSelectedItem(0);
        NameField.setText("");
        user_load();
        madllist();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed
    //xuất báo cáo
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String month = MonthList.getSelectedItem().toString();
        try {   
            Hashtable map = new Hashtable();
            JasperReport report = JasperCompileManager.compileReport("C:\\Users\\ngoth\\OneDrive\\Documents\\NetBeansProjects\\Nhom 9\\src\\report\\BAOCAODOANHSO.jrxml");
            
            map.put("getMonth", month);
            
            
            JasperPrint p = JasperFillManager.fillReport(report, map, con);
            JasperViewer jReportsViewer = new JasperViewer(p, false);
            jReportsViewer.setFitWidthZoomRatio();
            jReportsViewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ReportSalesMonth.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    //cập nhật bảng
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String madl, month;
        madl = MaDLList.getSelectedItem().toString();
        month = MonthList.getSelectedItem().toString();
        
        try {
            ps = con.prepareStatement("select COUNT(MaPhieuXuat) AS XUATHIEN, SUM(TongTien) AS TOTAL "
                    + "from PHIEUXUATHANG WHERE MaDaiLy = ? AND MONTH(NgayLapPhieu) = ? ");
            ps.setString(1, madl);
            ps.setString(2, month);
            rs = ps.executeQuery();
            if (rs.next()) {
                int defcount = rs.getInt("XUATHIEN");
                int defsum = rs.getInt("TOTAL");
                String spx = Integer.toString(defcount);
                String total = Integer.toString(defsum);
                ps1 = con.prepareStatement("UPDATE DOANHSO SET SoPhieuXuat = ?, TongTriGia = ?)"
                        + "WHERE MaDaiLy = ?, Thang = ?");
                
                ps1.setString(1, spx);
                ps1.setString(2, total);
                ps1.setString(3, madl);
                ps1.setString(4, month);
                ps1.executeUpdate();
                //ps1.setString(5, null);
                JOptionPane.showMessageDialog(this,"Thành công","Đại lý",JOptionPane.INFORMATION_MESSAGE);
          
                user_load();
                madllist();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReportSalesMonth.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    
   
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
            java.util.logging.Logger.getLogger(ReportSalesMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportSalesMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportSalesMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportSalesMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReportSalesMonth firstrp = new ReportSalesMonth();
                firstrp.setVisible(true);
                firstrp.setResizable(false);
                firstrp.setTitle("Báo cáo doanh số");
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DOANHSOTable;
    private javax.swing.JComboBox<String> MaDLList;
    private javax.swing.JComboBox<String> MonthList;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}