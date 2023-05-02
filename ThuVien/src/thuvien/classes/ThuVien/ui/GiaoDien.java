package thuvien.classes.ThuVien.ui;

import thuvien.classes.ThuVien.helper.Auth;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;


public class GiaoDien extends javax.swing.JFrame {

    CardLayout layout;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";
    Thread time = null;
    
    public GiaoDien() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblThuVien = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        PnlLeft = new javax.swing.JPanel();
        lblQuanLy = new javax.swing.JLabel();
        lblHeThong = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        btnGioiThieu = new javax.swing.JButton();
        btnQuanLyNguoiMuon = new javax.swing.JButton();
        btnQuanLySach = new javax.swing.JButton();
        btnQuanLyHocSinh = new javax.swing.JButton();
        btnQuanLyGiaoVien = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        lblBackgroundLeft = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 560));
        setPreferredSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblThuVien.setBackground(new java.awt.Color(0, 0, 0));
        lblThuVien.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblThuVien.setForeground(new java.awt.Color(255, 255, 255));
        lblThuVien.setText("Thư viện");
        getContentPane().add(lblThuVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        lblVersion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblVersion.setForeground(new java.awt.Color(255, 255, 255));
        lblVersion.setText("Version 1.0");
        getContentPane().add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblClock.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblClock.setForeground(new java.awt.Color(255, 255, 255));
        lblClock.setText("11:20:00");
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thuvien/classes/ThuVien/images/header1.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        PnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuanLy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQuanLy.setForeground(new java.awt.Color(247, 215, 148));
        lblQuanLy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuanLy.setText("Quản lý");
        PnlLeft.add(lblQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, -1));

        lblHeThong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeThong.setForeground(new java.awt.Color(247, 215, 148));
        lblHeThong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeThong.setText("Hệ thống");
        PnlLeft.add(lblHeThong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        PnlLeft.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 181, -1));

        btnHuongDan.setBackground(new java.awt.Color(255, 255, 255));
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        PnlLeft.add(btnHuongDan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 181, -1));

        btnGioiThieu.setBackground(new java.awt.Color(255, 255, 255));
        btnGioiThieu.setText("Giới thiệu");
        btnGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGioiThieuActionPerformed(evt);
            }
        });
        PnlLeft.add(btnGioiThieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 181, -1));

        btnQuanLyNguoiMuon.setBackground(new java.awt.Color(255, 255, 255));
        btnQuanLyNguoiMuon.setText("Quản lý người mượn");
        btnQuanLyNguoiMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNguoiMuonActionPerformed(evt);
            }
        });
        PnlLeft.add(btnQuanLyNguoiMuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, -1));

        btnQuanLySach.setBackground(new java.awt.Color(255, 255, 255));
        btnQuanLySach.setText("Quản lý sách");
        btnQuanLySach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLySachActionPerformed(evt);
            }
        });
        PnlLeft.add(btnQuanLySach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 181, -1));

        btnQuanLyHocSinh.setBackground(new java.awt.Color(255, 255, 255));
        btnQuanLyHocSinh.setText("Quản lý học sinh");
        btnQuanLyHocSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyHocSinhActionPerformed(evt);
            }
        });
        PnlLeft.add(btnQuanLyHocSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 181, -1));

        btnQuanLyGiaoVien.setBackground(new java.awt.Color(255, 255, 255));
        btnQuanLyGiaoVien.setText("Quản lý giáo viên");
        btnQuanLyGiaoVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyGiaoVienActionPerformed(evt);
            }
        });
        PnlLeft.add(btnQuanLyGiaoVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 181, -1));

        btnDangXuat.setBackground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        PnlLeft.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 181, -1));

        lblBackgroundLeft.setBackground(new java.awt.Color(106, 137, 204));
        lblBackgroundLeft.setOpaque(true);
        PnlLeft.add(lblBackgroundLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 520));

        getContentPane().add(PnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, -1));

        pnlRight.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 810, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        chuyenPanel("cardTrangChu");
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        chuyenPanel("cardHuongDan");
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGioiThieuActionPerformed
        chuyenPanel("cardGioiThieu");
    }//GEN-LAST:event_btnGioiThieuActionPerformed

    private void btnQuanLyNguoiMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNguoiMuonActionPerformed
        chuyenPanel("cardNguoiMuon");
    }//GEN-LAST:event_btnQuanLyNguoiMuonActionPerformed

    private void btnQuanLySachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLySachActionPerformed
        chuyenPanel("cardSach");
    }//GEN-LAST:event_btnQuanLySachActionPerformed

    private void btnQuanLyHocSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyHocSinhActionPerformed
        chuyenPanel("cardHocSinh");
    }//GEN-LAST:event_btnQuanLyHocSinhActionPerformed

    private void btnQuanLyGiaoVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyGiaoVienActionPerformed
        chuyenPanel("cardGiaoVien");
    }//GEN-LAST:event_btnQuanLyGiaoVienActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDien().setVisible(true);
            }
        });
    }

    public void init() {
        layout = (CardLayout) pnlRight.getLayout();
        addCard();
        chuyenPanel("cardTrangChu");
        clock();
    }
    
    public void clock() {
        time = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Calendar cal = Calendar.getInstance();
                        hours = cal.get(Calendar.HOUR_OF_DAY);
                        if (hours > 12) {
                            hours -= 12;
                        }
                        minutes = cal.get(Calendar.MINUTE);
                        seconds = cal.get(Calendar.SECOND);
                        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
                        Date date = cal.getTime();
                        timeString = formatter.format(date);
                        lblClock.setText(timeString);
                        time.sleep(1000);  
                    }
                } catch (Exception e) {
                }
            }
        });
        time.start();
    }
    
    public void addCard() {
        pnlRight.add(new PanelTrangChu(), "cardTrangChu");
        pnlRight.add(new PanelHuongDan(), "cardHuongDan");
        pnlRight.add(new PanelGioiThieu(), "cardGioiThieu");
        pnlRight.add(new PanelMuonTra(), "cardNguoiMuon");
        pnlRight.add(new PanelSach(), "cardSach");
        pnlRight.add(new PanelHocSinh(), "cardHocSinh");
        pnlRight.add(new PanelGiaoVien(), "cardGiaoVien");
    }
    
    public void chuyenPanel(String cardName) {
        layout.show(pnlRight, cardName);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel PnlLeft;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnGioiThieu;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnQuanLyGiaoVien;
    private javax.swing.JButton btnQuanLyHocSinh;
    private javax.swing.JButton btnQuanLyNguoiMuon;
    private javax.swing.JButton btnQuanLySach;
    private javax.swing.JLabel lblBackgroundLeft;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblHeThong;
    private javax.swing.JLabel lblQuanLy;
    private javax.swing.JLabel lblThuVien;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel pnlRight;
    // End of variables declaration//GEN-END:variables
}
