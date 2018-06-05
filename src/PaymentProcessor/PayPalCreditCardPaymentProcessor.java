package PaymentProcessor;

import java.util.logging.Logger;

import com.google.inject.Inject;

import Reciept.Reciept;

public class PayPalCreditCardPaymentProcessor implements CreditCardPaymentProcessor {
	String name;
	String type;
	Logger logger;
	
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	@Inject	
    public PayPalCreditCardPaymentProcessor(String name) {
    	this.name = name;
    	this.type = "AutoDebit";
    	
    }
    public PayPalCreditCardPaymentProcessor(Logger logger, String name) {
    	this.name = name;
    	this.type = "AutoDebit";
    	this.logger = logger;
    }

    public PayPalCreditCardPaymentProcessor(Logger logger, String name, String type) {
    	this.name = name;
    	this.type = type;
    	this.logger = logger;
    }
	
    @Override
    public Reciept Process() {
    	System.out.println("Processing " + this.name + ":" + this.type);
    	//logger.log(null, "Processing " + this.name + ":" + this.type);
        return null;
    }

}
