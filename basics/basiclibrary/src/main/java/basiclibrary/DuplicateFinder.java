package basiclibrary;

import java.util.ArrayList;

public class DuplicateFinder {
  public boolean duplicatePresent(ArrayList toCheckAgainst) {
    boolean isThereADuple = false;

    for (int i = 0; i < toCheckAgainst.length; i++) {
      int currentCheck = toCheckAgainst[i];
      for (int j = i+1; j < toCheckAgainst.length; j++)
        if (currentCheck == toCheckAgainst[i]) {
          isThereADuple = true;
          break;
        }
    }
    System.out.println(isThereADuple);
    return isThereADuple;
  }
}