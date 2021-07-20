public class WordCount {

  public static void main (String[] args) {
    String exampleString = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    char space = ' ';
    int wordCount = 0;

    for (int i = 0; i < exampleString.length(); i++) {
      if (space == exampleString.charAt(i)) {
        wordCount++;
      }
    }

    wordCount++;
    System.out.println("The given string has " + wordCount + " words.");
  }

}
