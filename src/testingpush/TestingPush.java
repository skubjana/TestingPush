/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingpush;
import java.util.Scanner;
/**
 *
 * @author skubjana
 */
public class TestingPush {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Input First Name > ");
        String fname = inp.next();
        
        System.out.print("Input Last name > ");
        String lname = inp.next();
        
        System.out.println("Hello " + fname + " " + lname);
    }
    
}
