package experiment2_3.partA;

import java.util.*;

public class EmployeeSortDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Rohan", 25, 50000),
                new Employee("Aman", 30, 70000),
                new Employee("Neha", 22, 45000),
                new Employee("Simran", 28, 65000)
        );

        System.out.println("---- Sort by Name ----");
        employees.stream().sorted((e1, e2) -> e1.name.compareTo(e2.name))
                .forEach(System.out::println);

        System.out.println("\n---- Sort by Age ----");
        employees.stream().sorted((e1, e2) -> e1.age - e2.age)
                .forEach(System.out::println);

        System.out.println("\n---- Sort by Salary (Descending) ----");
        employees.stream().sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                .forEach(System.out::println);
    }
}
