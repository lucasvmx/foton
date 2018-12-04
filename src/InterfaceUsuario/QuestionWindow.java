/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

import regrasNegocio.*;
import Excecoes.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class QuestionWindow extends javax.swing.JFrame {
    FormWindow formPai;
    
    /**
     * Creates new form QuestionWindow
     */
    public QuestionWindow(FormWindow form) {
        initComponents();
        defineConfig();
        
        formPai = form;   
    }
    
    public QuestionWindow(FormWindow form, String enunciado, String[] alternativas){
        initComponents();
        defineConfig();
        
        formPai = form;  
        this.enunciado.setText(enunciado);
        
        if (alternativas == null)
            cbAlternativas.getItemAt(1);
        
        for(int count = 0; count < alternativas.length; count++)
            taAlternativas.append(alternativas[count]);
    }
    
    private void defineConfig(){
        // Define os tipos de pergunta
        cbAlternativas.addItem("Aberta");
        cbAlternativas.addItem("Lista");
        cbAlternativas.addItem("Alternativa");
        cbAlternativas.addItem("Exclusiva");
        cbAlternativas.addItem("Opcional");
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
        enunciado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbAlternativas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAlternativas = new javax.swing.JTextArea();
        bSalvar = new javax.swing.JButton();
        bDescartar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fóton - Pergunta");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setText("Enunciado :");

        jLabel2.setText("Tipo de pergunta :");

        cbAlternativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlternativasActionPerformed(evt);
            }
        });

        jLabel3.setText("Alternativas ( Se possível ): ");

        taAlternativas.setColumns(20);
        taAlternativas.setRows(5);
        taAlternativas.setEnabled(false);
        jScrollPane1.setViewportView(taAlternativas);

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bDescartar.setText("Descartar");
        bDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDescartarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enunciado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAlternativas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bDescartar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbAlternativas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(bSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDescartar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDescartarActionPerformed
        dispose();
    }//GEN-LAST:event_bDescartarActionPerformed
   
    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        try{
            // Verifica se existe enunciado
            if(enunciado.getText().isEmpty())
                throw new EnunciadoNaoInformadoException();

            else{
                if (cbAlternativas.getSelectedItem().toString() == "Aberta"){
                    // Cria a pergunta e adciona a lista
                    PerguntaAberta pergunta = new PerguntaAberta(enunciado.getText());
                    
                    formPai.lista.add(pergunta);
                    formPai.addTaPerguntas(pergunta.getTexto());
                }
            
                else{
                    // Recebe as alternativas inseridas 
                    String saux = new String();
                    saux = taAlternativas.getText();
                    
                    // Verifica se existe alternativas
                    if(saux.isEmpty())
                        throw new AlternativasNaoInformadasException();
                    
                    // Separa as alternativas por '\n'
                    String[] str = saux.split("\n");
                    
                    // Cria a pergunta e adciona a lista
                    PerguntaFechada pergunta = new PerguntaFechada(enunciado.getText(), str);
                    
                    formPai.lista.add(pergunta);
                    formPai.addTaPerguntas(pergunta.getTexto());
                }
                
                dispose();
            }
        }
        
        catch (EnunciadoNaoInformadoException e){
            JOptionPane optionPane = new JOptionPane(e.getMessage(), JOptionPane.ERROR_MESSAGE);    
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setVisible(true);
        }
        
        catch (AlternativasNaoInformadasException e){
            JOptionPane optionPane = new JOptionPane(e.getMessage(), JOptionPane.ERROR_MESSAGE);    
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setVisible(true);
        }
        
    }//GEN-LAST:event_bSalvarActionPerformed

    private void cbAlternativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlternativasActionPerformed
        // Desabilita a edição da alternativas se for pergunta aberta ou opcional (s/n)
        if ((cbAlternativas.getSelectedItem().toString() == "Aberta") || (cbAlternativas.getSelectedItem().toString() == "Opcional")){
            taAlternativas.setEnabled(false);
            
            // Seta as alternativas para o tipo Opcional
            if (cbAlternativas.getSelectedItem().toString() == "Opcional")
                taAlternativas.setText("Sim\nNão");
        }
        
        // Habilita a edição das alternativas
        else
            taAlternativas.setEnabled(true);
    }//GEN-LAST:event_cbAlternativasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDescartar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JComboBox<String> cbAlternativas;
    private javax.swing.JTextField enunciado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taAlternativas;
    // End of variables declaration//GEN-END:variables
}
