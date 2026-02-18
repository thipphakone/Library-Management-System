
package Library;
import java.awt.event.KeyEvent;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class frm_search_books extends javax.swing.JFrame {
    Book_Management_frm bm;
    public frm_search_books(Book_Management_frm sbm) {
        initComponents();
        bm=sbm;
    }
    public frm_search_books() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnenter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Input:");

        btnenter.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnenter.setText("Enter");
        btnenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnenter))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnenter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenterActionPerformed
     String itm =txtsearch.getText().trim();
        bm.showDataByVal(itm);
    }//GEN-LAST:event_btnenterActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String itm= txtsearch.getText().trim();
            bm.showDataByVal(itm);
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
       String itm=txtsearch.getText().trim();
        bm.showDataByVal(itm);
    }//GEN-LAST:event_txtsearchKeyTyped

    public static void main(String args[]) {
        try {
        UIManager.setLookAndFeel( new FlatLightLaf() );
        new frm_search_books().setVisible(true);
    } catch( Exception ex ) {
        System.err.println( "Failed to initialize LaF" );
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_search_books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnenter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
