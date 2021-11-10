import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

  static Scanner scanner = new Scanner(System.in);
  final static byte MONTHS_IN_YEAR = 12;
  final static byte PERCENT = 100;

  public static void main(String[] args) {
    int principal = getPrincipal();
    double monthlyInterestRate = getMonthlyInterestRate();
    short numOfMonthlyPayments = getNumberOfMonthlyPayments();

    printMortgage(principal, monthlyInterestRate, numOfMonthlyPayments);
    printPaymentSchedule(principal, monthlyInterestRate, numOfMonthlyPayments);

    scanner.close();
  }

  private static void printMortgage(int principal, double monthlyInterestRate, short numOfMonthlyPayments) {
    double mortgage = calculateMortgage(principal, monthlyInterestRate, numOfMonthlyPayments);
    String mortgageFormatted = formatCurrency(mortgage);
    System.out.println("\nMORTGAGE\n--------");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }

  private static void printPaymentSchedule(int principal, double monthlyInterestRate, short numOfMonthlyPayments) {
    System.out.println("\nPAYMENT SCHEDULE\n----------------");
    for (short month = 1; month <= numOfMonthlyPayments; month++) {
      double balance = calculateBalance(principal, monthlyInterestRate, numOfMonthlyPayments, month);
      String balanceFormatted = formatCurrency(balance);
      System.out.println(balanceFormatted);
    }
  }

  public static int getPrincipal() {
    int principal = (int) readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
    return principal;
  }

  public static double getMonthlyInterestRate() {
    float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
    return (annualInterest / (double) MONTHS_IN_YEAR / (double) PERCENT);
  }

  public static byte getNumberOfMonthlyPayments() {
    byte years = (byte) readNumber("Period (Years): ", 1, 30);
    return (byte) (years * MONTHS_IN_YEAR);
  }

  public static double calculateMortgage(int principal, double monthlyInterestRate, short numOfMonthlyPayments) {
    double expression = Math.pow(1 + monthlyInterestRate, numOfMonthlyPayments);

    double top = monthlyInterestRate * expression;
    double bottom = expression - 1;

    return principal * (top / bottom);
  }

  public static double calculateBalance(int principal, double monthlyInterestRate, short numOfMonthlyPayments,
      short numPaymentsMade) {

    double numPayments = Math.pow(1 + monthlyInterestRate, numOfMonthlyPayments);
    double paymentsMade = Math.pow(1 + monthlyInterestRate, numPaymentsMade);

    return principal * ((numPayments - paymentsMade) / (numPayments - 1));
  }

  public static String formatCurrency(double number) {
    return NumberFormat.getCurrencyInstance().format(number);
  }

  public static boolean validateNumberRange(double value, double min, double max) {
    boolean isWithinRange = (value >= min) && (value <= max);

    if (!isWithinRange)
      System.out.println(String.format("Invalid input. Please enter a value between %s and %s", min, max));

    return isWithinRange;
  }

  public static double readNumber(String prompt, double min, double max) {
    System.out.print(prompt);

    double value = scanner.nextFloat();

    boolean isValid = validateNumberRange(value, min, max);

    return isValid ? value : readNumber(prompt, min, max);
  }

}
