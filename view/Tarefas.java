package view;

public class Tarefas extends javax.swing.JFrame {

    public Tarefas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        gestaoM = new javax.swing.JMenu();
        atendimentoB = new javax.swing.JMenuItem();
        clientesB = new javax.swing.JMenuItem();
        atividadesM = new javax.swing.JMenu();
        calendarioB = new javax.swing.JMenuItem();
        tarefasB = new javax.swing.JMenuItem();
        processosM = new javax.swing.JMenu();
        financeiroM = new javax.swing.JMenu();
        Documentos = new javax.swing.JMenu();
        arquivosB = new javax.swing.JMenuItem();
        modelosB = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu6.setText("Inicio");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        gestaoM.setText("Gestão");

        atendimentoB.setText("Atendimento");
        atendimentoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atendimentoBActionPerformed(evt);
            }
        });
        gestaoM.add(atendimentoB);

        clientesB.setText("Clientes");
        clientesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesBActionPerformed(evt);
            }
        });
        gestaoM.add(clientesB);

        jMenuBar1.add(gestaoM);

        atividadesM.setText("Atividades");

        calendarioB.setText("Calendario");
        calendarioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarioBActionPerformed(evt);
            }
        });
        atividadesM.add(calendarioB);

        tarefasB.setText("Painel de Tarefas");
        tarefasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarefasBActionPerformed(evt);
            }
        });
        atividadesM.add(tarefasB);

        jMenuBar1.add(atividadesM);

        processosM.setText("Processos");
        jMenuBar1.add(processosM);

        financeiroM.setText("Financeiro");
        jMenuBar1.add(financeiroM);

        Documentos.setText("Documentos");

        arquivosB.setText("Arquivos");
        arquivosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivosBActionPerformed(evt);
            }
        });
        Documentos.add(arquivosB);

        modelosB.setText("Modelos");
        modelosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelosBActionPerformed(evt);
            }
        });
        Documentos.add(modelosB);

        jMenuBar1.add(Documentos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void atendimentoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atendimentoBActionPerformed
        Atendimento atendimento = new Atendimento();
        atendimento.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_atendimentoBActionPerformed

    private void clientesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesBActionPerformed
        Clientes clientes = new Clientes();
        clientes.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_clientesBActionPerformed

    private void calendarioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarioBActionPerformed
        Calendario calendario = new Calendario();
        calendario.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_calendarioBActionPerformed

    private void tarefasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarefasBActionPerformed
        Tarefas tarefas = new Tarefas();
        tarefas.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_tarefasBActionPerformed

    private void arquivosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivosBActionPerformed
        Arquivos arquivos = new Arquivos();
        arquivos.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_arquivosBActionPerformed

    private void modelosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelosBActionPerformed
        Modelos modelos = new Modelos();
        modelos.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_modelosBActionPerformed

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
            java.util.logging.Logger.getLogger(Tarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Documentos;
    private javax.swing.JMenuItem arquivosB;
    private javax.swing.JMenuItem atendimentoB;
    private javax.swing.JMenu atividadesM;
    private javax.swing.JMenuItem calendarioB;
    private javax.swing.JMenuItem clientesB;
    private javax.swing.JMenu financeiroM;
    private javax.swing.JMenu gestaoM;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem modelosB;
    private javax.swing.JMenu processosM;
    private javax.swing.JMenuItem tarefasB;
    // End of variables declaration//GEN-END:variables
}
