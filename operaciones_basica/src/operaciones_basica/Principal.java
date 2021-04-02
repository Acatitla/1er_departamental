
package operaciones_basica;

public class Principal extends javax.swing.JFrame {
    
    Operaciones operar = new Operaciones();
    double num1;
    double num2;
    
    public Principal() {
        initComponents();
    }
    
    public void entrada(){
        num1 = Double.parseDouble(campo1.getText());
        num2 = Double.parseDouble(campo2.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        campo2 = new javax.swing.JTextField();
        ButtonSum = new javax.swing.JButton();
        ButtonMult = new javax.swing.JButton();
        ButtonDiv = new javax.swing.JButton();
        ButtonRes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Operaciones Basicas");

        jLabel2.setText("Primer Numero:");

        jLabel3.setText("Segundo Numero:");

        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });

        campo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo2ActionPerformed(evt);
            }
        });

        ButtonSum.setText("+");
        ButtonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSumActionPerformed(evt);
            }
        });

        ButtonMult.setText("x");
        ButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultActionPerformed(evt);
            }
        });

        ButtonDiv.setText("/");
        ButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDivActionPerformed(evt);
            }
        });

        ButtonRes.setText("-");
        ButtonRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(192, 192, 192));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Resultado: ");

        Resultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Resultado.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 21, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campo2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonMult)
                        .addGap(6, 6, 6))
                    .addComponent(ButtonSum, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonRes)
                    .addComponent(ButtonDiv))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSum)
                    .addComponent(ButtonRes))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMult)
                    .addComponent(ButtonDiv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultActionPerformed
        entrada();
        operar.calmultipl(num1, num2);
        Resultado.setText(String.valueOf(operar.result)); 
        campo1.requestFocus();
        campo1.selectAll();
        
    }//GEN-LAST:event_ButtonMultActionPerformed

    private void campo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo2ActionPerformed

    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo1ActionPerformed

    private void ButtonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSumActionPerformed
    entrada();
    operar.calsuma(num1, num2);
    Resultado.setText(String.valueOf(operar.result));
    campo1.requestFocus();
    campo1.selectAll();
    }//GEN-LAST:event_ButtonSumActionPerformed

    private void ButtonResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResActionPerformed
    entrada();     
        operar.calresta(num1, num2);
        Resultado.setText(String.valueOf(operar.result));
        campo1.requestFocus();
        campo1.selectAll();
    }//GEN-LAST:event_ButtonResActionPerformed

    private void ButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDivActionPerformed
    entrada();
        operar.caldiv(num1, num2);
        Resultado.setText(String.valueOf(operar.result));
        campo1.requestFocus();
        campo1.selectAll();
    }//GEN-LAST:event_ButtonDivActionPerformed

 
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDiv;
    private javax.swing.JButton ButtonMult;
    private javax.swing.JButton ButtonRes;
    private javax.swing.JButton ButtonSum;
    private javax.swing.JLabel Resultado;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
