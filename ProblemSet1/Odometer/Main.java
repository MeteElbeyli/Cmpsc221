public class Main {
    // input the average and the miles
    public static void main(String[] args) {
        Odometer o1 = new Odometer(23.9, 12.2);
        Odometer o2 = new Odometer(60.2, 20.4);
        Odometer o3 = new Odometer(150, 42);
        Odometer o4 = new Odometer(599, 64);
        Odometer o5 = new Odometer(1002, 32);

        o1.addmiles(45.2);
        o2.addmiles(602.3);
        o3.addmiles(10);
        o4.addmiles(149);
        o5.addmiles(32);


        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);

    }
}