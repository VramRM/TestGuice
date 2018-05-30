package Billing;

import PaymentProcessor.PaymentProcessor;
import Reciept.Reciept;

public class BillingService {
    private final PaymentProcessor processor;
    
    public BillingService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public Reciept chargeOrder() {
        return null;
    }
}
