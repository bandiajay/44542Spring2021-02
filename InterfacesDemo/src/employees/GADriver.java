/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.ArrayList;

/**
 *
 * @author ajay
 */
public class GADriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GraduateAssistant hga = new HalfGA("Ajay", "Bandi");
        System.out.println(hga);
        System.out.println(hga.getInitials()); 
        System.out.println(hga.calcSalary());
        
        GraduateAssistant tga = new ThreeFourthGA("Johm", "Smith");
        System.out.println(tga);
        System.out.println(tga.getInitials()); 
        System.out.println(tga.calcSalary());
        System.out.println(tga.calcSalaryAfterTaxes());
        
        GraduateAssistant hga1 = new HalfGA("Y", "N");
        GraduateAssistant hga2 = new HalfGA("B", "K");
        
        ArrayList<GraduateAssistant> gaList = new ArrayList<>();
        gaList.add(hga);
        gaList.add(hga1);
        gaList.add(tga);
        gaList.add(hga2);
        
        for(GraduateAssistant ga:gaList){
            boolean name = ga instanceof ThreeFourthGA;
            if(name){
                System.out.println(ga);
            }
        }
  }
    
    
    
}
