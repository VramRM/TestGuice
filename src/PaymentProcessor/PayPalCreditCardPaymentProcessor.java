package PaymentProcessor;

import Reciept.Reciept;

public class PayPalCreditCardPaymentProcessor implements CreditCardPaymentProcessor {
	String name;
	
    public PayPalCreditCardPaymentProcessor(String name) {
    	this.name = name;
    }

    @Override
    public Reciept Process() {
    	System.out.println("Processing " + this.name);
        return null;
    }

}
