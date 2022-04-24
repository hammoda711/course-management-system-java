/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemangementsystem;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author moses
 */
public class CourseMangementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initail objects to the project
        Scanner cin = new Scanner(System.in);
        Admin A1 = new Admin("Moussa", 123 , 23, 1); 
        Student s1 = new Student("","Ali", 333 , 23, 2);
        Student s2 = new Student("","Olivar", 321 , 23, 4);
        Instractor I1 = new Instractor("","","Hanaa", 111 , 30, 3);
        //Run the program 
        char e = 'y';
        while(e == 'y' || e == 'Y')
     {
            A1.Login();
            System.out.println("to Login again enter Y --- to exit Enter any letter");
            e =(char)cin.next().charAt(0); 
    }
    
}
}