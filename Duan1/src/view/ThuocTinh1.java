/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChatLieu;
import model.KichCo;
import model.Mau;
import model.XuatXu;
import service.ThuocTinhService;

/**
 *
 * @author 4bacu
 */
public class ThuocTinh1 extends javax.swing.JDialog {

    /**
     * Creates new form ThuocTinh1
     */
    ThuocTinhService ttsv = new ThuocTinhService();
    public ThuocTinh1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
                setTitle("Quản lý thuộc tính");
        Image icon = new ImageIcon(this.getClass().getResource("/vot.png")).getImage();
        this.setIconImage(icon);
        setSize(700, 800);
        setLocationRelativeTo(null);
        fillChatLieu(ttsv.getAllChatLieu());
        fillXuatXu(ttsv.getAllXuatXu());
        fillKichCo(ttsv.getAllKichCo());
        fillMau(ttsv.getAllMau());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMau = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblChatLieu = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKichCo = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblXuatXu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton6.setText("Sửa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        jLabel8.setText("Tên Kích Cỡ");

        tblMau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên"
            }
        ));
        tblMau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMauMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMau);

        jButton9.setText("Sửa");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên Xuất Xứ");

        jButton3.setText("Thêm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên Màu");

        tblChatLieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên"
            }
        ));
        tblChatLieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChatLieuMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblChatLieu);

        jLabel6.setText("Xuất Xứ");

        jLabel1.setText("Màu Sắc");

        jLabel10.setText("Tên Chất Liệu");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Thêm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        jButton5.setText("Sửa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setText("Chất Liệu");

        tblKichCo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên"
            }
        ));
        tblKichCo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKichCoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblKichCo);

        jLabel11.setText("ID");

        jLabel7.setText("Kích Cỡ");

        jButton8.setText("Thêm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        tblXuatXu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên"
            }
        ));
        tblXuatXu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblXuatXuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblXuatXu);

        jLabel2.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(jTextField4))))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel8)
                                        .addComponent(jButton8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton9)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6))
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(420, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton9)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (checkkichco()) {
            KichCo m = readformkc();
            int index = tblKichCo.getSelectedRow();
            int id = Integer.parseInt(tblKichCo.getValueAt(index, 0).toString());

            if (ttsv.suakichco(m, id) != 0) {
                JOptionPane.showMessageDialog(this, "Sửa Thành Công");
                fillKichCo(ttsv.getAllKichCo());
                tblKichCo.setRowSelectionInterval(index, index);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa Thất Bại");
            }

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tblMauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMauMouseClicked
        int index = tblMau.getSelectedRow();
        ShowMau(index);
    }//GEN-LAST:event_tblMauMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (checkchatlieu()) {
            ChatLieu m = readformcl();
            int index = tblChatLieu.getSelectedRow();
            int id = Integer.parseInt(tblChatLieu.getValueAt(index, 0).toString());

            if (ttsv.suachatlieu(m, id) != 0) {
                JOptionPane.showMessageDialog(this, "Sửa Thành Công");
                fillChatLieu(ttsv.getAllChatLieu());
                tblChatLieu.setRowSelectionInterval(index, index);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa Thất Bại");
            }

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (checkxuatxu()) {
            XuatXu m = readformxx();
            if (ttsv.testTrungXuatXu(m.getIdxuatxu())) {
                JOptionPane.showMessageDialog(this, "Trùng Mã Xuất Xứ");

            } else {
                if (ttsv.themxuatxu(m) != 0) {
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                    fillXuatXu(ttsv.getAllXuatXu());
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
                }
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblChatLieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChatLieuMouseClicked
        int index = tblChatLieu.getSelectedRow();
        ShowChatLieu(index);
    }//GEN-LAST:event_tblChatLieuMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (checkmau()) {
            Mau m = readformmau();
            if (ttsv.testTrungMau(m.getIdmau())) {
                JOptionPane.showMessageDialog(this, "Trùng Mã Màu");
            } else {
                if (ttsv.themmau(m) != 0) {
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                    fillMau(ttsv.getAllMau());
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (checkmau()) {
            Mau m = readformmau();
            int index = tblMau.getSelectedRow();
            int id = Integer.parseInt(tblMau.getValueAt(index, 0).toString());

            if (ttsv.suamau(m, id) != 0) {
                JOptionPane.showMessageDialog(this, "Sửa Thành Công");
                fillMau(ttsv.getAllMau());
                tblMau.setRowSelectionInterval(index, index);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa Thất Bại");
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (checkkichco()) {
            KichCo m = readformkc();
            if (ttsv.testTrungKichCo(m.getIdkichco())) {
                JOptionPane.showMessageDialog(this, "Trùng Mã Kích Cỡ");

            } else {
                if (ttsv.themkichco(m) != 0) {
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                    fillKichCo(ttsv.getAllKichCo());
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
                }
            }

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (checkxuatxu()) {
            XuatXu m = readformxx();
            int index = tblXuatXu.getSelectedRow();
            int id = Integer.parseInt(tblXuatXu.getValueAt(index, 0).toString());

            if (ttsv.suaxuatxu(m, id) != 0) {
                JOptionPane.showMessageDialog(this, "Sửa Thành Công");
                fillXuatXu(ttsv.getAllXuatXu());
                tblXuatXu.setRowSelectionInterval(index, index);

            } else {
                JOptionPane.showMessageDialog(this, "Sửa Thất Bại");
            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblKichCoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKichCoMouseClicked
        int index = tblKichCo.getSelectedRow();
        ShowKichCo(index);
    }//GEN-LAST:event_tblKichCoMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (checkchatlieu()) {

            ChatLieu m = readformcl();
            if (ttsv.testTrungChatlieu(m.getIdchatlieu())) {
                JOptionPane.showMessageDialog(this, "Trùng Mã Chất Liệu");
            } else {
                if (ttsv.themchatlieu(m) != 0) {
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                    fillChatLieu(ttsv.getAllChatLieu());
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
                }
            }

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tblXuatXuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblXuatXuMouseClicked
        int index = tblXuatXu.getSelectedRow();
        ShowXuatXu(index);
    }//GEN-LAST:event_tblXuatXuMouseClicked

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
            java.util.logging.Logger.getLogger(ThuocTinh1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuocTinh1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuocTinh1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuocTinh1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThuocTinh1 dialog = new ThuocTinh1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tblChatLieu;
    private javax.swing.JTable tblKichCo;
    private javax.swing.JTable tblMau;
    private javax.swing.JTable tblXuatXu;
    // End of variables declaration//GEN-END:variables
    private void fillChatLieu(List<ChatLieu> allChatLieu) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblChatLieu.getModel();
        model.setRowCount(0);
        for (ChatLieu chatLieu : allChatLieu) {
            model.addRow(chatLieu.toDataRow());
        }
    }

    private void fillXuatXu(List<XuatXu> allXuatXu) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblXuatXu.getModel();
        model.setRowCount(0);
        for (XuatXu chatLieu : allXuatXu) {
            model.addRow(chatLieu.toDataRow());
        }
    }

    private void fillKichCo(List<KichCo> allKichCo) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblKichCo.getModel();
        model.setRowCount(0);
        for (KichCo chatLieu : allKichCo) {
            model.addRow(chatLieu.toDataRow());
        }
    }

    private void fillMau(List<Mau> allMau) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblMau.getModel();
        model.setRowCount(0);
        for (Mau chatLieu : allMau) {
            model.addRow(chatLieu.toDataRow());
        }
    }

    private void ShowMau(int index) {
        Mau m = ttsv.getAllMau().get(index);
        jTextField1.setText(m.getIdmau() + "");
        jTextField2.setText(m.getTenmau());
    }

    private void ShowKichCo(int index) {
        KichCo m = ttsv.getAllKichCo().get(index);
        jTextField6.setText(m.getIdkichco() + "");
        jTextField5.setText(m.getTenkichco());
    }

    private void ShowChatLieu(int index) {
        ChatLieu m = ttsv.getAllChatLieu().get(index);
        jTextField8.setText(m.getIdchatlieu() + "");
        jTextField7.setText(m.getTenchatlieu());
    }

    private void ShowXuatXu(int index) {
        XuatXu m = ttsv.getAllXuatXu().get(index);
        jTextField4.setText(m.getIdxuatxu() + "");
        jTextField3.setText(m.getTenxuatxu());
    }

    private Mau readformmau() {
        return new Mau(Integer.parseInt(jTextField1.getText()), jTextField2.getText());
    }

    private KichCo readformkc() {
        return new KichCo(Integer.parseInt(jTextField6.getText()), jTextField5.getText());
    }

    private XuatXu readformxx() {
        return new XuatXu(Integer.parseInt(jTextField4.getText()), jTextField3.getText());
    }

    private ChatLieu readformcl() {
        return new ChatLieu(Integer.parseInt(jTextField8.getText()), jTextField7.getText());
    }

    boolean checkmau() {
        if (jTextField1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Màu Trống");
            return false;
        }
        if (jTextField2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên Màu Trống");
            return false;
        }
        try {
            Integer.parseInt(jTextField1.getText());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ID Màu Phải Là Số");
            return false;
        }

    }

    boolean checkxuatxu() {
        if (jTextField4.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Xuất Xứ Trống");
            return false;
        }
        if (jTextField3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên Xuất Xứ Trống");
            return false;
        }
        try {
            Integer.parseInt(jTextField4.getText());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ID Xuất Xứ Phải Là Số");
            return false;
        }
    }

    boolean checkkichco() {
        if (jTextField6.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Kích Cỡ Trống");
            return false;
        }
        if (jTextField5.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên Kích Cỡ Trống");
            return false;
        }
        try {
            Integer.parseInt(jTextField6.getText());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ID Kích Cỡ Phải Là Số");
            return false;
        }
    }

    boolean checkchatlieu() {
        if (jTextField8.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID Chất Liệu Trống");
            return false;
        }
        if (jTextField7.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên Chất Liệu Trống");
            return false;
        }
        try {
            Integer.parseInt(jTextField8.getText());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ID Xuất Xứ Phải Là Số");
            return false;
        }
    }
}
