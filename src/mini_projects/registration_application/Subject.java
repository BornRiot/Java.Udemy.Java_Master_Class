package mini_projects.registration_application;

public class Subject {
    private int Subject_id;
    private String  Subject_name;
    private int  instructor_id;


    public Subject(int subject_id, String subject_name, int instructor_id) {
        Subject_id = subject_id;
        Subject_name = subject_name;
        this.instructor_id = instructor_id;
    }

    public void setSubject_id(int subject_id) {
        Subject_id = subject_id;
    }

    public void setSubject_name(String subject_name) {
        Subject_name = subject_name;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public int getInstructor_id() {
        return instructor_id;
    }
}
