public class BasicLoops {

  public static void main (String[] args) {
    // print "Hello world!"
    System.out.println("## Task 'hello world'");

    for (int helloWorldCount = 0; helloWorldCount < 6; helloWorldCount++) {
      System.out.println("Hello World!");
    }

    // doubled number exceeds 100
    System.out.println("\n\n\n## Task 'multiply numbers'");

    for (int sum = 3; sum < 100; sum *= 2) {
      System.out.println("Current result is " + sum);
    }

    // count down from 30
    System.out.println("\n\n\n## Task 'countdown'");

    for (int count = 10; count >= 0; count--) {
      System.out.println(count);
    }
  }

}
