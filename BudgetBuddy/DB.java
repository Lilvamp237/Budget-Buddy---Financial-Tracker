package BudgetBuddy;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    private String url ="jdbc:mysql://localhost:3306/budgetbuddy";
    private String un="root";
    private String pw="Sumu1234!";
    private Connection con;

    public DB() {
        con = getCon();
    }
    
    public Connection getCon(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, un, pw);
            System.out.println("sucessful");
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
             System.out.println(ex);
        }
        return con;
    }
    
    public void closeCon(){
        if (con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public boolean execute (String query){
        boolean status =false;
        
        try {
            Statement stmt = (Statement) con.createStatement();
            stmt.executeUpdate(query);
            status =true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status; 
    }

    public ResultSet getData (String query){
        ResultSet rs = null;
        try {
            Statement stmt=con.createStatement();
             rs=stmt.executeQuery(query); 
            //while(rs.next())
              //  System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    return rs;
    }

    public static void main(String[] args) {
        DB ob = new DB();
    }
    
    
}
