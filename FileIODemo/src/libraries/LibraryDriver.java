/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author AJAY
 */
public class LibraryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Library l1 = new Library("BDOwens", 12, 9.99);
        System.out.println(l1);
        PrintWriter write = new PrintWriter(new File("myOutput.txt"));
        Scanner scan = new Scanner(new File("libData.txt"));
        while (scan.hasNext()) {
            //System.out.println("Enter the lib name: ");
            //String name = scan.next();
            
            //System.out.println("Enter the number of books: ");
            //int totalBooks = scan.nextInt();
            //System.out.println("Enter membership fee: ");
            //double fee = scan.nextDouble();
            
            Library l2 = new Library(scan.next(), scan.nextInt(), scan.nextDouble());
            System.out.println(l2);
            write.println(l2);
        }
        scan.close();
        write.close();
    }

}
