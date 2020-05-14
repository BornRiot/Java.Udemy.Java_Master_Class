package mini_projects.registration_application;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Registration_Application {
     static int the_id;
     static String the_fname;
     static String the_lname;
     static String the_Subject;
     static int Subj_id;

    static Scanner the_Input = new Scanner(System.in);

    public static void main(String[] args) {
    //Create instance of an Instructor.
        System.out.println("Please enter the Instructor ID:");
        the_id =  the_Input.nextInt();

        System.out.println("Please enter the Instructor's first name: ");
        the_fname = the_Input.next();

        System.out.println("Please enter the Instructor's last name: ");
        the_lname = the_Input.next();

        Instructor instructor_1 = new Instructor(the_id,the_fname,the_lname);

        //Create an instance of the class
        System.out.println("Please enter the Subject ID");
        Subj_id = the_Input.nextInt();


        System.out.println("Please enter the Subject name: ");
        the_Subject = the_Input.nextLine();

        //Populate Instructor information in Subject class
        the_id = instructor_1.getInstructor_id();
        Subject the_firstSubj = new Subject(Subj_id,the_Subject,the_id);

        //Create an instance of the Student

       try {
           System.out.println("Please enter the Student ID");
           the_id = the_Input.nextInt();

       } catch (InputMismatchException e){
           System.out.println("Something went wrong. Please try again." );
             the_Input.nextInt();
       }

         System.out.println("Please enter the Student's first name: ");
        the_fname = the_Input.next();

        System.out.println("Please enter the Student's last name: ");
        the_lname = the_Input.next();

        Student std_1 = new Student(the_id, the_fname, the_lname);

        System.out.println(the_firstSubj.getInstructor_id());

        std_1.setBirthMonth();

















    }

     static void   setInstructor(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please enter the instructor id:");
        int the_InstructorID = getInput.nextInt();

        System.out.println("Please enter the  Instructor's first name:  ");
        String instructor_fname = getInput.next();

        System.out.println("Please enter the  Instructor's last name:  ");
        String instructor_lname = getInput.next();

        Instructor the_Insturcot = new Instructor(the_InstructorID,instructor_fname,instructor_lname);
    }
}
