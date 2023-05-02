/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvien.classes.ThuVien.ui;

/**
 *
 * @author QUOC DAO
 */
import java.awt.BorderLayout;
import thuvien.classes.ThuVien.dao.HocSinhDAO;
//import thuvien.classes.ThuVien.entity.HocSinh;
import thuvien.classes.ThuVien.helper.XDate;
import thuvien.classes.ThuVien.helper.MsgBox;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;
public class PanelHocSinh extends javax.swing.JPanel {

    /**
     * Creates new form HocSinh
     */
    public PanelHocSinh() {
        initComponents();
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

        btgGioiTinh = new javax.swing.ButtonGroup();
        tabHocSinh = new javax.swing.JTabbedPane();
        pnlHocSinh = new javax.swing.JPanel();
        lblMaHocSinh = new javax.swing.JLabel();
        lblHoTenHS = new javax.swing.JLabel();
        lblLop = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaHS = new javax.swing.JTextField();
        txtHoTenHS = new javax.swing.JTextField();
        txtLop = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JTextField();
        pnlBang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocSinh = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();

        pnlHocSinh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaHocSinh.setText("Mã học sinh");
        pnlHocSinh.add(lblMaHocSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 34, -1, -1));

        lblHoTenHS.setText("Họ tên học sinh");
        pnlHocSinh.add(lblHoTenHS, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 112, -1, -1));

        lblLop.setText("Lớp");
        pnlHocSinh.add(lblLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 34, -1, -1));

        lblNgaySinh.setText("Ngày sinh");
        pnlHocSinh.add(lblNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        lblMatKhau.setText("Mật khẩu");
        pnlHocSinh.add(lblMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel6.setText("Giới tính");
        pnlHocSinh.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 183, -1, -1));
        pnlHocSinh.add(txtMaHS, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 63, 200, -1));
        pnlHocSinh.add(txtHoTenHS, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 141, 200, -1));
        pnlHocSinh.add(txtLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 63, 200, -1));
        pnlHocSinh.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 200, -1));

        btgGioiTinh.add(rdoNam);
        rdoNam.setText("Nam");
        pnlHocSinh.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 211, -1, -1));

        rdoNu.setText("Nữ");
        pnlHocSinh.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 211, -1, -1));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thuvien/classes/ThuVien/images/Icon_24px/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlHocSinh.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 275, 104, -1));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thuvien/classes/ThuVien/images/Icon_24px/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlHocSinh.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 275, 104, -1));

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thuvien/classes/ThuVien/images/Icon_24px/Update.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        pnlHocSinh.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 275, 132, -1));
        pnlHocSinh.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 200, -1));

        tabHocSinh.addTab("Học sinh", pnlHocSinh);

        tblHocSinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HS", "Họ tên HS", "Giới tính", "Lớp", "Năm sinh", "Mật khẩu"
            }
        ));
        jScrollPane1.setViewportView(tblHocSinh);

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTimKiem.setForeground(new java.awt.Color(153, 153, 153));
        txtTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusLost(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        lblTimKiem.setText("Tìm kiếm");

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBangLayout = new javax.swing.GroupLayout(pnlBang);
        pnlBang.setLayout(pnlBangLayout);
        pnlBangLayout.setHorizontalGroup(
            pnlBangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBangLayout.createSequentialGroup()
                .addGap(34, 264, Short.MAX_VALUE)
                .addGroup(pnlBangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBangLayout.createSequentialGroup()
                        .addComponent(lblTimKiem)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBangLayout.createSequentialGroup()
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast)
                        .addGap(302, 302, 302))))
            .addGroup(pnlBangLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlBangLayout.setVerticalGroup(
            pnlBangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBangLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlBangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlBangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        tabHocSinh.addTab("Bảng", pnlBang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabHocSinh)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabHocSinh)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        isUpdate = false;
        if (checkForm()) {
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        isUpdate = true;
        if (checkForm()) {
            Update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void txtTimKiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusGained
        focusGained();
    }//GEN-LAST:event_txtTimKiemFocusGained

    private void txtTimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusLost
        focusLost();
    }//GEN-LAST:event_txtTimKiemFocusLost

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        row = tblHocSinh.getSelectedRow();
        edit();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    JTableHeader header;
    public void setModelTable() {
        model = new DefaultTableModel(new Object[][]{}, new Object[]{"Mã HS", "Họ tên HS", "Giới tính", "Lớp", "Năm sinh", "Mật khẩu"});
        tblHocSinh.setModel(model);
        header = tblHocSinh.getTableHeader();
        header.setFont(new Font("SansSerif", 1, 12));
        header.setForeground(new Color(0, 0, 0));
        tblHocSinh.setForeground(new Color(0, 0, 0));
    }
    
    DefaultTableModel model;
    UtilDateModel datePickerModel;
    JDatePicker datePicker;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    boolean isUpdate = false;
    HocSinhDAO dao = new HocSinhDAO();
    int row = -1;

    public void init() {
        setModelTable();
        fillTable();
        updateStatus();
        generateDatePicker();
//        txtNgaySinh.setEditable(false);
    }

    public void generateDatePicker() {
        datePickerModel = new UtilDateModel();
        datePicker = new JDatePicker(datePickerModel);
//        txtNgaySinh.setLayout(new BorderLayout());
//        txtNgaySinh.add(datePicker, BorderLayout.CENTER);
        datePicker.setCursor(Cursor.getDefaultCursor());
        datePickerModel.setValue(new java.util.Date());
    }
    
    public void focusGained() {
        if (txtTimKiem.getText().equals("Tìm kiếm học sinh")) {
            txtTimKiem.setText("");
        }
        txtTimKiem.setForeground(Color.black);
    }

    public void focusLost() {
        if (txtTimKiem.getText().equals("")) {
            txtTimKiem.setText("Tìm kiếm học sinh");
            txtTimKiem.setForeground(new Color(102, 102, 102));
        }

    }

    public void insert() {
        thuvien.classes.ThuVien.entity.HocSinh hs = getForm();
        try {
            dao.insert(hs);
            fillTable();
            clearForm();
            JOptionPane.showMessageDialog(this, "thêm thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "thêm thất bại");
        }
    }

    public void Update() {
        thuvien.classes.ThuVien.entity.HocSinh hs = getForm();
        if (MsgBox.confirm(this, "Bạn có chắc muốn cập nhật không?")) {
            try {
                dao.update(hs);
                fillTable();
                clearForm();
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại ");
            }
        }

    }

    public void first() {
        row = 0;
        tblHocSinh.setRowSelectionInterval(row, row);
        edit();
    }

    public void next() {
        if (row < tblHocSinh.getRowCount() - 1) {
            row++;
            tblHocSinh.setRowSelectionInterval(row, row);
            edit();
        }
    }

    public void prev() {
        if (row > 0) {
            row--;
            tblHocSinh.setRowSelectionInterval(row, row);
            edit();
        }
    }

    public void last() {
        row = tblHocSinh.getRowCount() - 1;
        tblHocSinh.setRowSelectionInterval(row, row);
        edit();
    }

    public void updateStatus() {
        boolean edit = (row >= 0);
        boolean first = (row == 0);
        boolean last = (row == tblHocSinh.getRowCount() - 1);
        //trạng thái form
        txtMaHS.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
      
        String date = sdf.format(new Date());
        txtNgaySinh.setText(date);
    }

    public thuvien.classes.ThuVien.entity.HocSinh setForm(thuvien.classes.ThuVien.entity.HocSinh hs) {
        txtMaHS.setText(hs.getMaHS());
        txtHoTenHS.setText(hs.getHoTenHS());
        JFormattedTextField ngaySinh = datePicker.getFormattedTextField();
        ngaySinh.setText(hs.getNgaySinh());
//        txtNgaySinh.setText(XDate.toString(hs.getNgaySinh()));
        txtMatKhau.setText(hs.getMatKhau());
        txtLop.setText(hs.getLop());
        if (hs.getGioiTinh() == true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        return hs;
    }

    public thuvien.classes.ThuVien.entity.HocSinh getForm() {
        thuvien.classes.ThuVien.entity.HocSinh hs = new thuvien.classes.ThuVien.entity.HocSinh();
        hs.setMaHS(txtMaHS.getText());
        hs.setHoTenHS(txtHoTenHS.getText());
        String date = sdf.format(datePickerModel.getValue());
        hs.setNgaySinh(txtNgaySinh.getText());
//        hs.setNgaySinh(XDate.toDate(txtNgaySinh.getText()));
        hs.setMatKhau(txtMatKhau.getText());
        hs.setLop(txtLop.getText());
        if (rdoNam.isSelected()) {
            hs.setGioiTinh(true);
        } else {
            hs.setGioiTinh(false);
        }
        return hs;
    }

    public void clearForm() {
        thuvien.classes.ThuVien.entity.HocSinh hs = new thuvien.classes.ThuVien.entity.HocSinh();
        setForm(hs);
        txtHoTenHS.setText("");
        txtNgaySinh.setText("");
        txtLop.setText("");
        txtMatKhau.setText("");
        btgGioiTinh.clearSelection();
        row = -1;
        updateStatus();
    }

    public void edit() {
        String hocsinh = String.valueOf(tblHocSinh.getValueAt(row, 0));
        thuvien.classes.ThuVien.entity.HocSinh hs = dao.selectById(hocsinh);
        setForm(hs);
        updateStatus();
    }

    public void fillTable() {
        model.setRowCount(0);
        try {
            List<thuvien.classes.ThuVien.entity.HocSinh> list = dao.selectAll();
            
            for (thuvien.classes.ThuVien.entity.HocSinh hs : list) {
                Object[] row = {hs.getMaHS(), hs.getHoTenHS(), hs.getGioiTinh() ? "Nam" : "Nữ", hs.getLop(), hs.getNgaySinh(), hs.getMatKhau()};
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    public void timKiemNguoiHoc() {
        fillTable();
        clearForm();
        row = -1;
        updateStatus();
    }

    public boolean checkForm() {
        if (txtMaHS.getText().equals("") && txtHoTenHS.getText().equals("") && txtNgaySinh.getText().equals("") && txtMatKhau.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Xin hãy nhập đủ dữ liệu sau đó ấn Thêm", "Error", 1);
            return false;
        } else if (!txtHoTenHS.getText().contains("")) {
            MsgBox.alert(this, "Vui lòng nhập đầy đủ họ tên!");
            return false;
        } else if (!(txtMaHS.getText()).matches("HS[0-9]{1,9}")) {
            JOptionPane.showMessageDialog(this, "Sai định dạng mã \n VD : HS0001", "Error", 1);
            txtMaHS.requestFocus();
            return false;
        }
        else if (txtNgaySinh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Xin hãy nhập ngày tháng năm sinh", "Error", 1);
            txtNgaySinh.requestFocus();
            return false;
        }
        else if (!(txtMatKhau.getText()).matches("HS[0-9]{1,9}")) {
            JOptionPane.showMessageDialog(this, "Sai định dạng mật khẩu \n VD : HS0001", "Error", 1);
            txtMatKhau.requestFocus();
            return false;
        }
        List<thuvien.classes.ThuVien.entity.HocSinh> list = dao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (isUpdate) {
            } else {
                if (txtMaHS.getText().equalsIgnoreCase(list.get(i).getMaHS())) {
                    JOptionPane.showMessageDialog(this, "Trùng Mã Người Học", "Error", 1);
                    return false;
                }
            }
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoTenHS;
    private javax.swing.JLabel lblLop;
    private javax.swing.JLabel lblMaHocSinh;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JPanel pnlBang;
    private javax.swing.JPanel pnlHocSinh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabHocSinh;
    private javax.swing.JTable tblHocSinh;
    private javax.swing.JTextField txtHoTenHS;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMaHS;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}