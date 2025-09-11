package Week5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }

        for(Student student : list){
            System.out.println(student);
        }

        System.out.print("Give search name: ");
        String term = reader.nextLine();
        for(Student student : list){
            if(student.getName().contains(term)){
                System.out.println(student);
            }
        }

        reader.close();
    }
}