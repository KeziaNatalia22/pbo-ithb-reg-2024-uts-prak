package Model;
import Controller.Controller;

public class OnlinePayment implements PaymentInterface {
    private String trancasctionID, paymentGateway;

    public OnlinePayment(String trancasctionID, String paymentGateway) {
        this.trancasctionID = trancasctionID;
        this.paymentGateway = paymentGateway;
    }

    public String getTrancasctionID() {
        return trancasctionID;
    }

    public void setTrancasctionID(String trancasctionID) {
        this.trancasctionID = trancasctionID;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(){
        Controller.makePayment("", "");
    }
}
