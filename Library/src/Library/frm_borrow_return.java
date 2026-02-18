package Library;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import DB.DBConnect;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class frm_borrow_return extends javax.swing.JInternalFrame {
Connection con;
    DefaultTableModel model=new DefaultTableModel();
    
    public frm_borrow_return() {
        initComponents();
        bor_Datebor.setDate(new java.util.Date());
        model=(DefaultTableModel)tbshow.getModel();
        getMemberID();
        getStaffID();
        txtName.setEditable(false);
        showData();
    }
    private void showData(){
        DefaultTableModel model = (DefaultTableModel) tbshow.getModel();
        model.setRowCount(0);
        
        try {
            String sql ="SELECT B_id, B_Name, Author FROM books " +
                 "WHERE (B_id LIKE ? OR B_Name LIKE ?) AND status = 'Available'";
            con = DBConnect.getConnect(); 
            PreparedStatement psm = con.prepareStatement(sql);

            String query = "%" + txtSearch.getText() + "%";
            psm.setString(1, query);
            psm.setString(2, query);

            ResultSet rs = psm.executeQuery();

    
        while (rs.next()) {
            Object[] row = {
                rs.getString("B_id"),
                rs.getString("B_Name"),
                rs.getString("Author")
            };
            model.addRow(row);
            }
            rs.close();
            con.close();
        
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbStaffID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        bor_Datebor = new com.toedter.calendar.JDateChooser();
        bor_Datereturn = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbshow = new javax.swing.JTable();
        btnremove = new javax.swing.JButton();
        btncomfirm = new javax.swing.JButton();
        btnclaer = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrow", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MemberID");

        cmbID.setForeground(new java.awt.Color(0, 0, 0));
        cmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Member Name");

        cmbStaffID.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("StaffID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("-");
        jLabel4.setToolTipText("");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Borrow Date");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bor_Datebor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(bor_Datereturn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbID, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bor_Datebor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bor_Datereturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrow Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Search ID/Name:");

        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tbshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "B_ID", "Book Name", "Author"
            }
        ));
        jScrollPane1.setViewportView(tbshow);

        btnremove.setBackground(new java.awt.Color(0, 0, 0));
        btnremove.setForeground(new java.awt.Color(255, 255, 255));
        btnremove.setText("Remove Book");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btncomfirm.setBackground(new java.awt.Color(0, 0, 0));
        btncomfirm.setForeground(new java.awt.Color(255, 255, 255));
        btncomfirm.setText("confirm");
        btncomfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomfirmActionPerformed(evt);
            }
        });

        btnclaer.setBackground(new java.awt.Color(0, 0, 0));
        btnclaer.setForeground(new java.awt.Color(255, 255, 255));
        btnclaer.setText("Clear");
        btnclaer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclaerActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("AddBook");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnremove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncomfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclaer)
                .addGap(32, 32, 32))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnremove)
                    .addComponent(btncomfirm)
                    .addComponent(btnclaer))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 500));

        setBounds(0, 0, 1120, 535);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        //showData();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String bookID = txtSearch.getText().trim();
    
    if (bookID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please Enter book id");
        return;
    }

    for (int i = 0; i < tbshow.getRowCount(); i++) {
        if (tbshow.getValueAt(i, 0).toString().equals(bookID)) {
            JOptionPane.showMessageDialog(this, "This book is already on the list.");
            return;
        }
    }

    String sql = "SELECT B_id, B_Name, Author FROM Books WHERE B_id = ? AND status = 'Available'";
    
    try {
        con = DBConnect.getConnect();
        PreparedStatement psm = con.prepareStatement(sql);
        psm.setString(1, bookID);
        ResultSet rs = psm.executeQuery();

        if (rs.next()) {
            Object[] row = {
                rs.getString("B_id"),
                rs.getString("B_Name"),
                rs.getString("Author")
            };
            model.addRow(row);
            txtSearch.setText(""); 
            txtSearch.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "The book code was not found, or the book is not available for borrowing.");
        }
        
        rs.close();
        psm.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int row = tbshow.getSelectedRow();
        if (row != -1) {
            model.removeRow(row);
}
    }//GEN-LAST:event_btnremoveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
       
    }//GEN-LAST:event_txtNameActionPerformed

    private void cmbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIDActionPerformed
        if (cmbID.getSelectedItem() == null) return;

    String selectedID = cmbID.getSelectedItem().toString();
    String sql = "SELECT M_Name, M_Surname FROM member WHERE M_id = ?";

    try {
        con = DB.DBConnect.getConnect();
        PreparedStatement psm = con.prepareStatement(sql);
        psm.setString(1, selectedID);
        ResultSet rs = psm.executeQuery();

        if (rs.next()) {
            String fullName = rs.getString("M_Name") + " " + rs.getString("M_Surname");
            txtName.setText(fullName);
        }

        rs.close();
        psm.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_cmbIDActionPerformed

    private void btncomfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomfirmActionPerformed

    if (tbshow.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "please add a book to table");
        return;
    }

    try {
        con = DBConnect.getConnect();
        con.setAutoCommit(false);

        String newBrID = "BR001"; 
        String sqlMax = "SELECT Br_ID FROM borrow ORDER BY Br_ID DESC LIMIT 1";
        Statement st = con.createStatement();
        ResultSet rsMax = st.executeQuery(sqlMax);
        
        if (rsMax.next()) {
            String lastID = rsMax.getString("Br_ID");
            int idNum = Integer.parseInt(lastID.substring(2)) + 1; 
            newBrID = String.format("BR%03d", idNum); 
        }

        // 2. บันทึกลงตาราง borrow
        String sqlBorrow = "INSERT INTO borrow (Br_ID, M_id, S_id, Borrowing_Date, Due_date) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstB = con.prepareStatement(sqlBorrow);
        pstB.setString(1, newBrID);
        pstB.setString(2, cmbID.getSelectedItem().toString());
        pstB.setString(3, cmbStaffID.getSelectedItem().toString());
        pstB.setDate(4, new java.sql.Date(bor_Datebor.getDate().getTime()));
        pstB.setDate(5, new java.sql.Date(bor_Datereturn.getDate().getTime()));
        pstB.executeUpdate();


        String sqlDetail = "INSERT INTO borrow_detail (Br_id, B_id) VALUES (?, ?)";
        String sqlUpdateBook = "UPDATE books SET status = 'Unavailable' WHERE B_id = ?";
        
        PreparedStatement pstD = con.prepareStatement(sqlDetail);
        PreparedStatement pstU = con.prepareStatement(sqlUpdateBook);

        for (int i = 0; i < tbshow.getRowCount(); i++) {
            String bookID = tbshow.getValueAt(i, 0).toString();
            pstD.setString(1, newBrID); 
            pstD.setString(2, bookID);
            pstD.executeUpdate();

            pstU.setString(1, bookID);
            pstU.executeUpdate();
        }

        con.commit();
        JOptionPane.showMessageDialog(this, "Record successful! The borrowing code is:: " + newBrID);
        // เคลียร์ค่าหน้าจอ...

    } catch (Exception e) {
        try { con.rollback(); } catch (SQLException ex) {}
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btncomfirmActionPerformed

    private void btnclaerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclaerActionPerformed
        if (cmbID.getItemCount() > 0) cmbID.setSelectedIndex(0);
    if (cmbStaffID.getItemCount() > 0) cmbStaffID.setSelectedIndex(0);
    txtName.setText(""); 


    bor_Datebor.setDate(new java.util.Date());
    bor_Datereturn.setDate(null);

    txtSearch.setText("");
    model.setRowCount(0); 

    txtSearch.requestFocus();
    }//GEN-LAST:event_btnclaerActionPerformed
    private void getMemberID() {
    cmbID.removeAllItems();
    String sql = "SELECT M_id FROM member";

    try {
        con = DB.DBConnect.getConnect();
        PreparedStatement psm = con.prepareStatement(sql);
        ResultSet rs = psm.executeQuery();

        while (rs.next()) {
            cmbID.addItem(rs.getString("M_id"));
        }

        rs.close();
        psm.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    private void getStaffID() {
    cmbStaffID.removeAllItems(); 
    String sql = "SELECT s_id FROM Staff";

    try {
        con = DB.DBConnect.getConnect();
        PreparedStatement psm = con.prepareStatement(sql);
        ResultSet rs = psm.executeQuery();

        while (rs.next()) {
            cmbStaffID.addItem(rs.getString("s_id"));
        }

        rs.close();
        psm.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bor_Datebor;
    private com.toedter.calendar.JDateChooser bor_Datereturn;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnclaer;
    private javax.swing.JButton btncomfirm;
    private javax.swing.JButton btnremove;
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JComboBox<String> cmbStaffID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbshow;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
