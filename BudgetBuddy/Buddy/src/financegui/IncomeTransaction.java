package financegui;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IncomeTransaction extends Transaction {
    protected String description;
    protected User user;
    protected float amount;
    protected Category category;
    protected float totalincome;

    public IncomeTransaction(User user, String description, float amount, Category categ){
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

    public float getTotalIncome() {
        totalincome = 0;
        try {
            DB db = new DB();
            ResultSet rs = db.getData("SELECT SUM(amount) AS totalIncome FROM income WHERE username='" + user.getUserName().trim() + "'");
            if (rs.next()) {
                totalincome = rs.getFloat("totalIncome");
            }
            db.closeCon();
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
        return totalincome;
    }

    public boolean addNewTransaction(){
        DB db = new DB();
        if (db.execute("INSERT INTO income(username, category, description, amount) VALUES ('" + user.getUserName().trim() + "', '" + category.getCategoryName().trim() + "', '" + description.trim() + "', '" + amount +  "')")) {
            return true;
        }
        db.closeCon();
        return false;
    }
}
