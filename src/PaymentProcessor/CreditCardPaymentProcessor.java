package PaymentProcessor;

import Reciept.Reciept;

public interface CreditCardPaymentProcessor extends PaymentProcessor{
    
    @Override
    public Reciept Process();

}
