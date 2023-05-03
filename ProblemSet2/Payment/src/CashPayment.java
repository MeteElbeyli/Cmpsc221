public class CashPayment extends Payment
{

    CashPayment(double val) {
        super(val);
    }

    public void paymentDetails() {
        System.out.println("The cash payment of :  $" + this.cash);
    }
}