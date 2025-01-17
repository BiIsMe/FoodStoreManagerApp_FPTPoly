/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.panelChild;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import quanlynhahang.dao.NhanVienDAO;
import quanlynhahang.entity.NhanVien;
import quanlynhahang.helper.Auth;
import quanlynhahang.helper.MsgBox;
import quanlynhahang.ui.NhanVienJPanel;

/**
 *
 * @author SONY
 */
public class NhanVienJPanelChild extends javax.swing.JPanel {

    String id,ten;
    NhanVien nv;
    /**
     * Creates new form NhanVienJPanelChild
     */
    public NhanVienJPanelChild(NhanVien nv) {
        initComponents();
        this.nv = nv;
        this.init();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNVChild = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlNVChild.setBackground(new java.awt.Color(255, 255, 255));
        pnlNVChild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlNVChild.setPreferredSize(new java.awt.Dimension(470, 40));
        pnlNVChild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNVChildMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNVChildMouseExited(evt);
            }
        });

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlynhahang/icon/user.png"))); // NOI18N

        lblTen.setBackground(new java.awt.Color(255, 255, 255));
        lblTen.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTen.setForeground(new java.awt.Color(153, 0, 0));
        lblTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTen.setText("Thị nở");

        lblVaiTro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblVaiTro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVaiTro.setText("Nhân Viên");
        lblVaiTro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlNVChildLayout = new javax.swing.GroupLayout(pnlNVChild);
        pnlNVChild.setLayout(pnlNVChildLayout);
        pnlNVChildLayout.setHorizontalGroup(
            pnlNVChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNVChildLayout.createSequentialGroup()
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(lblVaiTro)
                .addContainerGap())
        );
        pnlNVChildLayout.setVerticalGroup(
            pnlNVChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNVChildLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlNVChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTen)
                    .addComponent(lblVaiTro))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNVChild, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNVChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlNVChildMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNVChildMouseExited
        // TODO add your handling code here:
        pnlNVChild.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pnlNVChildMouseExited

    private void pnlNVChildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNVChildMouseClicked
        // TODO add your handling code here:
        Auth.nhanvien = this.nv;
        if(evt.getClickCount()==1){
            pnlNVChild.setBackground(new Color(204,255,255));
            NhanVienJPanel.setForm(Auth.nhanvien);
        }
    }//GEN-LAST:event_pnlNVChildMouseClicked

    NhanVienDAO nvd = new NhanVienDAO();
    
    public void init(){
        lblTen.setText(nv.getTenNV());
        if(nv.getVaiTro())
            lblVaiTro.setText("Quản Lý");
        else
            lblVaiTro.setText("NhanVien");
    }
    
//    public void loadInfor(NhanVien nv){
//        NhanVienJPanel nvp = null;
//        NhanVienJPanel.txtMaNv.setText(nv.getMaNV().toString());
//        NhanVienJPanel.txtTen.setText(nv.getTenNV().toString());
//        NhanVienJPanel.txtMatKhau.setText(nv.getMatkhau());
//        if(nv.getVaiTro())
//            NhanVienJPanel.rdoQuanLy.setSelected(true);
//        else
//            NhanVienJPanel.rdoNhanvien.setSelected(true);
//        
//        if(nv.getCa().toString().equalsIgnoreCase("Sáng"))
//            NhanVienJPanel.cboCa.setSelectedIndex(0);
//        else if(nv.getCa().toString().equalsIgnoreCase("Chiều"))
//            NhanVienJPanel.cboCa.setSelectedIndex(1);
//        else
//            NhanVienJPanel.cboCa.setSelectedIndex(2);
//        
//        if(nv.getGioiTinh())
//            NhanVienJPanel.rdoNam.setSelected(true);
//        else
//            NhanVienJPanel.rdoNu.setSelected(true);
//        
//        NhanVienJPanel.txtSodt.setText(nv.getSoDT());
//        NhanVienJPanel.txtEmail.setText(nv.getEmail());
//        NhanVienJPanel.txtDiachi.setText(nv.getDiaChi());
//        NhanVienJPanel.dateNgaysinh.setDate(nv.getNgaySinh());
//        NhanVienJPanel.dateNgayLam.setDate(nv.getNgayLam());
//    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JPanel pnlNVChild;
    // End of variables declaration//GEN-END:variables


}

    
