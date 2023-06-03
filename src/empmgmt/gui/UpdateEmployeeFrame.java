
package empmgmt.gui;

import empmgmt.dao.EmpDao;
import empmgmt.pojo.EmpPojo;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UpdateEmployeeFrame extends javax.swing.JFrame {

    
    EmpPojo emp;
    public UpdateEmployeeFrame() 
    {
        initComponents();
        setLocationRelativeTo(null);
        txtEName.setEditable(false);
        txtESalary.setEditable(false);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEmpNo = new javax.swing.JLabel();
        lblEName = new javax.swing.JLabel();
        lblESalary = new javax.swing.JLabel();
        btnUpdateEmp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtEmpNo = new javax.swing.JTextField();
        txtEName = new javax.swing.JTextField();
        txtESalary = new javax.swing.JTextField();
        btnShowRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Upadte  Employee");

        lblEmpNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmpNo.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpNo.setText("Emp No");

        lblEName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEName.setForeground(new java.awt.Color(255, 255, 255));
        lblEName.setText("Name");

        lblESalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblESalary.setForeground(new java.awt.Color(255, 255, 255));
        lblESalary.setText("Salary");

        btnUpdateEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdateEmp.setText("Update Emp");
        btnUpdateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmpActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtEmpNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtEName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtESalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnShowRecord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowRecord.setText("SHOW RECORD");
        btnShowRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnShowRecord)
                        .addGap(109, 109, 109)
                        .addComponent(btnUpdateEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmpNo)
                            .addComponent(lblEName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblESalary, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpNo, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txtEName)
                            .addComponent(txtESalary))
                        .addGap(35, 35, 35))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 299, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpNo)
                            .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEName)
                            .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblESalary)
                        .addComponent(txtESalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateEmp)
                    .addComponent(btnBack)
                    .addComponent(btnShowRecord))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        OptionFrame opFrame=new OptionFrame();
        opFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmpActionPerformed
        // TODO add your handling code here:
         if(validateInputs() == false){
            JOptionPane.showMessageDialog(null, "Please Input At First !", "ERROR",JOptionPane.WARNING_MESSAGE);
            return;
        }
        String empNo = txtEmpNo.getText().trim();
        String empName = txtEName.getText().trim();
        String empSal = txtESalary.getText().trim();
        if(empName.isEmpty() || empName.isEmpty()){
            JOptionPane.showMessageDialog(null, "Input Field can't be Empty !", "ERROR",JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            int eNo = Integer.parseInt(empNo);
            double eSal = Double.parseDouble(empSal);
            EmpPojo emp = new EmpPojo(eNo,empName,eSal);
            boolean bool = EmpDao.UpdateEmp(emp);
            if(bool){
                JOptionPane.showMessageDialog(null, "Record Updated Successfully !", "Success",JOptionPane.INFORMATION_MESSAGE);
                clearInputs();
                return;
            }
            JOptionPane.showMessageDialog(null, "Record not Updated try Again !", "",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in DB", "ERROR",JOptionPane.WARNING_MESSAGE);
            ex.printStackTrace();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Input According to Field", "ERROR",JOptionPane.WARNING_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateEmpActionPerformed

    private void btnShowRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowRecordActionPerformed
        // TODO add your handling code here:
        String empNo = txtEmpNo.getText().trim();
        if(empNo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input your emp no.");
            return;
        }
        
        try{
            emp = EmpDao.getUserDetailsByEmpNo(Integer.parseInt(empNo));
            if(emp == null){
                JOptionPane.showMessageDialog(null, "Invalid Emp No!");
                return;
            }
            txtEmpNo.setText(String.valueOf(emp.getEmpNo()));
            txtEName.setText(String.valueOf(emp.getEmpName()));
            txtESalary.setText(String.valueOf(emp.getEmpSal()));
            txtEmpNo.setEditable(false);
            txtEName.setEditable(true);
            txtESalary.setEditable(true);
        }
        catch(NumberFormatException ex){
            
        }catch(SQLException ex){
            
        }

    }//GEN-LAST:event_btnShowRecordActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnShowRecord;
    private javax.swing.JButton btnUpdateEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEName;
    private javax.swing.JLabel lblESalary;
    private javax.swing.JLabel lblEmpNo;
    private javax.swing.JTextField txtEName;
    private javax.swing.JTextField txtESalary;
    private javax.swing.JTextField txtEmpNo;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() 
    {
         txtEmpNo.requestFocus();
        return !txtEmpNo.getText().isEmpty();
    }

    private void clearInputs() 
    {
        txtEmpNo.setText("");
        txtEName.setText("");
        txtESalary.setText("");
        txtEmpNo.setEditable(true);
        txtEName.setEditable(false);
        txtESalary.setEditable(false);
        txtEmpNo.requestFocus();
        
    }
}
