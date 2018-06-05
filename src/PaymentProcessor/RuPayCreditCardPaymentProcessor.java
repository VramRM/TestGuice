package PaymentProcessor;

import Reciept.Reciept;

public class RuPayCreditCardPaymentProcessor implements CreditCardPaymentProcessor {
	String name;
    public RuPayCreditCardPaymentProcessor() {
    	this.name = "Visa";
    }

    @Override
    public Reciept Process() {
    	System.out.println("Processing Rupay");
        return null;
    }

}
