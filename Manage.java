import java.util.ArrayList;
import java.util.List;

public class Manage {
    int keynumber=0;
    List<Student> studentList;
    public Manage() {
        this.studentList = new ArrayList<>();
    }

    public void showlist() {
        for(Student studentprint : studentList) {
            System.out.println(studentprint);
            System.out.println();
        }
    }

    public  void addStudent(Student student) {
        this.studentList.add(student);
    }

    // Delete
    public void deleteStudent(int deleteInput) {
        // Check if the delete input is in the student list
        
            if (studentList.size() >= deleteInput) {
                deleteInput = deleteInput-1;
                System.out.println("REMOVED: "+ studentList.get(deleteInput));
                studentList.remove(deleteInput);
            }
            else {
                System.out.println("Cannot find");
            }
    }

    // Find
    public void findStudent(String name, int id)
    {   
        ArrayList<Student> temporaryStudent = new ArrayList<>();
        for(Student studentFind: studentList) {
            if ((studentFind.getName()).equalsIgnoreCase(name) && studentFind.getId()==id)
            {
                temporaryStudent.add(studentFind);
            }
            else if ((studentFind.getName()).equalsIgnoreCase(name))
            {
                temporaryStudent.add(studentFind);
            }
        }
        if (temporaryStudent.isEmpty())
        {
            System.out.println("List is null");
        }
        for(int i=0; i<temporaryStudent.size();i++) {
            System.out.print(temporaryStudent.get(i)+"\n");
        }
    }

    // Edit
    public void editStudent(Student studentEdit, int editInput)
    {
        if (studentList.isEmpty()) {
            System.out.print("Your List is empty");
        }
        else {
        studentList.set(editInput-1, studentEdit);
        System.out.println("Edited");
        }
    }

    // Check List is empty or not
    public boolean isEmpty() {
        return this.studentList.isEmpty();
    }
}