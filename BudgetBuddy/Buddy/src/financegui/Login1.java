package financegui;

import javax.swing.JOptionPane;
/**
 *
 * @author Sasini Lekamge
 */
public class Login1 extends javax.swing.JFrame {

    private User user;
    /**
     * Creates new form Login
     */
    public Login1() {
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
                .addGap(103, 103, 103))
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

        jPanel3.setBackground(new java.awt.Color(204, 204, 255,150));

        Password.setFont(new java.awt.Font("Candara", 1, 26)); // NOI18N
        Password.setText("PASSWORD");

        UName.setFont(new java.awt.Font("Candara", 1, 26)); // NOI18N
        UName.setText("USERNAME");

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        username.setText(" ");

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        logInButton.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        logInButton.setText("LOG IN");

        jLabel6.setFont(new java.awt.Font("Candara", 3, 18)); // NOI18N
        jLabel6.setText("Don't have an account?");

        signUpButton.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(0, 0, 204));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password)
                            .addComponent(UName))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logInButton)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(signUpButton)))
                .addGap(75, 75, 75))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UName)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logInButton)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel3, new AbsoluteConstraints(0, 480, 550, 220));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/bb.login.jpg"))); // NOI18N
        image.setText("jLabel1");
        getContentPane().add(image, new AbsoluteConstraints(-10, -60, -1, -1));

        setSize(new java.awt.Dimension(568, 747));
        setLocationRelativeTo(null);


        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login();
            }
        });
    
        // KeyListener for handling Enter key press event on username field
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    login();
                }
            }
        });
    
        // KeyListener for handling Enter key press event on password field
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    login();
                }
            }
        });
    }// </editor-fold>  
    
    private void login(){
        String uname = username.getText();
        String pass = new String(password.getPassword());

        user = new User(uname, pass);
                
        if (user.loginUser()) {
            // Login successful, navigate to the main application screen
            JOptionPane.showMessageDialog(null, "Login successful!");
            // Navigate to the main application screen
            user.setUserDetails();
            dispose();
            Home3 home=new Home3(user);
            home.setVisible(true);
        } else if (user.loginUser()==false){
            // Login failed, display error message
            JOptionPane.showMessageDialog(null, "Invalid username or password!");
        }
    }
    
    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
        Register2 register=new Register2();
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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
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
