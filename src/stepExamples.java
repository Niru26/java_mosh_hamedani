import java.util.*;

public class stepExamples {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int sum = 0;
        while(true) {
            int number = data.nextInt();
            int lastDigit = number % 10;
            if (lastDigit == 7) {
                sum += number;
            }
            if (number % 7 == 0) {
                break;
            }
        }
        System.out.println(sum);
    }

}

