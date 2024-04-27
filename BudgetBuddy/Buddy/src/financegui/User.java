package financegui;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

public class User{
    private String username;
    private String name;
    private String password;
    private String email;
    private String dob, gender;

    private Budget8 budget;

    private static int userCount =0;

    public User() {
    }

    public User(User user) {
        this.username = user.getUserName(); // Assuming getUsername() method exists in your User class
        this.name = user.getName();
        this.dob = user.getDob();
        this.gender = user.getGender();
        this.password = user.getPassword();
        this.email = user.getEmail();
        // Copy any other fields as needed
    }   

    public User(String user_id) {
        //validate the inputs
        this.username = user_id;
    }

    public User(String user_id, String pass) {
        //validate the inputs
        this.username = user_id;
        this.password = pass;
    } 

    public User(String user_id, String name, String dob, String gender, String password, String email) {
        //validate the inputs
        this.username = user_id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        //this.contactno = contactno;
        this.password = password;
        this.email = email;
        
        //array[count] = new User(user_id, name, email, dob, password, gender, contactno);
        userCount++;
    }

    public void setUserName(){

    }
    public void setPassword(){
        
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setEmail(String email){
        this.email = email;
    }


    public String getUserName(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getDob(){
        return dob;
    }

    public String getGender(){
        return gender;
    }

    public String getEmail(){
        return email;
    }


    public static boolean validateUN(String userName){
        String regx = "^[A-Za-z][A-Za-z0-9_].{0,19}$";
        boolean out = Pattern.matches(regx, userName);
        return out;
    }
    public static boolean validatePassword(String password){
        //one digit, one capital, one simple, one special character with min length 8 and max length 15
        String regx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,15}$";
        boolean out = Pattern.matches(regx, password);
        return out;
    }
    public static boolean validateEmail(String email){
        String regx = "^(.+)@(\\S+)$";
        boolean out = Pattern.matches(regx, email);
        return out;
    }

    public static boolean checkUserName(String userName){
        boolean out = false; 
        // Perform validation against the database, checks if the username exists already
        DB db = new DB();
        ResultSet rs = db.getData("SELECT * FROM `user` WHERE username= '" + userName.trim() + "'");
        try {
            out = rs.next();
            System.out.println(out);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.closeCon();
        }
        
        return out;
    }

    public boolean registerUser(){
        DB db = new DB();
            if (db.execute("INSERT INTO user(username, name, dob, gender, passw, email) VALUES ('" + username.trim() + "', '"  + name.trim() + "', '" + dob.trim() + "', '" + gender.trim() + "', '" + password.trim() + "', '" + email.trim() + "')")) {
                return true;
            }
        db.closeCon();
        return false;
    }

    public boolean loginUser(){
        boolean loginOk = false;
        DB db = new DB();
        ResultSet rs = db.getData("SELECT * FROM `user` WHERE username= '" + username.trim() + "' AND passw= '" + password.trim() + "'");
        try {
            loginOk = rs.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.closeCon();
        }
        return loginOk;
    }

    public void setUserDetails(){
        boolean out = false;
        DB db = new DB();
        ResultSet rs = db.getData("SELECT * FROM `user` WHERE username= '" + username.trim() + "'");
        try {
            out = rs.next();
            // If the username exists, retrieve the full name
            if (out) {
                setName(rs.getString("name")); 
                setDob(rs.getString("dob"));
                setGender(rs.getString("gender"));
                setEmail(rs.getString("email"));
            }
            System.out.println(out);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.closeCon();
        }
    }


    
}
