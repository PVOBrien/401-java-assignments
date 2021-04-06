package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;

public class LowestAverage {
  public int[] lowAverage(int[][] toAverageAgainst) {
    Averages theAverage = new Averages();
    int indexOfLowest = 0;
    int theLowestOfTheLow = (int) theAverage.averageFinder(toAverageAgainst[0]);

    for (int i = 0; i < toAverageAgainst.length; i++) {
      if (theAverage.averageFinder(toAverageAgainst[i]) < theLowestOfTheLow) {
        indexOfLowest = i;
        theLowestOfTheLow = (int) theAverage.averageFinder(toAverageAgainst[i]);
      }
    }
    System.out.println("Here're those averages, Dale. " + Arrays.toString(toAverageAgainst[indexOfLowest]));
    return toAverageAgainst[indexOfLowest];
  }
}
