package it.com.company;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;

public class WinDialogProdotto extends javax.swing.JDialog {

    public WinDialogProdotto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        refreshLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstProdotto = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        txPrezzo = new javax.swing.JTextField();
        txQuantita = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuovo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblMSG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstProdotto.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstProdotto);

        jLabel1.setText("Nome:");

        jLabel2.setText("Prezzo:");

        jLabel3.setText("Quantità:");

        btnNuovo.setText("Nuovo Prodotto");
        btnNuovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuovoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestione Prodotti");

        lblMSG.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblMSG.setForeground(new java.awt.Color(191, 23, 21));
        lblMSG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txQuantita, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txNome)))
                            .addComponent(btnNuovo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMSG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txPrezzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txQuantita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuovo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshLista() {
        DefaultListModel model = new DefaultListModel();

        for (int i = 0; i < GestioneProdotto.listaProdotto.size(); i++) {
            String nc = GestioneProdotto.listaProdotto.get(i).getId_prodotto()
                    + ") " + GestioneProdotto.listaProdotto.get(i).getNome();

            model.addElement(nc);
        }
        lstProdotto.setModel(model);

    }

    private void salvaCorsiCSV() {
        //recupero un corso per volta
        //estraggo info di tipo string
        //aggiungo info ad un testo generico e poi setto in display
        String testoDisplay = "id,nome;Prezzo;Quantita\n";
        for (int i = 0; i < GestioneProdotto.listaProdotto.size(); i++) {
            //recupero un corso per volta
            Product prod = GestioneProdotto.listaProdotto.get(i);
            String info = prod.getCSV(); //richiamo metodo geintfo per richiamare le informazioni delle variabili
            testoDisplay += info;
        }
        try {
            //creo file corsi .txt
            FileWriter myWriter = new FileWriter(GestioneProdotto.path + "prodotti.csv");
            //ci scrivo dentro testo display
            myWriter.write(testoDisplay);
            //lo chiudo se no si blocca
            myWriter.close();

        } catch (IOException ex) {
            lblMSG.setText("ERRORE di scrittura file prodotti.csv");
        }

    }

    public boolean salvaProdotto() {

        Product prod = new Product(txNome.getText(), Double.parseDouble(txPrezzo.getText()), Integer.parseInt(txQuantita.getText()));

        if (lstProdotto.getSelectedIndex() == -1) {   //nessuna selezione,non sono in modifica
            GestioneProdotto.listaProdotto.add(prod);
            lblMSG.setText("Corso Creato!");
        } else {//lista selezionata  sono in modifica dell iesimo elemento
            GestioneProdotto.listaProdotto.set(lstProdotto.getSelectedIndex(), prod);
            lblMSG.setText("Corso aggiornato!");
            return true;
        }
        pulisce();

        return false;

    }

    void pulisce() {
        txNome.setText("");
        txPrezzo.setText("");
        txQuantita.setText("");
        lstProdotto.setSelectedIndex(-1);
    }

    private boolean validaCorso() {
        boolean ret = false;
        
        boolean okNome = !txNome.getText().equals("");
        boolean okPrezzo = !txPrezzo.getText().equals("");
        boolean okQt = (!txQuantita.getText().equals("") && Integer.parseInt(txQuantita.getText()) > 0);

        if (okNome && okPrezzo && okQt) {
            ret = true;
        }

        return ret;
    }


    private void btnNuovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuovoActionPerformed
        if (validaCorso()) {
            String msg = salvaProdotto() ? "Corso Creato con successo!" : "Corso Aggiornato con successo!";
            lblMSG.setText(msg);
            salvaCorsiCSV();
        }else{
            lblMSG.setText("Campo vuoto!!");
        }
    }//GEN-LAST:event_btnNuovoActionPerformed

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
            java.util.logging.Logger.getLogger(WinDialogProdotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinDialogProdotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinDialogProdotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinDialogProdotto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WinDialogProdotto dialog = new WinDialogProdotto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnNuovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMSG;
    private javax.swing.JList<String> lstProdotto;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txPrezzo;
    private javax.swing.JTextField txQuantita;
    // End of variables declaration//GEN-END:variables
}
