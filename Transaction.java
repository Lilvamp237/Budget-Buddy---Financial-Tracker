public abstract class Transaction {
    protected Category category;
    protected int amount;

    public abstract int getAmount();
    public abstract void setAmount();

}
