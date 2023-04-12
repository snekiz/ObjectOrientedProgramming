import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("First name: ");
    String firstname = sc.nextLine();
    System.out.print("Last name: ");
    String lastname = sc.nextLine();
    System.out.print("Course: ");
    String course = sc.nextLine();
    System.out.print("Year: ");
    String year = sc.nextLine();
    System.out.print("Section: ");
    String section = sc.nextLine();
    System.out.print("Midterm Grade: ");
    double midtermGrade = sc.nextDouble();
    System.out.print("Final Grade: ");
    double finalGrade = sc.nextDouble();

    Student s = new Student(firstname, lastname, course, year, section, midtermGrade, finalGrade);
    s.showStudent();
    s.computeGrade();


    }
}
