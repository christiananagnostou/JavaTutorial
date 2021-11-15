public interface TaxCalculator {
  // Declared field in interface
  // Fields are final and static
  // NOTE: just because Java supports constant fields in interfaces doesn't mean
  // you should use them
  float minimumTax = 100;

  double calculateTax();

  // Also never implement a static method with logic inside an interface.
  // Implement that logic inside an abstract class (see AbstractTaxCalculator) as
  // it is an implementation detail

  // static double getTaxableIncome(double income, double expenses) {
  // return income - expenses;
  // }

  /*
   * // Interview Question
   * 
   * Q: What is the difference between interfaces and abstract classes?
   * 
   * A: Interfaces are purely contracts and have no code or implementation and we
   * use them to build loosely coupled, extensible, and testable applications.
   * Abstract Classes are partially implemented classes and we use them to share
   * code between classes
   * 
   * With the new features in interfaces such as private and static methods,
   * interfaces have lost their meaning. People are using those new features as a
   * hack to achieve multiple interhitance.
   * 
   * 
   * // You should use an interface when you want to decouple a class from its
   * dependencies.
   * 
   * Benefits: You can easilly swap one implementation with another. Instead of
   * programming against a concrete templating engine, you would, instead, program
   * against an interface
   * 
   */
}
