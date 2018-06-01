package PaymentProcessor;

import Reciept.Reciept;

public class VisaCreditCardPaymentProcessor implements CreditCardPaymentProcessor {
	String name;
    public VisaCreditCardPaymentProcessor() {
    	this.name = "Visa";
    }

    @Override
    public Reciept Process() {
    	System.out.println("Processing Visa");
        return null;
    }

}
