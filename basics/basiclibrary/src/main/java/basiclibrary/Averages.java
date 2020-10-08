package basiclibrary;

public class Averages {
  public static double averageFinder(double[] averagePool) {
    double total = 0;
    for (int i = 0; i < averagePool.length; i++) {
      total += averagePool[i];
    }
    return total / averagePool.length;
  }
}
