package basiclibrary;

import java.util.Arrays;

public class Roll {

  public int[] diceRoll(int numberOfRolls) {
    int[] rollArray = new int[numberOfRolls];
    for (int i = 0; i < numberOfRolls; i++) {
      int aNumber = (int) (Math.random() * 6+1); // https://www.javatpoint.com/java-math-random-method so says.
      aNumber = (int) Math.ceil(aNumber);
      rollArray[i] = aNumber;
    }
    System.out.println(Arrays.toString(rollArray));
    return rollArray;
  }
}