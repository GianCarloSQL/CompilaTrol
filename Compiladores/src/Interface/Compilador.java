package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Gian Carlo Giovanella, Jadiel Dos Santos
 */
public class Compilador extends javax.swing.JFrame {

    File file;
    String salva = "";

    public Compilador() {
        initComponents();
        textEditor.setBorder(new NumberedBorder());
        inicializaTeclasAtalho();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mensagens = new javax.swing.JScrollPane();
        textMensagens = new javax.swing.JTextArea();
        editor = new javax.swing.JScrollPane();
        textEditor = new javax.swing.JTextArea();
        textStatus = new javax.swing.JLabel();
        jButtonAbrir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCopiar = new javax.swing.JButton();
        jButtonColar = new javax.swing.JButton();
        jButtonRecortar = new javax.swing.JButton();
        jButtonCompilar = new javax.swing.JButton();
        jButtonSobre = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 660));

        mensagens.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        mensagens.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        mensagens.setAutoscrolls(true);
        mensagens.setMaximumSize(new java.awt.Dimension(30000, 30000));
        mensagens.setMinimumSize(new java.awt.Dimension(750, 105));
        mensagens.setPreferredSize(new java.awt.Dimension(750, 105));

        textMensagens.setEditable(false);
        textMensagens.setColumns(20);
        textMensagens.setRows(5);
        mensagens.setViewportView(textMensagens);

        editor.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        editor.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        editor.setAutoscrolls(true);
        editor.setMinimumSize(new java.awt.Dimension(750, 480));
        editor.setPreferredSize(new java.awt.Dimension(750, 480));

        textEditor.setColumns(20);
        textEditor.setRows(5);
        editor.setViewportView(textEditor);

        textStatus.setMaximumSize(new java.awt.Dimension(900, 25));
        textStatus.setMinimumSize(new java.awt.Dimension(900, 25));
        textStatus.setPreferredSize(new java.awt.Dimension(900, 25));

        jButtonAbrir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAbrir.setText("Abrir [Crtl+O]");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvar.setText("Salvar [Crtl+S]");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCopiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCopiar.setText("Copiar [Crtl+C]");
        jButtonCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarActionPerformed(evt);
            }
        });

        jButtonColar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonColar.setText("Colar [Crtl+V]");
        jButtonColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColarActionPerformed(evt);
            }
        });

        jButtonRecortar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonRecortar.setText("Recortar [Crtl+X]");
        jButtonRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecortarActionPerformed(evt);
            }
        });

        jButtonCompilar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCompilar.setText("Compilar [F9]");
        jButtonCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompilarActionPerformed(evt);
            }
        });

        jButtonSobre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSobre.setText("Equipe [F1]");
        jButtonSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobreActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNovo.setText("Novo [Ctrl+N]");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAbrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCopiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonColar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRecortar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCompilar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonColar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRecortar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editor, javax.swing.GroupLayout.PREFERRED_SIZE, 427, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        abre();
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        salva();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarActionPerformed
        copia();
    }//GEN-LAST:event_jButtonCopiarActionPerformed

    private void jButtonColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColarActionPerformed
        cola();
    }//GEN-LAST:event_jButtonColarActionPerformed

    private void jButtonRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecortarActionPerformed
        corta();
    }//GEN-LAST:event_jButtonRecortarActionPerformed

    private void jButtonSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobreActionPerformed
        sobre();
    }//GEN-LAST:event_jButtonSobreActionPerformed

    private void jButtonCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompilarActionPerformed
        try {
            compila();
        } catch (IOException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCompilarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        novo();
    }//GEN-LAST:event_jButtonNovoActionPerformed

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
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compilador().setVisible(true);
            }
        });
    }

    private void abre() {
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("txt", "TXT");
        jfc.setFileFilter(filtro);
        int returnVal = jfc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                //zera
                textEditor.setText("");
                textStatus.setText("");
                textMensagens.setText("");

                file = jfc.getSelectedFile();
                //status
                textStatus.setText("Arquivo selecionado: " + file.getName() + "          "
                        + "Diretorio: " + file.getParent());
                //editor
                BufferedReader entrada = new BufferedReader(new FileReader(file));
                String lido;

                while ((lido = entrada.readLine()) != null) {
                    textEditor.append(lido + "\n");
                }

            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }

    private void novo() {
        textEditor.setText("");
        textStatus.setText("");
        file = null;
    }

    private void salva() {
        if (file == null) {
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle("salvar");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("txt", "TXT");
            jfc.setFileFilter(filtro);
            int returnVal = jfc.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = jfc.getSelectedFile();
                textStatus.setText("Arquivo selecionado: " + file.getName() + "          "
                        + "Diretorio: " + file.getParent());
                textMensagens.setText("");

                try {
                    FileWriter fw = new FileWriter(file.getPath());
                    String str[] = textEditor.getText().split("\n");
                    for (String linha : str) {
                        fw.write(linha + "\n");
                    }
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            try {
                FileWriter fw = new FileWriter(file.getPath());
                String str[] = textEditor.getText().split("\n");
                for (String linha : str) {
                    fw.write(linha + "\n");
                }
                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void copia() {
        textEditor.copy();
    }

    private void cola() {
        textEditor.paste();
    }

    private void corta() {
        textEditor.cut();
    }

    private void compila() throws IOException {
        Lexico lexico = new Lexico();
        lexico.setInput(textEditor.getText());
        String Saida = "";
        try {
            int linha = 0;
            Token t = null;
            while ((t = lexico.nextToken()) != null) {
                System.out.println(t.getLexeme());
                if (t.getLexeme().equalsIgnoreCase("\n")) {
                    linha++;
                }
                
                Saida += linha + " " + t.getClasse() + " " + t.getLexeme() + "\n";
                // só escreve o lexema
                // necessário escrever t.getId (classe), t.getPosition() (não a linha, mas a posição inicial do lexema dentro do editor)
                // no entanto, t.getId () - retorna o identificador da classe e deve ser apresentada a
                // classe por extenso (olhar Constants.java e adaptar)
                // no entanto, t.getPosition () - retorna a posição inicial do lexema, tem que adaptar para  
                // mostrar a linha
                // esse código apresenta os tokens enquanto não ocorrer erro
                // no entanto, os tokens devem ser apresentados SÓ se não ocorrer erro, tem que adaptar	
            }
            textMensagens.setText(Saida);
        } catch (LexicalError e) {  // tratamento de erros
            System.err.println(e.getMessage() + " em " + e.getPosition());
            // e.getMessage() - retorna a mensagem de erro de SCANNER_ERRO (olhar ScannerConstants.java e 
            // adaptar conforme o enunciado da parte 2)

            // e.getPosition() - retorna a posição inicial do erro, tem que adaptar para mostrar a linha
            // quando o erro for do tipo "símbolo inválido", tem que mostrar também o símbolo
            // que causou o erro 	
        }
    }

    private void sobre() {
        textMensagens.setText("Gian Carlo Giovanella, jadiel Dos Santos e matheus alguma coisa");
    }

    private void inicializaTeclasAtalho() {
        //ctrl + n
        jButtonNovo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK), "novo");
        jButtonNovo.getActionMap().put("novo", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                novo();
            }

        });

        //ctrl + o
        jButtonAbrir.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK), "abrir");
        jButtonAbrir.getActionMap().put("abrir", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                abre();
            }
        });

        //ctrl + s
        jButtonSalvar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK), "salvar");
        jButtonSalvar.getActionMap().put("salvar", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                salva();
            }
        });

        //ctrl + c
        jButtonCopiar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK), "copiar");
        jButtonCopiar.getActionMap().put("copiar", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                copia();
            }
        });

        //ctrl + v
        jButtonColar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK), "colar");
        jButtonColar.getActionMap().put("colar", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                cola();
            }
        });

        //crtl + x
        jButtonRecortar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK), "recortar");
        jButtonRecortar.getActionMap().put("recortar", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                corta();
            }
        });

        //F9
        jButtonCompilar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, 0), "compilar");
        jButtonCompilar.getActionMap().put("compilar", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    compila();
                } catch (IOException ex) {
                    Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        //F1
        jButtonSobre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "equipe");
        jButtonSobre.getActionMap().put("equipe", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                sobre();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane editor;
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonColar;
    private javax.swing.JButton jButtonCompilar;
    private javax.swing.JButton jButtonCopiar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRecortar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSobre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane mensagens;
    private javax.swing.JTextArea textEditor;
    private javax.swing.JTextArea textMensagens;
    private javax.swing.JLabel textStatus;
    // End of variables declaration//GEN-END:variables
}
