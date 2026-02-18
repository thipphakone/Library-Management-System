

package Library;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import DB.DBConnect;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Member_management_frm extends javax.swing.JInternalFrame {
Connection con;
    DefaultTableModel model=new DefaultTableModel();
    public Member_management_frm() {
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
            String sql="select * from member";
            ResultSet rs =con.createStatement().executeQuery(sql);
            while(rs.next()){
                String [] data={
                    rs.getString("M_id"),
                    rs.getString("M_Name"),
                    rs.getString("M_Surname"),
                    rs.getString("Gender"),
                    rs.getString("Email"),
                    rs.getString("Phone"),
                    rs.getString("Village"),
                    rs.getString("District"),
                    rs.getString("Province"),
                    rs.getString("Date_of_Member"),
                    rs.getString("Expiration_Date")
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtvillage = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtprovince = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        datemember = new com.toedter.calendar.JDateChooser();
        dateexpira = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbshow = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Member Management");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MemberID");

        txtid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FirstName");

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LastName");

        txtsurname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email");

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Phone");

        txtphone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Village");

        txtvillage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("District");

        txtdis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Province");

        txtprovince.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gender", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        buttonGroup1.add(rbmale);
        rbmale.setText("Male");
        jPanel2.add(rbmale);

        buttonGroup1.add(rbfemale);
        rbfemale.setText("Female");
        jPanel2.add(rbfemale);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Date of Member");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Expiration Date");

        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtsurname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(search)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdis, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtvillage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(datemember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtprovince)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel11))
                                    .addComponent(dateexpira, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprovince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datemember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateexpira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtvillage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnedit)
                    .addComponent(btndelete)
                    .addComponent(search))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 240));

        tbshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MID", "Name", "Surname", "Gender", "Email", "Phone", "village", "District", "Province", "Member's Date", "Expiration"
            }
        ));
        tbshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbshowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbshow);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 244, 1110, 250));

        setBounds(0, 0, 1117, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
         try {
            con=DB.DBConnect.getConnect();
            if(txtname.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter FirstName");
                txtname.requestFocus();
            }
            if(txtsurname.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter LastName");
                txtsurname.requestFocus();
            }
            for(int i=0;i<tbshow.getRowCount();i++){
                String name=txtname.getText();
                String surname=txtsurname.getText();
                if (name.equals(tbshow.getValueAt(i, 1).toString()) && surname.equals(tbshow.getValueAt(i, 2).toString())){
                    JOptionPane.showMessageDialog(null, "This info is already available.");
                    tbshow.addRowSelectionInterval(i, i);
                    tbshow.scrollRectToVisible(tbshow.getCellRect(i, 0,true));
                    return;
                }
            }
            String spl="insert into member(M_id,M_Name,M_Surname,Gender,Email,Phone,Village,District,Province,Date_of_Member,Expiration_Date) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement psm=con.prepareStatement(spl);
            psm.setString(1, txtid.getText().trim());
            psm.setString(2, txtname.getText());
            psm.setString(3, txtsurname.getText());
            if(rbmale.isSelected()){
                psm.setString(4, rbmale.getText());
            }else if(rbfemale.isSelected()){
                psm.setString(4, rbfemale.getText());
            }else{
                JOptionPane.showMessageDialog(null,"Please Select Gender");
                rbmale.setSelected(true);
            }
            psm.setString(5, txtemail.getText());
            psm.setString(6, txtphone.getText());
            psm.setString(7, txtvillage.getText());
            psm.setString(8, txtdis.getText());
            psm.setString(9, txtprovince.getText());
            java.util.Date memDate = datemember.getDate();
            if (memDate != null) {
                psm.setDate(10, new java.sql.Date(memDate.getTime()));
            } else {
                psm.setNull(10, java.sql.Types.DATE);
            }
            java.util.Date exDate = dateexpira.getDate();
            if (exDate != null) {
                psm.setDate(11, new java.sql.Date(exDate.getTime()));
            } else {
                psm.setNull(11, java.sql.Types.DATE);
            }
            int r=psm.executeUpdate();
            if(r==1){
                JOptionPane.showMessageDialog(this, "Added");
                showData();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            
            con=DB.DBConnect.getConnect();
            String spl="update member set M_Name=?,M_Surname=?,Gender=?,Email=?,Phone=?,Village=?,District=?,Province=?,Date_of_Member=?,Expiration_Date=? where M_id=?";
            PreparedStatement psm=con.prepareStatement(spl);
            psm.setString(1, txtname.getText());
            psm.setString(2, txtsurname.getText());
            if(rbmale.isSelected()){
                psm.setString(3, rbmale.getText());
            }else if(rbfemale.isSelected()){
                psm.setString(3, rbfemale.getText());
            }else{
                JOptionPane.showMessageDialog(null,"Please Select Gender");
                rbmale.setSelected(true);
            }
            psm.setString(4, txtemail.getText());
            psm.setString(5, txtphone.getText());
            psm.setString(6, txtvillage.getText());
            psm.setString(7, txtdis.getText());
            psm.setString(8, txtprovince.getText());
            java.util.Date memDate = datemember.getDate();
            if (memDate != null) {
                psm.setDate(9, new java.sql.Date(memDate.getTime()));
            } else {
                psm.setNull(9, java.sql.Types.DATE);
            }
            java.util.Date exDate = dateexpira.getDate();
            if (exDate != null) {
                psm.setDate(10, new java.sql.Date(exDate.getTime()));
            } else {
                psm.setNull(10, java.sql.Types.DATE);
            }
            psm.setString(11, txtid.getText().trim());
            int r=psm.executeUpdate();
            if(r==1){
                JOptionPane.showMessageDialog(this, "Added");
                showData();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btneditActionPerformed
    String id;
    private void tbshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbshowMouseClicked
        int row=tbshow.getSelectedRow();
        id=tbshow.getValueAt(row, 0).toString();
        txtid.setText(id);
        txtname.setText(tbshow.getValueAt(row, 1).toString());
        txtsurname.setText(tbshow.getValueAt(row, 2).toString());
        String gender=tbshow.getValueAt(row, 3).toString();
        if (gender.equals(rbmale.getText())){
            rbmale.setSelected(true);
        }else{
            rbfemale.setSelected(true);
        }
        txtemail.setText(tbshow.getValueAt(row, 4).toString());
        txtphone.setText(tbshow.getValueAt(row, 5).toString());
        txtvillage.setText(tbshow.getValueAt(row, 6).toString());
        txtdis.setText(tbshow.getValueAt(row, 7).toString());
        txtprovince.setText(tbshow.getValueAt(row, 8).toString());
        try {
        String datemem = tbshow.getValueAt(row, 9).toString(); 
        java.util.Date date = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(datemem);
        datemember.setDate(date);
        } catch (Exception e) {
            datemember.setDate(null);
        }
        try {
        String dateex = tbshow.getValueAt(row, 9).toString(); 
        java.util.Date date = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(dateex);
        dateexpira.setDate(date);
        } catch (Exception e) {
            dateexpira.setDate(null);
        }
        
        
        
        //txtid.setEditable(false);
    }//GEN-LAST:event_tbshowMouseClicked

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
            String sql="select * from member where M_id LIKE '%"+data+"%' or M_Name LIKE '%"+data+"%' or M_Surname LIKE '%"+data+"%' or Email LIKE '%"+data+"%' or Phone LIKE '%"+data+"%' or Village LIKE '"+data+"%' or District LIKE '"+data+"%' or Province LIKE '"+data+"'";
            ResultSet rs=con.createStatement().executeQuery(sql); 

            while(rs.next()){ 
                String [] arr={ 
                    rs.getString("M_id"),      
                    rs.getString("M_Name"),  
                    rs.getString("M_Surname"), 
                    rs.getString("Email"),     
                    rs.getString("Phone"),    
                    rs.getString("village"),
                    rs.getString("DIstrict"),
                    rs.getString("Province"),
                            
                };
                model.addRow(arr);
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            con=DB.DBConnect.getConnect();
            String sql="delete from member where M_id=?";
            PreparedStatement psm=con.prepareStatement(sql);
            psm.setString(1, id);
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

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       frm_search_member f=new frm_search_member(this);
        showDataByVal("");
        f.setVisible(true);
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dateexpira;
    private com.toedter.calendar.JDateChooser datemember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JButton search;
    private javax.swing.JTable tbshow;
    private javax.swing.JTextField txtdis;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtprovince;
    private javax.swing.JTextField txtsurname;
    private javax.swing.JTextField txtvillage;
    // End of variables declaration//GEN-END:variables
}
