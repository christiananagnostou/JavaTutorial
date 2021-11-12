public class Main {
  public static void main(String[] args) {
    var employee = new Employee(50_000, 20);
    var mike = new Employee(100_000);

    Employee.printNumberOfEmployees();

    int wage = employee.calculateWage(10);
    System.out.println(wage);

    // var browser = new Browser();
    // browser.navigate("christiancodes.com");

  }
}
