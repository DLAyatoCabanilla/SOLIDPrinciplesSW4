package DIP;
import java.util.Map;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        PaymentMethod eWallet= new EWallet();
        PaymentMethod cash = new Cash();
        PaymentMethod credit = new CreditCard();

        Map<String, PaymentMethod> paymentMethods = new HashMap<>();

        paymentMethods.put("ewallet", eWallet);
        paymentMethods.put("cash", cash);
        paymentMethods.put("creditcard", credit);

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethods);

        Order order1 = new Order("Order1", 500.00, "ewallet");
        Order order2 = new Order("Order2", 200.00, "cash");

        paymentProcessor.processPayment(order1);
        paymentProcessor.processPayment(order2);
    }
}