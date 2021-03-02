/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo1;

import java.util.ArrayList;

/**
 *
 * @author ajay
 */
public class ArrayListDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("Milk");
        groceries.add("Onions");
        groceries.add("Bread");
        System.out.println(groceries);
        groceries.add(2, "Soda");
        System.out.println(groceries);
        groceries.remove(1);
        boolean removed = groceries.remove("Milk");
        System.out.println(removed);
        System.out.println(groceries);
        System.out.println(groceries.get(1));
        System.out.println(groceries.size());
        groceries.set(1, "Beer");
        System.out.println(groceries); 
        System.out.println("******"); 
        for(int i=0; i<groceries.size(); i++){
            System.out.println(groceries.get(i));
        }
        System.out.println("******"); 
       for(String gItem:groceries){
            System.out.println(gItem);
        }
       
    }
    
}
