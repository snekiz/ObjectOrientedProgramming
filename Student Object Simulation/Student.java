import java.util.Scanner;

public class Student {
    String firstName, lastName;
    String year;
    String course, section;
    Double midtermGrade, finalGrade;


    Student(String firstName, String lastName, String course, String year, String section, Double midtermGrade, Double finalGrade){

          this.firstName = firstName;
          this.lastName = lastName;
          this.year = year;
          this.course = course;
          this.section = section;
          this.midtermGrade = midtermGrade;
          this.finalGrade = finalGrade;
    }

    void showStudent(){
        System.out.println("Student: " + firstName + " " + lastName );
        System.out.println("Course: " + course +" Year: "+ year + " Section: " + section);

    }

    void computeGrade(){
         double ave = (midtermGrade + finalGrade) / 2;
       System.out.println("Your average is: " + ave);
         if(ave >= 100) {    
            System.out.println("INVALID GRADE");
        }else if(ave >= 98){
            System.out.println("With Highest Honors");
        }else if(ave >= 95){
            System.out.println("With High Honors");
        }else if(ave >= 90){
            System.out.println("With Honors");
        }else if(ave >=75){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        
    }
}
