package basiclibrary;

import java.util.ArrayList;

public class Averages {
  public double averageFinder(ArrayList averagePool) {
    int total = 0;
    for (int i = 0; i < (int) averagePool.get(i); i++) {
      total += (int) averagePool.get(i);
    }
    System.out.println(total / averagePool.size());
    return total / averagePool.size();
  }
}
