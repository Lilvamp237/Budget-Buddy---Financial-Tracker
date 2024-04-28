package financegui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class IncomeTransaction extends Transaction {
    protected String description;
    protected User user;
    protected float amount;
    protected Category category;
    protected float totalincome;

    public IncomeTransaction(User user){
        this.user = user;
    }

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

    public float getTotalIncomeforCurrentMonth() {
        totalincome = 0;
        try {
            DB db = new DB();
            ResultSet rs = db.getData("SELECT SUM(amount) AS totalIncome FROM income WHERE username='" + user.getUserName().trim() + "'AND MONTH(month) = MONTH(CURRENT_DATE());");
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

    public String[] getCategory(){
        String[] catg = new String[3]; 
        int index = 0;
        try {
            DB db = new DB();
            ResultSet rs = db.getData("SELECT category, SUM(amount) AS total FROM income WHERE username='" + user.getUserName().trim() + "'AND MONTH(month) = MONTH(CURRENT_DATE()) GROUP BY category");
            Map<String, Float> categoryMap = new HashMap<>();
        
            while (rs.next()) {
                String category = rs.getString("category");
                float amount = rs.getFloat("total");
            
                categoryMap.put(category, amount);
            }   

            String[] customOrder = {"Salary", "Investments", "Other"};
 
            for (String category : customOrder) {
                if (categoryMap.containsKey(category)) {
                    catg[index] = category + ": " + categoryMap.get(category);
                    index++;
                } else {
                    catg[index] = category + ": null"; // Category not found, set amount to null
                    index++;
                }    
            }
            db.closeCon();
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
        return catg;
    }


    public String toString() {
        return getTotalIncome()+"";
    }

    public void setTotalIncome(float newTotalIncome) {
        this.totalincome = newTotalIncome;
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
