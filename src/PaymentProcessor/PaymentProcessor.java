package PaymentProcessor;

import com.google.inject.ImplementedBy;

import Reciept.Reciept;

@ImplementedBy(RuPayCreditCardPaymentProcessor.class)
public interface PaymentProcessor {

    public Reciept Process();

}
