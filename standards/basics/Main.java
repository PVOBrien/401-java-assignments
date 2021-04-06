import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Main{
  public static void main(String[] args) {
    int dogCount = 0;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int gerbilCount = 1;
    System.out.println("I own " + gerbilCount + " " + pluralize("gerbil", gerbilCount) + ".");
    
    int flipCount = 4;
    System.out.println(flipNHeads(flipCount));

    clock();
  }

  public static String pluralize(String word, int animalCount) {
    if (animalCount > 1 || animalCount == 0) {
      String pluralWord = word + 's';
      return pluralWord;
    } else {
      return word;
    }
  }

  public static String flipNHeads (int howManyFlips) {
    int theNumber = 0;
    int totalCount = 0;

    while (theNumber != howManyFlips) { // w David Dicken, found that the Math.random is standard/built-in, no need to import.
      if (Math.random() < .5) {
        theNumber++;
        totalCount++;
      } else {
        totalCount++;
        theNumber = 0;
      }
    }
    return "It took " + totalCount + " flips to have " + howManyFlips + " heads in a row.";
  }

  public static void clock() {
    int number = 0;
    LocalDateTime timeToCheck = LocalDateTime.now();
    String time = timeToCheck.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    String diffTime = timeToCheck.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    while (number == 0) {
      timeToCheck = LocalDateTime.now();
      diffTime = timeToCheck.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      if (!time.equals(diffTime)) {
        time = timeToCheck.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
      }
    }
  }
}