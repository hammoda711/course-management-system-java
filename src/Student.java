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
public class Student extends Person{
   private String Feedback; 
   
    public String getMesssage() {
        return Feedback;
    }

   

    public Student(String Feedback,String UserName, int Password, int Age, int Id) {
        super(UserName,Password, Age,Id);
        this.Feedback = Feedback;
        Person.Students.add(this);
    }
    public Student(){}
    

    public void setFeedback(String Feedback) {
        this.Feedback += Feedback;
    }

    
    
     //توصيل الرسايل بين الطالب والدكتور 
   
   public void sendMessage(String messsage, int instructorId ){
         //check id 
          for(Instractor I : Person.Instractors){
            if(I.getId()== instructorId);
                 I.setMessage("\n" +  messsage + " from: " + this.getUserName() + "\n");
           
     }
     }
   
   // when student send Project 
   public void SubmitProject(String msage, int instructorId ){
         //check id 
         for(Instractor I : Person.Instractors){
            if(I.getId()== instructorId);
                 I.setCheckedProgects("\n" +  msage + " from: " + this.getUserName()+"\n");
           
     }
    
    
    }
    Scanner cin = new Scanner(System.in);
    public  void Student_Panal(){
      char e = 'y';
      while(e == 'y' || e == 'Y'){  
            System.out.println("welcom "+ this.getUserName() +" you are here in student panel choose one of this option");
            System.out.println("1-message an instractor \n  2-submit project \n  3-show insteractors Feedbacks");

            int user_choice=cin.nextInt();
            switch(user_choice){
                case 1:
                    System.out.println(" The instractor Id : ");
                    int InsId=cin.nextInt();
                    cin.nextLine();
                    System.out.println(" Your Message : ");
                    
                    String Message=cin.nextLine();
                    this.sendMessage(Message, InsId);
                    break;
                case 2:
                    System.out.println(" The instractor Id : ");
                    int InsID=cin.nextInt();
                    cin.nextLine();
                    System.out.println(" Your project : ");
                    String Project=cin.nextLine();
                   this.SubmitProject(Project, InsID);
                    break;
                
                case 3:
                   System.out.println("Feedbacks of your Instractor are: \n" +  this.getMesssage());
                    break;
                
                 default:
                     System.out.println("Please choooooooose one of this options only");
                     this.Student_Panal();
                     break;
            }
            System.out.println("to continue enter Y --- to log-out Enter any letter");
            e = cin.next().charAt(0); 
      }
  }
}
