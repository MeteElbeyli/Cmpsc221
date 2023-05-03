public class TestDemo
{

    public static void main(String[] args)
    {
        CreditCardPayment x = new CreditCardPayment(5.90, "************123\"","Mete Elbeyli", "11/22");

        CashPayment p = new CashPayment(20.03);

        CreditCardPayment y = new CreditCardPayment(20.50, "123456789234","Mike Melusky","01/01");

        CashPayment q = new CashPayment(55.12);

        x.paymentDetails();
        p.paymentDetails();
        y.paymentDetails();
        q.paymentDetails();
    }

}