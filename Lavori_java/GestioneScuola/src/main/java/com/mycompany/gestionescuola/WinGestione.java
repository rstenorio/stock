package com.mycompany.gestionescuola;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WinGestione extends javax.swing.JFrame {

    static List<Corso> listaCorsi = new ArrayList<Corso>();
    static List<Anagrafica> listaAnagrafiche = new ArrayList<Anagrafica>();
    int idcorso = -1;
    
    public WinGestione() {
        initComponents();
        this.setLocationRelativeTo(null);
        caricaDatiCorsi();
        showCorsi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitolo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpDisplay = new javax.swing.JTextPane();
        btnGestioneCorso = new javax.swing.JButton();
        btnGestAnagrafica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitolo.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitolo.setText("Gestione scuola");

        jScrollPane2.setViewportView(tpDisplay);

        btnGestioneCorso.setText("Gestione Corsi");
        btnGestioneCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioneCorsoActionPerformed(evt);
            }
        });

        btnGestAnagrafica.setText("Gestione Anagrafiche");
        btnGestAnagrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestAnagraficaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGestioneCorso)
                    .addComponent(btnGestAnagrafica))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGestioneCorso)
                        .addGap(18, 18, 18)
                        .addComponent(btnGestAnagrafica))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestioneCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioneCorsoActionPerformed
        new WinDialogCorso(this, true).setVisible(true);
    }//GEN-LAST:event_btnGestioneCorsoActionPerformed

    private void btnGestAnagraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestAnagraficaActionPerformed
        //new WinDialogCorso(this, true).setVisible(true);
    }//GEN-LAST:event_btnGestAnagraficaActionPerformed

    public void showCorsi() {
        //recupero un corso per volta
        //estraggo info di tipo string
        //aggiungo info ad un testo generico e poi setto in display
        String testoDisplay = "";
        for (int i = 0; i < listaCorsi.size(); i++) {
            //recupero un corso per volta
            Corso c = listaCorsi.get(i);
            String info = "[" + (i + 1) + "]" + c.getInfo(); //richiamo metodo geintfo per richiamare le informazioni delle variabili
            testoDisplay = info + testoDisplay;

        }
        //visualizzo i corsi in display
        tpDisplay.setText(testoDisplay);

    }

    private void caricaDatiCorsi() {
        try {

            //aprire il file /tss/scuola.csv
            File filecsv = new File("/home/tss/rodrigo/Lavori_java/corsi.csv");
            //creo scanner per leggere una riga per volta
            Scanner lettore = new Scanner(filecsv);
            //estrarre una riga per volta
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati = riga.split(";");
                    //dati[0] nomecorso, dati[1] durata ecc
                    String nc = dati[0];
                    int durata = Integer.parseInt(dati[1]);
                    String des = dati[2];
                    String d[] = dati[3].split("-");
                    int y = Integer.parseInt(d[0]);
                    int m = Integer.parseInt(d[1]);
                    int g = Integer.parseInt(d[2]);
                    String link = dati[4];
                    Corso c = new Corso(nc, durata, y, m, g);
                    c.setDescrizione(des);
                    c.setLink(link);
                    //il corso ?? pronto e lo aggiungiamo alla lista
                    listaCorsi.add(c);
                }
                n++;
                //la riga la taglio in tanti pezzi col; in un array
                //elemento per elemento dell'array lo imposto ad un corso
                //il corso lo aggiungo alla lista
            }
            //e cosi via PER LE ALTRE RIGHE DEL FILE
            //alla fine chiudo se no si blocca
        } catch (Exception e) {

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
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinGestione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestAnagrafica;
    private javax.swing.JButton btnGestioneCorso;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JTextPane tpDisplay;
    // End of variables declaration//GEN-END:variables
}
