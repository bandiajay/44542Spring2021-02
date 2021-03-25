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
public class HalfGA extends GraduateAssistant{

    public HalfGA(String fName, String lName) {
        super(fName, lName);
    }

    @Override
    public String getInitials() {
        return super.getfName().charAt(0)+" "+
                super.getlName().charAt(0);
    }

    @Override
    public double calcSalary() {
        return FULL_SALARY/2;
    }

    
    
}
