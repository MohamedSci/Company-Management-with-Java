/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employeepanales;

import companymanagement.Support;
import static companymanagement.Support.rs;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class AddEmployee extends javax.swing.JPanel {
    String gender = null;  
     String imgy = null;
   int a = 0;
   ImageIcon imageIcon =null;
    Image dimg = null;
            
 public int getI() {
        return i;
    }
 

 
 public  void clearance(){
        try {
 Support.ex("select max(employee_id) from employee");
                 a =  rs.getInt(1)+1;
            employee_id.setText(String.valueOf(a));
            first_name.setText(null);
            last_name.setText(null);
            salary.setText(null);
            manager_id.setText(null);
             email.setText(null);
             e_male.setSelected(false);
             e_female.setSelected(false);
             imgtxt.setText(null); 
             addimg.setIcon(null);
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }
   private int i =0;
    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
        clearance();
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employee_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        last_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        manager_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        e_male = new javax.swing.JRadioButton();
        e_female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        imgtxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        addimg = new javax.swing.JLabel();
        hire_date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setText("Add Employee");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Employee ID");

        employee_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("First Name");

        first_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Last Name");

        last_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_nameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Salary");

        salary.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Hire Date");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Manager ID");

        manager_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        manager_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_idActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Gender");

        e_male.setText("Male");
        e_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_maleActionPerformed(evt);
            }
        });

        e_female.setText("Female");
        e_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_femaleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Department");

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Executive", "Sales", "Customer Support", "Hardware Development",
            "Software Development" ,"Marketing","Finance","Legal" ,"Maintenance"}));
department.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        departmentActionPerformed(evt);
    }
    });

    jButton1.setBackground(new java.awt.Color(0, 204, 204));
    jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
    jButton1.setForeground(new java.awt.Color(51, 51, 51));
    jButton1.setText("Add");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel10.setText("Image");

    imgtxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

    jButton2.setBackground(new java.awt.Color(255, 153, 255));
    jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jButton2.setText("Upload");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    addimg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

    jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel11.setText("Email");

    email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    email.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            emailActionPerformed(evt);
        }
    });

    jButton3.setText("Reset");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(83, Short.MAX_VALUE)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
            .addComponent(addimg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(51, 51, 51)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8)
                .addComponent(jLabel5)
                .addComponent(jLabel1)
                .addComponent(jLabel3)
                .addComponent(jLabel9)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4))
                .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(first_name)
                        .addComponent(last_name)
                        .addComponent(salary)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(manager_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addGap(99, 99, 99)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(imgtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(e_male)
                                    .addGap(116, 116, 116)
                                    .addComponent(e_female)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(hire_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addComponent(employee_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(addimg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel2)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(hire_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(manager_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(e_male)
                        .addComponent(e_female))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(imgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addGap(27, 27, 27)
                    .addComponent(jLabel11)
                    .addGap(28, 28, 28)
                    .addComponent(jLabel6)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel8)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel9)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel10)))
            .addGap(23, 23, 23))
    );

    add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_nameActionPerformed

    private void e_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_maleActionPerformed
        // TODO add your handling code here:
        if(e_male.isSelected()){
            gender = "Male";
            e_female.setSelected(false);
        }
    }//GEN-LAST:event_e_maleActionPerformed

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        // TODO add your handling code here:
        String selecteddepartment = (String) department.getSelectedItem();

        if (selecteddepartment .equals("Executive")) {
            setI(1);
        }
        else if (selecteddepartment .equals("Sales")) {
            setI(2);
        }
        else if (selecteddepartment .equals("Customer Support")) {
            setI(3);
        }
        else if (selecteddepartment .equals("Hardware Development")) {
            setI(4);
        }
        else if (selecteddepartment .equals("Software Development")) {
            setI(5);
        }
        else if (selecteddepartment .equals("Marketing")) {
            setI(6);
        }
        else if (selecteddepartment .equals("Finance")) {
            setI(7);
        }
        else if (selecteddepartment .equals("Legal")) {
            setI(8);
        }
        else
        {
            setI(9);
        }

    }//GEN-LAST:event_departmentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
            // TODO add your handling code here:
         /* hire_date.getDate();
             java.util.Date date1=  new SimpleDateFormat("dd/MM/yyyy").parse(hiredate.;  */
            SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/YYYY");
            Support.insert(Integer.parseInt( employee_id.getText()), first_name.getText(), last_name.getText(),
                    Integer.parseInt(salary.getText()), getI(), Integer.parseInt(manager_id.getText() ), sdf.format(hire_date.getDate()),gender,imgy,email.getText());
            clearance();
            
           /* Support.dml("insert into employee ( employee_id, first_name, last_name, salary ,department_id, manager_id, hire_date) values ( "                  
                + e_id.getText() +"  , "+ e_firstname.getText() +" , "+e_lastname.getText() +" , " + e_salary.getText() +"  , "
                + String.valueOf(getI()) +" ,  "+e_managerid.getText() + " , " + sdf.format( hire_date.getDate())+" )");

        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:               
     
    
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if(f.isFile())
          imgy = f.getAbsolutePath();
     BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgy));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(addimg.getWidth(), addimg.getHeight(),
                Image.SCALE_SMOOTH);     
        ImageIcon imageIcon = new ImageIcon(dimg);
             addimg.setIcon(imageIcon);
     imgtxt.setText(imgy);
     
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void e_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_femaleActionPerformed
        // TODO add your handling code here:
         if(e_female.isSelected()){
            gender = "Female";
            e_male.setSelected(false);
        }
    }//GEN-LAST:event_e_femaleActionPerformed

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

    private void manager_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manager_idActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clearance();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addimg;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JRadioButton e_female;
    private javax.swing.JRadioButton e_male;
    private javax.swing.JTextField email;
    private javax.swing.JTextField employee_id;
    private javax.swing.JTextField first_name;
    private com.toedter.calendar.JDateChooser hire_date;
    private javax.swing.JTextField imgtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField last_name;
    private javax.swing.JTextField manager_id;
    private javax.swing.JTextField salary;
    // End of variables declaration//GEN-END:variables
}