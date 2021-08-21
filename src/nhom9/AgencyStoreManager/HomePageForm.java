/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom9.AgencyStoreManager;

import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author honkaiwaifu
 */
public final class HomePageForm extends javax.swing.JFrame {
    Connection con = NewConnection.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Creates new form Main
     */
    public HomePageForm() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem8 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        UserName = new javax.swing.JMenuItem();
        Changpassword = new javax.swing.JMenuItem();
        RecoveryKey = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        ExitApplication = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DEALER MANAGEMENT SOFTWARE (POWERED BY ELYSIA)");
        jLabel2.setToolTipText("");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/2021081320041749710 (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        UserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-name-16.png"))); // NOI18N
        jMenu1.add(UserName);

        Changpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/modify-key-icon (1).png"))); // NOI18N
        Changpassword.setText("Thay đổi mật khẩu");
        Changpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangpasswordActionPerformed(evt);
            }
        });
        jMenu1.add(Changpassword);

        RecoveryKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/modify-key-icon (1).png"))); // NOI18N
        RecoveryKey.setText("Khoá phục hồi");
        RecoveryKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecoveryKeyActionPerformed(evt);
            }
        });
        jMenu1.add(RecoveryKey);

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Logout-icon.png"))); // NOI18N
        Logout.setText("Đăng xuất");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jMenu1.add(Logout);

        ExitApplication.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ExitApplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Actions-application-exit-icon.png"))); // NOI18N
        ExitApplication.setText("Thoát");
        ExitApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitApplicationActionPerformed(evt);
            }
        });
        jMenu1.add(ExitApplication);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Tổ chức");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/wholesale.png"))); // NOI18N
        jMenuItem1.setText("Hồ sơ đại lý");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-create-document-16.png"))); // NOI18N
        jMenu5.setText("Quy chế");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-create-document-16.png"))); // NOI18N
        jMenuItem6.setText("Tổ chức đại lý");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-create-document-16.png"))); // NOI18N
        jMenuItem9.setText("Loại đại lý");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenu2.add(jMenu5);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-package-16.png"))); // NOI18N
        jMenuItem10.setText("Mặt hàng");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Xuất");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/invoice-icon.png"))); // NOI18N
        jMenuItem2.setText("Phiếu thu tiền");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/invoice-icon.png"))); // NOI18N
        jMenuItem3.setText("Phiếu xuất hàng");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Báo cáo");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Sales-report-icon.png"))); // NOI18N
        jMenuItem4.setText("Doanh số tháng");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Sales-report-icon.png"))); // NOI18N
        jMenuItem5.setText("Công nợ tháng");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar2.add(jMenu4);

        jMenu6.setText("Về");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-info-16.png"))); // NOI18N
        jMenuItem7.setText("Thông tin");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   //hồ sơ đại lý
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        InforAgency dl = new InforAgency();
        dl.setVisible(true);
        dl.setResizable(false);
        dl.pack();
        dl.setLocationRelativeTo(null);
        dl.setTitle("Hồ sơ đại lý");
        JOptionPane.showMessageDialog(this,"Nhấn nút làm mới sau khi thay đổi danh sách loại đại lý","Thông báo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    //thu tiền
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        BillPayment t = new BillPayment();
        t.setVisible(true);
        t.setResizable(false);
        t.pack();
        t.setLocationRelativeTo(null);
        t.setTitle("Phiếu thu tiền");
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    //quy chế đại lý
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        AgentOrganization tc = new AgentOrganization();
         tc.setVisible(true);
         tc.setResizable(false);
         tc.pack();
         tc.setLocationRelativeTo(null);
         tc.setTitle("Tổ chức đại lý");
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    //Thêm loại đại lý
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
        AddAgencyTypes addtype = new AddAgencyTypes();
        addtype.setVisible(true);
        addtype.setResizable(false);
        addtype.pack();
        addtype.setLocationRelativeTo(null);
        addtype.setTitle("Thêm loại đại lý");
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    //xuất hàng
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        BillNotes px = new BillNotes();
        px.setVisible(true);
        px.setResizable(false);
        px.pack();
        px.setLocationRelativeTo(null);
        px.setTitle("Phiếu xuất hàng");
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    //mặt hàng
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        
        PackageInfo mh = new PackageInfo();
        mh.setVisible(true);
        mh.setResizable(false);
        mh.pack();
        mh.setLocationRelativeTo(null);
        mh.setTitle("Mặt hàng");
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    //báo cáo doanh số
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        ReportSalesMonth firstrp = new ReportSalesMonth();
        firstrp.setVisible(true);
        firstrp.setResizable(false);
        firstrp.pack();
        firstrp.setLocationRelativeTo(null);
        firstrp.setTitle("Báo cáo doanh số");
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    //công nợ tháng
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        ReportDebit secrp = new ReportDebit();
        secrp.setVisible(true);
        secrp.setResizable(false);
        secrp.pack();
        secrp.setLocationRelativeTo(null);
        secrp.setTitle("Báo cáo công nợ");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

   //thoát pm
    private void ExitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitApplicationActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_ExitApplicationActionPerformed
//đăng xuất
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
         this.dispose();
         LoginForm lf = new LoginForm();
         lf.setVisible(true);
         lf.setResizable(false);
         lf.pack();
         lf.setLocationRelativeTo(null);
         lf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         lf.setTitle("Đăng nhập hệ thống");
    }
//GEN-FIRST:event_LogoutActionPerformed

//GEN-LAST:event_LogoutActionPerformed
                                              
  //thay đổi mật khẩu
    private void ChangpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangpasswordActionPerformed
        // TODO add your handling code here:
        dispose();
        ChangePassword cp = new ChangePassword();
        cp.setVisible(true);
        cp.setResizable(false);
        cp.pack();
        cp.setLocationRelativeTo(null);
        cp.setTitle("Thay đổi mật khẩu");
    }
//GEN-LAST:event_ChangpasswordActionPerformed
    //khoá phục hồi
    private void RecoveryKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecoveryKeyActionPerformed
        // TODO add your handling code here:
        RecoveryKey rk = new RecoveryKey();
       
        rk.setVisible(true);
        rk.setResizable(false);
        rk.pack();
        rk.setLocationRelativeTo(null);
        rk.setTitle("Khoá phục hồi");
        try {
        ps = con.prepareStatement("SELECT * FROM DANGNHAP WHERE username = ?");
        ps.setString(1, UserName.getText());
        rs = ps.executeQuery();
        if (rs.next()) {
             rk.username.setText(rs.getString(2));
            }
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(HomePageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_RecoveryKeyActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        
        AboutSoftware as = new AboutSoftware();
        as.setVisible(true);
        as.setResizable(false);
        as.pack();
        as.setLocationRelativeTo(null);
        as.setTitle("Về chúng tôi");
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    
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
            java.util.logging.Logger.getLogger(HomePageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                HomePageForm mf = new HomePageForm();
                mf.UserName.setEnabled(false);
                mf.setVisible(true);
                mf.setResizable(false);
                mf.setTitle("Quản lý đại lý");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Changpassword;
    private javax.swing.JMenuItem ExitApplication;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenuItem RecoveryKey;
    public javax.swing.JMenuItem UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
