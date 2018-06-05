package PaymentProcessor;

import com.google.inject.ProvidedBy;

import Provider.ProcessorProvider;
import Reciept.Reciept;

//@ImplementedBy(VisaCreditCardPaymentProcessor.class)
@ProvidedBy(ProcessorProvider.class)
public interface PaymentProcessor {

    public Reciept Process();

}
