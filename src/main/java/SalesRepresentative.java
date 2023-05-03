public class SalesRepresentative {
    private int numberOfSales;
    private int quota;
    private int amount;

    public SalesRepresentative(int numberOfSales, int quota) {
        this.numberOfSales = numberOfSales;
        this.quota = quota;
        this.amount = numberOfSales * quota;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "numberOfSales=" + numberOfSales +
                ", quota=" + quota +
                ", amount=" + amount +
                '}';
    }

}
