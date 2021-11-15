
public class TaxReport {

  // *** THIS DEPENDS ON A CONCRETE IMPLEMENTATION ***
  // private TaxCalculator2018 calculator;

  // public TaxReport() {
  // calculator = new TaxCalculator2018(100_000);
  // }

  // *** Constructor Injetion ***
  // private TaxCalculator calculator;

  // public TaxReport(TaxCalculator calculator) {
  // this.calculator = calculator;
  // }

  // // *** Setter Injection ***
  // public void setCalculator(TaxCalculator calculator) {
  // this.calculator = calculator;
  // }

  // ** Method Injection **
  // Since show() was the only method using the calculator, pass the desired
  // calculator to the method itself and call upon that.
  public void show(TaxCalculator calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }
}
