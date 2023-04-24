/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package KiemTra1;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class MainFrom extends javax.swing.JFrame {

    private PhuongTrinhBac1 pt1;
    private PhuongTrinhBac2 pt2;
    private SumDaySo ds;

    /**
     * Creates new form NewJFrame
     */
    public MainFrom() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        bttPT1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        bttPT2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        bttSumTN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tplBangChay = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmnPT1 = new javax.swing.JMenuItem();
        jmnPT2 = new javax.swing.JMenuItem();
        jmnSum = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        Thoát = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        bttPT1.setText("Giải phương trình bâc 1");
        bttPT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttPT1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bttPT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPT1ActionPerformed(evt);
            }
        });
        jToolBar1.add(bttPT1);
        jToolBar1.add(jSeparator1);

        bttPT2.setText("Giải phương trình bậc 2");
        bttPT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttPT2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bttPT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPT2ActionPerformed(evt);
            }
        });
        jToolBar1.add(bttPT2);
        jToolBar1.add(jSeparator2);

        bttSumTN.setText("Tổng dạy số tự nhiên");
        bttSumTN.setFocusable(false);
        bttSumTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttSumTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bttSumTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSumTNActionPerformed(evt);
            }
        });
        jToolBar1.add(bttSumTN);

        jButton3.setText("Thoát");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("S:\\Icon\\CCC.jpg")); // NOI18N
        tplBangChay.addTab("Backgroup", jLabel1);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jMenu1.setText("Các phương thức tính toán");

        jmnPT1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmnPT1.setText("PT bậc 1");
        jmnPT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnPT1ActionPerformed(evt);
            }
        });
        jMenu1.add(jmnPT1);

        jmnPT2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmnPT2.setText("PT bậc 2");
        jmnPT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnPT2ActionPerformed(evt);
            }
        });
        jMenu1.add(jmnPT2);

        jmnSum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmnSum.setText("Sum dãy số");
        jmnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnSumActionPerformed(evt);
            }
        });
        jMenu1.add(jmnSum);
        jMenu1.add(jSeparator3);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Hỗ trợ");
        jMenuBar1.add(jMenu3);

        Thoát.setText("Exit");

        jMenuItem1.setText("Thoát");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Thoát.add(jMenuItem1);

        jMenuBar1.add(Thoát);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(tplBangChay))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplBangChay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void PT1(){
        if (pt1 == null) {
            pt1 = new PhuongTrinhBac1();
            tplBangChay.addTab("Phương trình bậc 1", pt1);
        }
        tplBangChay.setSelectedComponent(pt1);
    }
    private void bttPT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPT1ActionPerformed
        PT1();
        // TODO add your handling code here:
    }//GEN-LAST:event_bttPT1ActionPerformed
    private void PT2(){
        if (pt2 == null) {
            pt2 = new PhuongTrinhBac2();
            tplBangChay.addTab("Phương trình bậc 2", pt2);
        }
        tplBangChay.setSelectedComponent(pt2);
    }
    private void bttPT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPT2ActionPerformed
        PT2();
        // TODO add your handling code here:
    }//GEN-LAST:event_bttPT2ActionPerformed
    private void Sum(){
        if (ds == null) {
            ds = new SumDaySo();
            tplBangChay.addTab("Tổng dãy số", ds);
        }
        tplBangChay.setSelectedComponent(ds);
    }
    
    private void bttSumTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSumTNActionPerformed
        Sum();
        // TODO add your handling code here:
    }//GEN-LAST:event_bttSumTNActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jmnPT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnPT1ActionPerformed
        PT1();
        // TODO add your handling code here:
    }//GEN-LAST:event_jmnPT1ActionPerformed

    private void jmnPT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnPT2ActionPerformed
        PT2();
        // TODO add your handling code here:
    }//GEN-LAST:event_jmnPT2ActionPerformed

    private void jmnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnSumActionPerformed
        Sum();
        // TODO add your handling code here:
    }//GEN-LAST:event_jmnSumActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Thoát;
    private javax.swing.JButton bttPT1;
    private javax.swing.JButton bttPT2;
    private javax.swing.JButton bttSumTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmnPT1;
    private javax.swing.JMenuItem jmnPT2;
    private javax.swing.JMenuItem jmnSum;
    private javax.swing.JTabbedPane tplBangChay;
    // End of variables declaration//GEN-END:variables
}
