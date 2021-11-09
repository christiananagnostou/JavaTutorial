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
    System.out.print("Principal: ");
    return scanner.nextInt();
  }

  public static double getMonthlyInterestRate() {
    System.out.print("Annual Interest Rate: ");
    float annualInterest = scanner.nextFloat();
    return annualInterest / MONTHS_IN_YEAR / PERCENT;
  }

  public static short getNumPayments() {
    System.out.print("Period (Years): ");
    return (short) (scanner.nextShort() * MONTHS_IN_YEAR);
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

  public static void validateValue() {
    

  }
}
