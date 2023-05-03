public class SalariedEmployee {
    String firstName, lastName, hireDate;
    double salary;
//instance data
    //SalariedEmployee numeroUno = new SalariedEmployee(first, last, hire, salary);
    //
    SalariedEmployee(String first, String last, String hire, double salary)
    {
        this.firstName = first;
        this.lastName = last;
        this.hireDate = hire;
        this.salary = salary;
    }

    String getFirstName(){
        return this.firstName;
    }

    String getLastName(){
        return this.lastName;
    }

    String getHireDate(){
        return this.hireDate;
    }

    double getSalary(){
        return this.salary;
    }

    void setFirstName(String name){
        this.firstName = name;
    }

    void setLastName(String name){
        this.lastName = name;
    }

    void setHireDate(String date){
        this.hireDate = date;
    }

    void setSalary(double salary){
        this.salary = salary;
    }

    boolean equals(SalariedEmployee number2){
        if ()
    return false;
    }
}
