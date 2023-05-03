public class Pizza {
    private String pizzaSize;
    private int cheeseNum;
    private int pepperoniNum;
    private int hamNum;

    public Pizza()
    {
        this.pizzaSize = "";
        this.cheeseNum = 0;
        this.pepperoniNum = 0;
        this.hamNum = 0;
    }

    public Pizza(String pizzaSize, int cheeseNum,int pepperoniNum, int hamNum) {
        this.pizzaSize = pizzaSize;
        this.cheeseNum = cheeseNum;
        this.pepperoniNum = pepperoniNum;
        this.hamNum = hamNum;
    }


    public String getPizzaSize() {
        return pizzaSize;
    }


    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }


    public int getNumCheeseToppings() {
        return cheeseNum;
    }


    public void setNumCheeseToppings(int cheeseNum) {
        this.cheeseNum = cheeseNum;
    }


    public int getNumPepperoniToppings() {
        return pepperoniNum;
    }


    public void setNumPepperoniToppings(int pepperoniNum) {
        this.pepperoniNum = pepperoniNum;
    }


    public int getNumHmaToppings() {
        return hamNum;
    }


    public void setNumHmaToppings(int hamNum) {
        this.hamNum = hamNum;
    }

    //
    //calcCost that returns the cost of the pizza *double
    public double calcCost() {
        if(pizzaSize.equalsIgnoreCase("small")) {
            return 10 + (cheeseNum + pepperoniNum + hamNum) * 2;
        }
        else if(pizzaSize.equalsIgnoreCase("medium")) {
            return 12 + (cheeseNum + pepperoniNum + hamNum) * 2;
        }
        else if(pizzaSize.equalsIgnoreCase("large")) {
            return 14 + (cheeseNum + pepperoniNum + hamNum) * 2;
        }
        else {
            return 0.0;
        }  //  my bug was that I let it be 0, not 0.0 bc i was thinking of ints not doubles
    }

    public String getDescription() {
        return " ------------------ \n Size of Pizza: " + pizzaSize + "\n Cheese Toppings: "
                + cheeseNum + "\n Pepperoni Toppings: "
                + pepperoniNum + "\n Ham Toppings: " + hamNum
                + "\n Pizza Cost: $" + calcCost() + "\n ------------------";
    }
}



