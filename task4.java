import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter server request count: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int request = sc.nextInt();

            if (request > 0 && request <= 1000)
                System.out.println("Request Valid");
            else
                System.out.println("Request Invalid");
        }

        sc.close();
    }
}