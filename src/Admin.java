/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemangementsystem;
import java.util.*; // import the HashMap class
import java.util.Scanner;
/**
 *
 * @author moses
 */
public class Admin extends Person{
    
    
     
    //Create cirrculem and coding subjects
   private static  HashMap<Integer,String> subjects =new HashMap<Integer,String>();
     
    //constractor
    public Admin(String UserName, int Password, int Age, int Id) {
        super(UserName, Password, Age, Id);
       Person.Admins.add(this);
    }

    
    public Admin() {
       
    }

  
    
  public void addStudent(Student s){
      
      Person.Students.add(s);
        
      
  }
  public void addInstractor(Instractor I){
      
      Person.Instractors.add(I);
        
      
  }
  public void addAdmin(Admin A){
      
      Person.Admins.add(A);
        
      
  }
  Scanner cin = new Scanner(System.in);
    public Person TakeData(){
                 cin.nextLine();
                 System.out.println("UserName:");
                 String UserName=cin.nextLine();
                 System.out.println("Id:");
                int Id=cin.nextInt();
                 System.out.println("Password:");
                 int Password=cin.nextInt();
                 System.out.println("age:");
                 int age=cin.nextInt();
                return new Person(UserName, Password, age, Id);
  }
  public  void Admin_Panal(){
      char e = 'y';
      while(e == 'y' || e == 'Y'){
            System.out.println("welcom "+ this.getUserName() +" you are here in Admin panel choose one of this option");
            System.out.println("#-Cearte Accounts [1 - Sttudent -- 2- Instractor --  3- Admin ] \n  4-Create cirrculem and coding subjects 5-managing employees and students \n ");

            int user_choice=cin.nextInt();
            switch(user_choice){
                case 1:
                      Person p = TakeData();
                      new Student("", p.getUserName(), p.getPassword(), p.getAge(), p.getId());
                    break;
                case 2:
                      Person p2 = TakeData();
                      new Instractor("", "", p2.getUserName(), p2.getPassword(), p2.getAge(), p2.getId());
                    break;
                case 3:
                       Person p3 = TakeData();
                      new Admin(p3.getUserName(), p3.getPassword(), p3.getAge(), p3.getId());
                    break;
                case 4:
                    cin.nextLine();
                    System.out.println("Subject Name : ");
                    String SubjectName =cin.nextLine();
                    System.out.println("Subject Code : ");
                    int SubjectCode=cin.nextInt();
                    Admin.subjects.put(SubjectCode, SubjectName);
                    break;
                case 5:
                    displayAll();
                    break;
                default:
                     System.out.println("Please choooooooose one of this options only");
                     this.Admin_Panal();
                     break;

            }
             System.out.println("to continue Enter Y --- to logout Enter any letter");
            e =(char)cin.next().charAt(0); 
      }
  }
  
  
  
  
   public void displayAll(){
       System.out.println(" If you want to display all information about : 1-Admins  2-students  3-Instractors");
       int P = cin.nextInt();
       switch(P){
           case 1:
               System.out.println("All Admins");
               for(Admin a : Person.Admins) {
                   System.out.println("UserName-->>" + a.getUserName());
                   System.out.println("Id -->>" + a.getId());
                   System.out.println("Age -->>" + a.getAge());
                   System.out.println("-----------------------------");
                   
                 }
           break;
           case 2:
               
                for(Student a :  Person.Students)
                 {
                   System.out.println("UserName-->>" + a.getUserName());
                   System.out.println("Id -->>" + a.getId());
                   System.out.println("Age -->>" + a.getAge());
                   System.out.println("-----------------------------");
                 }
            break;
           case 3: 
               
               for(Instractor a :  Person.Instractors) 
                   {
                   System.out.println("UserName-->>" + a.getUserName());
                   System.out.println("Id -->>" + a.getId());
                   System.out.println("Age -->>" + a.getAge());
                   System.out.println("-----------------------------");
                 }
            break;
            default:
                System.out.println("No data about this type");
     
       }
       
   }
}
