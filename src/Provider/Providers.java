package Provider;

import java.util.logging.Logger;

import com.google.inject.Provider;

import PaymentProcessor.PayPalCreditCardPaymentProcessor;

public class Providers implements Provider<PayPalCreditCardPaymentProcessor> {
	
	
	public PayPalCreditCardPaymentProcessor get() {
		return new PayPalCreditCardPaymentProcessor(Logger.getLogger("Foo"), "Master Card Pay Pal");
	}


}
