
public class Loops {
  public static void main(String[] args) {

    // For loop
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // While loop
    int i = 0;
    while (i < 5) {
      System.out.println(i++);
    }

    // Do While loop
    int j = 0;
    do {
      System.out.println(j++);
    } while (j < 5);

    // For Each loop 
    String[] fruits = { "Apple", "Mango", "Orange" };

    for (String fruit : fruits) {
      System.out.println(fruit);
    }
  }
}
