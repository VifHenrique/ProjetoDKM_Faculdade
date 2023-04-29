
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaAdmin extends javax.swing.JFrame {

    public TelaAdmin() {
        initComponents();
        btnExcluir.setVisible(false);

    }

    public TelaAdmin(String usuario, String senha, String nome, String cargo) {

        initComponents();
        txtUsuario.setText(usuario);
        txtSenha.setText(senha);
        txtNome.setText(nome);
        cmbCargo.setSelectedItem(cargo);
        btnCadastrar.setVisible(false);
        
    }

    public void TelaAdmin (String usuario, String senha, String nome, String cargo) {

        initComponents();
        txtUsuario.setText(usuario);
        txtSenha.setText(senha);
        txtNome.setText(nome);
        cmbCargo.setSelectedItem(cargo);
        btnCadastrar.setVisible(false);
        btnExcluir.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();

        setTitle("Tela de Admin");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(70, 130, 110, 50);

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(450, 230, 100, 60);
        getContentPane().add(txtNome);
        txtNome.setBounds(550, 130, 140, 50);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(450, 130, 100, 50);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(80, 230, 100, 50);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(180, 130, 140, 50);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(180, 230, 140, 50);

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(550, 230, 140, 60);

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(530, 340, 120, 60);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   Gerenciamento Des Usuários do Sistema");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 10, 510, 80);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(140, 340, 120, 60);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 450);

        setSize(new java.awt.Dimension(761, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String u, s, n, c;

        u = txtUsuario.getText();
        s = txtSenha.getText();
        n = txtNome.getText();
        c = cmbCargo.getSelectedItem().toString();

        if (u.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop

        }
        if (s.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (n.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (c.equals("Nunhum")) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        try {
            //2 - Conectar no banco de dados sistemabd
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "084511");
            //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
            PreparedStatement st = conectado.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?)");
            st.setString(1, u);
            st.setString(2, s);
            st.setString(3, n);
            st.setString(4, c);
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");

            txtUsuario.setText("");
            txtSenha.setText("");
            txtNome.setText("");
            cmbCargo.setSelectedIndex(1);
            txtUsuario.requestFocus();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "ENtre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        if (resposta == 0) {

            String u = txtUsuario.getText();

            try {
                //2 - Conectar no banco de dados sistemabd
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "084511");
                //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
                PreparedStatement st = conectado.prepareStatement("DELETE FROM usuario WHERE usuario= ?;");
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
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        if (resposta == 0) {

            String u = txtUsuario.getText();

            try {
                //2 - Conectar no banco de dados sistemabd
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "084511");
                //Executar a operação desejada (INSERT, UPDATE, DELETE, SELECT)
                PreparedStatement st = conectado.prepareStatement("UPDATE `projetodkm`.`usuariosdkm` SET `Usuarios` = ?, `Nome` = ?, `Cargo` = ?, `Senha` = ? WHERE (`Usuarios` = ?);");
                st.setString(1, u);
                st.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuário Editado com sucesso com sucesso");
                dispose();

                conectado.close();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
            }

        } else { // Resposta foi Não
            dispose();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
