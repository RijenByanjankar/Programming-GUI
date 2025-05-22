
/**
 *Aakarshan Khadka | AI 3 | 22085855
 */
public class Dropout extends Student
{
    // instance variables 
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    /**
     * Constructor for objects of class Dropout
     */
    public Dropout(int enrollmentID,String dateOfBirth, String studentName, int courseDuration, int tutionFee, int numOfRemainingModules, int numOfMonthsAttended,
    String dateOfDropout)
    {
        // initialise instance variables
        super(dateOfBirth, studentName, courseDuration, tutionFee);
        super.set_enrollmentID(enrollmentID); //super.get_enrollmentID() and assign with parameter value
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        super.set_courseName(""); //super.get_courseName() can also be used to pass the values 
        
        super.set_dateofEnrollment("");//super.get_dateofEnrollment() can also be used to pass the values
        this.remainingAmount = 0;
        this.hasPaid = false;

    }
    //getter method to hide the names of the variable
    public int get_numOfRemainingModules() {
        return this.numOfRemainingModules;
    }

    public int get_numOfMonthsAttended() {
        return this.numOfMonthsAttended;
    }

    public String get_dateOfDropout() {
        return this.dateOfDropout;
    }

    public int get_remainingAmount() {
        return this.remainingAmount;
    }

    public boolean get_hasPaid() {
        return this.hasPaid;
    }

    public void billsPayble () {
        String message = "";
        this.remainingAmount = (courseDuration - numOfMonthsAttended) * tutionFee;
        if (this.remainingAmount == 0) {
            hasPaid = true;
            message = "All bills cleared by the student";
        } else {
            message = "The total amount of bills needed to be paid is" + "" + this.remainingAmount;}

        System.out.println(message);
    }
    //return type void can also be used for removeStudent()
    public String removeStudent() {
        String message = "All Bills Cleared Sucessfully!";
        // if bills has been paid set all attributes to null / or 0 to remove student.
        if (hasPaid = true) {
            // instance variables of students need to be initialized as protected to modify here.
            dateOfBirth = "";
            courseName = "";
            studentName = "";
            dateOfEnrollment = "";
            courseDuration = 0;
            tutionFee = 0;
            dateOfDropout = "";
            enrollmentID = 0;
            numOfRemainingModules = 0;
            numOfMonthsAttended = 0;
            remainingAmount = 0;
        } else {
            message = "All Bills not cleared.";
        }

        return message;
    }
    //display method
    public void display() {
        super.display();
        System.out.println("The number of remaining modules is" + " "+get_numOfRemainingModules());
        System.out.println("The number of months attended is" +" "+ get_numOfMonthsAttended());
        System.out.println("The date of dropout was" +" "+ get_dateOfDropout());
    }
}