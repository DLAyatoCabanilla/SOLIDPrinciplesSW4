package OCP;

public class Customer {
    private String name;
    private Discount discount;
    private double amount;

    public Customer(String name, String type, double amount) {
        this.name = name;
        this.amount = amount;
        setDiscount(type);
    }

    public double getAmount() {
        return amount;
    }

    private void setDiscount(String type) {
        switch (type.toLowerCase()) {
            case "student":
                discount = new StudentDiscount();
                break;
            case "senior citizen":
                discount = new SeniorCitizenDiscount();
                break;
            default:
                discount = new RegularDiscount();
                break;
        }
    }

    public double calculateDiscount() {
        return discount.calculateDiscount(amount);
    }

    public double applyDiscount(double amount) {
        return amount - calculateDiscount();
    }
    public String getName() {
        return name;
    }



}
