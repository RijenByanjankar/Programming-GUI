
/**
 *Aakarshan Khadka | AI 3 | 22085855
 */
public class Student
{
    // initialization of instance variables
    protected int enrollmentID =0; 
    //enrollmentID is intialized to 0
    protected String dateOfBirth;
    protected String studentName;
    protected String dateOfEnrollment = "";
    //initialized to an empty string
    protected String courseName ="";
    //initialized to an empty string
    protected int tutionFee,courseDuration;

    /**
     * Constructor for objects of class Student
     */
    public Student(String dateOfBirth, String studentName, int courseDuration, int tutionFee)
    {
        // initialise instance variables.
        // this keyword used to avoid naming conflict
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tutionFee = tutionFee;

    }

    /**
     *Making getter and setter methods for the variables
     */

    public String get_dateOfBirth() {
        return this.dateOfBirth;
    }

    public String get_studentName() {
        return this.studentName;
    }

    public int get_courseDuration() {
        return this.courseDuration;
    }

    public int get_tutionFee() {
        return this.tutionFee;
    }

    public void set_courseName(String coursename) {
        this.courseName = coursename;
    }

    public String get_courseName() {
        return this.courseName;
    }

    public void set_enrollmentID(int ID) {
        this.enrollmentID = ID;
    }

    public int get_enrollmentID() {
        return this.enrollmentID;
    }

    public void set_dateofEnrollment(String date) {
        this.dateOfEnrollment = date;
    }

    public String get_dateofEnrollment() {
        return this.dateOfEnrollment;
    }
    //display method to show the output
    public void display() {
        if (dateOfEnrollment.equals("") || dateOfEnrollment == null) {
            System.out.println("Date of Enrollment Value is missing!");
        } 
        else if (courseName == "" || courseName == null) {
            System.out.println("Course Name is not mentioned!");
        }
        else if (enrollmentID == 0) {
            System.out.println("Enrollment ID is not declared!");
        }
        else {
            System.out.println("Enrollment ID: " + get_enrollmentID());
            System.out.println("Date of Birth: " + get_dateOfBirth());
            System.out.println("Course Name: " + get_courseName());
            System.out.println("Student Name: " + get_studentName());
            System.out.println("Date Enrolled: " + get_dateofEnrollment());
            System.out.println("Course Duration: " + get_courseDuration() + " months");
            System.out.println("Tuition Fee: " + get_tutionFee());
            System.out.println();
            System.out.println();
        }
    }

}