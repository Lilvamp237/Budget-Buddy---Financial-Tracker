package BudgetBuddy;

public class ExpenseTransaction extends Transaction {
    protected String description;

    public ExpenseTransaction(String user, String description, float amount){
        new User(user);
        this.description = description;
        this.amount = amount;
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(){
        
    }
    
}
