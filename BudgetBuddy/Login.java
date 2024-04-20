package BudgetBuddy;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sasini Lekamge
 */

public class Login extends javax.swing.JFrame {

    User user;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Budget = new javax.swing.JLabel();
        Buddy = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        UName = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        logInButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255,80));

        Budget.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        Budget.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Budget.setText("BUDGET");

        Buddy.setFont(new java.awt.Font("Candara", 1, 60)); // NOI18N
        Buddy.setText("BUDDY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(Budget, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buddy)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Budget, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buddy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 550, 140));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255,80));

        UName.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        UName.setText("USERNAME");

        Password.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        Password.setText("PASSWORD");

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        username.setText(" ");

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        logInButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logInButton.setText("LOG IN");

        jLabel6.setFont(new java.awt.Font("Candara", 0, 13)); // NOI18N
        jLabel6.setText("Don't have an account?");

        signUpButton.setForeground(new java.awt.Color(0, 0, 204));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
//hello sasi
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UName)
                            .addComponent(Password))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(logInButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUpButton)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password))
                .addGap(18, 18, 18)
                .addComponent(logInButton)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(signUpButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new AbsoluteConstraints(0, 480, -1, 220));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/login.jpg"))); // NOI18N
        image.setText("jLabel1");
        getContentPane().add(image, new AbsoluteConstraints(-10, -60, -1, -1));

        setSize(new java.awt.Dimension(568, 747));
        setLocationRelativeTo(null);


        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String uname = username.getText();
                String pass = new String(password.getPassword());

                user = new User(uname, pass);
                
                
                if (user.loginUser()) {
                    // Login successful, navigate to the main application screen
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    // Add code here to navigate to the main application screen
                    dispose();
                    user.setUserDetails();
                    Home home=new Home(user);
                    home.setVisible(true);
                } else if (user.loginUser()==false){
                    // Login failed, display error message
                    JOptionPane.showMessageDialog(null, "Invalid username or password!");
                }
            }
        });
    }// </editor-fold>                        
    
    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
        Register register=new Register ();
        register.setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration                   
    private javax.swing.JLabel Buddy;
    private javax.swing.JLabel Budget;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel UName;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logInButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField username;
    // End of variables declaration                   
}
