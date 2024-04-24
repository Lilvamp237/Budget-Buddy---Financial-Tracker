package BudgetBuddy;

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
    public void getTotalIncome(){
        DB db = new DB();
        ResultSet rs = db.getData("SELECT SUM * FROM `user` WHERE username= '" + User.getUserName().trim() + "'");
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
