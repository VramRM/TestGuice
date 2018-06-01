package Billing;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import PaymentProcessor.PaymentProcessor;
import Reciept.Reciept;

public class BillingService {
    private final PaymentProcessor processor;
    
    @Inject
    BillingService(@Named("Visa") PaymentProcessor processor) {
        this.processor = processor;
    }

    public Reciept chargeOrder() {
    	System.out.println("Charging Order from " + processor.toString());
        return null;
    }
    
    
}
