public class Operators {
  public static void main(String[] args) {
    int x = 1;
    int y = 1;
    System.out.println(x == y);
    System.out.println(x != y);

    byte temperature = 22;
    boolean isWarm = temperature > 20 && temperature < 70;
    System.out.println(isWarm);

    boolean hasHighIncome = true;
    boolean hasGoodCredit = true;
    boolean hasCriminalRecord = false;
    boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    System.out.println(isEligible);

  }
}
