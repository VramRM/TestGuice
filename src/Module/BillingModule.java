package Module;

import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule{

    public BillingModule() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void configure() {
		//bind(PaymentProcessor.class).to(PayPalCreditCardPaymentProcessor.class);
		//bind(PaymentProcessor.class).annotatedWith(Names.named("PayPal")).toProvider(ProcessorProvider.class);
		//bind(PaymentProcessor.class).annotatedWith(Names.named("PayPal")).to(PayPalCreditCardPaymentProcessor.class);
		//bind(PaymentProcessor.class).annotatedWith(Names.named("Visa")).toInstance(new VisaCreditCardPaymentProcessor());
//		try {
//			bind(PaymentProcessor.class).annotatedWith(Names.named("PayPal")).toConstructor(PayPalCreditCardPaymentProcessor.class.getConstructor(Logger.class, String.class,String.class));
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		MapBinder
	}
	
//	@Provides
//	PaymentProcessor getPayPalCreditCardPaymentProcessor() {
//		return new PayPalCreditCardPaymentProcessor("Master Card Pay Pal");
//	}

//.to
//.annotatedWith
//.toConstructor
//.toInstance
//.toProvider
//.in
//@Named("")
//@Provides
//@ProvidedBy
//@Inject
//@ImplementedBy()
//Names.named("")

}
