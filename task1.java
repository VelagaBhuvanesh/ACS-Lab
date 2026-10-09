import java.util.Scanner;

public class TrafficAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int vehicles = sc.nextInt();

        if (vehicles <= 20)
            System.out.println("Low Congestion - Green Signal");
        else if (vehicles <= 50)
            System.out.println("Moderate Congestion - Yellow Signal");
        else
            System.out.println("High Congestion - Red Signal");

        sc.close();
    }
}