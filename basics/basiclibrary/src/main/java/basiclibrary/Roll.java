package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;

public class Roll {

  public ArrayList diceRoll(int numberOfRolls) {
    ArrayList<Integer> rollArray = new ArrayList<>();
    for (int i = 0; i < numberOfRolls; i++) {
      int aNumber = (int) (Math.random() * 6); // https://www.javatpoint.com/java-math-random-method so says.
      aNumber = (int) Math.ceil(aNumber);
      rollArray.set(i, aNumber);
    }
    System.out.println(rollArray.toString());
    return rollArray;
  }
}