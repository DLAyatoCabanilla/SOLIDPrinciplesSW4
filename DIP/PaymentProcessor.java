package DIP;

import java.util.Map;

public class PaymentProcessor {
    private final Map<String, PaymentMethod> paymentMethods;

    public PaymentProcessor(Map<String, PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public void processPayment(Order order) {
        String paymentMethod = order.getPaymentMethod();

        if (!paymentMethods.containsKey(paymentMethod)) {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }

        PaymentMethod selectedPaymentMethod = paymentMethods.get(paymentMethod);
        selectedPaymentMethod.pay(order.getAmount());
    }

}
