package basiclibrary;

public class DuplicateFinder {
  public boolean duplicatePresent(int[] toCheckAgainst) {
    boolean isThereADuple = false;

    for (int i = 0; i < toCheckAgainst.length; i++) {
      int currentCheck = toCheckAgainst[i];
      for (int j = i+1; j < toCheckAgainst.length; j++)
        if (currentCheck == toCheckAgainst[j]) {
          isThereADuple = true;
          break;
        }
    }
    System.out.println("Are there duplicates? " + isThereADuple);
    return isThereADuple;
  }
}