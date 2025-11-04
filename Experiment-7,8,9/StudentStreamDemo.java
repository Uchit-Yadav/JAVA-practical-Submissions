package experiment2_3.partB;

import java.util.*;

public class StudentStreamDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Riya", 80),
                new Student("Amit", 60),
                new Student("Sneha", 90),
                new Student("Kunal", 70)
        );

        System.out.println("Students scoring above 75% sorted by marks:");
        students.stream()
                .filter(s -> s.marks > 75)
                .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks))
                .map(s -> s.name + " (" + s.marks + ")")
                .forEach(System.out::println);
    }
}
