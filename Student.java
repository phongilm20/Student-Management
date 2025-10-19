public class Student {
    private int id;
    private int age;
    private String name;
    private double gpa;

    public Student(int id, int age, String name, double gpa) {
        this.id=id;
        this.age=age;
        this.name = name;
        this.gpa = gpa;
    }
    public String toString() {
        return "ID "+id+" - Student: "+ name + " Age: "+ age+" GPA: "+gpa ;
    }
   public int getId()
   {
        return id;
   }
   public String getName()
   {
        return name;
   }
   public int getAge()
   {
        return age;
   }
   public double getGpa()
   {
        return gpa;
   }
}