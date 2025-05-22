import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainGUI implements ActionListener
{
    //-----------------------------!Initialization of Main Frame and Panel!--------------------------
    private JFrame mainGUIFrame;
    private JPanel regularGUIPanel;
    private JPanel mainStudentpanel;
    private JPanel dropoutGUIPanel;

    //----------------------------!Initialization of JLabel!-----------------------------------------
    private JLabel title;
    private JLabel studentNameLabel;
    private JLabel dobLabel;
    private JLabel enrollmentIDLabel;
    private JLabel courseNameLabel;
    private JLabel courseDurationLabel;
    private JLabel tuitionFeeLabel;
    private JLabel numberOfCreditHoursLabel;
    private JLabel numberOfRemainingModulesLabel;
    private JLabel numberOfMonthsAttendedLabel;
    private JLabel daysPresentLabel;
    private JLabel numberOfModulesLabel;
    private JLabel doeLabel;
    private JLabel numOfRemainingModulesLabel;
    private JLabel remainingAmountLabel;
    private JLabel dateOfDropoutLabel;
    private JLabel doeRegularLabel;
    private JLabel dobRegularLabel;
    private JLabel message;

    //------------------------------!Initialization of JTextField!-----------------------------------
    private JTextField studentNameTextR;

    private JTextField enrollmentIDTextR;
    private JTextField courseNameTextR;
    private JTextField courseDurationTextR;
    private JTextField tuitionFeeTextR;
    private JTextField numberOfModulesTextR;
    private JTextField numOfCreditHoursTextR;
    private JTextField numberOfRemainingModulesTextR;
    private JTextField numberOfMonthsAttendedTextR;
    private JTextField daysPresentTextR;

    //--------------------------------!Buttons for RegularGUI!--------------------------------------
    private JButton addButton;
    private JButton dropoutButton;
    private JButton presentPercentageButton;
    private JButton grantedScholarshipButton;
    private JButton billButton;
    private JButton removeStudentButton;
    private JCheckBox terms;
    private JButton displayButton;
    private JButton clearButton;
    private JButton backButton;
    private JComboBox  dobDay,dobMonth, dobYear;
    private JComboBox doe;

    //-------------------------------!Text Field for dropout panel!-------------------------------------
    private JTextField studentNameTextd;

    private JTextField enrollmentIDTextd;
    private JTextField courseNameTextd;
    private JTextField courseDurationTextd;
    private JTextField tuitionFeeTextd;
    private JTextField numberOfModulesTextd;
    private JTextField numOfCreditHoursTextd;
    private JTextField numOfRemainingModulesTextd;
    private JTextField numOfMonthsAttendedTextd;
    private JTextField remainingAmountTextd;
    private JTextField dobd;

    private JComboBox doed;
    private JComboBox dodYear;
    private JComboBox dodMonth;
    private JComboBox dodDay;
    private JComboBox dobDropoutDay,dobDropoutMonth, dobDropoutYear;

    //-------------------------------!Buttons for dropout!-------------------------------------
    private JButton dropout;
    private JButton billsPayable;
    private JButton removeStudent;
    private JButton displayDropout; 
    private JButton clear;
    private JButton backd;
    //-------------------------------!Instance Variable!---------------------------------
    private int enrollmentID,numberOfModules,numOfCreditHours;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;
    private int numberOfRemainingModules;
    private int numberOfMonthsAttended;
    private String dateOfDropout;
    private double daysPresent;
    private boolean hasPaid;
    private int remainingAmount;

    private JButton regularButton;

    //-----------------------------!Array list!-----------------------------------------
    private ArrayList<Student>std= new ArrayList<>();

    public mainGUI()
    {
        mainGUIFrame=new JFrame("StudentGUI");
        mainGUIFrame.setSize(500,500);
        mainGUIFrame.setResizable(false);

        title= new JLabel("Dropout Class");
        title.setBounds(200,0,200,40);
        title.setFont(new Font("Tenorite", Font.BOLD,20));

        title= new JLabel("Regular Class");
        title.setBounds(200,0,200,40);
        title.setFont(new Font("Tenorite", Font.BOLD,20));

        //------------------------------------!Main pannel!------------------------------------------
        mainStudentpanel=new JPanel();
        mainStudentpanel.setSize(500, 500);
        mainStudentpanel.setLayout(null);
        mainGUIFrame.add(mainStudentpanel);

        message=new JLabel("Main Window");
        message.setBounds(200,50,200,100);
        message.setFont(new Font("Times New Roman",Font.BOLD,20));

        regularButton=new JButton("Regular");
        regularButton.setBounds(70,180,150,50);
        regularButton.addActionListener(this);

        dropoutButton=new JButton("Dropout");
        dropoutButton.setBounds(280,180,150,50);
        dropoutButton.addActionListener(this);

        mainStudentpanel.add(message);
        mainStudentpanel.add(regularButton);
        mainStudentpanel.add(dropoutButton);

        regularGUIPanel=new JPanel();
        regularGUIPanel.setSize(500,500);
        regularGUIPanel.setLayout(null);

        studentNameLabel=new JLabel("Student Name");
        studentNameLabel.setBounds(20,45,100,40);
        studentNameTextR= new JTextField();
        studentNameTextR.setBounds(125,55,100,25);
        dobLabel = new JLabel("Date of Birth");
        dobLabel.setBounds(20,240,100,40);
        dobDay=new JComboBox<String>();
        for(int i=1;i<=31;i++)
        {
            dobDay.addItem(i);
        }

        String month[]={"Jan","Feb","Mar","Apr","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        dobMonth=new JComboBox<String>(month);
        dobYear= new JComboBox<String>();
        for(int y=1999;y<=2023;y++)
        {
            dobYear.addItem(y);
        }
        dobDay.setBounds(40,280,70,20);
        dobMonth.setBounds(110,280,70,20);
        dobYear.setBounds(180,280,70,20);

        enrollmentIDLabel=new JLabel("EnrollmentID");
        enrollmentIDLabel.setBounds(290,160,100,50 );
        enrollmentIDTextR=new JTextField();
        enrollmentIDTextR.setBounds(375,173,100,25);

        courseNameLabel= new JLabel("Course Name");
        courseNameLabel.setBounds(20,200,100,40);
        courseNameTextR=new JTextField();
        courseNameTextR.setBounds(125,210,100,25);

        courseDurationLabel=new JLabel("Course Duration");
        courseDurationLabel.setBounds(20,125,100,40);
        courseDurationTextR=new JTextField();
        courseDurationTextR.setBounds(125,135,100,25);

        tuitionFeeLabel= new JLabel("Tuition Fee");
        tuitionFeeLabel.setBounds(300,45,70,40);
        tuitionFeeTextR=new JTextField();
        tuitionFeeTextR.setBounds(375,55,100,25);

        numberOfModulesLabel= new JLabel("No of Modules");
        numberOfModulesLabel.setBounds(20,85,100,40);
        numberOfModulesTextR=new JTextField();
        numberOfModulesTextR.setBounds(125,95,100,25);

        numberOfCreditHoursLabel= new JLabel("Credit Hours");
        numberOfCreditHoursLabel.setBounds(295,125,100,40);
        numOfCreditHoursTextR=new JTextField();
        numOfCreditHoursTextR.setBounds(375,135,100,25);

        doeLabel=new JLabel("Date of Enrollment");
        doeLabel.setBounds(20,160,110,50);
        doe=new JComboBox<String>();
        for(int y=1990;y<=2023;y++)
        {
            doe.addItem(y);
        }
        doe.setBounds(135,175,90,20);

        daysPresentLabel= new JLabel("Days Present");
        daysPresentLabel.setBounds(290,200,100,40);
        daysPresentTextR=new JTextField();
        daysPresentTextR.setBounds(375,210,100,25);

        addButton=new JButton("add");
        addButton.setBounds(300,320,87,35);

        presentPercentageButton=new JButton("Present Precentage");
        presentPercentageButton.setBounds(300,400,170,40);

        grantedScholarshipButton=new JButton("Scholarship");
        grantedScholarshipButton.setBounds(300,87,175,40);
        
        terms=new JCheckBox("Accept Terms and Conditions.");
        terms.setBounds(20,325,200,40);

        displayButton=new JButton("Display");
        displayButton.setBounds(390,320,87,35);

        clearButton=new JButton("Clear");
        clearButton.setBounds(170,400,100,40);

        backButton=new JButton("Back");
        backButton.setBounds(30,400,100,40);

        //------------------------------------Adding Object to Panel----------------------------------
        regularGUIPanel.add(studentNameLabel);
        regularGUIPanel.add(studentNameTextR);

        regularGUIPanel.add(title);

        regularGUIPanel.add(enrollmentIDLabel);
        regularGUIPanel.add(enrollmentIDTextR);

        regularGUIPanel.add(courseNameLabel);
        regularGUIPanel.add(courseNameTextR);

        regularGUIPanel.add(courseDurationLabel);
        regularGUIPanel.add(courseDurationTextR);

        regularGUIPanel.add(tuitionFeeLabel);
        regularGUIPanel.add(tuitionFeeTextR);

        regularGUIPanel.add(numberOfModulesLabel);
        regularGUIPanel.add(numberOfModulesTextR);

        regularGUIPanel.add(numberOfCreditHoursLabel);
        regularGUIPanel.add(numOfCreditHoursTextR);

        regularGUIPanel.add(daysPresentLabel);
        regularGUIPanel.add(daysPresentTextR);

        regularGUIPanel.add(dobLabel);
        regularGUIPanel.add(dobDay);
        regularGUIPanel.add(dobMonth);
        regularGUIPanel.add(dobYear);
        regularGUIPanel.add(doeLabel);
        regularGUIPanel.add(doe);

        //---------------------------------adding button to the panel---------------------
        regularGUIPanel.add(addButton);
        regularGUIPanel.add(presentPercentageButton);
        regularGUIPanel.add(grantedScholarshipButton);
        regularGUIPanel.add(displayButton);
        regularGUIPanel.add(clearButton);
        regularGUIPanel.add(backButton);
        regularGUIPanel.add(terms);

        presentPercentageButton.addActionListener(this);

        clearButton.addActionListener(this);
        displayButton.addActionListener(this);
        addButton.addActionListener((e) -> addregular());
        clearButton.addActionListener(this);
        backButton.addActionListener(this);
        grantedScholarshipButton.addActionListener(this);

        mainGUIFrame.add(regularGUIPanel);
        mainGUIFrame.setVisible(true);
        regularGUIPanel.setLayout(null);
        //----------------------------------Dropout code--------------------------- 

        dropoutGUIPanel=new JPanel();
        dropoutGUIPanel.setSize(500, 500);
        mainGUIFrame.add(dropoutGUIPanel);
        dropoutGUIPanel.setLayout(null);

        studentNameLabel=new JLabel("Student Name");
        studentNameLabel.setBounds(20,45,100,40);
        studentNameTextd= new JTextField();
        studentNameTextd.setBounds(125,55,100,25);

        dobRegularLabel = new JLabel("Date of Birth");
        dobRegularLabel.setBounds(20,85,100,40);
        dobDropoutDay=new JComboBox<String>();//doe combobox
        for(int i=1;i<=31;i++)
        {
            dobDropoutDay.addItem(i);
        }

        String month1[]={"Jan","Feb","Mar","Apr","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        dobDropoutMonth=new JComboBox<String>(month1);
        dobDropoutYear= new JComboBox<String>();
        for(int y=1990;y<=2023;y++)
        {
            dobDropoutYear.addItem(y);
        }
        dobDropoutDay.setBounds(100,95,50,20);
        dobDropoutMonth.setBounds(150,95,50,20);
        dobDropoutYear.setBounds(200,95,60,20);

        enrollmentIDLabel= new JLabel("Enrollment ID");
        enrollmentIDLabel.setBounds(280,40,100,50);
        enrollmentIDTextd= new JTextField();
        enrollmentIDTextd.setBounds(375,55,100,25);

        courseNameLabel=new JLabel("Course Name");
        courseNameLabel.setBounds(20,200,100,40);
        courseNameTextd= new JTextField();
        courseNameTextd.setBounds(125,210,100,25);

        courseDurationLabel= new JLabel("Course Duration");
        courseDurationLabel.setBounds(20,125,100,40);
        courseDurationTextd= new JTextField();
        courseDurationTextd.setBounds(125,135,100,25);

        numOfRemainingModulesLabel= new JLabel("Remain Module");
        numOfRemainingModulesLabel.setBounds(280,200,100,40);
        numOfRemainingModulesTextd= new JTextField();
        numOfRemainingModulesTextd.setBounds(375,210,100,25);

        remainingAmountLabel= new JLabel("Remain Amount");
        remainingAmountLabel.setBounds(280,240,100,40);
        remainingAmountTextd= new JTextField();
        remainingAmountTextd.setBounds(375,250,100,25);

        numberOfMonthsAttendedLabel= new JLabel("Month Attended");
        numberOfMonthsAttendedLabel.setBounds(280,85,100,40);
        numOfMonthsAttendedTextd= new JTextField();
        numOfMonthsAttendedTextd.setBounds(375,95,100,25);
        doeRegularLabel=new JLabel("Date of Enrollment");
        doeRegularLabel.setBounds(20,160,110,50);
        doed=new JComboBox<String>();//doe combobox

        for(int y=1990;y<=2023;y++)
        {
            doed.addItem(y);
        }
        doed.setBounds(135,175,90,20);

        tuitionFeeLabel= new JLabel("Tuition Fee");
        //280,200,100,40
        //375,210,100,25
        tuitionFeeLabel.setBounds(20,240,100,40);
        tuitionFeeTextd= new JTextField();
        tuitionFeeTextd.setBounds(125,250,100,25);

        dateOfDropoutLabel = new JLabel("Date of Dropout");
        dateOfDropoutLabel.setBounds(280,280,100,40);
        dodDay= new JComboBox<String>();//doe combobox
        for(int i=1;i<=31;i++)
        {
            dodDay.addItem(i);
        }

        String monthd[]={"Jan","Feb","Mar","Apr","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        dodMonth=new JComboBox<String>(monthd);
        dodYear= new JComboBox<String>();
        for(int y=1999;y<=2023;y++)
        {
            dodYear.addItem(y);
        }
        dodDay.setBounds(282,330,60,20);
        dodMonth.setBounds(342,330,65,20);
        dodYear.setBounds(405,330,65,20);

        dropout=new JButton("Dropout");
        dropout.setBounds(300,140,170,40);
        dropout.addActionListener(this);

        billsPayable= new JButton("Pay Bill");
        billsPayable.setBounds(300,400,170,40);
        billsPayable.addActionListener(this);

        removeStudent= new JButton("Remove");
        removeStudent.setBounds(30,320,87,35);
        removeStudent.addActionListener(this);

        displayDropout=new JButton("Display");
        displayDropout.setBounds(120,320,87,35);
        displayDropout.addActionListener(this);

        clear=new JButton("Clear");
        clear.setBounds(170,400,100,40);
        clear.addActionListener(this);

        backd=new JButton("Back");
        backd.setBounds(30,400,100,40);
        backd.addActionListener(this);

        dropoutGUIPanel.add(studentNameLabel);
        dropoutGUIPanel.add(studentNameTextd);

        dropoutGUIPanel.add(dobRegularLabel);
        dropoutGUIPanel.add(dobDropoutDay);
        dropoutGUIPanel.add(dobDropoutMonth);
        dropoutGUIPanel.add(dobDropoutYear);

        dropoutGUIPanel.add(enrollmentIDLabel);
        dropoutGUIPanel.add(enrollmentIDTextd);

        dropoutGUIPanel.add(courseNameLabel);
        dropoutGUIPanel.add(courseNameTextd);

        dropoutGUIPanel.add(courseDurationLabel);
        dropoutGUIPanel.add(courseDurationTextd);

        dropoutGUIPanel.add(numOfRemainingModulesLabel);
        dropoutGUIPanel.add(numOfRemainingModulesTextd);

        dropoutGUIPanel.add(remainingAmountLabel);
        dropoutGUIPanel.add(remainingAmountTextd);

        dropoutGUIPanel.add(numberOfMonthsAttendedLabel);
        dropoutGUIPanel.add(numOfMonthsAttendedTextd);

        dropoutGUIPanel.add(doeRegularLabel);
        dropoutGUIPanel.add(doed);

        dropoutGUIPanel.add(tuitionFeeLabel);
        dropoutGUIPanel.add(tuitionFeeTextd);

        dropoutGUIPanel.add(dateOfDropoutLabel);
        dropoutGUIPanel.add(dodYear);
        dropoutGUIPanel.add(dodMonth);
        dropoutGUIPanel.add(dodDay);

        //buttons for dropout
        dropoutGUIPanel.add(dropout);
        dropoutGUIPanel.add(billsPayable);
        dropoutGUIPanel.add(removeStudent);
        dropoutGUIPanel.add(displayDropout);
        dropoutGUIPanel.add(clear);
        dropoutGUIPanel.add(backd);
        dropoutGUIPanel.add(dobDropoutDay);
        dropoutGUIPanel.add(dobDropoutMonth);
        dropoutGUIPanel.add(dobDropoutYear);

        regularGUIPanel.setVisible(false);
        dropoutGUIPanel.setVisible(false);

        regularGUIPanel.setLayout(null);
        mainGUIFrame.add(regularGUIPanel);
        mainGUIFrame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==presentPercentageButton)  // for regular
        {
            this.presentPercentage();
        }

        /*if(e.getSource()==dropout) // for dropout
        {
        this.adddropout();
        }*/

        if(e.getSource()==regularButton)
        {
            this.visibleregpanel();
        }

        if(e.getSource()==dropoutButton)
        {
            this.visibleDroppanel();
        }

        if(e.getSource()==clear)  //for regular
        {
            this.clearDrop();
        }

        if(e.getSource()==displayButton)  //for regualar
        {
            this.display();
        }

        if(e.getSource()==clearButton)  //for dropout
        {
            this.clearRegular();
        }

        if(e.getSource()==backButton)   //for regular
        {
            this.back();
        }

        if(e.getSource()==backd)   //for dropout
        {
            this.back1();

        }

        if(e.getSource()==grantedScholarshipButton)  
        {
            this.grantScholars();

        }
        if(e.getSource()==removeStudent)
        {
            String enrollment_ID_val_str = "";
            int enrollment_ID_val = 0;
            try {
                enrollment_ID_val_str= JOptionPane.showInputDialog("Enter enrollment ID: ");

                if (enrollment_ID_val_str.isEmpty()) {
                    JOptionPane.showMessageDialog(dropoutGUIPanel, "Cannot be empty", "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
                enrollment_ID_val = Integer.parseInt(enrollment_ID_val_str);
                if (enrollment_ID_val < 0) {
                    JOptionPane.showMessageDialog(dropoutGUIPanel, "Cannot be negative", "Error",
                        JOptionPane.ERROR_MESSAGE);
                } /*else {
                JOptionPane.showMessageDialog(studentGUIPanel1, "Enrollment ID cannot be negative", "Error",
                JOptionPane.ERROR_MESSAGE);
                }*/
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(dropoutGUIPanel, "Enter a valid Enrollment ID", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
            this.remove(enrollment_ID_val, std);
        }
        if(e.getSource()==billsPayable)   //for dropout
        {
            String enrollment_ID_val_str = "";
            int enrollment_ID_val = 0;
            try {
                enrollment_ID_val_str= JOptionPane.showInputDialog("Enter enrollment ID: ");

                if (enrollment_ID_val_str.isEmpty()) {
                    JOptionPane.showMessageDialog(dropoutGUIPanel, "Cannot be empty", "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
                enrollment_ID_val = Integer.parseInt(enrollment_ID_val_str);
                if (enrollment_ID_val < 0) {
                    JOptionPane.showMessageDialog(dropoutGUIPanel, "Cannot be negative", "Error",
                        JOptionPane.ERROR_MESSAGE);
                } /*else {
                JOptionPane.showMessageDialog(studentGUIPanel1, "Enrollment ID cannot be negative", "Error",
                JOptionPane.ERROR_MESSAGE);
                }*/
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(dropoutGUIPanel, "Enter a valid Enrollment ID", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
            this.bills(enrollment_ID_val, std);

        }

        if(e.getSource()==displayDropout)   //for dropout
        {
            this.Displaydrop();

        }

        if(e.getSource()==dropout)   //for dropout
        {
            this.adddropout();

        }
    }

    private void visibleregpanel()
    {
        regularGUIPanel.setVisible(true);
        mainStudentpanel.setVisible(false);
    }

    private void visibleDroppanel()
    {
        dropoutGUIPanel.setVisible(true);
        mainStudentpanel.setVisible(false);
    }

    public void addregular() 
    {
        try{
            //System.out.println(enrollmentIDText.getText());
            enrollmentID = Integer.parseInt(enrollmentIDTextR.getText().trim());
            //System.out.println(enrollmentIDText);
            String day_dob = String.valueOf(dobDay.getSelectedItem());
            String month_dob = String.valueOf(dobMonth.getSelectedItem());
            String year_dob = String.valueOf(dobYear.getSelectedItem());
            dateOfBirth= day_dob + "/" + month_dob + "/" + year_dob;
            //System.out.println(dob);
            courseName=courseNameTextR.getText();
            studentName=studentNameTextR.getText();
            dateOfEnrollment=String.valueOf(doe.getSelectedItem());
            courseDuration=Integer.parseInt(courseDurationTextR.getText());
            tuitionFee=Integer.parseInt(tuitionFeeTextR.getText());
            numberOfModules=Integer.parseInt(numberOfModulesTextR.getText());
            numOfCreditHours=Integer.parseInt(numOfCreditHoursTextR.getText());
            daysPresent=Integer.parseInt(daysPresentTextR.getText());
            System.out.println(daysPresent);
            Regular regular=new Regular(dateOfBirth,studentName,courseDuration,tuitionFee,numberOfModules,numOfCreditHours,daysPresent,dateOfEnrollment,courseName,enrollmentID);
            std.add(regular);
            JOptionPane.showMessageDialog(mainGUIFrame,"Successfully object created");

        }
        catch(Exception f)
        {
            JOptionPane.showMessageDialog( mainGUIFrame,"Please fill the valid information and then try to proceed again.");
        }
    }
    
    public void adddropout()
    {
        try
        {
            //System.out.println(enrollmentIDText.getText());
            enrollmentID = Integer.parseInt(enrollmentIDTextd.getText().trim());
            //System.out.println(enrollmentIDText);
            String day_dob1 = String.valueOf(dobDropoutDay.getSelectedItem());
            String month_dob1 = String.valueOf(dobDropoutMonth.getSelectedItem());
            String year_dob1 = String.valueOf(dobDropoutYear.getSelectedItem());
            dateOfBirth= day_dob1 + "/" + month_dob1 + "/" + year_dob1;
            //System.out.println(dob);
            courseName=courseNameTextd.getText();
            studentName=studentNameTextd.getText();
            dateOfEnrollment=String.valueOf(doe.getSelectedItem());
            courseDuration=Integer.parseInt(courseDurationTextd.getText());
            tuitionFee=Integer.parseInt(tuitionFeeTextd.getText());
            numberOfRemainingModules=Integer.parseInt(numOfRemainingModulesTextd.getText());
            remainingAmount=Integer.parseInt(remainingAmountTextd.getText());
            tuitionFee=Integer.parseInt(tuitionFeeTextd.getText());
            numberOfMonthsAttended=Integer.parseInt(numOfMonthsAttendedTextd.getText());
            //System.out.println(daysPresent);
            String day_dod=String.valueOf(dodDay.getSelectedItem());
            String month_dod=String.valueOf(dodMonth.getSelectedItem());
            String year_dod=String.valueOf(dodYear.getSelectedItem());
            dateOfDropout= day_dod + "/" + month_dod + "/" + year_dod;
            dateOfEnrollment=String.valueOf(doe.getSelectedItem());

            Dropout dropout=new Dropout(enrollmentID,dateOfBirth,studentName,courseDuration,tuitionFee,numberOfRemainingModules,numberOfMonthsAttended,dateOfDropout);//remainingAmount);
            std.add(dropout);
            JOptionPane.showMessageDialog(mainGUIFrame,"Successfully object created");
        }
        catch(Exception f)
        {
            JOptionPane.showMessageDialog( mainGUIFrame,"Please fill the valid information and then try to proceed again.");
        }
    }
    
    public void presentPercentage() // for regular
    {
        ArrayList<Regular> Regular= new ArrayList<>();

        boolean enrollment_val = false;
        // Regular a = regular_values();
        String enrollmentIDs_str = JOptionPane.showInputDialog("Enter your Enrollment ID: ");
        int enrollmentIDs = Integer.parseInt(enrollmentIDs_str);
        String number_of_days_str = JOptionPane.showInputDialog("Enter number of days: ");
        double number_of_days = Double.parseDouble(number_of_days_str);
        for (Student student : std) {
            if (student instanceof Regular) {
                // System.out.println(student.get_studentName() + " is a Regular student.")
                Regular.add((Regular) student);
                // System.out.println(RegularList);
                // System.out.println("This is of present_percentage!!");
            }
        }

        for (Regular i : Regular) {
            if (enrollmentIDs == i.get_enrollmentID()) {
                enrollment_val = true;
                //i.setdaysPresent(number_of_days);
                //i.presentPercentage(number_of_days);
                System.out.println(number_of_days);
                if (number_of_days > (i.get_courseDuration() * 30)) {

                    JOptionPane.showMessageDialog(mainGUIFrame, "Days Present greater than Course Duration "+
                        JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    char grade=i.presentPercentage(number_of_days);
                    JOptionPane.showMessageDialog(mainGUIFrame, "present percentage claculated successfully grade is "+grade);
                }
                break;
            }

        }

        if (!enrollment_val) {
            JOptionPane.showMessageDialog(mainGUIFrame, "Enrollment ID not found", "Certification",
                JOptionPane.INFORMATION_MESSAGE);
        }
        // return null;
    }

    public void display()//for regular
    {
        for (Student student : std) {
            if (student instanceof Regular) {
                Regular r=(Regular)student;
                r.display();
                // System.out.println(RegularList);
                // System.out.println("This is of present_percentage!!");
            }
        }  
    }

    public void grantScholars()
    {
        ArrayList<Regular> Regular_array= new ArrayList<>();
        for (Student student : std) 
        {
            if (student instanceof Regular) 
            {
                // System.out.println(student.get_studentName() + " is a Regular student.")
                Regular_array.add((Regular) student);
                // System.out.println(RegularList);
                // System.out.println("This is of present_percentage!!");
            }
        }

        try {
            if (std.size() > 0)
            {
                boolean enrollment_val = false;
                try {
                    String enrollment_ID_str = JOptionPane.showInputDialog("Enter Enrollment ID: ");
                    int enrollment_ID = Integer.parseInt(enrollment_ID_str);

                    for ( Regular i : Regular_array) 
                    {

                        if (enrollment_ID == i.get_enrollmentID()) 
                        {
                            String courseName = JOptionPane.showInputDialog("Enter courseName: ");
                            String dateofEnrollment = JOptionPane.showInputDialog("Enter Date Of Enrollment: ");

                            enrollment_val = true;
                            if (courseName.equals(i.get_courseName()))
                            {
                                if (dateofEnrollment.equals(i.get_dateofEnrollment()))
                                {

                                    i.grantCertificate(courseName, i.get_enrollmentID(), dateofEnrollment);
                                    if (i.getisGrantedScholarship())
                                    {
                                        JOptionPane.showMessageDialog(mainGUIFrame, "Scholarship Granted", "Certification",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    } else
                                    {
                                        JOptionPane.showMessageDialog(mainGUIFrame, "Scholarship Cannot be Granted",
                                            "Certification",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else 
                                {
                                    JOptionPane.showMessageDialog(mainGUIFrame,
                                        "Invalid Date of Enrollment for the course.. for given Enrollment ID",
                                        "Certification",
                                        JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            } else
                            {
                                JOptionPane.showMessageDialog(mainGUIFrame, "Course Name not found for given Enrollment ID",
                                    "Certification",
                                    JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                            break; // No need to continue looping once a match is found
                        }
                    }

                    if (!enrollment_val)
                    {
                        JOptionPane.showMessageDialog(mainGUIFrame, "Enrollment ID not found", "Certification",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(mainGUIFrame, "Enter valid input for Enrollment ID", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                } catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(mainGUIFrame, "Unexpected Error Occurred", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(mainGUIFrame, "No students added yet!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) 
        {
            throw ex;
        }
    }

    //for regular

    public void clearRegular()
    {
        studentNameTextR.setText("");
        dobDay.insertItemAt("",0);
        dobMonth.insertItemAt("",0);
        dobYear.insertItemAt("",0);
        enrollmentIDTextR.setText("");
        courseNameTextR.setText("");
        courseDurationTextR.setText("");
        numOfCreditHoursTextR.setText("");
        numberOfModulesTextR.setText("");
        tuitionFeeTextR.setText("");
        //daysPresent.setText("");
        //daysPresent = 0.0;
        //daysPresentText.setText(String.valueOf(daysPresent));
        daysPresentTextR.setText(Double.toString(daysPresent));
    }

    public void back()//for regular
    {
        regularGUIPanel.setVisible(false);
        mainStudentpanel.setVisible(true);
    }
    //for dropout
    

    public void back1()//for dropout
    {
        dropoutGUIPanel.setVisible(false);
        mainStudentpanel.setVisible(true);
    }

    public void clearDrop()//for dropout
    {
        studentNameTextd.setText("");
        dobDay.insertItemAt("",0);
        dobMonth.insertItemAt("",0);
        dobYear.insertItemAt("",0);
        enrollmentIDTextd.setText("");
        courseNameTextd.setText("");
        courseDurationTextd.setText("");
        //numOfCreditHoursText1.setText("");
        numOfRemainingModulesTextd.setText("");
        tuitionFeeTextd.setText("");
        numOfMonthsAttendedTextd.setText("");
        remainingAmountTextd.setText("");
        doe.insertItemAt("",0);
        //dod.insertItemAt("",0);

    }
    
    public void bills(int idFromPane,ArrayList<Student>studentList)
    {
        boolean istrue = false;
        for (Student checkStudent : studentList){
            if(checkStudent instanceof Dropout)
            {
                Dropout d=(Dropout)checkStudent;
                if(d.get_enrollmentID()==idFromPane)
                {
                    d.billsPayble();
                    JOptionPane.showMessageDialog(null,"bill calcuated successfully \n remaining amount" + d.get_remainingAmount());
                    istrue= false;
                    break;
                }
                else
                {
                    istrue = true;
                }
            }
        }

        if(istrue)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Enrollment ID");
            //System.out.println("Incorrect Enrollment ID");
        }

    }
    
    public void displayDropout()
    {
        for (Student student : std)
        {
            if (student instanceof Dropout) 
            {
                Dropout r=(Dropout)student;
                r.display();
            }
        }  
    }

    public void remove(int idFromPane,ArrayList<Student>studentList)
    {
        boolean istrue = false;
        for (Student checkStudent : studentList){
            if(checkStudent instanceof Dropout)
            {
                Dropout d=(Dropout)checkStudent;
                if(d.get_enrollmentID()==idFromPane)
                {
                    istrue= false;
                    if(d.get_hasPaid()==true)
                    {
                        d.removeStudent();
                        JOptionPane.showMessageDialog(null,"student reemoved sucdessfully");
                        break;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"remaining amount was left so student can't be removed"); 
                        break;
                    }

                }
                else
                {
                    istrue = true;
                }
            }
        }

        if(istrue)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Enrollment ID");
            //System.out.println("Incorrect Enrollment ID");
        }

    }

    

    public void Displaydrop()//for dropout
    {
        for (Student student : std) {
            if (student instanceof Dropout) {
                Dropout d=(Dropout)student;
                d.display();
                // System.out.println(RegularList);
                // System.out.println("This is of present_percentage!!");
            }
        }  
    }
    //------------------------!Main Method!---------------------------
    public static void main(String[] a) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    mainGUI window = new mainGUI();
                }
            });
    }
}
