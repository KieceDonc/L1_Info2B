/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.awt.Color;

/**
 *
 * @author vv224843
 */
public class LesChiffres extends javax.swing.JFrame {
    

    /**
     * Creates new form LesChiffres
     */
    public LesChiffres() {
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

        jPanelNorth = new javax.swing.JPanel();
        Message_North = new javax.swing.JTextField();
        jPanelCenter = new javax.swing.JPanel();
        Message = new javax.swing.JTextField();
        jPanelEast = new javax.swing.JPanel();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanelWest = new javax.swing.JPanel();
        jButtonRed = new javax.swing.JButton();
        jButtonYellow = new javax.swing.JButton();
        jButtonGreen = new javax.swing.JButton();
        jButtonOrange = new javax.swing.JButton();
        jButtonBlue = new javax.swing.JButton();
        jPanelSouth = new javax.swing.JPanel();
        jTextFieldFontSize = new javax.swing.JTextField();
        jButtonFT14 = new javax.swing.JButton();
        jButtonFT24 = new javax.swing.JButton();
        jButtonFT36 = new javax.swing.JButton();
        jButtonCBC = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Message_North.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Message_North.setText("Apprenez à écrire les chiffres !");
        jPanelNorth.add(Message_North);

        getContentPane().add(jPanelNorth, java.awt.BorderLayout.NORTH);

        jPanelCenter.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jPanelCenter.setLayout(new java.awt.GridLayout(1, 0));

        Message.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Message.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Message.setText("Cliquez sur un bouton ! ");
        Message.setOpaque(false);
        jPanelCenter.add(Message);

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        jPanelEast.setLayout(new java.awt.GridLayout(10, 0));

        jButton0.setText("0");
        jButton0.setActionCommand("jButton0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton0);

        jButton1.setText("1");
        jButton1.setActionCommand("jButton0");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton1);

        jButton2.setText("2");
        jButton2.setActionCommand("jButton0");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton2);

        jButton3.setText("3");
        jButton3.setActionCommand("jButton0");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton3);

        jButton4.setText("4");
        jButton4.setActionCommand("jButton0");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton4);

        jButton5.setText("5");
        jButton5.setActionCommand("jButton0");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton5);

        jButton6.setText("6");
        jButton6.setActionCommand("jButton0");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton6);

        jButton7.setText("7");
        jButton7.setActionCommand("jButton0");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton7);

        jButton8.setText("8");
        jButton8.setActionCommand("jButton0");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton8);

        jButton9.setText("9");
        jButton9.setActionCommand("jButton0");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelEast.add(jButton9);

        getContentPane().add(jPanelEast, java.awt.BorderLayout.EAST);

        jPanelWest.setLayout(new java.awt.GridLayout(5, 0));

        jButtonRed.setText("Red");
        jButtonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedActionPerformed(evt);
            }
        });
        jPanelWest.add(jButtonRed);

        jButtonYellow.setText("Jaune");
        jButtonYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYellowActionPerformed(evt);
            }
        });
        jPanelWest.add(jButtonYellow);

        jButtonGreen.setText("Green");
        jButtonGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGreenActionPerformed(evt);
            }
        });
        jPanelWest.add(jButtonGreen);

        jButtonOrange.setText("Orange");
        jButtonOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrangeActionPerformed(evt);
            }
        });
        jPanelWest.add(jButtonOrange);

        jButtonBlue.setText("Blue");
        jButtonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlueActionPerformed(evt);
            }
        });
        jPanelWest.add(jButtonBlue);

        getContentPane().add(jPanelWest, java.awt.BorderLayout.WEST);

        jTextFieldFontSize.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldFontSize.setText("font size :");
        jTextFieldFontSize.setToolTipText("");
        jPanelSouth.add(jTextFieldFontSize);

        jButtonFT14.setText("14");
        jButtonFT14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFT14ActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonFT14);

        jButtonFT24.setText("24");
        jButtonFT24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFT24ActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonFT24);

        jButtonFT36.setText("36");
        jButtonFT36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFT36ActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonFT36);

        jButtonCBC.setText("change background color");
        jButtonCBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCBCActionPerformed(evt);
            }
        });
        jPanelSouth.add(jButtonCBC);

        getContentPane().add(jPanelSouth, java.awt.BorderLayout.SOUTH);

        jMenu1.setText("LesChiffres");

        jMenuItem1.setText("Quitter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        modifyMessage("zero",Color.green);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modifyMessage("one",Color.blue);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modifyMessage("two",Color.red);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modifyMessage("three",Color.white);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        modifyMessage("four",Color.orange);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        modifyMessage("five",Color.gray);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        modifyMessage("six",Color.pink);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        modifyMessage("seven",Color.MAGENTA);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        modifyMessage("eight",Color.CYAN);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        modifyMessage("nine",Color.yellow);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedActionPerformed
        Message.setForeground(Color.red);  // changement de la couleur d’écriture
    }//GEN-LAST:event_jButtonRedActionPerformed

    private void jButtonYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYellowActionPerformed
        Message.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jButtonYellowActionPerformed

    private void jButtonGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGreenActionPerformed
        Message.setForeground(Color.GREEN);
    }//GEN-LAST:event_jButtonGreenActionPerformed

    private void jButtonOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrangeActionPerformed
        Message.setForeground(Color.ORANGE);
    }//GEN-LAST:event_jButtonOrangeActionPerformed

    private void jButtonBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlueActionPerformed
        Message.setForeground(Color.BLUE);
    }//GEN-LAST:event_jButtonBlueActionPerformed

    private void jButtonFT14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFT14ActionPerformed
        Message.setFont(new java.awt.Font("Tahoma", 0, 14));
    }//GEN-LAST:event_jButtonFT14ActionPerformed

    private void jButtonFT24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFT24ActionPerformed
        Message.setFont(new java.awt.Font("Tahoma", 0, 24));
    }//GEN-LAST:event_jButtonFT24ActionPerformed

    private void jButtonFT36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFT36ActionPerformed
        Message.setFont(new java.awt.Font("Tahoma", 0, 36));
    }//GEN-LAST:event_jButtonFT36ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonCBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCBCActionPerformed
        jPanelCenter.setBackground(Color.black);
    }//GEN-LAST:event_jButtonCBCActionPerformed

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
            java.util.logging.Logger.getLogger(LesChiffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LesChiffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LesChiffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LesChiffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Message;
    private javax.swing.JTextField Message_North;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonBlue;
    private javax.swing.JButton jButtonCBC;
    private javax.swing.JButton jButtonFT14;
    private javax.swing.JButton jButtonFT24;
    private javax.swing.JButton jButtonFT36;
    private javax.swing.JButton jButtonGreen;
    private javax.swing.JButton jButtonOrange;
    private javax.swing.JButton jButtonRed;
    private javax.swing.JButton jButtonYellow;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelEast;
    private javax.swing.JPanel jPanelNorth;
    private javax.swing.JPanel jPanelSouth;
    private javax.swing.JPanel jPanelWest;
    private javax.swing.JTextField jTextFieldFontSize;
    // End of variables declaration//GEN-END:variables

    private void modifyMessage(String message,Color color){
        Message.setText(message);   // changement du texte à afficher
    }

}