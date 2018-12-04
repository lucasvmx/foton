/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

import Excecoes.FormularioInexistenteException;
import FDF.fdfFile;
import FDF.fdfWriter;
import regrasNegocio.Formulario;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import regrasNegocio.Pergunta;

/**
 *
 * @author Windows 10
 */
public class MainWindow extends javax.swing.JFrame {
    List<Formulario> lista;

    /**
     * Creates new form NewJFrame
     */
    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        lista = new ArrayList<Formulario>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bCriar = new javax.swing.JButton();
        bResponder = new javax.swing.JButton();
        bApagar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbFormularios = new javax.swing.JComboBox<>();
        bInfo = new javax.swing.JButton();
        bSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fóton");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setText("Fóton");

        bCriar.setText("Criar");
        bCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriarActionPerformed(evt);
            }
        });

        bResponder.setText("Responder");
        bResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResponderActionPerformed(evt);
            }
        });

        bApagar.setText("Apagar");
        bApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bApagarActionPerformed(evt);
            }
        });

        jLabel2.setText("Formulários Disponíveis");

        bInfo.setText("Info");

        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bResponder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCriar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bResponder)
                    .addComponent(cbFormularios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bApagar)
                    .addComponent(bInfo)
                    .addComponent(bSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriarActionPerformed
        FormWindow formWindow = new FormWindow(this);
        formWindow.setVisible(true);
    }//GEN-LAST:event_bCriarActionPerformed
    
    private void bResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResponderActionPerformed
        Pergunta pergunta = this.lista.get(cbFormularios.getSelectedIndex()).questoes.get(0);
        String _tipo = pergunta.getTipo();
        
        if(_tipo == "Aberta"){
            ResponderAberta resp = new ResponderAberta();
            resp.setVisible(true);
        }
        
        else if(_tipo == "Lista" || _tipo == "Exclusiva"){
            ResponderLista resp = new ResponderLista();
            resp.setVisible(true);
        }
        else if(_tipo == "Alternativa"){
            ResponderAlternativa resp = new ResponderAlternativa();
            resp.setVisible(true);
        }
        
        else{
            ResponderOpcional resp = new ResponderOpcional();
            resp.setVisible(true);
        }
    }//GEN-LAST:event_bResponderActionPerformed

    private void bApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bApagarActionPerformed
        try{
            if(cbFormularios.getItemCount() == 0)
                throw new FormularioInexistenteException();
            
            else{
                lista.remove(cbFormularios.getSelectedIndex());
                atualizar();
            }
        }
        
        catch(FormularioInexistenteException e){
            JOptionPane optionPane = new JOptionPane(e.getMessage(), JOptionPane.ERROR_MESSAGE);    
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_bApagarActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    void addFormulario(Formulario form){
        lista.add(form);
    }
    
    void rmvFormulario(Formulario form){
        lista.remove(form);
    }
    
    void atualizar(){
        cbFormularios.removeAllItems();
        
        for(int count = 0; count < lista.size(); count++)
            cbFormularios.addItem(lista.get(count).getNome());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bApagar;
    private javax.swing.JButton bCriar;
    private javax.swing.JButton bInfo;
    private javax.swing.JButton bResponder;
    private javax.swing.JButton bSair;
    private javax.swing.JComboBox<String> cbFormularios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
