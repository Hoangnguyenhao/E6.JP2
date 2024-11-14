package Entity;

public class Order {
    private int id;
    private int customerId;
    private String dateTime;

    public Order(int id, int customerId, String dateTime) {
        this.id = id;
        this.customerId = customerId;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
