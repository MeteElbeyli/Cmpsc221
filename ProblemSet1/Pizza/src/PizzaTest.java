public class PizzaTest
{
    public static void main(String[] args)
    {
        Pizza p1 = new Pizza("small",  3,  2,  1);
        Pizza p2 = new Pizza("medium",  4,  1,  2);
        Pizza p3 = new Pizza("large",  2,  1,  3);
        Pizza p4 = new Pizza("large",  5,  5,  5);
        Pizza p5 = new Pizza("small",  0,  0,  0);


         System.out.println(p1.getDescription());
         System.out.println(p2.getDescription());
         System.out.println(p3.getDescription());
         System.out.println(p4.getDescription());
         System.out.println(p5.getDescription());


    }
}