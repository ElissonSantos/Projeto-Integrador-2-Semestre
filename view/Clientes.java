package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.table.AbstractTableModel;

public class Clientes extends javax.swing.JFrame /*AbstractTableModel*/ {

    public Clientes() {
        initComponents();
        
        String[] nomesClientes = {"Otavio", "Silva"};
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cadastroButton = new javax.swing.JButton();
        campoPesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList<>();
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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMS Advocacia - Clientes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar clientes");

        cadastroButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastroButton.setText("Novo Cliente");
        cadastroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroButtonMouseClicked(evt);
            }
        });

        campoPesquisa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        campoPesquisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listaClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaClientes.setAlignmentX(1.5F);
        listaClientes.setAlignmentY(1.5F);
        listaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadastroButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1016, 689));
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cadastroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroButtonMouseClicked
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_cadastroButtonMouseClicked

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void listaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClientesMouseClicked

    }//GEN-LAST:event_listaClientesMouseClicked

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Documentos;
    private javax.swing.JMenuItem arquivosB;
    private javax.swing.JMenuItem atendimentoB;
    private javax.swing.JMenu atividadesM;
    private javax.swing.JButton cadastroButton;
    private javax.swing.JMenuItem calendarioB;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JMenuItem clientesB;
    private javax.swing.JMenu financeiroM;
    private javax.swing.JMenu gestaoM;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaClientes;
    private javax.swing.JMenuItem modelosB;
    private javax.swing.JMenu processosM;
    private javax.swing.JMenuItem tarefasB;
    // End of variables declaration//GEN-END:variables
}
