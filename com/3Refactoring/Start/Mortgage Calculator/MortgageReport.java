import java.text.NumberFormat;

public class MortgageReport {

  private final NumberFormat currency;
  private MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) {
    currency = NumberFormat.getCurrencyInstance();
    this.calculator = calculator;
  }

  public void printPaymentSchedule() {
    System.out.println("\nPAYMENT SCHEDULE\n----------------\n");

    for (double balance : calculator.getRemainingBalances())
      System.out.println(currency.format(balance));
  }

  public void printMortgage() {
    double mortgage = calculator.calculateMortgage();
    String mortgageFormatted = currency.format(mortgage);
    
    System.out.println("\nMORTGAGE\n--------\n");
    System.out.println("Monthly Payments: " + mortgageFormatted);
  }
}
