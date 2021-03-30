/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author ajay
 */
public class HourlyEmployee extends Employee {
    private double wageRate;
    private int hrsWorked;

    public HourlyEmployee( String firstName, String lastName, String SSN, double wageRate, int hrsWorked) {
        super(firstName, lastName, SSN);
        this.wageRate = wageRate;
        this.hrsWorked = hrsWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public int getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }
    
    public double calcSalary(){
        return wageRate*hrsWorked;
    }
    
    @Override
    public String getFullName(){
        return super.getFirstName()+" "+super.getLastName();
    }
    
    @Override
    public String toString(){
        return super.toString()+" $"+calcSalary();
    }
    
}
