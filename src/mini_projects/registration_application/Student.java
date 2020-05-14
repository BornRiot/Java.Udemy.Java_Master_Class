package mini_projects.registration_application;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Student {

    private int  student_id;
    private  String  fname;
    private  String  lname;

    public Student(int student_id, String fname, String lname) {
        this.student_id = student_id;
        this.fname = fname;
        this.lname = lname;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }


        public void setLname(String lname) {
        this.lname = lname;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String setBirthMonth(){
        Scanner takeInput = new Scanner(System.in);

        System.out.println("What is the Month of your birthday: ");
        int the_BMonth  = takeInput.nextInt();
        String the_Month = "null";

        if(the_BMonth>= 1 & the_BMonth <= 12){
            switch (the_BMonth){
                case 1:
                    the_Month = "January";
                    break;
                case 2:
                    the_Month = "February";
                    break;
                case 3:
                    the_Month = "March ";
                    break;
                case 4:
                    the_Month = "April";
                    break;
                case 5:
                    the_Month = "May";
                    break;
                case 6:
                    the_Month = "June ";
                    break;
                case 7:
                    the_Month = "July";
                    break;
                case 8:
                    the_Month = "August";
                    break;
                case 9:
                    the_Month = "September";
                    break;
                case 10:
                    the_Month = "October";
                    break;
                case 11:
                    the_Month = "November";
                    break;
                case 12:
                    the_Month = "December";
                    break;

                default:
                    System.out.println("A wrong input was given.");
                    break;

            }

        }
        return the_Month;

    }

    public String theFullB(){
        String my_Month = setBirthMonth();
        Scanner getInfo = new Scanner(System.in);

        int the_Day;
        int theYear;


        return "";
    }
}
