package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;

public class LowestAverage {
  public int[] lowAverage(ArrayList<> toAverageAgainst) {
    Averages theAverage = new Averages();
    int indexOfLowest = 0;
    double theLowestOfTheLow = theAverage.averageFinder(toAverageAgainst.);

    for (int i = 1; i < toAverageAgainst.length; i++) {
      System.out.println(Arrays.toString(toAverageAgainst[i]));
      if (theAverage.averageFinder(toAverageAgainst.[i]) < theLowestOfTheLow) {
        indexOfLowest = i;
        theLowestOfTheLow = theAverage.averageFinder(toAverageAgainst[i]);
      }
    }
    System.out.println(Arrays.toString(toAverageAgainst[indexOfLowest]));
    return toAverageAgainst[indexOfLowest];
  }
}
