
package Library;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import DB.DBConnect;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class frm_Return extends javax.swing.JInternalFrame {
Connection con;
    DefaultTableModel model=new DefaultTableModel();
    public frm_Return() {
        initComponents();
        showData(title);
    }

    private void showData(String id) {
    DefaultTableModel model = (DefaultTableModel) tbshow.getModel();
    model.setRowCount(0); 
    String sql = "SELECT bd.B_id, b.B_Name, br.Borrowing_Date " +
                 "FROM borrow_detail bd " +
                 "JOIN books b ON bd.B_id = b.B_id " +
                 "JOIN borrow br ON bd.Br_ID = br.Br_id " +
                 "WHERE bd.Br_id = ? AND bd.Return_date IS NULL";

    try {
        con = DBConnect.getConnect();
        PreparedStatement psm = con.prepareStatement(sql);
        psm.setString(1, id);
        ResultSet rs = psm.executeQuery();

        while (rs.next()) {
            Object[] row = {
                rs.getString("B_id"),
                rs.getString("B_Name"),
                rs.getString("Borrowing_Date"),
                "", 
                "0.00" 
            };
            model.addRow(row);
        }
        
        rs.close();
        psm.close();
        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
        e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBorrowID = new javax.swing.JTextField();
        btnfindborrow = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMemberName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        re_Dateborrow = new com.toedter.calendar.JDateChooser();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbshow = new javax.swing.JTable();
        btnreturnall = new javax.swing.JButton();
        btnreturnselected = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbfine = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(474, 487));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrow Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("BorrowID");

        txtBorrowID.setForeground(new java.awt.Color(0, 0, 0));

        btnfindborrow.setBackground(new java.awt.Color(0, 0, 0));
        btnfindborrow.setForeground(new java.awt.Color(255, 255, 255));
        btnfindborrow.setText("Find Borrow");
        btnfindborrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindborrowActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Member Name");

        txtMemberName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Borrow Date");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBorrowID))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMemberName)
                            .addComponent(re_Dateborrow, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfindborrow))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBorrowID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfindborrow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(re_Dateborrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrow Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tbshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "B_ID", "Book Name", "Borrow Date", "Return", "Fine"
            }
        ));
        jScrollPane2.setViewportView(tbshow);

        btnreturnall.setBackground(new java.awt.Color(0, 0, 0));
        btnreturnall.setForeground(new java.awt.Color(255, 255, 255));
        btnreturnall.setText("Return All");
        btnreturnall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnallActionPerformed(evt);
            }
        });

        btnreturnselected.setBackground(new java.awt.Color(0, 0, 0));
        btnreturnselected.setForeground(new java.awt.Color(255, 255, 255));
        btnreturnselected.setText("Return Selected");
        btnreturnselected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnselectedActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Total Fine:");

        lbfine.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbfine.setForeground(new java.awt.Color(255, 0, 0));
        lbfine.setText("00.00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbfine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnreturnselected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnreturnall)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lbfine)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnreturnall)
                            .addComponent(btnreturnselected))))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 315, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 316, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1117, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void btnfindborrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindborrowActionPerformed
        String brID = txtBorrowID.getText().trim();
    
    if (brID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the loan code before searching.");
        return;
    }

    String sql = "SELECT m.M_Name, m.M_Surname, b.Borrowing_Date " +
                 "FROM borrow b " +
                 "JOIN member m ON b.M_id = m.M_id " +
                 "WHERE b.Br_id = ?";

    try {
        con = DBConnect.getConnect();
        PreparedStatement psm = con.prepareStatement(sql);
        psm.setString(1, brID);
        ResultSet rs = psm.executeQuery();

        if (rs.next()) {
            String fullName = rs.getString("M_Name") + " " + rs.getString("M_Surname");
            txtMemberName.setText(fullName);
            re_Dateborrow.setDate(rs.getDate("Borrowing_Date"));
            
            showData(brID); 
            
        } else {
            JOptionPane.showMessageDialog(this, "This borrowing code was not found in the system.");
            txtMemberName.setText("");
            re_Dateborrow.setDate(null);
            ((DefaultTableModel)tbshow.getModel()).setRowCount(0);
        }

        rs.close();
        psm.close();
        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnfindborrowActionPerformed

    private void btnreturnselectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnselectedActionPerformed
        int row = tbshow.getSelectedRow();
    
    // 1. ตรวจสอบว่าเลือกแถวหรือยัง
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select the book you wish to return from the table.");
        return;
    }

    String brID = txtBorrowID.getText();
    String bID = tbshow.getValueAt(row, 0).toString();
    java.util.Date today = new java.util.Date(); 

    try {
        con = DBConnect.getConnect();
        con.setAutoCommit(false); 

        String sqlCheck = "SELECT Due_date FROM borrow WHERE Br_id = ?";
        PreparedStatement psmCheck = con.prepareStatement(sqlCheck);
        psmCheck.setString(1, brID);
        ResultSet rs = psmCheck.executeQuery();
        
        double fine = 0;
        if (rs.next()) {
            java.sql.Date dueDate = rs.getDate("Due_date");
            if (today.after(dueDate)) {
                long diff = today.getTime() - dueDate.getTime();
                long diffDays = diff / (24 * 60 * 60 * 1000); 
                fine = diffDays * 5.0; 
            }
        }

        String sqlReturn = "UPDATE borrow_detail SET Return_date = ?, Fine_Amount = ? " +
                           "WHERE Br_id = ? AND B_id = ?";
        PreparedStatement psmR = con.prepareStatement(sqlReturn);
        psmR.setDate(1, new java.sql.Date(today.getTime()));
        psmR.setDouble(2, fine);
        psmR.setString(3, brID);
        psmR.setString(4, bID);
        psmR.executeUpdate();
        
        String sqlBook = "UPDATE books SET status = 'Available' WHERE B_id = ?";
        PreparedStatement psmB = con.prepareStatement(sqlBook);
        psmB.setString(1, bID);
        psmB.executeUpdate();

        con.commit(); 
        
        // แสดงค่าปรับที่ต้องจ่าย
        lbfine.setText(String.format("%.2f", fine));
        JOptionPane.showMessageDialog(this, "Book returned successfully. Fine paid: " + fine + " kip");

        showData(brID);

    } catch (Exception e) {
        try { con.rollback(); } catch (SQLException ex) {}
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnreturnselectedActionPerformed

    private void btnreturnallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnallActionPerformed

    int rowCount = tbshow.getRowCount();
    if (rowCount == 0) {
        JOptionPane.showMessageDialog(this, "There are no books to return.");
        return;
    }

    String brID = txtBorrowID.getText();
    java.util.Date today = new java.util.Date();
    double totalFine = 0; 

    try {
        con = DBConnect.getConnect();
        con.setAutoCommit(false); 


        String sqlCheck = "SELECT Due_date FROM borrow WHERE Br_id = ?";
        PreparedStatement psmCheck = con.prepareStatement(sqlCheck);
        psmCheck.setString(1, brID);
        ResultSet rs = psmCheck.executeQuery();
        
        double finePerBook = 0;
        if (rs.next()) {
            java.sql.Date dueDate = rs.getDate("Due_date");
            if (today.after(dueDate)) {
                long diff = today.getTime() - dueDate.getTime();
                long diffDays = diff / (24 * 60 * 60 * 1000); 
                finePerBook = diffDays * 5.0; 
            }
        }

        String sqlReturn = "UPDATE borrow_detail SET Return_date = ?, Fine_Amount = ? " +
                           "WHERE Br_id = ? AND B_id = ?";
        String sqlBook = "UPDATE books SET status = 'Available' WHERE B_id = ?";
        
        PreparedStatement psmR = con.prepareStatement(sqlReturn);
        PreparedStatement psmB = con.prepareStatement(sqlBook);

        for (int i = 0; i < rowCount; i++) {
            String bID = tbshow.getValueAt(i, 0).toString();

            psmR.setDate(1, new java.sql.Date(today.getTime()));
            psmR.setDouble(2, finePerBook);
            psmR.setString(3, brID);
            psmR.setString(4, bID);
            psmR.executeUpdate();

            psmB.setString(1, bID);
            psmB.executeUpdate();
            
            totalFine += finePerBook; 
        }

        con.commit(); 
        
        lbfine.setText(String.format("%.2f", totalFine));
        JOptionPane.showMessageDialog(this, "All books successfully searched!\ntotal initial fine: " + totalFine + " kip");

        showData(brID); 

    } catch (Exception e) {
        try { if(con != null) con.rollback(); } catch (SQLException ex) {}
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnreturnallActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfindborrow;
    private javax.swing.JButton btnreturnall;
    private javax.swing.JButton btnreturnselected;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbfine;
    private com.toedter.calendar.JDateChooser re_Dateborrow;
    private javax.swing.JTable tbshow;
    private javax.swing.JTextField txtBorrowID;
    private javax.swing.JTextField txtMemberName;
    // End of variables declaration//GEN-END:variables
}
