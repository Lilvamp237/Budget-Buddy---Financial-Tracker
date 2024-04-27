package financegui;

public abstract class Transaction {
    protected User user;
    protected Category category;
    protected float amount;

    public abstract float getAmount();
    public abstract void setAmount();

}
