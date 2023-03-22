abstract class Module{
    private String name;
    private int status;
    private double finalMark;

    public Module(String name, int status){
        this.name = "";
        this.status = 0;
        this.finalMark = 0;
    }

    // $$ Name Attribute Accessor and Mutator $$
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    // $$ Status Attribute Accessor and Mutator $$
    public void setStatus(int status){
        if (status == 0 || status == 1 || status == 2){
            this.status = status;
        }
        else{
            System.out.println("Invalid Status");
        }
    }
    public int getStatus(){
        return status;
    }

    // $$ Final Mark Attribute Accessor and Mutator $$
    public double setFinalMark(double finalMark){
        return this.finalMark = finalMark;
    }
    public double getFinalMark(){
        return finalMark;
    }
    public String printFinalMark(){
        return "Final Mark: " + finalMark;
    }

}

class EX002 extends Module{
    public EX002(int exam) {
        super("EX002",1);
        this.exam = exam;
    }
    private double exam;

    // $$ Exam Mark Attribute Accessor and Mutator $$
    public void setExamMark(double exam){
        if (exam >= 0 && exam <= 100){
            this.exam = exam;
        }
        else{
            System.out.println("Invalid Exam Mark -- Project mark will not be calculated into Final EX002 Mark");
        }
    }
    public double getExamMark(){
        return exam;
    }
    public void getEX002Mark(){
        setFinalMark(exam);
    }
}

class CE003 extends Module{
    private double CE003Mark;
    private double exam;
    private double [] homework;
    private double averageHW;
    public CE003(double [] homework, int exam) {
        super("CE003",2);
        this.homework = homework;
        this.exam = exam;
    }
    // $$ Coursework Attribute Accessor and Mutator $$
    public void setCourseworkMark(int i, double marks){
        if (marks >= 0 && marks <= 100){
            homework[i] = marks;
        }
        else{
            System.out.println("Invalid Coursework Mark -- Project mark will not be calculated into Final CE003 Mark");
        }
    }
    public double[] getCourseworkMark(){
        return homework;
    }

    // $$ Exam Mark Attribute Accessor and Mutator $$
    public void setExamMark(double exam){
        if (exam >= 0 && exam <= 100){
            this.exam = exam;
        }
        else{
            System.out.println("Invalid Exam Mark -- Project mark will not be calculated into Final CE003 Mark");
        }
    }
    public double getExamMark(){
        return exam;
    }
    public void getCE003Mark(){
        this.averageHW = ((homework[0] + homework[1] + homework[2])/3);
        CE003Mark = ((averageHW * 0.4) + (exam * 0.6));
        setFinalMark(CE003Mark);
    }
    public double getAverageHW(){
        return averageHW;
    }

}

class CW001 extends Module{
    private double project;
    private double [] homework;
    private double averageHW;
    private double CW001Mark;
    public CW001(double [] homework, int project) {
        super("CW001", 0);
        this.homework = homework;
        this.project = project;

    }
    // $$ HW Attribute Accessor and Mutator $$
    public void setHWMarks(int i, double marks){
        if (marks >= 0 && marks <= 100){
            homework[i] = marks;
        }
        else{
            System.out.println("Invalid Homework Mark -- Project mark will not be calculated into Final CW001 Mark");
        }
    }
    public double[] getHWMarks(){
        return homework;
    }
    // $$ Project Attribute Accessor and Mutator $$
    public void setProjectMark(double project){
        if (project >= 0 && project <= 100){
            this.project = project;
        }
        else{
            System.out.println("Invalid Project Mark -- Project mark will not be calculated into Final CW001 Mark");
        }
    }
    public double getProjectMark(){
        return project;
    }
    public void getCW001Mark(){
        this.averageHW = ((homework[0] + homework[1] + homework[2])/3);
        CW001Mark = ((averageHW * 0.5)+ (project * 0.5));
        setFinalMark(CW001Mark);
    }

    public double getAverageHW(){
        return averageHW;
    }

}

class Student {
    private String firstName;
    private String surname;

    // Making attributes from each module packages
    private CW001 cw001;
    private EX002 ex002;
    private CE003 ce003;

    Student(String firstname, String surname, CW001 cw001, EX002 ex002, CE003 ce003) {
        this.firstName = firstname;
        this.surname = surname;
        this.cw001 = cw001;
        this.ex002 = ex002;
        this.ce003 = ce003;

    }

    // $$ Firstname Attribute Accessor and Mutator $$
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // $$ Surname Attribute Accessor $$
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    // $$ CW001 Attribute Accessor and Mutator $$
    public void setCW001FinalMark(double finalMark) {
        cw001.setFinalMark(finalMark);
    }

    public double getCW001FinalMark() {
        return cw001.getFinalMark();
    }

    // $$ EX002 Attribute Accessor and Mutator $$
    public void setEX002FinalMark(double finalMark) {
        ex002.setFinalMark(finalMark);
    }

    public double getEX002FinalMark() {
        return ex002.getFinalMark();
    }

    // $$ CE003 Attribute Accessor and Mutator $$
    public void setCE003FinalMark(double finalMark) {
        ce003.setFinalMark(finalMark);
    }

    public double getCE003FinalMark() {
        return ce003.getFinalMark();
    }

    // methods to print all modules or one specific module
    public void printAllModuleMarks() { //print all modules
        System.out.printf("%-12s %-15s %.2f%% %9.2f%% %9.2f%%\n", firstName, surname, cw001.getFinalMark(),
                ex002.getFinalMark(), ce003.getFinalMark());
    }
    public void printCW001Marks(){ //print CW001
        System.out.printf("%-12s %-15s %.2f%% %9.2f%% %9.2f%%\n", firstName, surname,
                cw001.getAverageHW(), cw001.getProjectMark(), cw001.getFinalMark());
    }
    public void printEX002Marks(){ //print EX002
        System.out.printf("%-12s %-15s %.2f%%\n", firstName, surname, ex002.getFinalMark());
    }
    public void printCE003Marks(){ //print CE003
        System.out.printf("%-12s %-15s %.2f%% %9.2f%% %9.2f%%\n", firstName, surname,
                ce003.getAverageHW(), ce003.getExamMark(), ce003.getFinalMark());
    }
}


import java.util.*;
public class Main {
    public static void main(String[] args) {
        //-----------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------");
        System.out.println("How many students are taking this module? : ");
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        int numOfStudents = scanner.nextInt();
        Student[] studentDetails = new Student[numOfStudents]; // Create an array of Student objects with the size of numOfStudents
        for (int i = 0; i < numOfStudents; i++) { // Loop through the array of Student objects
            System.out.println("Enter student " + (i + 1) + " details : ");
            System.out.print("First Name : ");
            String firstName = scanner.next();
            System.out.print("Surname : ");
            String surname = scanner.next();

            // Create a CW001 object
            System.out.println("--CW001--");
            double[] homework1 = new double[3];
            for (int x = 0; x < 3; x++) {
                System.out.print("Homework " + (x + 1) + " mark: ");
                homework1[x] = scanner.nextDouble();
            }

            System.out.print("Project Mark : ");
            int project = scanner.nextInt();
            CW001 cw001 = new CW001(homework1, project);

            // Create a EX002 object
            System.out.println("--EX002--");
            System.out.print("Exam Mark : ");
            int exam = scanner.nextInt();
            EX002 ex002 = new EX002(exam);

            // Create a CE003 object
            System.out.println("--CE003--");
            double[] homework2 = new double[4];
            for (int x = 0; x < 4; x++) {
                System.out.print("Homework " + (x + 1) + " mark: ");
                homework2[x] = scanner.nextDouble();
            }
            System.out.print("Exam Mark : ");
            int exam_2 = scanner.nextInt();
            CE003 ce003 = new CE003(homework2, exam_2);

            // calculate each module marks and store them in the Student object
            cw001.getCW001Mark();
            ex002.getEX002Mark();
            ce003.getCE003Mark();
            studentDetails[i] = new Student(firstName, surname, cw001, ex002, ce003);
        }
        //-----------------------------------------------------------------------------------------------------------------
        // Printout in tabular form the student details and their marks (user can choose to print 1 module marks or all module marks)
        boolean exit = false;
        while (!exit){
            System.out.println("-------------------------------------------------------------");
            System.out.println("Hello, and welcome to the Student Marking System!");
            System.out.println("Please select an option from the menu below : ");
            System.out.println("1. Print all student details and module marks");
            System.out.println("2. Print student details and marks for a specific module");
            System.out.println("3. Exit");
            System.out.println("-------------------------------------------------------------");
            int option = scanner.nextInt();
            switch (option){
                case 1: // Print out all the student details and marks
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Marks for all modules : ");
                    System.out.printf("%-12s %-15s %-10s %-10s %-9s\n", "Name", "Surname", "CW001", "EX002", "CE003");
                    for (int i = 0; i < numOfStudents; i++) {
                        studentDetails[i].printAllModuleMarks();
                    }
                    break;
                case 2: // Print out the marks for a specific module
                    System.out.println("Please select a module to print marks for : ");
                    System.out.println("1. CW001");
                    System.out.println("2. EX002");
                    System.out.println("3. CE003");
                    int module = scanner.nextInt();
                    switch (module) {
                        case 1: { // Print out the marks for CW001
                            System.out.println("-------------------------------------------------------------");
                            System.out.println("Marks for CW001 : ");
                            System.out.printf("%-12s %-15s %-10s %-10s %-9s\n", "Name", "Surname", "HWs", "Project", "Final Mark");
                            for (int i = 0; i < numOfStudents; i++) {
                                studentDetails[i].printCW001Marks();
                            }
                            break;
                        }
                        case 2: { // Print out the marks for EX002
                            System.out.println("-------------------------------------------------------------");
                            System.out.println("Marks for EX002 : ");
                            System.out.printf("%-12s %-15s %-10s\n", "Name", "Surname", "Final Mark");
                            for (int i = 0; i < numOfStudents; i++) {
                                studentDetails[i].printEX002Marks();
                            }
                            break;
                        }
                        case 3:{ // Print out the marks for CE003
                            System.out.println("-------------------------------------------------------------");
                            System.out.println("Marks for CE003 : ");
                            System.out.printf("%-12s %-15s %-10s %-10s %-9s\n", "Name", "Surname", "CW", "Exam", "Final Mark");
                            for (int i = 0; i < numOfStudents; i++) {
                                studentDetails[i].printCE003Marks();
                            }
                            break;
                        }
                        //default: // Invalid option
                            //    System.out.println("Invalid option, please try again.");
                    }
                    break;
                case 3: // Exit the program
                    System.out.println("Thank you for using the Student Marking System!");
                    exit = true; // Exit the program
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }

        }
        scanner.close();
    }
}
