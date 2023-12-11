 class Student {
    private String name;
    private String stu_id;
    private double GPA;
    private int age;

    // Fully loaded constructor
    public Student(String name, String stu_id, double GPA, int age) {
        this.name = name;
        this.stu_id = stu_id;
        this.GPA = GPA;
        this.age = age;
    }

    // No-arg constructor
    public Student() {
        // Default constructor with no arguments
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for stu_id
    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    // Getter and setter methods for GPA
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
 public class StudentAccess {
     public static void main(String[] args) {
         // Instantiating a student using the fully loaded constructor
         Student student1 = new Student("Chandler Bing", "12225", 3.8, 21);

         // Instantiating a student using the no-arg constructor
         Student student2 = new Student();

         // Setting values using setter methods
         student2.setName("Rachel Green");
         student2.setStu_id("52321");
         student2.setGPA(4.0);
         student2.setAge(20);

         // Accessing and printing the information
         System.out.println("Student 1:");
         System.out.println("Name: " + student1.getName());
         System.out.println("Student ID: " + student1.getStu_id());
         System.out.println("GPA: " + student1.getGPA());
         System.out.println("Age: " + student1.getAge());

         System.out.println("\nStudent 2:");
         System.out.println("Name: " + student2.getName());
         System.out.println("Student ID: " + student2.getStu_id());
         System.out.println("GPA: " + student2.getGPA());
         System.out.println("Age: " + student2.getAge());
     }
 }


