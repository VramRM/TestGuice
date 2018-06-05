package Provider;

import java.util.Map;
import java.util.Random;

import com.google.inject.Inject;
import com.google.inject.Provider;

import PaymentProcessor.PayPalCreditCardPaymentProcessor;
import PaymentProcessor.PaymentProcessor;

public class ProcessorProvider implements Provider<PayPalCreditCardPaymentProcessor> {
	
	private final Random random;
	private final Map<Integer, PaymentProcessor> processorBinder;
	
	@Inject
	public ProcessorProvider(Random random, Map<Integer, PaymentProcessor> processorBinder) {
		this.random = random;
		this.processorBinder = processorBinder;
	}	
	
	public PayPalCreditCardPaymentProcessor get() {
		return new PayPalCreditCardPaymentProcessor("VIIIISA Card Pay Pal");
	}


}
