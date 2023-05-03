public class Odometer {
    private double oldmiles ,milesdriven, totalmilage, gallons;

    public Odometer(double average, double miles){
        oldmiles = miles;
        milesdriven = miles;
        totalmilage = average;
    }

    public double addmiles (double newmiles){
        milesdriven = 0;
        milesdriven = newmiles;
        return setaverage(milesdriven);
    }

    public double reset(){
        milesdriven = 0;
        return addmiles(milesdriven);
    }

    public double setaverage(double newtrip){
        gallons = (newtrip/totalmilage);
        return gallons;
    }

    //
    // prints out the statement with the private variables in them 
    public String toString(){
        return "Amount of Gallons -> " + milesdriven + " miles = " + gallons + "\n Amount of Miles after Trip -> " + (oldmiles+  milesdriven);
    }

}


