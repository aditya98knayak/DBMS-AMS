/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author AVINASH
 */
public class Update_res extends javax.swing.JFrame {

    /**
     * Creates new form Update_res
     */
        Connection con=null;
    OraclePreparedStatement pst=null;
    OracleResultSet rs=null;
    public Update_res() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        DOB = new com.toedter.calendar.JDateChooser();
        Phone = new javax.swing.JTextField();
        FlatNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        RName = new javax.swing.JTextField();
        Rid = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        errof = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JDesktop.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rid");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RName");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOB");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FlatNo");

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneKeyTyped(evt);
            }
        });

        FlatNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FlatNoKeyTyped(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        RName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RNameKeyTyped(evt);
            }
        });

        Rid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RidKeyTyped(evt);
            }
        });

        error.setForeground(new java.awt.Color(255, 255, 255));

        errof.setForeground(new java.awt.Color(255, 255, 255));

        JDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(Gender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(DOB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(Phone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(FlatNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(RName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(Rid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(error, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JDesktop.setLayer(errof, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JDesktopLayout = new javax.swing.GroupLayout(JDesktop);
        JDesktop.setLayout(JDesktopLayout);
        JDesktopLayout.setHorizontalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopLayout.createSequentialGroup()
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDesktopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JDesktopLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(JDesktopLayout.createSequentialGroup()
                                        .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(Phone)
                            .addComponent(FlatNo)
                            .addComponent(RName)
                            .addComponent(Rid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(errof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(JDesktopLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        JDesktopLayout.setVerticalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rid, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RName, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DOB, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Phone, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errof, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RidKeyTyped
        // TODO add your handling code here:
    con=JavaConnectDb.ConnectDb();
    if(Rid.getText().length()==5)
    {
        evt.consume();
   
    try{
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","mathias");
         String sql="Select * from Resident where rid=?";
         PreparedStatement pst=con.prepareStatement(sql);
         pst.setString(1, Rid.getText());
         rs = (OracleResultSet) pst.executeQuery();
         if(rs.next()){
             Rid.setText(rs.getString("Rid"));
             RName.setText(rs.getString("RName"));
             DOB.setDate(rs.getDate("DOB"));
             Gender.setSelectedItem(rs.getString("Gender"));
             Phone.setText(String.valueOf(rs.getLong("Phone")));
             FlatNo.setText(String.valueOf(rs.getInt("FlatNo")));
             
         }
         
        
        
      
        
        
        
         

    } catch(Exception e)
    {
        System.out.println(e);
    }
    }
    }//GEN-LAST:event_RidKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         con=JavaConnectDb.ConnectDb();
         try{
             String sql="Select * from Resident where rid=?";
         PreparedStatement pst=con.prepareStatement(sql);
         pst.setString(1, Rid.getText());
         rs = (OracleResultSet) pst.executeQuery();
         if(rs.next()){
         
         try{
             String sql1="Update resident set RName=?, DOB=?, Gender=?, Phone=?, FlatNo=? where Rid=?";
         if(RName.getText().trim().isEmpty()||Phone.getText().trim().isEmpty()||DOB.toString().isEmpty()||FlatNo.getText().trim().isEmpty())
               {
                  JOptionPane.showMessageDialog(null,"Enter all mandatory fields"); 
               }
         else if(Phone.getText().length()!=10)
         {
             JOptionPane.showMessageDialog(null,"Please enter 10 digits"); 
         }
         
        else{
        String dateofbirth=((JTextField)DOB.getDateEditor().getUiComponent()).getText();
         
         java.util.Date myDate = new java.util.Date(dateofbirth);
       java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
         PreparedStatement pst1=con.prepareStatement(sql1);
         pst1.setString(1, RName.getText());
         pst1.setDate(2,sqlDate);
         pst1.setString(3, (String)Gender.getSelectedItem());
         pst1.setLong(4, Long.parseLong(Phone.getText()));
         pst1.setInt(5, Integer.parseInt(FlatNo.getText()));
         pst1.setInt(6, Integer.parseInt(Rid.getText()));
         pst1.executeUpdate();
         con.close();
        JOptionPane.showMessageDialog(null,"RESIDENT  record updated");
         this.dispose();
         
         } 
         }
         catch(Exception e){
            System.out.println(e); 
         }
         }
         
         else{
                 JOptionPane.showMessageDialog(null,"RESIDENT  record doesen't exist");
                 }
         }
         catch(Exception ex)
         {
             
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneKeyTyped
        // TODO add your handling code here:
        if(Character.isAlphabetic(evt.getKeyChar()))
        {
            evt.consume();
            error.setText("Numbers Only");
        }
        else{
            error.setText(null);
        }
        if(Phone.getText().length()>=10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_PhoneKeyTyped

    private void RNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RNameKeyTyped
        // TODO add your handling code here:
        if(RName.getText().length()>=19)
        {
            evt.consume();
        }
    }//GEN-LAST:event_RNameKeyTyped

    private void FlatNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FlatNoKeyTyped
        // TODO add your handling code here:
        con=JavaConnectDb.ConnectDb();
        if(FlatNo.getText().length()==3){
        evt.consume();
        try {
          
         
         
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","mathias");
        

      
        
        
        int fltno=Integer.parseInt(FlatNo.getText());
        String sql = "Select FlatNo from Flat where FlatNo=?";
       
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setInt(1, fltno);
        rs = (OracleResultSet) pst.executeQuery();
        int a = 0 ;
        while(rs.next()){
            a=rs.getInt(1);
        }
        if(a==fltno){
            
            errof.setText(null);
            
        }
        else{
            errof.setText("Flat Doesent Exist");
        }
       
        con.close();
       
    } catch(Exception e)
    {
        System.out.println(e);
    }
        }
        else{
            errof.setText(null);
        }
    }//GEN-LAST:event_FlatNoKeyTyped

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
            java.util.logging.Logger.getLogger(Update_res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_res().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JTextField FlatNo;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JDesktopPane JDesktop;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField RName;
    private javax.swing.JTextField Rid;
    private javax.swing.JLabel errof;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}