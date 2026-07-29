import java.util.ArrayList;

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Aswin");
        students.add("Karthick");
        students.add("Priyadharshini");
        students.add("Rahul");
        students.add("Kumar");

        System.out.println(students);
        
        System.out.println(students.get(2));
        
        students.set(3, "Arun");
        System.out.println(students);
        
        students.remove(1);
        System.out.println(students);
        
        System.out.println(students.size());
        
        System.out.println(students.contains("Kumar"));
        
        students.clear();
        System.out.println(students);
    }
}