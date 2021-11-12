import java.util.Scanner;

public class Statements {
  public static void main(String[] args) {
    int temp = 32;

    // If Statements
    if (temp > 30) {
      System.out.println("It's a hot day");
      System.out.println("Drink water");
    } else if (temp > 20) {
      System.out.println("Beautiful day");
    } else {
      System.out.println("Cold day");
    }

    // Simplifying If Statements
    int income = 120_000;
    boolean hasHighIncome = (income > 100_000);
    System.out.println(hasHighIncome);

    // Ternary operator
    String className = (income > 100_000) ? "First" : "Economy";
    System.out.println(className);

    // Switch Statements
    String role = "admin";
    switch (role) {
    case "admin":
      System.out.println("You are an admin");
      break;
    case "moderator":
      System.out.println("You are a moderator");
      break;
    default:
      System.out.println("You are a guest");
      break;
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    int number = scanner.nextInt();

    if (number % 5 == 0 && number % 3 == 0)
      System.out.println("FizzBuzz");
    else if (number % 5 == 0)
      System.out.println("Fizz");
    else if (number % 3 == 0)
      System.out.println("Buzz");
    else
      System.out.println(number);

    scanner.close();

  }
}
