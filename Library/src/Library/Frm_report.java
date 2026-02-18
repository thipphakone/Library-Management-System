
package Library;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import DB.DBConnect;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Frm_report extends javax.swing.JInternalFrame {
Connection con;
    DefaultTableModel model=new DefaultTableModel();
    public Frm_report() {
        initComponents();
        showData();
        Date_start.setDate(new java.util.Date());
        Date_End.setDate(new java.util.Date());
    }
    private void showData() {
    DefaultTableModel model = (DefaultTableModel) tbshow.getModel();
    model.setRowCount(0);


    String sql = "SELECT br.Br_id, m.M_Name, b.B_Name, br.Borrowing_Date, br.Due_date, s.S_Name " +
                 "FROM borrow br " +
                 "JOIN member m ON br.M_id = m.M_id " +
                 "JOIN borrow_detail bd ON br.Br_id = bd.Br_id " +
                 "JOIN books b ON bd.B_id = b.B_id " +
                 "JOIN staff s ON br.S_id = s.S_id " +
                 "ORDER BY br.Br_id DESC";

    try {
        con = DBConnect.getConnect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        int count = 0;
        while (rs.next()) {
            Object[] row = {
                rs.getString("Br_id"),
                rs.getString("M_Name"),
                rs.getString("B_Name"),
                rs.getString("Borrowing_Date"),
                rs.getString("Due_date"),
                rs.getString("S_Name")
            };
            model.addRow(row);
            count++;
        }
        

        lbtotal.setText("Total Records: " + count);

        rs.close();
        st.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Date_start = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Date_End = new com.toedter.calendar.JDateChooser();
        btn_date = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbshow = new javax.swing.JTable();
        btn_search = new javax.swing.JButton();
        btnexcel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbtotal = new javax.swing.JLabel();
        btnprint = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrow&Retrun Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Filter Options", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Start Date");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("End Date");

        btn_date.setText("Apply Filter");
        btn_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date_start, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Date_End, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date_End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_date))
        );

        tbshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "BorrowID", "Member Name", "Books Name", "Borrow Date", "Due Date", "Staff"
            }
        ));
        jScrollPane2.setViewportView(tbshow);

        btn_search.setText("Apply Filter");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btnexcel.setText("Export to Excel");
        btnexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total Records:");

        lbtotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbtotal.setForeground(new java.awt.Color(0, 0, 0));
        lbtotal.setText("0");

        btnprint.setText("Print report");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbtotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnexcel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnprint)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbtotal)
                    .addComponent(btnexcel)
                    .addComponent(btnprint))
                .addGap(2, 2, 2))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 490));

        setBounds(0, 0, 1117, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dateActionPerformed

    if (Date_start.getDate() == null || Date_End.getDate() == null) {
        JOptionPane.showMessageDialog(this, "กรุณาเลือกช่วงวันที่ให้ครบถ้วน");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) tbshow.getModel();
    model.setRowCount(0);

    String sql = "SELECT br.Br_id, m.M_Name, b.B_Name, br.Borrowing_Date, br.Due_date, s.S_Name " +
                 "FROM borrow br " +
                 "JOIN member m ON br.M_id = m.M_id " +
                 "JOIN borrow_detail bd ON br.Br_id = bd.Br_id " +
                 "JOIN books b ON bd.B_id = b.B_id " +
                 "JOIN staff s ON br.S_id = s.S_id " +
                 "WHERE br.Borrowing_Date BETWEEN ? AND ? " +
                 "ORDER BY br.Borrowing_Date ASC";

    try {
        con = DBConnect.getConnect();
        PreparedStatement psm = con.prepareStatement(sql);
        
        psm.setDate(1, new java.sql.Date(Date_start.getDate().getTime()));
        psm.setDate(2, new java.sql.Date(Date_End.getDate().getTime()));
        
        ResultSet rs = psm.executeQuery();
        int count = 0;
        
        while (rs.next()) {
            Object[] row = {
                rs.getString("Br_id"),
                rs.getString("M_Name"),
                rs.getString("B_Name"),
                rs.getString("Borrowing_Date"),
                rs.getString("Due_date"),
                rs.getString("S_Name")
            };
            model.addRow(row);
            count++;
        }
        
        lbtotal.setText("Total Records: " + count);
        
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "No data was found within the selected date range.");
        }

        rs.close();
        psm.close();
        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btn_dateActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String keyword = txtsearch.getText().trim();
    
    if (keyword.isEmpty()) {
        showData();
        return;
    }

    DefaultTableModel model = (DefaultTableModel) tbshow.getModel();
    model.setRowCount(0);


    String sql = "SELECT br.Br_id, m.M_Name, b.B_Name, br.Borrowing_Date, br.Due_date, s.S_Name " +
                 "FROM borrow br " +
                 "JOIN member m ON br.M_id = m.M_id " +
                 "JOIN borrow_detail bd ON br.Br_id = bd.Br_id " +
                 "JOIN books b ON bd.B_id = b.B_id " +
                 "JOIN staff s ON br.S_id = s.S_id " +
                 "WHERE br.Br_id LIKE ? OR m.M_Name LIKE ? OR b.B_Name LIKE ? " +
                 "ORDER BY br.Br_id DESC";

    try {
        con = DBConnect.getConnect();
        PreparedStatement psm = con.prepareStatement(sql);
        
        String searchKey = "%" + keyword + "%";
        psm.setString(1, searchKey); 
        psm.setString(2, searchKey);
        psm.setString(3, searchKey); 
        
        ResultSet rs = psm.executeQuery();
        int count = 0;
        
        while (rs.next()) {
            Object[] row = {
                rs.getString("Br_id"),
                rs.getString("M_Name"),
                rs.getString("B_Name"),
                rs.getString("Borrowing_Date"),
                rs.getString("Due_date"),
                rs.getString("S_Name")
            };
            model.addRow(row);
            count++;
        }
        
        lbtotal.setText("Total Records Found: " + count);
        
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "No information matching the search query was found.: " + keyword);
        }

        rs.close();
        psm.close();
        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btnexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcelActionPerformed

    if (tbshow.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "There is no data in the table to export.");
        return;
    }

    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    fileChooser.setDialogTitle("Save file as Excel");
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File fileToSave = fileChooser.getSelectedFile();
        String filePath = fileToSave.getAbsolutePath();
        
        if (!filePath.endsWith(".xls")) {
            filePath += ".xls";
        }

        try {
            java.io.FileWriter fw = new java.io.FileWriter(filePath);
            java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);


            for (int i = 0; i < tbshow.getColumnCount(); i++) {
                bw.write(tbshow.getColumnName(i) + "\t");
            }
            bw.newLine();

            for (int i = 0; i < tbshow.getRowCount(); i++) {
                for (int j = 0; j < tbshow.getColumnCount(); j++) {
                    Object val = tbshow.getValueAt(i, j);
                    bw.write((val != null ? val.toString() : "") + "\t");
                }
                bw.newLine();
            }

            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(this, "Data export successful.: " + filePath);

        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while saving the file.: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnexcelActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
        boolean complete = tbshow.print(javax.swing.JTable.PrintMode.FIT_WIDTH, 
            new java.text.MessageFormat("Book borrowing and return report."), 
            new java.text.MessageFormat("Page {0}"));
            
        if (complete) {
            JOptionPane.showMessageDialog(this, "Data successfully sent to the printer.");
        }
    } catch (java.awt.print.PrinterException e) {
        JOptionPane.showMessageDialog(this, "Cannot be printed.: " + e.getMessage());
    }
    }//GEN-LAST:event_btnprintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date_End;
    private com.toedter.calendar.JDateChooser Date_start;
    private javax.swing.JButton btn_date;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btnexcel;
    private javax.swing.JButton btnprint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JTable tbshow;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
