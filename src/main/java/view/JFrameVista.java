/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Ridikc
 */
public class JFrameVista extends javax.swing.JFrame {

    /**
     * Creates new form JFrameVista
     */
    public JFrameVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        instruccion = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        consulta2 = new javax.swing.JButton();
        consulta1 = new javax.swing.JButton();
        consulta3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bungee Inline", 0, 36)); // NOI18N
        jLabel1.setText("Proyecto Constructora");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 50));

        instruccion.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        instruccion.setText("Precione click en la consulta deseada para ver la tabla de datos requerida");
        jPanel1.add(instruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 500, -1));

        salir.setBackground(new java.awt.Color(255, 51, 51));
        salir.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 80, 30));

        consulta2.setBackground(new java.awt.Color(255, 0, 255));
        consulta2.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        consulta2.setText("Consulta 2");
        consulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta2ActionPerformed(evt);
            }
        });
        jPanel1.add(consulta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 152, 62));

        consulta1.setBackground(new java.awt.Color(51, 51, 255));
        consulta1.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        consulta1.setText("Consulta 1");
        consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta1ActionPerformed(evt);
            }
        });
        jPanel1.add(consulta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 152, 62));

        consulta3.setBackground(new java.awt.Color(255, 102, 0));
        consulta3.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        consulta3.setText("Consulta 3");
        consulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta3ActionPerformed(evt);
            }
        });
        jPanel1.add(consulta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 152, 62));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Escritorio))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta1ActionPerformed
        Tabla1 tabla1=new Tabla1();
        Escritorio.add(tabla1);
        tabla1.show();
    }//GEN-LAST:event_consulta1ActionPerformed

    private void consulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta3ActionPerformed
        Tabla3 tabla3=new Tabla3();
        Escritorio.add(tabla3);
        tabla3.show();
    }//GEN-LAST:event_consulta3ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void consulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta2ActionPerformed
        Tabla2 tabla2=new Tabla2();
        Escritorio.add(tabla2);
        tabla2.show();
    }//GEN-LAST:event_consulta2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton consulta1;
    private javax.swing.JButton consulta2;
    private javax.swing.JButton consulta3;
    private javax.swing.JLabel instruccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration
}
