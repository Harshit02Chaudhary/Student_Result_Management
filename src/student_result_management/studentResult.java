/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_management;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author HARSHIT
 */
public class studentResult extends javax.swing.JFrame {

    /**
     * Creates new form studentResult
     */
    public studentResult() {
        initComponents();
    }
    public studentResult(String rollno) {
        initComponents();
        jTextField3.setText(rollno);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management/addnewstudent.jpg"))); // NOI18N
        jLabel26.setText("jLabel26");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel1.setText("Course Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 18, 104, 30));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 66, 104, 26));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel3.setText("Roll No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 114, 104, 30));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 18, 148, 30));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 66, 148, 30));

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 114, 148, 30));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel4.setText("Branch");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 25, 113, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 73, 113, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel6.setText("Father's Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 121, 113, -1));

        jTextField4.setEditable(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 66, 148, 30));

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 18, 148, 30));

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 114, 148, 30));

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel7.setText("Total Marks");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, 25));

        jLabel8.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel8.setText("Passing Marks");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 120, 25));

        jLabel9.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel9.setText("Marks Obtained");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 140, 25));

        jLabel10.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel10.setText("Physics");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 57, 105, 22));

        jLabel11.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel11.setText("Maths");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 101, 105, 22));

        jLabel12.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel12.setText("OS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 145, 105, 22));

        jLabel13.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel13.setText("CN");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 189, 105, 22));

        jLabel14.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel14.setText("DBMS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 233, 105, 22));

        jLabel15.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel15.setText("100");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 57, 110, 25));

        jLabel16.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel16.setText("100");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 101, 110, 25));

        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel17.setText("100");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 145, 110, 25));

        jLabel18.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel18.setText("100");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 189, 110, 25));

        jLabel19.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel19.setText("100");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 233, 110, 25));

        jLabel20.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel20.setText("30");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 57, 110, 25));

        jLabel21.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel21.setText("30");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 101, 110, 25));

        jLabel22.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel22.setText("30");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 145, 110, 25));

        jLabel23.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel23.setText("30");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 189, 110, 25));

        jLabel24.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel24.setText("30");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 233, 110, 25));

        jTextField7.setEditable(false);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 56, 110, 25));

        jTextField8.setEditable(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 100, 110, 25));

        jTextField9.setEditable(false);
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 144, 110, 25));

        jTextField10.setEditable(false);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 188, 110, 25));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 232, 110, 25));

        jLabel25.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel25.setText("Total Marks Obtained");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 180, 31));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 273, 111, 25));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 329, 269, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management/icons8-cancel-24.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 319, 107, 33));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management/marks.jpg"))); // NOI18N
        jLabel29.setText("jLabel29");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 660, 360));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_result_management/addnewstudent.jpg"))); // NOI18N
        jLabel27.setText("jLabel27");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollno = jTextField3.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm", "root", "sql@1234");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollno = '"+rollno+"' and result.rollno = '"+rollno+"'");
            if(rs.next()){
                jTextField1.setText(rs.getString(2));
                jTextField5.setText(rs.getString(3));
                jTextField2.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
                jTextField6.setText(rs.getString(6));
                
                jTextField7.setText(rs.getString(8));
                jTextField8.setText(rs.getString(9));
                jTextField9.setText(rs.getString(10));
                jTextField10.setText(rs.getString(11));
                jTextField11.setText(rs.getString(12));
                
                int p = Integer.parseInt(jTextField7.getText());
                int m = Integer.parseInt(jTextField8.getText());
                int o = Integer.parseInt(jTextField9.getText());
                int c = Integer.parseInt(jTextField10.getText());
                int d = Integer.parseInt(jTextField11.getText());
                
                int total = p+m+o+c+d;
                
                jTextField12.setText(String.valueOf(total));
                
                if(total >= 150) {
                    jTextField13.setText("Hurray! You Passed :)");
                }else{
                    jTextField13.setText("You Failed :(");
                }
            }            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentHome().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(studentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
