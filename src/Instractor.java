/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemangementsystem;

import java.util.Scanner;

/**
 *
 * @author moses
 */
public class Instractor extends Person {
   private String CheckedProgects ;  // >> coursema -> id:224
   private String Message;          // >> Question ->id 553

    public Instractor(String CheckedProgects, String Message, String UserName, int Password, int Age, int Id) {
        super(UserName, Password, Age, Id);
        this.CheckedProgects = CheckedProgects;
        this.Message = Message;
         Person.Instractors.add(this);
    }

    public Instractor(String CheckedProgects, String Message) {
        this.CheckedProgects = CheckedProgects;
        this.Message = Message;
        
    }
    public Instractor(){} 

   
    public void setCheckedProgects(String CheckedProgects) {
        this.CheckedProgects += CheckedProgects;
    }

    public void setMessage(String Message) {
        this.Message += Message;
    }

    public String getCheckedProgects() {
        return CheckedProgects;
    }

    public String getMessage() {
        return Message;
    }
    
    public void SendFeed(String messsage, int Studentid){
         //check id 
         for(Student s :Person.Students ){
           if(s.getId() == Studentid);
           s.setFeedback("\n" +  messsage + " from: " + this.getUserName() + "\n");
           
     }
   }
    Scanner cin = new Scanner(System.in);
   // user_choice=cin.nextInt();
  
  public  void Instractors_Panal(){
      char e = 'y';
      while(e == 'y' || e == 'Y'){
            System.out.println("welcom "+ this.getUserName() +" you are here in Instractor panel choose one of this option");
            System.out.println("1-Check projects \n  2-Give a feedback \n  3-Show Students Messages \n");

            int user_choice=cin.nextInt();
            switch(user_choice){
                case 1:
                      System.out.println("Projects of your student are: \n" +  this.getCheckedProgects() );
                    break;
                case 2:
                    cin.nextLine();
                    System.out.println(" Your Feedback : ");
                    String Feedback=cin.nextLine();
                    System.out.println(" The Student Id : ");
                    int SID=cin.nextInt();
                    this.SendFeed(Feedback, SID);
                    break;
                case 3:
                    System.out.println("Messages of your student are: \n" +  this.getMessage());
                    break;
                default:
                     System.out.println("Please choooooooose one of this options only");
                     this.Instractors_Panal();
                     break;

            }
             System.out.println("to continue enter Y --- to log-out Enter any letter");
            e =cin.next().charAt(0);   
      }
  }
    
}
