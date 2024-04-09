package BudgetBuddy;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

public class User{
    private String username;
    private String name;
    private String password;
    private String email;
    private String dob, gender, contactno;

    private Budget budget;
    private static User array[] = new User[20];
    private static int count =0;

    public User(String user_id, String name, String dob, String gender, String contactno, String password, String email) {
        //validate the inputs
        this.username = user_id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.contactno = contactno;
        this.password = password;
        this.email = email;
        
        //array[count] = new User(user_id, name, email, dob, password, gender, contactno);
        count++;

    }

    public static boolean validateUN(String userName){
       // String regx = "[A-Z]([a-z]+|\\s[a-z]+)";
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
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.closeCon();
        }
        
        return out;
    }

}