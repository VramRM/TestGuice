package  Main;

import com.google.inject.Guice;
import com.google.inject.Injector;

import Billing.BillingService;
import Module.BillingModule;

public class TestingGuiceInitializer {

    public TestingGuiceInitializer() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
       Injector injector = Guice.createInjector(new BillingModule());
       BillingService billingService = injector.getInstance(BillingService.class);
       billingService.chargeOrder();

    }

}
