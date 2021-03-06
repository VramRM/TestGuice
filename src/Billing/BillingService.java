package Billing;

import com.google.inject.Inject;

import PaymentProcessor.PaymentProcessor;
import Reciept.Reciept;

public class BillingService {
    private final PaymentProcessor processor;
    //private final Provider<PaymentProcessor> processor;
    
    @Inject
    BillingService(PaymentProcessor processor) {
        this.processor = processor;
    }
//    @Inject
//    BillingService(@Named("PayPal") PaymentProcessor processor) {
//    	this.processor = processor;
//    }
//    @Inject
//    BillingService(Provider<PaymentProcessor> processor) {
//        this.processor = processor;
//    }
    
    public Reciept chargeOrder() {
//    	System.out.println("Charging Order from " + processor.get().Process());
    	System.out.println("Charging Order from " + processor.Process());
        return null;
    }
    
    
}
