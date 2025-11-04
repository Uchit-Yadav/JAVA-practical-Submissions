package experiment2_2.partA;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter how many numbers you want to add: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            String input = sc.nextLine();

            // String to Integer using parseInt (Autoboxing happens while adding to ArrayList)
            Integer num = Integer.parseInt(input);
            numbers.add(num);
        }

        int sum = 0;
        // Unboxing happens here in enhanced for loop
        for (Integer value : numbers) {
            sum += value;
        }

        System.out.println("Sum of integers = " + sum);
        sc.close();
    }
}
