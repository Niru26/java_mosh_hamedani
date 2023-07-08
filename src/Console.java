import java.util.Scanner;

public class Console {
    private static Scanner DataEntry = new Scanner(System.in);
    public static double readNumber(String prompt) {
        return DataEntry.nextDouble();
    }
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = DataEntry.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter valid data between " + min + " and " + max);
        }
        return value;
    }
}
