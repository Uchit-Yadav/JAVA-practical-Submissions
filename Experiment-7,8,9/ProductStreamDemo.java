package experiment2_3.partC;

import java.util.*;
import java.util.stream.Collectors;

public class ProductStreamDemo {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 70000, "Electronics"),
                new Product("Phone", 50000, "Electronics"),
                new Product("Shirt", 1500, "Clothing"),
                new Product("Jeans", 2500, "Clothing"),
                new Product("Milk", 60, "Grocery"),
                new Product("Oil", 150, "Grocery")
        );

        // Grouping by Category
        System.out.println("\n--- Group Products by Category ---");
        Map<String, List<Product>> group = products.stream()
                .collect(Collectors.groupingBy(p -> p.category));
        System.out.println(group);

        // Most expensive product in each category
        System.out.println("\n--- Most Expensive Product by Category ---");
        Map<String, Optional<Product>> maxPrice = products.stream()
                .collect(Collectors.groupingBy(
                        p -> p.category,
                        Collectors.maxBy(Comparator.comparing(p -> p.price))
                ));
        System.out.println(maxPrice);

        // Average price
        double avgPrice = products.stream()
                .collect(Collectors.averagingDouble(p -> p.price));
        System.out.println("\nAverage Product Price: " + avgPrice);
    }
}
