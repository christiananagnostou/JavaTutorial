import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;

public class Types {
  public static void main(String[] args) {
    /**
     * 
     * Primitive Types:
     * 
     * TYPE BYTES RANGE 
     * 
     * byte 1 [-128,127]
     * short 2 [-32K, 32k] 
     * int 4 [-2B, 2B] 
     * long 8
     * 
     * float 4 
     * double 8 
     * 
     * char 2 A, B, C, ... 
     * 
     * boolean 1 true / false
     * 
     */

    System.out.println("Hello world");

    byte myAge = 30;

    System.out.println(myAge);
    myAge = 20;
    System.out.println(myAge);

    int herAge = myAge;
    System.out.println(herAge);

    // Need to add a suffix L to tell java that we are using a long type
    long viewsCount = 4_123_456_789L;
    System.out.println(viewsCount);

    float price = 10.99F;
    System.out.println(price);

    char letter = 'A';
    boolean isEligible = false;

    String name = "String";

    // REFERENCE TYPES
    // import java util Date to create an instance of the Date Class
    Date now = new Date();
    System.out.println(now);

    Point point1 = new Point(1, 1);
    Point point2 = point1;

    point1.setLocation(5, 5);
    // Reference types point to the location in memory where the data was created
    System.out.println(point2.x);

    String fName = "Christian";
    String lName = new String("Anagnostou");

    String fullName = fName + " " + lName;

    System.out.println(fullName.endsWith("u"));
    System.out.println(fullName.length());
    System.out.println(fullName.indexOf('A'));
    // .replace returns a new string
    // Methods that modify's a string returns a new string because Strings are
    // immutable
    String newName = fullName.replace("Christian", "Jordan");
    System.out.println(newName);
    System.out.println(fullName);

    String messageWithSpaces = "String with \"space\"    ";
    System.out.println(messageWithSpaces);
    System.out.println(messageWithSpaces.length()); // 23
    System.out.println(messageWithSpaces.trim().length()); // 19

    // ARRAYS
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[2] = 2;
    // numbers[10] = 3; // Throws an exception (out of bounds)

    String stringRepresentationOfArr = Arrays.toString(numbers);
    System.out.println(stringRepresentationOfArr);
    System.out.println(numbers);

    int[] nums = { 1, 2, 3, 4, 5 }; // Arrays have a fixed length
    System.out.println(nums.length);

    int[][] nums2D = new int[2][3];
    nums2D[0][0] = 1;
    System.out.println(Arrays.deepToString(nums2D));

    int[][] nums2DCurly = { { 1, 2, 3 }, { 4, 5, 6 } };
    System.out.println(Arrays.deepToString(nums2DCurly));

    // CONSTANTS (Final Variables) - All constants should be capitalized
    final float PI = 3.14F;

    // Arithmetic Expressions
    double result = (double) 10 / (double) 3;
    System.out.println(++result); // The prefix and suffix ++ & -- work the same way as Javascript

    int x = 2;
    x *= 2;
    System.out.println(x);

    // TYPE CASTING
    // Implicit casting: byte > short > int > long (happens automatically)
    double n = 1.1;
    int y = (int) n + 2;
    System.out.println(y);
    String stringNumber = "1.1";
    System.out.println(Double.parseDouble(stringNumber) + 2);

    // Math class for performing math operations
    // .round() - Round to the nearest integer
    // .ceil() - Round up to the nearest integer
    // .floor()
    // .max() - Retuns the greater of 2 values
    // .min() - Returns the lesser of 2 values
    // .random() - Returns a random floating point number from 0 - 1
    int res = Math.round(1.1F);
    System.out.println(res);

    int random = (int) (Math.random() * 100);
    System.out.println(random);

    // FORMATTING NUMBERS
    // 0.1 to be represented as a percent 10%
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String resultCurrency = currency.format(0.1);
    System.out.println(resultCurrency);

    System.out.println(NumberFormat.getPercentInstance().format(0.1));

    // READING INPUT
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your age: ");
    byte age = scanner.nextByte();

    System.out.print("Enter your first name: ");
    String firstName = scanner.next().trim();
    System.out.print("Enter your last name: ");
    String lastName = scanner.next().trim();

    System.out.println(firstName + " " + lastName + ", you are " + age + ".");

    scanner.close();

  }

}
