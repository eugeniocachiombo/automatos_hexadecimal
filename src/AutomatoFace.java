
import java.awt.Color;
import javax.swing.JOptionPane;

public class AutomatoFace extends javax.swing.JFrame {

    public AutomatoFace() {
        initComponents();
        /* jTextPane1.setVisible(false);
         jLabel3.setVisible(false);*/
        jLabel3.setText("  ");
    }

    public void automato(String valor) {
        /*TEMOS:
         estado
         valor
         simbolo
         ALFABETO É (0, 1)
         */

        int estado = 0; //Estado Inicial
        Boolean erro = false;
        char[] simbolo = valor.toCharArray();

        jTextPane1.setVisible(true);
        jLabel3.setVisible(true);
        jTextPane1.setText("Estado inicial: q" + estado + " \nEstado Final: q1 ou q4 \n----------------------------------------");

        for (int i = 0; i < valor.length() && erro == false; i++) {

            switch (estado) {

                //ESTADO 0
                case 0:
                    this.verificarEstado0(simbolo[i], estado, erro);
                    break;
               //FIM ESTADO 0

                //ESTADO 1
                case 1:
                    if (simbolo[i] == '0' || simbolo[i] == '1' || simbolo[i] == '2'
                            || simbolo[i] == '3' || simbolo[i] == '4' || simbolo[i] == '5'
                            || simbolo[i] == '6' || simbolo[i] == '7' || simbolo[i] == '8'
                            || simbolo[i] == '9' || simbolo[i] == 'A' || simbolo[i] == 'B'
                            || simbolo[i] == 'C' || simbolo[i] == 'D' || simbolo[i] == 'E'
                            || simbolo[i] == 'F') {
                        estado = 1;
                        jTextPane1.setText(jTextPane1.getText() + "\nEstado actual: q" + estado + "");
                        jTextPane1.setText(jTextPane1.getText() + "\n***************************");
                    } else if (simbolo[i] == 'G' || simbolo[i] == 'H' || simbolo[i] == 'I'
                            || simbolo[i] == 'J' || simbolo[i] == 'K' || simbolo[i] == 'L'
                            || simbolo[i] == 'M' || simbolo[i] == 'N' || simbolo[i] == 'O'
                            || simbolo[i] == 'P' || simbolo[i] == 'K' || simbolo[i] == 'R'
                            || simbolo[i] == 'S' || simbolo[i] == 'T' || simbolo[i] == 'U'
                            || simbolo[i] == 'V' || simbolo[i] == 'W' || simbolo[i] == 'X'
                            || simbolo[i] == 'Y' || simbolo[i] == 'Z') {
                        estado = 2;
                        jTextPane1.setText(jTextPane1.getText() + "\nEstado actual: q" + estado + "");
                        jTextPane1.setText(jTextPane1.getText() + "\n***************************");

                    } else if (simbolo[i] == '.') {
                        estado = 3;
                        jTextPane1.setText(jTextPane1.getText() + "\nEstado actual: q" + estado + "");
                        jTextPane1.setText(jTextPane1.getText() + "\n***************************");
                    } else {
                        erro = true;
                        jLabel3.setText("\nO Simbolo '" + simbolo[i] + "' não pertence ao alfabeto Hexadecimal");
                        jLabel3.setBackground(Color.red);
                    }
                    break;
               //FIM ESTADO 1

                //ESTADO 3
                case 3:
                    if (simbolo[i] == '0' || simbolo[i] == '1' || simbolo[i] == '2'
                            || simbolo[i] == '3' || simbolo[i] == '4' || simbolo[i] == '5'
                            || simbolo[i] == '6' || simbolo[i] == '7' || simbolo[i] == '8'
                            || simbolo[i] == '9' || simbolo[i] == 'A' || simbolo[i] == 'B'
                            || simbolo[i] == 'C' || simbolo[i] == 'D' || simbolo[i] == 'E'
                            || simbolo[i] == 'F') {

                        estado = 4;
                        jTextPane1.setText(jTextPane1.getText() + "\nEstado actual: q" + estado + "");
                        jTextPane1.setText(jTextPane1.getText() + "\n***************************");
                    } else {
                        erro = true;
                        jLabel3.setText("O Simbolo '" + simbolo[i] + "' não pertence ao alfabeto Hexadecimal");
                        jLabel3.setBackground(Color.red);
                    }
                    break;
               //FIM ESTADO 3

                //ESTADO 4
                case 4:
                    if (simbolo[i] == '0' || simbolo[i] == '1' || simbolo[i] == '2'
                            || simbolo[i] == '3' || simbolo[i] == '4' || simbolo[i] == '5'
                            || simbolo[i] == '6' || simbolo[i] == '7' || simbolo[i] == '8'
                            || simbolo[i] == '9' || simbolo[i] == 'A' || simbolo[i] == 'B'
                            || simbolo[i] == 'C' || simbolo[i] == 'D' || simbolo[i] == 'E'
                            || simbolo[i] == 'F') {

                        estado = 4;
                        jTextPane1.setText(jTextPane1.getText() + "\nEstado actual: q" + estado + "");
                        jTextPane1.setText(jTextPane1.getText() + "\n***************************");
                    } else if (simbolo[i] == '.') {
                        erro = true;
                        // System.out.println("O Simbolo '" + simbolo[i] +"' não pertence ao alfabeto");
                        jLabel3.setText("O Simbolo '" + simbolo[i] + "' não pode ser repetido");
                        jLabel3.setBackground(Color.white);
                    } else {
                        erro = true;
                        jLabel3.setText("O Simbolo '" + simbolo[i] + "' não pertence ao alfabeto Hexadecimal");
                        jLabel3.setBackground(Color.white);
                    }
                    break;
                //FIM ESTADO 4
            }//FIM Switch
        } //FIM for

        this.apresentarResultadoFinal(estado, erro);
    }

    public void verificarEstado0(char simbolo, int estado, boolean erro) {
        if (simbolo == '0' || simbolo == '1' || simbolo == '2'
                || simbolo == '3' || simbolo == '4' || simbolo == '5'
                || simbolo == '6' || simbolo == '7' || simbolo == '8'
                || simbolo == '9' || simbolo == 'A' || simbolo == 'B'
                || simbolo == 'C' || simbolo == 'D' || simbolo == 'E'
                || simbolo == 'F') {
            estado = 1;
            jTextPane1.setText(jTextPane1.getText() + "\nEstado actual: q" + estado + "");
            jTextPane1.setText(jTextPane1.getText() + "\n***************************");
        } else if (simbolo == 'G' || simbolo == 'H' || simbolo == 'I'
                || simbolo == 'J' || simbolo == 'K' || simbolo == 'L'
                || simbolo == 'M' || simbolo == 'N' || simbolo == 'O'
                || simbolo == 'P' || simbolo == 'K' || simbolo == 'R'
                || simbolo == 'S' || simbolo == 'T' || simbolo == 'U'
                || simbolo == 'V' || simbolo == 'W' || simbolo == 'X'
                || simbolo == 'Y' || simbolo == 'Z'
                || simbolo == '.') {
            estado = 2;
            jTextPane1.setText(jTextPane1.getText() + "\nEstado actual: q" + estado + "");
            jTextPane1.setText(jTextPane1.getText() + "\n***************************");
        } else {
            erro = true;
            jLabel3.setText("\nO Simbolo '" + simbolo + "' não pertence ao alfabeto Hexadecimal");
            jLabel3.setBackground(Color.red);
        }
    }

    public void apresentarResultadoFinal(int estado, boolean erro) {
        if (erro == true) {

        } else if (estado == 1 || estado == 4 && erro == false) {
            jTextPane1.setText(jTextPane1.getText() + "\nEstado Final: q" + estado + "");
            jTextPane1.setText(jTextPane1.getText() + "\n***************************");
            jLabel3.setText("Valor aceite");
        } else {
            jTextPane1.setText(jTextPane1.getText() + "\nEstado Final: q" + estado + "");
            jTextPane1.setText(jTextPane1.getText() + "\n***************************");
            jLabel3.setText("Não é Hexadecimal");
            jTextPane1.setText(jTextPane1.getText() + "\nEstado Final diferente de q1 e q4");
            jLabel3.setBackground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JEditorPane();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador Hexadecimal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mensagem:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Detalhes:");

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 298, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 204, 0));
        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite um valor Hexadecimal:");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 0));
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String valor = jTextField1.getText();

        if ("".equals(valor)) {
            JOptionPane.showMessageDialog(null, "Impossível validar, Digite um valor");
        } else {
            automato(valor);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextPane1.setText("");
        jLabel3.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AutomatoFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutomatoFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutomatoFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutomatoFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutomatoFace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JEditorPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
