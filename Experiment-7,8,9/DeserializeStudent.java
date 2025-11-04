package experiment2_2.partB;

import java.io.*;

public class DeserializeStudent {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            Student s = (Student) in.readObject();
            System.out.println("\nStudent details after deserialization:");
            s.display();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
