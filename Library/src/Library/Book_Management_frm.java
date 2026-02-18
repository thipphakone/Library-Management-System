
package Library;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import DB.DBConnect;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Book_Management_frm extends javax.swing.JInternalFrame {
Connection con;
    DefaultTableModel model=new DefaultTableModel();
    public Book_Management_frm() {
        initComponents();
        model=(DefaultTableModel)tbshow.getModel();
        showData();
    }
    private void showData(){
        try {
            con=DBConnect.getConnect();
            int row=tbshow.getRowCount()-1;
            while(row>-1){
                
                model.removeRow(row--);
            }
            String sql="select * from books";
            ResultSet rs =con.createStatement().executeQuery(sql);
            while(rs.next()){
                String [] data={
                    rs.getString("B_id"),
                    rs.getString("B_Name"),
                    rs.getString("Author"),
                    rs.getString("Publisher"),
                    rs.getString("Price"),
                    rs.getString("type_id")
                };
                model.addRow(data);
            }
            rs.close();
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpublisher = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        cbBookType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbshow = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Book Management");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("BookID");

        txtID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("BookName");

        txtname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Author");

        txtAuthor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Publisher");

        txtpublisher.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Price");

        txtPrice.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        cbBookType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbBookType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBookTypeActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("BookType");

        btnsave.setText("save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setText("delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnedit.setText("edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnsearch.setText("search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrice)
                            .addComponent(cbBookType, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBookType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 250));

        tbshow.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tbshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "BookID", "Name", "Author", "Publisher", "Price", "Type"
            }
        ));
        tbshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbshowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbshow);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1170, 250));

        setBounds(0, 0, 1117, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try{
        con=DB.DBConnect.getConnect();
        String sql="insert into books(B_id,B_Name,Author,Publisher,Price,type_id) values(?,?,?,?,?,?)";
            PreparedStatement psm=con.prepareStatement(sql);
            psm.setString(1, txtID.getText().trim());
            psm.setString(2, txtname.getText());
            psm.setString(3, txtAuthor.getText());
            psm.setString(4, txtpublisher.getText());
            String priceText = txtPrice.getText().trim();
            if (priceText.isEmpty()) {
                psm.setDouble(5, 0.0); 
            } else {
                psm.setDouble(5, Double.parseDouble(priceText));
            }
            if (cbBookType.getSelectedItem() != null) {
            psm.setString(6, cbBookType.getSelectedItem().toString());
            } else {
                psm.setString(6, ""); 
            }
            int r=psm.executeUpdate();
            if(r==1){
                JOptionPane.showMessageDialog(this, "Added ");
                showData();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void cbBookTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBookTypeActionPerformed
        cbBookType.removeAllItems(); 
    
    String sql = "SELECT DISTINCT type_id FROM books"; 
    
    try {
        con = DBConnect.getConnect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            String typeId = rs.getString("type_id");
            // 4. เพิ่มข้อมูลลงใน Combo Box
            cbBookType.addItem(typeId);
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "เกิดข้อผิดพลาดในการโหลดข้อมูล: " + e.getMessage());
    }
    }//GEN-LAST:event_cbBookTypeActionPerformed
    String BookID;
    private void tbshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbshowMouseClicked
       int row=tbshow.getSelectedRow();
        BookID=tbshow.getValueAt(row, 0).toString();
        txtID.setText(BookID);
        txtname.setText(tbshow.getValueAt(row, 1).toString());
        txtAuthor.setText(tbshow.getValueAt(row, 2).toString());
        txtpublisher.setText(tbshow.getValueAt(row, 3).toString());
        txtPrice.setText(tbshow.getValueAt(row, 4).toString());
        cbBookType.setSelectedItem(tbshow.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tbshowMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            con=DB.DBConnect.getConnect();
            String spl="update books set B_Name=?,Author=?,Publisher=?,Price=?,type_id=? where B_id=?";
            PreparedStatement psm=con.prepareStatement(spl);
            psm.setString(6, txtID.getText().trim());
            psm.setString(1, txtname.getText());
            psm.setString(2, txtAuthor.getText());
            psm.setString(3, txtpublisher.getText());
            String priceText = txtPrice.getText().trim();
            if (priceText.isEmpty()) {
                psm.setDouble(4, 0.0);
            } else {
                psm.setDouble(4, Double.parseDouble(priceText));
            }
            if (cbBookType.getSelectedItem() != null) {
            psm.setString(5, cbBookType.getSelectedItem().toString());
            } else {
                psm.setString(5, ""); 
            }
            int r=psm.executeUpdate();
            if(r==1){
                JOptionPane.showMessageDialog(this, "edited!");
                showData();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            con=DB.DBConnect.getConnect();
            String sql="delete from books where B_id=?";
            PreparedStatement psm=con.prepareStatement(sql);
            psm.setString(1, txtID.getText().trim());
            int r=psm.executeUpdate();
            if(r==1){
                JOptionPane.showMessageDialog(this, "deleted");
                showData();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btndeleteActionPerformed
    public void showDataByVal(String data){
        try {
            if (data==""){
                showData();
                return;
            }
            int row=tbshow.getRowCount()-1;
            while(row>-1){
                model.removeRow(row--);
            }
            con=DB.DBConnect.getConnect();
            String sql="select * from books where B_id LIKE '%"+data+"%' or B_Name LIKE '%"+data+"%' or Author LIKE '%"+data+"%' or Publisher LIKE '%"+data+"%' or Price LIKE '%"+data+"%' or type_id LIKE '"+data+"'";
            ResultSet rs=con.createStatement().executeQuery(sql); 

            while(rs.next()){ 
                String [] arr={ 
                    rs.getString("B_id"),      
                    rs.getString("B_Name"),  
                    rs.getString("Author"), 
                    rs.getString("Publisher"),     
                    rs.getString("Price"),    
                    rs.getString("type_id"),     
                            
                };
                model.addRow(arr);
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        frm_search_books f=new frm_search_books(this);
        showDataByVal("");
        f.setVisible(true);
    }//GEN-LAST:event_btnsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cbBookType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbshow;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpublisher;
    // End of variables declaration//GEN-END:variables
}
