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
public class ThreeFourthGA extends GraduateAssistant{

    public ThreeFourthGA(String fName, String lName) {
        super(fName, lName);
    }

    @Override
    public String getInitials() {
        return super.getfName().charAt(0)+". "+
                super.getlName().charAt(0)+".";
    }

    @Override
    public double calcSalary() {
        return 3/4.0*FULL_SALARY;
    }

    @Override
    public double calcSalaryAfterTaxes(){
        return calcSalary()*calcTax();
    }
    
}
