package experiment2_2.partC;

import java.io.*;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter fw;
        BufferedWriter bw;

        while (true) {
            System.out.println("\n===== Employee Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String desg = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    String sal = sc.nextLine();

                    fw = new FileWriter("employees.txt", true);
                    bw = new BufferedWriter(fw);
                    bw.write(id + "," + name + "," + desg + "," + sal);
                    bw.newLine();
                    bw.close();
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    FileReader fr = new FileReader("employees.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String line;

                    System.out.println("\n--- Employee Records ---");
                    while ((line = br.readLine()) != null) {
                        String data[] = line.split(",");
                        System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Designation: " + data[2] + ", Salary: " + data[3]);
                    }
                    br.close();
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

