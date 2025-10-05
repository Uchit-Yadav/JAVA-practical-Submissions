import java.util.ArrayList;
import java.util.Scanner;

public class SumIntegersAutoboxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by space:");
        String input = scanner.nextLine();
        String[] inputs = input.split("\\s+");

        for (String s : inputs) {
            Integer num = Integer.parseInt(s); // Autoboxing
            numbers.add(num);
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
