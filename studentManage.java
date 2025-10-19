import java.util.InputMismatchException;
import java.util.Scanner;

public class studentManage{
public static int idAgeInputCheck(Scanner scnr) {
    int output=0;
    boolean loop = false;
    while (loop == false) {
        try {
            output = scnr.nextInt();
            if (output>0) {
                return output;
            }
        }
        catch(InputMismatchException e) {
            System.out.println("Type a number: ");
            scnr.nextLine();
        }
    }
    
    return output;
}
public static double gpaInputCheck(Scanner scnr) {
    double output=0;
    boolean loop = false;
    while (loop == false) {
        try {
            output = scnr.nextDouble();
            if (output>=0.0 && output<=4.0) {
                return output;
            }
            else
            {
                System.out.println("Type a number (0.0-4.0): ");
            }
        }
        catch(InputMismatchException e) {
            System.out.println("Type a number: ");
            scnr.nextLine();
        }
    }
    
    return output;
}

    public static void main(String[]args) {
        Scanner scnr = new Scanner(System.in);
        String name;
        int age;
        int id;
        double gpa;
        boolean choosing = true;
        int numChoosing=0;
        Manage manage = new Manage();
        // Loop for choosing
        while (choosing == true) {
            System.out.println("\nSTUDENT MANAGEMENT");
            System.out.println("1. Show list");
            System.out.println("2. Add Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Find Student");
            System.out.println("5. Edit Student");
            System.out.println("6. Exit");
            
            try
            {
                numChoosing = scnr.nextInt();
            }
            catch(InputMismatchException e) 
            {
                numChoosing=0; // Move to Else
            }
            
            if (numChoosing < 7 && numChoosing >0) {
                switch (numChoosing) {
                    // Show
                    case 1:
                        manage.showlist();
                        break;

                    // Add student
                    case 2:
                        System.out.println("Student Name: ");
                        scnr.nextLine();
                        name = scnr.nextLine(); 
                        System.out.println("Student ID: ");
                        id = idAgeInputCheck(scnr);
                        scnr.nextLine();
                        System.out.println("Student age: ");
                        age = idAgeInputCheck(scnr);
                        scnr.nextLine();
                        System.out.println("Student gpa: ");
                        gpa = gpaInputCheck(scnr);
                        scnr.nextLine();
                        Student newstudent = new Student(id, age, name, gpa);
                        manage.addStudent(newstudent);
                        System.out.println("ADDED");                        
                        break;

                    // Delete
                    case 3:
                        manage.showlist();
                        System.out.println("Which student do you want to delete (line-number): ");
                        scnr.nextLine();
                        
                        try {
                            int deleteInput = scnr.nextInt();
                            if (deleteInput <=0) {
                                System.out.println("Line 0 does not exist");
                            }
                            else {
                            manage.deleteStudent(deleteInput);
                            }
                        }
                        catch(Exception e) {
                            System.out.println("Error");
                        }
                        break;
                    
                    // Find
                    case 4:
                        System.out.println("Student Name: ");
                        scnr.nextLine();
                        name = scnr.nextLine(); 
                        System.out.println("Student ID: ");
                        id = idAgeInputCheck(scnr);
                        scnr.nextLine();
                        manage.findStudent(name, id);
                        break;

                    case 5:
                        manage.showlist();
                        if (!manage.isEmpty()) {
                        System.out.println("Which student do you want to edit (line-number): ");
                        scnr.nextLine();
                        
                            try {
                                int deleteInput = scnr.nextInt();
                                if (deleteInput<=0) {
                                    System.out.println("Line 0 does not exist");
                                }
                                else {
                                    System.out.println("New Student Name: ");
                                    scnr.nextLine();
                                    name = scnr.nextLine(); 
                                    System.out.println("New Student ID: ");
                                    id = idAgeInputCheck(scnr);
                                    scnr.nextLine();
                                    System.out.println("New Student age: ");
                                    age = idAgeInputCheck(scnr);
                                    scnr.nextLine();
                                    System.out.println("New Student gpa: ");
                                    gpa = gpaInputCheck(scnr);
                                    scnr.nextLine();
                                    newstudent = new Student(id, age, name, gpa);
                                    manage.editStudent(newstudent, deleteInput);
                                    continue;
                                }
                            }
                            catch(Exception e) {
                                System.out.println("Error");
                            }
                            scnr.nextLine();
                            break;
                        }
                        else
                        {
                            System.out.println("List is empty, add more student");
                        }
                    
                    // Exit
                    case 6:
                        System.out.println("Thank you for using");
                        choosing = false;
                        break;
                }
            }
            
            else {
                System.out.println("Please type correct integer from 1 to 6");
                scnr.nextLine();
            }
        }

        scnr.close();
    }
}