package experiment2_2.partB;

import java.io.*;
import java.util.Scanner;

public class SerializeStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        Student s = new Student(id, name, grade);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(s);
            out.close();
            System.out.println("Student serialized successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}

