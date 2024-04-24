package BudgetBuddy;

import java.sql.ResultSet;

public class ExpenseTransaction extends Transaction {
    protected String description;
    protected User user;
    protected float amount;
    protected Category category;
    protected String totalExpense;

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

    public void getTotalExpense(){
        DB db = new DB();
        ResultSet rs = db.getData("SELECT SUM(totalexpense)  FROM `income` WHERE username= '" + user.getUserName().trim() + "'");
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
