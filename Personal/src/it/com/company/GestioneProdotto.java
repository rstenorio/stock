package it.com.company;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class GestioneProdotto extends javax.swing.JFrame {

    static String path = "/home/tss/workspace/MIO/Personal/";
    static List<Product> listaProdotto = new ArrayList<>();

    @Override
    public void list() {
        super.list(); //To change body of generated methods, choose Tools | Templates.
    }

    public GestioneProdotto() {
        initComponents();
        caricaDatiProdotti();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdotto = new javax.swing.JTable();
        btnProdotti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestione Prodotti");

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(191, 23, 21));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MSG");

        tbProdotto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome Prodotto", "Prezzo", "QT."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdotto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdottoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProdotto);

        btnProdotti.setText("Gestione Prodotti");
        btnProdotti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdottiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnProdotti, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProdotti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(229, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbProdottoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdottoMouseClicked

//        int i = tbProdotto.getSelectedRow();
//        JOptionPane.showMessageDialog(null, listaProdotto.get(i).toString());

    }//GEN-LAST:event_tbProdottoMouseClicked

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        
    }//GEN-LAST:event_formWindowStateChanged

    private void btnProdottiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdottiActionPerformed
        new WinDialogProdotto(this, true).setVisible(true);
    }//GEN-LAST:event_btnProdottiActionPerformed

    private void caricaDatiProdotti() {
        try {
            File filecsv = new File(path + "prodotti.csv");
            Scanner lettore = new Scanner(filecsv);
            int n = 1;

            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati = riga.split(";");

                    Integer id = Integer.parseInt(dati[0]);
                    String nome = dati[1];
                    Double prezzo = Double.parseDouble(dati[2]);
                    Integer quantita = Integer.parseInt(dati[3]);

                    Product prod = new Product(id,nome, prezzo, quantita);
                    //il corso è pronto e lo aggiungiamo alla lista
                    listaProdotto.add(prod);
                }
                n++;
            }
            
        } catch (Exception e) {
            System.out.println("ERRORE al caricari i prodotti!!!" + e.getMessage());
        }

        refreshTable();

    }

    public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) tbProdotto.getModel();
        model.setRowCount(0);//clean table

        int ncol = model.getColumnCount();

        Object[] rowData = new Object[ncol];

        for (Product prod : listaProdotto) {
            rowData[0] = prod.getId_prodotto();
            rowData[1] = prod.getNome();
            rowData[2] = prod.getPrezzo();
            rowData[3] = prod.getQuantita();

            model.addRow(rowData);
        }
    }

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
            java.util.logging.Logger.getLogger(GestioneProdotto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestioneProdotto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestioneProdotto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestioneProdotto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestioneProdotto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProdotti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbProdotto;
    // End of variables declaration//GEN-END:variables
}
