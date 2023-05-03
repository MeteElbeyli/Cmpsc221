public class Payment
{
     double cash;
    Payment(double val) {
        this.cash = Math.round(val*100)/100.0;
    }

    public double getcash() {
        return cash;
    }

    public void setcash(double newval) {
        this.cash = newval;
    }

    public void paymentDetails() {
        System.out.println("The cash payment of: $" +this.cash);
    }
}