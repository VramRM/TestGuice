package Module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

import PaymentProcessor.PayPalCreditCardPaymentProcessor;
import PaymentProcessor.PaymentProcessor;
import PaymentProcessor.VisaCreditCardPaymentProcessor;

public class BillingModule extends AbstractModule{

    public BillingModule() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void configure() {
		//bind(PaymentProcessor.class).to(PayPalCreditCardPaymentProcessor.class);
		//bind(PaymentProcessor.class).annotatedWith(Names.named("Visa")).to(VisaCreditCardPaymentProcessor.class);
		bind(PaymentProcessor.class).annotatedWith(Names.named("Visa")).toInstance(new VisaCreditCardPaymentProcessor());
		
	}
	
	@Provides
	PayPalCreditCardPaymentProcessor getPayPalCreditCardPaymentProcessor() {
		return new PayPalCreditCardPaymentProcessor("Master Card Pay Pal");
	}

	

}
