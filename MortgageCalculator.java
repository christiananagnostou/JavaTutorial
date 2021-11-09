import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

  final static byte MONTHS_IN_YEAR = 12;
  final static byte PERCENT = 100;

  public static void main(String[] args) {
    int principal = getPrincipal();
    double monthlyInterestRate = getMonthlyInterestRate();
    short numMonths = getNumPayments();

    double mortgage = calculateMortgage(principal, monthlyInterestRate, numMonths);
    String result = formatCurrency(mortgage);

    System.out.println("Mortgage: " + result);

  }

  public static int getPrincipal() {
    int principal = (int) readNumber("Principal ($1K - $1M): ");
    boolean isValid = validateNumberRange(1_000, 1_000_000, principal);

    return isValid ? principal : getPrincipal();
  }

  public static double getMonthlyInterestRate() {
    float annualInterest = (float) readNumber("Annual Interest Rate: ");
    boolean isValid = validateNumberRange(1, 30, annualInterest);

    return isValid ? (annualInterest / MONTHS_IN_YEAR / PERCENT) : getMonthlyInterestRate();
  }

  public static byte getNumPayments() {
    byte years = (byte) readNumber("Period (Years): ");
    boolean isValid = validateNumberRange(1, 30, years);

    return isValid ? (byte) (years * MONTHS_IN_YEAR) : getNumPayments();
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
      System.out.println(String.format("Invalid input. Please enter a value between %s and %s", min, max));

    return isWithinRange;
  }

  public static double readNumber(String prompt) {
    System.out.println(prompt);

    Scanner scanner = new Scanner(System.in);
    double value = scanner.nextFloat();
    scanner.close();

    return value;
  }
}
