package mini_projects.registration_application;

public class Instructor {
    private int  instructor_id;
    private String fname;
    private String lname;


    public int getInstructor_id() {
        return instructor_id;
    }

    public Instructor(int instructor_id, String fname, String lname) {
        this.instructor_id = instructor_id;
        this.fname = fname;
        this.lname = lname;
    }


    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
