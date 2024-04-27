package financegui;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExpenseTransaction extends Transaction {
    protected String description;
    protected User user;
    protected float amount;
    protected Category category;
    protected float totalExpense;

    public ExpenseTransaction(User user, String description, float amount, Category categ){
        this.user  = user;
        this.description = description;
        this.amount = amount;
        this.category = categ;
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(){
        
    }

    public float getTotalExpenses() {
        totalExpense = 0;
        try {
            DB db = new DB();
            ResultSet rs = db.getData("SELECT SUM(amount) AS totalExpenses FROM expense WHERE username='" + user.getUserName().trim() + "'");
            if (rs.next()) {
                totalExpense = rs.getFloat("totalExpenses");
            }
            db.closeCon();
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
        return totalExpense;
    }

    
    public boolean addNewTransaction(){
        DB db = new DB();
        if (db.execute("INSERT INTO expenses(username, category, description, amount) VALUES ('" + user.getUserName().trim() + "', '" + category.getCategoryName().trim() + "', '" + description.trim() + "', '" + amount +  "')")) {
            return true;
        }
        db.closeCon();
        return false;
    }
}
