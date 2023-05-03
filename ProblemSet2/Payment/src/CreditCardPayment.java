public class CreditCardPayment extends Payment {

    public String name, expDate, number;

    CreditCardPayment(double value, String number, String name, String expDate) {
        super(value);
        this.number = number;
        this.expDate = expDate;
        this.name = name;
    }

    public void paymentDetails() {
        System.out.println("Payment of: $" + this.cash + " to the card number:" + this.number
                + ",  and expiration date of: "	+ this.expDate + ", Owner name: " + this.name + ".");
    }

}