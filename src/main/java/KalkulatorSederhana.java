/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class KalkulatorSederhana extends javax.swing.JFrame {

    /**
     * Creates new form KalkulatorSederhana
     */
    String angka;
    double jumlah,bil1,bil2;
    int milih;
    public KalkulatorSederhana() {
        initComponents();
        angka="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTN9 = new javax.swing.JButton();
        BTN0 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        HASIL = new javax.swing.JButton();
        TAMBAH = new javax.swing.JButton();
        KURANG = new javax.swing.JButton();
        KALI = new javax.swing.JButton();
        BAGI = new javax.swing.JButton();
        TAMPILAN = new javax.swing.JTextField();
        BTNPERSEN = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        BTN1.setBackground(new java.awt.Color(255, 153, 51));
        BTN1.setForeground(new java.awt.Color(255, 255, 255));
        BTN1.setText("1");
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });

        BTN4.setBackground(new java.awt.Color(255, 153, 51));
        BTN4.setForeground(new java.awt.Color(255, 255, 255));
        BTN4.setText("4");
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });

        BTN7.setBackground(new java.awt.Color(255, 153, 51));
        BTN7.setForeground(new java.awt.Color(255, 255, 255));
        BTN7.setText("7");
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });

        BTN5.setBackground(new java.awt.Color(255, 153, 51));
        BTN5.setForeground(new java.awt.Color(255, 255, 255));
        BTN5.setText("5");
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });

        BTN2.setBackground(new java.awt.Color(255, 153, 51));
        BTN2.setForeground(new java.awt.Color(255, 255, 255));
        BTN2.setText("2");
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });

        BTN8.setBackground(new java.awt.Color(255, 153, 51));
        BTN8.setForeground(new java.awt.Color(255, 255, 255));
        BTN8.setText("8");
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });

        BTN3.setBackground(new java.awt.Color(255, 153, 51));
        BTN3.setForeground(new java.awt.Color(255, 255, 255));
        BTN3.setText("3");
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });

        BTN6.setBackground(new java.awt.Color(255, 153, 51));
        BTN6.setForeground(new java.awt.Color(255, 255, 255));
        BTN6.setText("6");
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });

        BTN9.setBackground(new java.awt.Color(255, 153, 51));
        BTN9.setForeground(new java.awt.Color(255, 255, 255));
        BTN9.setText("9");
        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });

        BTN0.setBackground(new java.awt.Color(255, 153, 51));
        BTN0.setForeground(new java.awt.Color(255, 255, 255));
        BTN0.setText("0");
        BTN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN0ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 153, 51));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText(",");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        CLEAR.setBackground(new java.awt.Color(255, 153, 51));
        CLEAR.setForeground(new java.awt.Color(255, 255, 255));
        CLEAR.setText("C");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        HASIL.setBackground(new java.awt.Color(255, 153, 51));
        HASIL.setForeground(new java.awt.Color(255, 255, 255));
        HASIL.setText("=");
        HASIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HASILActionPerformed(evt);
            }
        });

        TAMBAH.setBackground(new java.awt.Color(255, 153, 51));
        TAMBAH.setForeground(new java.awt.Color(255, 255, 255));
        TAMBAH.setText("+");
        TAMBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAMBAHActionPerformed(evt);
            }
        });

        KURANG.setBackground(new java.awt.Color(255, 153, 51));
        KURANG.setForeground(new java.awt.Color(255, 255, 255));
        KURANG.setText("-");
        KURANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KURANGActionPerformed(evt);
            }
        });

        KALI.setBackground(new java.awt.Color(255, 153, 51));
        KALI.setForeground(new java.awt.Color(255, 255, 255));
        KALI.setText("X");
        KALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KALIActionPerformed(evt);
            }
        });

        BAGI.setBackground(new java.awt.Color(255, 153, 51));
        BAGI.setForeground(new java.awt.Color(255, 255, 255));
        BAGI.setText("/");
        BAGI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAGIActionPerformed(evt);
            }
        });

        TAMPILAN.setBackground(new java.awt.Color(0, 0, 0));
        TAMPILAN.setForeground(new java.awt.Color(255, 255, 255));

        BTNPERSEN.setBackground(new java.awt.Color(255, 153, 51));
        BTNPERSEN.setForeground(new java.awt.Color(255, 255, 255));
        BTNPERSEN.setText("%");
        BTNPERSEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNPERSENActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TAMPILAN, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN0, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BTN6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTNPERSEN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KALI, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(BAGI, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(KURANG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TAMBAH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HASIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TAMPILAN, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CLEAR, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(BAGI, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(BTNPERSEN, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTN9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KALI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BTN4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(BTN5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KURANG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BTN2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(BTN3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TAMBAH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HASIL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN0ActionPerformed
        angka += "0";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN0ActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        angka += "1";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        angka += "2";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        angka += "3";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        angka += "4";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        angka += "5";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        angka += "6";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        angka += "7";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        angka += "8";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
        angka += "9";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_BTN9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        angka += ".";
        TAMPILAN.setText(angka);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        TAMPILAN.setText("");
        angka="";
        bil1=0;
        bil2=0;
    }//GEN-LAST:event_CLEARActionPerformed

    private void TAMBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAMBAHActionPerformed
       bil1=Double.parseDouble(angka);
        TAMPILAN.setText("+");
        angka="";
        milih=1;
    }//GEN-LAST:event_TAMBAHActionPerformed

    private void KURANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KURANGActionPerformed
        bil1=Double.parseDouble(angka);
        TAMPILAN.setText("-");
        angka="";
        milih=2;
    }//GEN-LAST:event_KURANGActionPerformed

    private void KALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KALIActionPerformed
        bil1=Double.parseDouble(angka);
        TAMPILAN.setText("x");
        angka="";
        milih=3;
    }//GEN-LAST:event_KALIActionPerformed

    private void BAGIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAGIActionPerformed
        bil1=Double.parseDouble(angka);
        TAMPILAN.setText("/");
        angka="";
        milih=4;
    }//GEN-LAST:event_BAGIActionPerformed

    private void HASILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HASILActionPerformed
        switch(milih){
            case 1:
                bil2=Double.parseDouble(angka);
                jumlah=bil1+bil2;
                angka=Double.toString(jumlah);
                TAMPILAN.setText(angka);
                break;
            case 2:
                bil2=Double.parseDouble(angka);
                jumlah=bil1-bil2;
                angka=Double.toString(jumlah);
                TAMPILAN.setText(angka);
                break;
            case 3:
                bil2=Double.parseDouble(angka);
                jumlah=bil1*bil2;
                angka=Double.toString(jumlah);
                TAMPILAN.setText(angka);
                break;
            case 4:
                bil2=Double.parseDouble(angka);
                jumlah=bil1/bil2;
                angka=Double.toString(jumlah);
                TAMPILAN.setText(angka);
                break; 
            case 5:
                bil2=Double.parseDouble(angka);
                jumlah= bil1%bil2;
                angka= Double.toString(jumlah);
                TAMPILAN.setText(angka);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_HASILActionPerformed

    private void BTNPERSENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNPERSENActionPerformed
        bil1=Double.parseDouble(angka);
        TAMPILAN.setText("%");
        angka="";
        milih=5;
    }//GEN-LAST:event_BTNPERSENActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorSederhana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAGI;
    private javax.swing.JButton BTN0;
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTN9;
    private javax.swing.JButton BTNPERSEN;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton HASIL;
    private javax.swing.JButton KALI;
    private javax.swing.JButton KURANG;
    private javax.swing.JButton TAMBAH;
    private javax.swing.JTextField TAMPILAN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
