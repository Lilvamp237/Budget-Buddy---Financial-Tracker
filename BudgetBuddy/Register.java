package BudgetBuddy;

import javax.swing.JOptionPane;

/**
 *
 * @author senud
 */

public class Register extends javax.swing.JFrame {
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CreateAnAccount = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        confirm = new javax.swing.JTextField();
        signUp = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<String>();
        year = new javax.swing.JComboBox<String>();
        month = new javax.swing.JComboBox<String>();
        date = new javax.swing.JComboBox<String>();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        FName1 = new javax.swing.JLabel();
        LName1 = new javax.swing.JLabel();
        UName1 = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        Password1 = new javax.swing.JLabel();
        ConfirmPW1 = new javax.swing.JLabel();
        Birthdate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up page");
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255,80));

        CreateAnAccount.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        CreateAnAccount.setText("Create An Account");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        signUp.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        signUp.setText("SIGN UP");
        signUp.setHideActionText(true);
        signUp.setName(""); // NOI18N
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female ", "Prefer Not To Say", " " }));

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930" }));

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        firstname.setNextFocusableComponent(LName1);
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });

        FName1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        FName1.setText("First Name:");

        LName1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        LName1.setText("Last Name:");

        UName1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        UName1.setText("Username:");

        Email1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        Email1.setText("Email:");

        Password1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        Password1.setText("Password:");

        ConfirmPW1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        ConfirmPW1.setText("Confirm Password:");

        Birthdate.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        Birthdate.setText("Birth Date: ");

        jLabel1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel1.setText("Gender:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LName1)
                            .addComponent(FName1)
                            .addComponent(UName1)
                            .addComponent(Email1)
                            .addComponent(Password1)
                            .addComponent(ConfirmPW1)
                            .addComponent(Birthdate)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(username)
                            .addComponent(lastname)
                            .addComponent(firstname)
                            .addComponent(email)
                            .addComponent(password)
                            .addComponent(confirm)
                            .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(CreateAnAccount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(signUp)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(CreateAnAccount)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FName1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LName1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UName1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPW1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Birthdate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(signUp)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new AbsoluteConstraints(40, 50, 470, 590));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/signin.jpg"))); // NOI18N
        image.setText("jLabel1");
        getContentPane().add(image, new AbsoluteConstraints(0, -10, 580, 790));

        setSize(new java.awt.Dimension(568, 747));
        setLocationRelativeTo(null);
    
        


        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String uname = username.getText();
                String fname = firstname.getText();
                String lname = lastname.getText();
                String mail = email.getText();
                String pass = password.getText();
                String confPass = confirm.getText();
                String gen = gender.getSelectedItem().toString();
                String dob = year.getSelectedItem().toString() + "-" + month.getSelectedItem().toString() + "-" + date.getSelectedItem().toString();
                //String tel = telno.getText();
                
                // Create a new User object
                User newUser = new User(uname, fname + " " + lname, dob, gen, pass, mail);
                
                // Perform validation and registration
                if (!User.validateUN(uname)) {
                    JOptionPane.showMessageDialog(null, "Invalid username format!\nCan contain only alphabetic characters and numbers.");
                } else if (User.checkUserName(uname)) {
                    JOptionPane.showMessageDialog(null, "Username already exists!\nTry another.");
                } else if (!User.validateEmail(mail)) {
                    JOptionPane.showMessageDialog(null, "Invalid email format!\nExample: email@service.com");
                } else if (!User.validatePassword(pass)) {
                    System.out.println(User.validatePassword(pass));
                    JOptionPane.showMessageDialog(null, "Invalid password format!\nMust contain Upper letters, Lower letters, numbers and special characters.\nLength of 8-15");
                } else if (!pass.equals(confPass)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match!");
                } else {
                    // Insert the user data into the database
                    if (newUser.registerUser()) {
                        JOptionPane.showMessageDialog(null, "Registration successful!");
                        dispose();
                        Login login=new Login();
                        login.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to register user!");
                    }
                }
            }
        });
    
    }// </editor-fold>
    
    
    
    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration                
    private javax.swing.JLabel Birthdate;
    private javax.swing.JLabel ConfirmPW1;
    private javax.swing.JLabel CreateAnAccount;
    private javax.swing.JLabel Email1;
    private javax.swing.JLabel FName1;
    private javax.swing.JLabel LName1;
    private javax.swing.JLabel Password1;
    private javax.swing.JLabel UName1;
    private javax.swing.JTextField confirm;
    private javax.swing.JComboBox<String> date;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField password;
    private javax.swing.JButton signUp;
    private javax.swing.JTextField username;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration                   
}
