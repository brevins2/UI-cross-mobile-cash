/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utransfer.MTN;

import javax.swing.JOptionPane;

/**
 *
 * @author brevin
 */
public class MBS extends javax.swing.JFrame {

    /**
     * Creates new form MBS
     */
    public MBS() {
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

        MBS30 = new javax.swing.JButton();
        MBS80 = new javax.swing.JButton();
        MBS180 = new javax.swing.JButton();
        MBS400 = new javax.swing.JButton();
        GB1 = new javax.swing.JButton();
        MBS500 = new javax.swing.JButton();
        GB5 = new javax.swing.JButton();
        GB20 = new javax.swing.JButton();
        GB117 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        MainManu = new javax.swing.JMenuBar();
        daily = new javax.swing.JMenu();
        weekly = new javax.swing.JMenu();
        monthly = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome to Mobile Internet Bundles");

        MBS30.setText("30 MBS");
        MBS30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBS30ActionPerformed(evt);
            }
        });

        MBS80.setText("80 MBS");
        MBS80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBS80ActionPerformed(evt);
            }
        });

        MBS180.setText("180MBS");
        MBS180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBS180ActionPerformed(evt);
            }
        });

        MBS400.setText("400 MBS");
        MBS400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBS400ActionPerformed(evt);
            }
        });

        GB1.setText("1 GB -3days");
        GB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GB1ActionPerformed(evt);
            }
        });

        MBS500.setText("500 MBS-1hr");
        MBS500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBS500ActionPerformed(evt);
            }
        });

        GB5.setText("5 GB -week");
        GB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GB5ActionPerformed(evt);
            }
        });

        GB20.setText("20 GB- Monthly");
        GB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GB20ActionPerformed(evt);
            }
        });

        GB117.setText("1.17 GB -Monthly");
        GB117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GB117ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 51, 0));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setText("Cancel");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        daily.setText("Daily");
        MainManu.add(daily);

        weekly.setText("Weekly");
        MainManu.add(weekly);

        monthly.setText("Monthly");
        MainManu.add(monthly);

        setJMenuBar(MainManu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GB117)
                        .addGap(18, 18, 18)
                        .addComponent(GB20, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(MBS400, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(GB1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(MBS500, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(MBS30, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MBS80, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MBS180, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(GB5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(45, 45, 45))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MBS30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MBS80, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MBS180, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MBS400, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GB1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MBS500, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(GB5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GB117, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GB20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void MBS30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBS30ActionPerformed
        
        int balance = 7000;
        int price = 250;
        
        if(price>balance){
            JOptionPane.showMessageDialog(null, "insuffiecient amount, reload anf try again later");
            System.exit(0);
        }
        else{
        balance -= price;
            JOptionPane.showMessageDialog(null, "You have bought 30MBS at 250SHS your balance is "+ balance);
            System.out.print("You have bought 30MBS at 250SHS your balance is "+ balance);
        }
    }//GEN-LAST:event_MBS30ActionPerformed

    private void MBS80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBS80ActionPerformed
        
        int balance = 7000;
        int price = 500;
        
        if(price>balance){
            JOptionPane.showMessageDialog(null, "insuffiecient amount, reload anf try again later");
            System.exit(0);
        }
        else{
        balance -= price;
            JOptionPane.showMessageDialog(null, "You have bought 80MBS at 500SHS your balance is "+ balance);
            System.out.print("You have bought 80MBS at 500SHS your balance is "+ balance);
        }
    }//GEN-LAST:event_MBS80ActionPerformed

    private void MBS180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBS180ActionPerformed
        
        int balance = 7000;
        int price = 1000;
        
        if(price>balance){
            JOptionPane.showMessageDialog(null, "insuffiecient amount, reload anf try again later");
            System.exit(0);
        }
        else{
        balance -= price;
            JOptionPane.showMessageDialog(null, "You have bought 180MBS at 1000SHS your balance is "+ balance);
            System.out.print("You have bought 180MBS at 1000SHS your balance is "+ balance);
        }
    }//GEN-LAST:event_MBS180ActionPerformed

    private void MBS400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBS400ActionPerformed
        
        int balance = 7000;
        int price = 2000;
        
        if(price>balance){
            JOptionPane.showMessageDialog(null, "insuffiecient amount, reload anf try again later");
            System.exit(0);
        }
        else{
        balance -= price;
            JOptionPane.showMessageDialog(null, "You have bought 400MBS at 2000SHS your balance is "+ balance);
            System.out.print("You have bought 400MBS at 2000SHS your balance is "+ balance);
        }
    }//GEN-LAST:event_MBS400ActionPerformed

    private void GB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GB1ActionPerformed
        
        int balance = 7000;
        int price = 5000;
        
        if(price>balance){
            JOptionPane.showMessageDialog(null, "insuffiecient amount, reload anf try again later");
            System.exit(0);
        }
        else{
        balance -= price;
            JOptionPane.showMessageDialog(null, "You have bought 1GB at 5000SHS your balance is "+ balance);
            System.out.print("You have bought 1GB at 5000SHS your balance is "+ balance);
        }
    }//GEN-LAST:event_GB1ActionPerformed

    private void MBS500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBS500ActionPerformed
        
        int balance = 7000;
        int price = 3000;
        
        if(price>balance){
            JOptionPane.showMessageDialog(null, "insuffiecient amount, reload anf try again later");
            System.exit(0);
        }
        else{
        balance -= price;
            JOptionPane.showMessageDialog(null, "You have bought 500MBS at 3000SHS your balance is "+ balance);
            System.out.print("You have bought 500MBS at 3000SHS your balance is "+ balance);
        }
    }//GEN-LAST:event_MBS500ActionPerformed

    private void GB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GB5ActionPerformed
        
        int balance = 7000;
        int price = 6500;
        
        if(price>balance){
            JOptionPane.showMessageDialog(null, "insuffiecient amount, reload anf try again later");
            System.exit(0);
        }
        else{
        balance -= price;
            JOptionPane.showMessageDialog(null, "You have bought 5GB at 6500SHS your balance is "+ balance);
            System.out.print("You have bought 5GB at 6500SHS your balance is "+ balance);
        }
    }//GEN-LAST:event_GB5ActionPerformed

    private void GB117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GB117ActionPerformed
        
        int balance = 7000;
        int price = 7000;
        
        if(price>balance){
            JOptionPane.showMessageDialog(null, "insuffiecient amount, reload anf try again later");
            System.exit(0);
        }
        else{
        balance -= price;
            JOptionPane.showMessageDialog(null, "You have bought 1.17GB at 7000SHS your balance is "+ balance);
            System.out.print("You have bought 1.17GB at 7000SHS your balance is "+ balance);
        }
    }//GEN-LAST:event_GB117ActionPerformed

    private void GB20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GB20ActionPerformed
        
        int balance = 7000;
        int price = 50000;
        
        if(price>balance){
            JOptionPane.showMessageDialog(null, "insuffiecient amount, reload anf try again later");
            System.exit(0);
        }
        else{
            balance -= price;
            JOptionPane.showMessageDialog(null, "You have bought 20GB at 50000SHS your balance is "+ balance);
            System.out.print("You have bought 20GB at 50000SHS your balance is "+ balance);
        }
    }//GEN-LAST:event_GB20ActionPerformed

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
            java.util.logging.Logger.getLogger(MBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MBS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MBS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GB1;
    private javax.swing.JButton GB117;
    private javax.swing.JButton GB20;
    private javax.swing.JButton GB5;
    private javax.swing.JButton MBS180;
    private javax.swing.JButton MBS30;
    private javax.swing.JButton MBS400;
    private javax.swing.JButton MBS500;
    private javax.swing.JButton MBS80;
    private javax.swing.JMenuBar MainManu;
    private javax.swing.JMenu daily;
    private javax.swing.JButton jButton11;
    private javax.swing.JMenu monthly;
    private javax.swing.JMenu weekly;
    // End of variables declaration//GEN-END:variables
}
