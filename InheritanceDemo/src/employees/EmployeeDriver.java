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
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new Employee("John", "Smith", "123-33-5432");
        System.out.println(emp);
        
        HourlyEmployee hrEmp = new HourlyEmployee("Byron", "Williams", "123-45-6789", 15, 10);
        System.out.println(hrEmp); 
   }
    
}
