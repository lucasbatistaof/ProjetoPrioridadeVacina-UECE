package br.com.prioridadevacina.view;

import br.com.prioridadevacina.model.Comorbidade;
import br.com.prioridadevacina.model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaVacina extends javax.swing.JFrame {
    
    List<Pessoa> pessoas = new ArrayList<>();
    
    public TelaVacina() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        receberNome = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        selecionarComorbidade = new javax.swing.JComboBox<>();
        comorbidade = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        mensagem = new javax.swing.JLabel();
        recebertData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        titulo.setText("PRIORIDADE VACINA");
        titulo.setToolTipText("");

        subtitulo.setFont(new java.awt.Font("Liberation Sans", 1, 22)); // NOI18N
        subtitulo.setText("COMPLETE SEU CADASTRO");

        receberNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receberNomeActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        nome.setText("NOME COMPLETO");

        data.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        data.setText("ANO DE NASCIMENTO");
        data.setToolTipText("");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data", "Comorbidade"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        selecionarComorbidade.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        selecionarComorbidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma", "Doenças cardiovasculares", "Diabetes mellitus", "Obesidade morbida" }));
        selecionarComorbidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarComorbidadeActionPerformed(evt);
            }
        });

        comorbidade.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        comorbidade.setText("SELECIONE COMORBIDADE");

        salvar.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        salvar.setText("VERIFICAR");
        salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(subtitulo)
                        .addGap(175, 175, 175))))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(salvar)
                        .addComponent(comorbidade)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                        .addComponent(selecionarComorbidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(data)
                        .addComponent(nome)
                        .addComponent(receberNome, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(recebertData, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subtitulo)
                .addGap(27, 27, 27)
                .addComponent(nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(receberNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recebertData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comorbidade)
                .addGap(18, 18, 18)
                .addComponent(selecionarComorbidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salvar)
                .addGap(18, 18, 18)
                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void receberNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receberNomeActionPerformed
        
    }//GEN-LAST:event_receberNomeActionPerformed

    private void selecionarComorbidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarComorbidadeActionPerformed
        
    }//GEN-LAST:event_selecionarComorbidadeActionPerformed

    private void salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseClicked
        boolean prioridadeIdade;
        boolean prioridadeComorbidade;
        
        if (receberNome.getText().equals("") || recebertData.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha os campos.");
        } else {
            Pessoa p = new Pessoa(receberNome.getText(), Double.parseDouble(recebertData.getText()));
            Comorbidade comorb = new Comorbidade(selecionarComorbidade.getSelectedIndex());
            p.setComorbidade(comorb);

            DefaultTableModel model = (DefaultTableModel)tabela.getModel();

            prioridadeIdade = p.prioridadeIdade();
            prioridadeComorbidade = Comorbidade.validar(comorb.getOpcao());

            if(prioridadeIdade || prioridadeComorbidade){
                mensagem.setText("Você tem " + p.getIdade() + " anos e possui prioridade para Vacinação.");
            } else {
                mensagem.setText("Você não possui prioridade para Vacinação.");
            }

            model.addRow(new Object[]{p.getNome(), p.getIdade(), (prioridadeIdade || prioridadeComorbidade) ? "Sim" : "Nao"});

            receberNome.setText("");
            recebertData.setText("");
            selecionarComorbidade.setSelectedIndex(0);
        }
    }//GEN-LAST:event_salvarMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                                                                                                                                                                                                                                                                                                                                                                                                                                             
                new TelaVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel comorbidade;
    private javax.swing.JLabel data;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensagem;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField receberNome;
    private javax.swing.JTextField recebertData;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox<String> selecionarComorbidade;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
