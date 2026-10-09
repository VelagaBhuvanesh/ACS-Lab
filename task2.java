import java.util.*;

public class WarehouseManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> products = new HashMap<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String product = sc.next();
            products.put(product, products.getOrDefault(product, 0) + 1);
        }

        System.out.println("Product Frequencies:");
        for (String p : products.keySet())
            System.out.println(p + " : " + products.get(p));

        sc.close();
    }
}