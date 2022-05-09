/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.gestionescuola;

import static com.mycompany.gestionescuola.WinGestione.listaCorsi;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;

/**
 *
 * @author tss
 */
public class WinDialogCorso extends javax.swing.JDialog {

    /**
     * Creates new form WinDialogCorso
     */
    public WinDialogCorso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        spDurata.setValue(1);
        // creo una lista per compilare la jlist
        refreshLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txDataInizio = new javax.swing.JFormattedTextField();
        lblMsg = new javax.swing.JLabel();
        btnUpdateCorso = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnPrepnewCorso = new javax.swing.JButton();
        lblTitolo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCorsi = new javax.swing.JList<>();
        txNomeCorso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDescrizione = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txLinkCorso = new javax.swing.JTextField();
        spDurata = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreaCorso = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txDataInizio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txDataInizio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txDataInizioKeyReleased(evt);
            }
        });

        lblMsg.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 12)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(255, 0, 0));

        btnUpdateCorso.setText("Update Corso");
        btnUpdateCorso.setEnabled(false);
        btnUpdateCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCorsoActionPerformed(evt);
            }
        });

        jLabel6.setText("(es.23/04/22)");

        btnPrepnewCorso.setText("Nuovo corso");
        btnPrepnewCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrepnewCorsoActionPerformed(evt);
            }
        });

        lblTitolo.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitolo.setText("Gestione Corsi");

        lstCorsi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCorsi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCorsiValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstCorsi);

        txNomeCorso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txNomeCorsoKeyReleased(evt);
            }
        });

        jLabel1.setText("NomeCorso:");

        jLabel7.setText("Lista Corsi:");

        txDescrizione.setColumns(20);
        txDescrizione.setRows(5);
        jScrollPane1.setViewportView(txDescrizione);

        jLabel4.setText("Data Inizio: ");

        jLabel2.setText("Descrizione:");

        txLinkCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLinkCorsoActionPerformed(evt);
            }
        });

        spDurata.setValue(1);
        spDurata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spDurataKeyReleased(evt);
            }
        });

        jLabel5.setText("Link Corso:");

        jLabel3.setText("Durata Ore:");

        btnCreaCorso.setText("Conferma nuovo Corso");
        btnCreaCorso.setEnabled(false);
        btnCreaCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaCorsoActionPerformed(evt);
            }
        });

        btnClose.setText("Chiudi");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(btnUpdateCorso)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)
                                .addGap(278, 278, 278))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblTitolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(23, 23, 23))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrepnewCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreaCorso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txLinkCorso)
                            .addComponent(txNomeCorso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spDurata, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txNomeCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(spDurata, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txLinkCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnPrepnewCorso)))
                .addGap(29, 29, 29)
                .addComponent(btnCreaCorso)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateCorso)
                            .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnClose)))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCorsoActionPerformed

        int id = 1;
        if (!(id < WinGestione.listaCorsi.size() && id >= 0)) {
            return;
        }

        String nc = txNomeCorso.getText();
        String des = txDescrizione.getText();
        String data = txDataInizio.getText();
        String ardata[] = data.split("/");
        int d = Integer.parseInt(ardata[0]);
        int m = Integer.parseInt(ardata[1]);
        int a = Integer.parseInt(ardata[2]) + 2000;
        String link = txLinkCorso.getText();
        int durata = (int) spDurata.getValue();
        Corso newcorso = new Corso(nc, durata, a, m, d);
        newcorso.setDescrizione(des);
        newcorso.setLink(link);
        WinGestione.listaCorsi.set(id, newcorso);
        salvaCorsiCSV();
        int idcorso = -1;

        btnUpdateCorso.setEnabled(false);
    }//GEN-LAST:event_btnUpdateCorsoActionPerformed

    private void btnPrepnewCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrepnewCorsoActionPerformed
        //semplicemente pulisco tutti i campi
        lblMsg.setText("inserisci i dati del corso: ");
        txNomeCorso.setText("");
        txDescrizione.setText("");
        txLinkCorso.setText("");
        txDataInizio.setText("");
        spDurata.setValue(0);
        btnCreaCorso.setEnabled(false);

    }//GEN-LAST:event_btnPrepnewCorsoActionPerformed

    private void lstCorsiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCorsiValueChanged
        int index = lstCorsi.getSelectedIndex();

        btnUpdateCorso.setEnabled(true);
        Corso c = WinGestione.listaCorsi.get(index);
        lblMsg.setText("corso creato correttamente!");
        txNomeCorso.setText(c.getNomecorso());
        txDescrizione.setText(c.getDescrizione());
        txLinkCorso.setText(c.getLink());
        DateTimeFormatter ddmmaa = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dataok = c.getDatainizio().format(ddmmaa);
        txDataInizio.setText(dataok);
        spDurata.setValue(c.getDurataore());

    }//GEN-LAST:event_lstCorsiValueChanged

    private void txLinkCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLinkCorsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLinkCorsoActionPerformed

    private void btnCreaCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaCorsoActionPerformed
        // TODO add your handling code here:
        //Recuperiamo i dati da interfaccia e li colleghiamo al evento bottoneclick(pulsante crea corso)
        String nc = txNomeCorso.getText();
        String des = txDescrizione.getText();
        String data = txDataInizio.getText();
        String ardata[] = data.split("/");
        int d = Integer.parseInt(ardata[0]);
        int m = Integer.parseInt(ardata[1]);
        int a = Integer.parseInt(ardata[2]) + 2000;
        String link = txLinkCorso.getText();
        int durata = (int) spDurata.getValue();
        Corso newcorso = new Corso(nc, durata, a, m, d);
        newcorso.setDescrizione(des);
        newcorso.setLink(link);
        if (lstCorsi.getSelectedIndex() == -1) {   //nessuna selezione,non sono in modifica
            WinGestione.listaCorsi.add(newcorso);
        } else {//lista selezionata  sono in modifica dell iesimo elemento
            WinGestione.listaCorsi.set(lstCorsi.getSelectedIndex(), newcorso);
            lblMsg.setText("Corso aggiornato!");
        }

        lblMsg.setText("corso creato correttamente!");
        txNomeCorso.setText("");
        txDescrizione.setText("");
        txLinkCorso.setText("");
        txDataInizio.setText("");
        spDurata.setValue(1);
        lstCorsi.setSelectedIndex(-1);
        refreshLista();

        //mostra elenco aggiornato in display di listacorsi
        salvaCorsi();
        salvaCorsiCSV();
        validaCorso();

    }//GEN-LAST:event_btnCreaCorsoActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txNomeCorsoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeCorsoKeyReleased
        btnCreaCorso.setEnabled(validaCorso());
    }//GEN-LAST:event_txNomeCorsoKeyReleased

    private void spDurataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spDurataKeyReleased
        btnCreaCorso.setEnabled(validaCorso());
    }//GEN-LAST:event_spDurataKeyReleased

    private void txDataInizioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txDataInizioKeyReleased
        btnCreaCorso.setEnabled(validaCorso());
    }//GEN-LAST:event_txDataInizioKeyReleased

    private boolean validaCorso() {
        boolean ret = false;
        int val = (int) spDurata.getValue();
        boolean okNome = !txNomeCorso.getText().equals("");
        boolean okData = !txDataInizio.getText().equals("");
        boolean okValore = (val > 0);

        if (okData && okNome && okValore) {
            ret = true;
        }

        return ret;
    }

    private void salvaCorsi() {
        //recupero un corso per volta
        //estraggo info di tipo string
        //aggiungo info ad un testo generico e poi setto in display
        String testoDisplay = "";
        for (int i = 0; i < listaCorsi.size(); i++) {
            //recupero un corso per volta
            Corso c = listaCorsi.get(i);
            String info = c.getInfo(); //richiamo metodo geintfo per richiamare le informazioni delle variabili
            testoDisplay = info + testoDisplay;

        }
        try {
            //creo file corsi .txt
            FileWriter myWriter = new FileWriter("/home/tss/rodrigo/Lavori_java/corsi.txt");
            //ci scrivo dentro testo display
            myWriter.write(testoDisplay);
            //lo chiudo se no si blocca
            myWriter.close();

        } catch (IOException ex) {
            lblMsg.setText("errore di scrittura file corsi.txt");
        }

    }

    private void salvaCorsiCSV() {
        //recupero un corso per volta
        //estraggo info di tipo string
        //aggiungo info ad un testo generico e poi setto in display
        String testoDisplay = "nomecorso;durataore;descrizione;datainizio;link\n";
        for (int i = 0; i < listaCorsi.size(); i++) {
            //recupero un corso per volta
            Corso c = listaCorsi.get(i);
            String info = c.getCSV(); //richiamo metodo geintfo per richiamare le informazioni delle variabili
            testoDisplay += info;

        }
        try {
            //creo file corsi .txt
            FileWriter myWriter = new FileWriter("/home/tss/rodrigo/Lavori_java/corsi.csv");
            //ci scrivo dentro testo display
            myWriter.write(testoDisplay);
            //lo chiudo se no si blocca
            myWriter.close();

        } catch (IOException ex) {
            lblMsg.setText("errore di scrittura file corsi.csv");
        }

    }

    private void refreshLista() {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < WinGestione.listaCorsi.size(); i++) {
            String nc = WinGestione.listaCorsi.get(i).getNomecorso();
            model.addElement(nc);

        }

        lstCorsi.setModel(model);

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
            java.util.logging.Logger.getLogger(WinDialogCorso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinDialogCorso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinDialogCorso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinDialogCorso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WinDialogCorso dialog = new WinDialogCorso(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreaCorso;
    private javax.swing.JButton btnPrepnewCorso;
    private javax.swing.JButton btnUpdateCorso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JList<String> lstCorsi;
    private javax.swing.JSpinner spDurata;
    private javax.swing.JFormattedTextField txDataInizio;
    private javax.swing.JTextArea txDescrizione;
    private javax.swing.JTextField txLinkCorso;
    private javax.swing.JTextField txNomeCorso;
    // End of variables declaration//GEN-END:variables
}