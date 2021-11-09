import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

  final static Scanner scanner = new Scanner(System.in);
  final static byte MONTHS_IN_YEAR = 12;
  final static byte PERCENT = 100;

  public static void main(String[] args) {

    int principal = getPrincipal();
    double monthlyInterestRate = getMonthlyInterestRate();
    short numMonths = getNumPayments();

    double mortgage = calculateMortgage(principal, monthlyInterestRate, numMonths);
    String result = formatCurrency(mortgage);

    System.out.println("Mortgage: " + result);

    scanner.close();
  }

  public static int getPrincipal() {
    System.out.print("Principal ($1K - $1M): ");
    int principal = scanner.nextInt();
    // Validate principal
    boolean isValid = validateNumberRange(1_000, 1_000_000, principal);

    return isValid ? principal : getPrincipal();
  }

  public static double getMonthlyInterestRate() {
    System.out.print("Annual Interest Rate: ");
    float annualInterest = scanner.nextFloat();
    // Validate annual interest
    boolean isValid = validateNumberRange(1, 30, annualInterest);

    return isValid ? (annualInterest / MONTHS_IN_YEAR / PERCENT) : getMonthlyInterestRate();
  }

  public static short getNumPayments() {
    System.out.print("Period (Years): ");
    short years = scanner.nextShort();

    boolean isValid = validateNumberRange(1, 30, years);

    return isValid ? (short) (years * MONTHS_IN_YEAR) : getNumPayments();
  }

  public static double calculateMortgage(int principal, double monthlyInterestRate, short numMonths) {
    double expression = Math.pow(1 + monthlyInterestRate, numMonths);

    double top = monthlyInterestRate * expression;
    double bottom = expression - 1;

    return principal * (top / bottom);
  }

  public static String formatCurrency(double number) {
    return NumberFormat.getCurrencyInstance().format(number);
  }

  public static boolean validateNumberRange(int min, int max, float number) {
    boolean isWithinRange = (number >= min) && (number <= max);

    if (!isWithinRange)
      System.out.println(String.format("Invalid input. Please enter a number between %s and %s", min, max));

    return isWithinRange;
  }
}
