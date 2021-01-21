/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

/**
 *
 * @author ajay
 */
public class DogDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d1 = new Dog("Jack", 8, "Golden Retriever");
        Dog  d2 = new Dog("Bruce", 3, "Labrador");
        
        String name1 = d1.getName();
        System.out.println(name1);
        
        int age1 = d1.getAge();
        System.out.println(age1);
        
        System.out.println(d1.getBreed());
        
        System.out.println(d1);
        
        d1.setName("Jill");
        
        System.out.println(d1.getName());
        System.out.println(d1.toString());
        
        d1.incrementAge();
        System.out.println(d1.getAge());
    }
    
}
