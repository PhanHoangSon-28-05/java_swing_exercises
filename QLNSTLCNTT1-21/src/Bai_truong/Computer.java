/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai_truong;

/**
 *
 * @author AD
 */
public class Computer extends javax.swing.JFrame {
    double cacso = 0;
    String ketqua = "";
    String phep = "";
    
    boolean kiemtraDauB = false;
    /**
     * Creates new form Computer
     */
    public Computer() {
        this.setLocationRelativeTo(null);
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

        bttAC = new javax.swing.JButton();
        btt7 = new javax.swing.JButton();
        bttCE = new javax.swing.JButton();
        bttChia = new javax.swing.JButton();
        bttNhan = new javax.swing.JButton();
        btt8 = new javax.swing.JButton();
        btt9 = new javax.swing.JButton();
        bttTru = new javax.swing.JButton();
        btt4 = new javax.swing.JButton();
        btt5 = new javax.swing.JButton();
        btt6 = new javax.swing.JButton();
        bttCong = new javax.swing.JButton();
        btt1 = new javax.swing.JButton();
        btt2 = new javax.swing.JButton();
        btt3 = new javax.swing.JButton();
        bttBang = new javax.swing.JButton();
        btt0 = new javax.swing.JButton();
        txtMangHinh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bttAC.setText("AC");
        bttAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttACActionPerformed(evt);
            }
        });

        btt7.setText("7");
        btt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt7ActionPerformed(evt);
            }
        });

        bttCE.setText("CE");
        bttCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCEActionPerformed(evt);
            }
        });

        bttChia.setText("/");
        bttChia.setMaximumSize(new java.awt.Dimension(40, 25));
        bttChia.setMinimumSize(new java.awt.Dimension(40, 25));
        bttChia.setPreferredSize(new java.awt.Dimension(40, 25));
        bttChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttChiaActionPerformed(evt);
            }
        });

        bttNhan.setText("*");
        bttNhan.setActionCommand("*");
        bttNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNhanActionPerformed(evt);
            }
        });

        btt8.setText("8");
        btt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt8ActionPerformed(evt);
            }
        });

        btt9.setText("9");
        btt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt9ActionPerformed(evt);
            }
        });

        bttTru.setText("-");
        bttTru.setMaximumSize(new java.awt.Dimension(40, 25));
        bttTru.setMinimumSize(new java.awt.Dimension(40, 25));
        bttTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttTruActionPerformed(evt);
            }
        });

        btt4.setText("4");
        btt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt4ActionPerformed(evt);
            }
        });

        btt5.setText("5");
        btt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt5ActionPerformed(evt);
            }
        });

        btt6.setText("6");
        btt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt6ActionPerformed(evt);
            }
        });

        bttCong.setText("+");
        bttCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCongActionPerformed(evt);
            }
        });

        btt1.setText("1");
        btt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt1ActionPerformed(evt);
            }
        });

        btt2.setText("2");
        btt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt2ActionPerformed(evt);
            }
        });

        btt3.setText("3");
        btt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt3ActionPerformed(evt);
            }
        });

        bttBang.setText("=");
        bttBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBangActionPerformed(evt);
            }
        });

        btt0.setText("0");
        btt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt0ActionPerformed(evt);
            }
        });

        txtMangHinh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMangHinh)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttCE, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btt0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btt4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btt5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btt6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btt2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btt3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttBang))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btt7)
                                .addGap(5, 5, 5)
                                .addComponent(btt8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btt9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttChia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttNhan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttCong))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(txtMangHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttNhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bttChia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bttCE)
                                .addComponent(bttTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btt7)
                            .addComponent(btt8)
                            .addComponent(btt9)
                            .addComponent(bttAC)))
                    .addComponent(bttCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btt4)
                            .addComponent(btt5)
                            .addComponent(btt6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btt1)
                            .addComponent(btt2)
                            .addComponent(btt3)))
                    .addComponent(bttBang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btt0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt1ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        } 
        String so1 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so1);
        if(cacso == 0){
            cacso = 1;
        }else{
        try{
            double sothu2 = Double.parseDouble(so1);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt1ActionPerformed

    private void btt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt2ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        }
        String so2 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so2);
        
        if(cacso == 0){
            cacso = 2;
        }else{
        try{
            double sothu2 = Double.parseDouble(so2);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt2ActionPerformed

    private void btt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt3ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        }
        String so3 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so3); 
        if(cacso == 0){
            cacso = 3;
        }else{
        try{
            double sothu2 = Double.parseDouble(so3);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt3ActionPerformed

    private void btt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt4ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        }
        String so4 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so4);
        if(cacso == 0){
            cacso = 4;
        }else{
        try{
            double sothu2 = Double.parseDouble(so4);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt4ActionPerformed

    private void btt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt5ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        }
        String so5 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so5);
        if(cacso == 0){
            cacso = 5;
        }else{
        try{
            double sothu2 = Double.parseDouble(so5);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt5ActionPerformed

    private void btt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt6ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        }
        String so6 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so6);
        if(cacso == 0){
            cacso = 6;
        }else{
        try{
            double sothu2 = Double.parseDouble(so6);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt6ActionPerformed

    private void btt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt7ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        }
        String so7 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so7);
        if(cacso == 0){
            cacso = 7;
        }else{
        try{
            double sothu2 = Double.parseDouble(so7);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt7ActionPerformed

    private void btt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt8ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        }
        String so8 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so8);
        if(cacso == 0){
            cacso = 8;
        }else{
        try{
            double sothu2 = Double.parseDouble(so8);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt8ActionPerformed

    private void btt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt9ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        }
        String so9 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so9);
        if(cacso == 0){
            cacso = 9;
        }else{
        try{
            double sothu2 = Double.parseDouble(so9);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt9ActionPerformed

    private void btt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt0ActionPerformed
        if(kiemtraDauB){
            kiemtraDauB = false;
            txtMangHinh.setText("");
        }
        String so0 = evt.getActionCommand();
        
        txtMangHinh.setText(txtMangHinh.getText() + so0);
        if(cacso == 0){
            cacso = 0;
        }else{
        try{
            double sothu2 = Double.parseDouble(so0);
            
            if (phep.equals("+")){
                cacso = cacso + sothu2;
            }else if (phep.equals("-")){
                cacso = cacso - sothu2;
            }else if (phep.equals("*")){
                cacso = cacso * sothu2;
            }else if (phep.equals("/")){
               cacso = cacso / sothu2;
            }
            ketqua = String.valueOf(cacso);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btt0ActionPerformed

    private void bttCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCongActionPerformed
        String phepCong = evt.getActionCommand();
        
        phep = phepCong;

        
        txtMangHinh.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_bttCongActionPerformed

    private void bttBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBangActionPerformed
        if(txtMangHinh.getText().equals("") || ketqua.equals("")){
             return;
        }
        txtMangHinh.setText("" + ketqua);
        kiemtraDauB = true;
           
        // TODO add your handling code here:
    }//GEN-LAST:event_bttBangActionPerformed

    private void bttACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttACActionPerformed
        txtMangHinh.setText("");
        cacso = 0;
        phep = "";
        kiemtraDauB = false;
        // TODO add your handling code here:
    }//GEN-LAST:event_bttACActionPerformed

    private void bttCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCEActionPerformed
//        if(txtMangHinh.getText().charAt(txtMangHinh.getText().length()) == 1){
//            txtMangHinh.setText(txtMangHinh.getText() - "1");
//        }
    txtMangHinh.setText(txtMangHinh.getText().substring(0, txtMangHinh.getText().length()-1));
        // TODO add your handling code here:
    }//GEN-LAST:event_bttCEActionPerformed

    private void bttTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttTruActionPerformed
        String phepTru = evt.getActionCommand();
        
        phep = phepTru;

        
        txtMangHinh.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_bttTruActionPerformed

    private void bttNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNhanActionPerformed
        String phepNhan = evt.getActionCommand();
        
        phep = phepNhan;

        
        txtMangHinh.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_bttNhanActionPerformed

    private void bttChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttChiaActionPerformed
        String phepChia = evt.getActionCommand();
        
        phep = phepChia;
        
        txtMangHinh.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_bttChiaActionPerformed

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
            java.util.logging.Logger.getLogger(Computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Computer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt0;
    private javax.swing.JButton btt1;
    private javax.swing.JButton btt2;
    private javax.swing.JButton btt3;
    private javax.swing.JButton btt4;
    private javax.swing.JButton btt5;
    private javax.swing.JButton btt6;
    private javax.swing.JButton btt7;
    private javax.swing.JButton btt8;
    private javax.swing.JButton btt9;
    private javax.swing.JButton bttAC;
    private javax.swing.JButton bttBang;
    private javax.swing.JButton bttCE;
    private javax.swing.JButton bttChia;
    private javax.swing.JButton bttCong;
    private javax.swing.JButton bttNhan;
    private javax.swing.JButton bttTru;
    private javax.swing.JTextField txtMangHinh;
    // End of variables declaration//GEN-END:variables
}