
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TelaCadastrodeProdutos extends javax.swing.JFrame {

  
    public TelaCadastrodeProdutos() {
        initComponents();
       btnExcluirProduto.setVisible(false);
       btnEditarProduto.setVisible(false);
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditarProduto = new javax.swing.JButton();
        btnCadastrarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        lblQuantidade = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();

        setTitle("Tela Cadastro de Produtos");
        getContentPane().setLayout(null);

        btnEditarProduto.setText("Editar Produto");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarProduto);
        btnEditarProduto.setBounds(580, 290, 140, 60);

        btnCadastrarProduto.setText("Cadastrar Produto");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarProduto);
        btnCadastrarProduto.setBounds(30, 290, 140, 60);

        btnExcluirProduto.setText(" Excluir Produto");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirProduto);
        btnExcluirProduto.setBounds(310, 290, 140, 60);

        lblQuantidade.setText("Quantidade");
        getContentPane().add(lblQuantidade);
        lblQuantidade.setBounds(20, 150, 90, 50);

        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 30, 70, 50);

        lblCodigo.setText("Codigo");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(330, 30, 90, 50);

        lblValor.setText("Valor ");
        getContentPane().add(lblValor);
        lblValor.setBounds(330, 150, 90, 50);
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(110, 150, 120, 50);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(420, 30, 120, 50);
        getContentPane().add(txtValor);
        txtValor.setBounds(420, 150, 120, 50);
        getContentPane().add(txtNome);
        txtNome.setBounds(100, 30, 120, 50);

        btnLimpar.setText("Limpar");
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(640, 40, 100, 40);

        setSize(new java.awt.Dimension(820, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        String v, c, n, f, q;

        v = txtValor.getText();
        c = txtCodigo.getText();
        n = txtNome.getText();
        
        q = txtQuantidade.getText();
        

        if (v.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtNome.requestFocus();
            return; // stop

        }
        if (c.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtNome.requestFocus();
            return; // stop
        }
        if (n.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtNome.requestFocus();
            return; // stop
        }
        
        if (q.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtNome.requestFocus();
            return; // stop
        }
        try {
            //2 - Conectar no banco de dados sistemabd
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "084511");
            //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
            PreparedStatement st = conectado.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?)");
            st.setString(1, v);
            st.setString(2, c);
            st.setString(3, n);
           
            st.setString(5, q);
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");

            txtCodigo.setText("");
            txtValor.setText("");
            txtNome.setText("");
            txtQuantidade.setText("");
            
            txtNome.requestFocus();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "ENtre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        if (resposta == 0) {

             String u = txtNome.getText();

            try {
                //2 - Conectar no banco de dados sistemabd
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "084511");
                //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
                PreparedStatement st = conectado.prepareStatement("UPDATE `projetodkm`.`usuariosdkm` SET `Valor` = ?, `Nome` = ?, `Codigo` = ?, `Fornecedor`= ?, 'Quantidade' = ? WHERE (`Usuarios` = ?);");
               st.setString(1, u);
               st.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuário Excluido com sucesso com sucesso");
                dispose();

                conectado.close();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
            }

        } else { // Resposta foi Não
            dispose();
        }
    }                                         

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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
