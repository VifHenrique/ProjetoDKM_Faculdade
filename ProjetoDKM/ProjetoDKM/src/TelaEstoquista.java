import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaEstoquista extends javax.swing.JFrame {

    
    public TelaEstoquista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditarProduto = new javax.swing.JButton();
        btnCadastrarProduto = new javax.swing.JButton();
        btnDeletarProduto = new javax.swing.JButton();
        lblControledeEstoque = new javax.swing.JLabel();
        btnProdutosCadastrados = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuAjuda = new javax.swing.JMenu();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("tela de Estoquista");
        getContentPane().setLayout(null);

        btnEditarProduto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEditarProduto.setText("Editar Produto");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarProduto);
        btnEditarProduto.setBounds(60, 250, 200, 70);

        btnCadastrarProduto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCadastrarProduto.setText("Cadastrar Produto");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarProduto);
        btnCadastrarProduto.setBounds(60, 110, 200, 70);

        btnDeletarProduto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnDeletarProduto.setText("Deletar Produto");
        btnDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletarProduto);
        btnDeletarProduto.setBounds(490, 240, 200, 70);

        lblControledeEstoque.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblControledeEstoque.setForeground(new java.awt.Color(255, 255, 255));
        lblControledeEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblControledeEstoque.setText("CONTROLE DE ESTOQUE ");
        getContentPane().add(lblControledeEstoque);
        lblControledeEstoque.setBounds(217, 20, 310, 80);

        btnProdutosCadastrados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProdutosCadastrados.setText("Produtos Cadastrados");
        getContentPane().add(btnProdutosCadastrados);
        btnProdutosCadastrados.setBounds(490, 110, 200, 70);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 760, 370);

        jMenu1.setText("Sair ");
        jMenuBar1.add(jMenu1);

        mnuAjuda.setText("Ajuda");
        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(774, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        TelaCadastrodeProdutos tela;
        tela = new TelaCadastrodeProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        TelaCadastrodeProdutos tela;
        tela = new TelaCadastrodeProdutos();
        tela.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEstoquista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoquista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoquista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoquista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoquista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnDeletarProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnProdutosCadastrados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblControledeEstoque;
    private javax.swing.JMenu mnuAjuda;
    // End of variables declaration//GEN-END:variables
}
