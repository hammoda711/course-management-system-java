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
public class Person {
    private String UserName;
    private int Password;
    private  int Age ;
    private  int Id ;
    //use HashSet to store unique objects in a Collection.
     protected static  HashSet<Student> Students = new HashSet<Student>(); // >> objs from Student
     protected static HashSet<Admin> Admins = new HashSet<Admin>();
     protected static HashSet<Instractor> Instractors = new HashSet<Instractor>();
    //constructor
    public Person(String UserName, int Password, int Age, int Id) {
        this.UserName = UserName;
        this.Password = Password;
        this.Age = Age;
        this.Id = Id;
    }

    public Person() {
        
    }
    
    
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }

    public String getUserName() {
        return UserName;
    }

    public int getPassword() {
        return Password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
      Scanner cin = new Scanner(System.in);
      //Login to 3 panels
    public void Login()
  {
      System.out.println(" press Enter / enter this fields ");
       cin.nextLine();        //to solve the problem of skipping the Username field
      System.out.println("UserName:");
     
       String userName = cin.nextLine();
       System.out.println("Password:");
       int password=cin.nextInt();
       
         for (Student s : Person.Students) {
             
            // System.out.println("userName->>" + s.getUserName() + " passs->> " + s.getPassword() );
             //System.out.println("userName->>" + userName + " passs->> " + password );
             if(s.getUserName() == userName || s.getPassword() == password )
                 //  Student  Panel
                s.Student_Panal();
           
         }
     for(Instractor I : Person.Instractors){
         
         if(I.getUserName() == userName || I.getPassword() == password )
            //  Instractor  Panel
           I.Instractors_Panal();
        
     }
     for(Admin A : Person.Admins){
                         
         if(A.getUserName() == userName || A.getPassword() == password ){
            //  Instractor  Panel
          A.Admin_Panal();
         }
      
     }
      //System.out.println(" we out" + Person.Admins);
      
          
  }
}
