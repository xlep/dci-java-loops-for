public class MultiplicationTables {

  public static void main (String[] args) {
    for (int number = 1; number <= 10; number++) {

      System.out.println("multiplication table for " + number);
      for (int multiplicator = 1; multiplicator <= 10; multiplicator++) {
        System.out.println(number + " x " + multiplicator + " = " + number * multiplicator);
      }

      System.out.println("\n\n");
    }
  }

}
