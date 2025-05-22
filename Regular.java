/**
 *Aakarshan Khadka | AI 3 | 22085855
 */
public class Regular extends Student
{
    // instance variables 
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    /**
     * Constructor for objects of class Regular
     */
    public Regular(String dateOfBirth, String studentName, int courseDuration, int tutionFee,int numOfModules, int numOfCreditHours, double daysPresent,
    String dateOfEnrollment, String courseName, int enrollmentID)
    {
        // initialise instance variables
        //super keyword is used to invoke the constructor of parent class
        super(dateOfBirth, studentName, courseDuration, tutionFee);
        super.set_courseName(courseName);
        super.set_enrollmentID(enrollmentID);
        super.set_dateofEnrollment(dateOfEnrollment);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }
    //getter methods to 
    public int get_NumOfModules() {
        return numOfModules;
    }

    public int get_NumOfCreditHours() {
        return numOfCreditHours;
    }

    public double get_DaysPresent() {
        return daysPresent;
    }

    public boolean getisGrantedScholarship() {
        return isGrantedScholarship;
    }

    public void setIsGrantedScholarship(boolean isGrantedScholarship) {
        this.isGrantedScholarship = isGrantedScholarship;
    }
    //present percentage method to calculate the percentage of present days and give attendance grade accordingly
    public char presentPercentage(double daysPresent) {
        double present_percentage = (daysPresent / (super.get_courseDuration() * 30)) * 100;
        char message = 'E';
        this.daysPresent = daysPresent;
        if (daysPresent > (get_courseDuration() * 30)) {
            System.out.println("Present days can’t be more than course duration");
            return ' ';
        } 
        
        else if (present_percentage >= 80 & present_percentage <= 100) {
                setIsGrantedScholarship(true);
                return 'A';

            }
        else if (present_percentage < 80 & present_percentage >=60) {
                return 'B';
            }

        else if (present_percentage < 60 & present_percentage >=40) {
                return'C';
            } 

        else if (present_percentage < 40 & present_percentage >=20) {
                return 'D';
            } 
            

        else { 
                return'E';
            }
    
        }
    
   
    
    //method to check if certificate is granted
    public void grantCertificate(String courseName, int enrollmentId, String dateOfEnrollment) {
        System.out.print(super.get_studentName() + " has graduated from " + get_courseName() + " with enrollment ID " + get_enrollmentID() + 
        " and enrollment date " + get_dateofEnrollment() + ".");
        if (isGrantedScholarship) {
            System.out.print(" The scholarship has been granted.");
        }
        System.out.println();
    } 
    //display method to display the output
    public void display() {
        super.display();
        System.out.println("Number of modules: " + this.numOfModules);
        System.out.println("Number of credit hours: " + this.numOfCreditHours);
        System.out.println("Days present: " + this.daysPresent);
    }

}