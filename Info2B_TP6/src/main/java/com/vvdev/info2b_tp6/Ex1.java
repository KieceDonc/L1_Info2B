/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vvdev.info2b_tp6;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Valentin
 */
public class Ex1 extends javax.swing.JFrame {
    
    private Bille bille1 = new Bille(0,0,25,25,Color.RED);;
    private Bille bille2 = new Bille(50,50,50,50,Color.BLUE);;
    
    private String bille1S = "Bille 1";
    private String bille2S = "Bille 2";
    
    private int currentBille = 1;
    /**
     * Creates new form Ex1
     */
    public Ex1() {
        initComponents();
        jButtonBille.setForeground(Color.RED);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g = jPanelDraw.getGraphics();
        bille1.drawBille(g);
        bille2.drawBille(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonHaut = new javax.swing.JButton();
        jButtonGauche = new javax.swing.JButton();
        jButtonDroite = new javax.swing.JButton();
        jButtonBas = new javax.swing.JButton();
        jButtonBille = new javax.swing.JButton();
        jPanelDraw = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Déplace les billes en cliquant dans le panneau ou avec les boutons !");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(5, 0));

        jButtonHaut.setText("Haut");
        jButtonHaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHautActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonHaut);

        jButtonGauche.setText("Gauche");
        jButtonGauche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGaucheActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGauche);

        jButtonDroite.setText("Droite");
        jButtonDroite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDroiteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDroite);

        jButtonBas.setText("Bas");
        jButtonBas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBasActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBas);

        jButtonBille.setText("Bille 1");
        jButtonBille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBilleActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBille);

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        jPanelDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDrawMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelDrawLayout = new javax.swing.GroupLayout(jPanelDraw);
        jPanelDraw.setLayout(jPanelDrawLayout);
        jPanelDrawLayout.setHorizontalGroup(
            jPanelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelDrawLayout.setVerticalGroup(
            jPanelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelDraw, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBilleActionPerformed
        String currentText = jButtonBille.getText();
        if(currentText.equals(bille1S)){
            currentBille = 2;
            jButtonBille.setText(bille2S);
            jButtonBille.setForeground(Color.BLUE);
        }else{
            currentBille = 1;
            jButtonBille.setText(bille1S);
            jButtonBille.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jButtonBilleActionPerformed

    private void jButtonHautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHautActionPerformed
        if(currentBille==1){
            bille1.moveY(-10);
        }else{
            bille2.moveY(-10);
        }
        this.repaint();
    }//GEN-LAST:event_jButtonHautActionPerformed

    private void jButtonGaucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGaucheActionPerformed
        if(currentBille==1){
            bille1.moveX(-10);
        }else{
            bille2.moveX(-10);
        }
        this.repaint();
    }//GEN-LAST:event_jButtonGaucheActionPerformed

    private void jButtonDroiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDroiteActionPerformed
        if(currentBille==1){
            bille1.moveX(10);
        }else{
            bille2.moveX(10);
        }
        this.repaint();
    }//GEN-LAST:event_jButtonDroiteActionPerformed

    private void jButtonBasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBasActionPerformed
        if(currentBille==1){
            bille1.moveY(10);
        }else{
            bille2.moveY(10);
        }
        this.repaint();
    }//GEN-LAST:event_jButtonBasActionPerformed

    private void jPanelDrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDrawMouseClicked
        int toSetX = evt.getX();
        int toSetY = evt.getY();
        if(currentBille==1){
            toSetX-=bille1.getWidth()/2;
            toSetY-=bille1.getHeight()/2;
            bille1.setX(toSetX);
            bille1.setY(toSetY);
        }else{
            toSetX-=bille2.getWidth()/2;
            toSetY-=bille2.getHeight()/2;
            bille2.setX(toSetX);
            bille2.setY(toSetY);
        }
        this.repaint();
    }//GEN-LAST:event_jPanelDrawMouseClicked

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
            java.util.logging.Logger.getLogger(Ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBas;
    private javax.swing.JButton jButtonBille;
    private javax.swing.JButton jButtonDroite;
    private javax.swing.JButton jButtonGauche;
    private javax.swing.JButton jButtonHaut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDraw;
    // End of variables declaration//GEN-END:variables
}