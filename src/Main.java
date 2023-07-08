import java.text.NumberFormat;

public class Main {
    final static int LOW_LIMIT_SUM = 1_000;
    final static  int TOP_LIMIT_SUM = 1_000_000;
    final static byte PERCENT = 100;
    final static byte MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {

        short MIN_VALUE = 1;
        short MAX_VALUE = 30;

        int principal = (int) Console.readNumber("Principal (1K - 1M): ", LOW_LIMIT_SUM, TOP_LIMIT_SUM);
        float anualInteresRate = (float) Console.readNumber("Annual Interest Rate: ", MIN_VALUE, MAX_VALUE);
        byte years = (byte) Console.readNumber("Period (Years): ", MIN_VALUE, MAX_VALUE);

        printMortage(principal, anualInteresRate, years);

        printPaymentSchedule(principal, anualInteresRate, years);
    }

    private static void printMortage(int principal, float anualInteresRate, byte years) {
        double mortage = calculateMortage(principal, anualInteresRate, years);
        String mortageCurrency = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println();
        System.out.println("Mortage");
        System.out.println("-------");
        System.out.println("Monthly mortage: " + mortageCurrency);
    }

    private static void printPaymentSchedule(int principal, float anualInteresRate, byte years) {
        System.out.println();
        System.out.println("Payment schedule");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, anualInteresRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double calculateBalance(
            int principal,
            float anualInteresRate,
            byte years,
            short numberOfPaymentsMade
    ) {

        float monthInteresRate = anualInteresRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow(1 + monthInteresRate, numberOfPayments) - (Math.pow((1 + monthInteresRate), numberOfPaymentsMade)))
                / (Math.pow(1 + monthInteresRate, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMortage(
            int principal,
            float anualInteresRate,
            byte years) {

        float monthInteresRate = anualInteresRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        double mortage = principal
                * ((monthInteresRate * Math.pow((1 + monthInteresRate), numberOfPayments))
                / (Math.pow((1 + monthInteresRate), numberOfPayments) - 1));

        return mortage;
    }
}
