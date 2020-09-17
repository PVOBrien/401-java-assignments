/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class BasicLibraryTest {
//    @Test public void testSomeLibraryMethod() {
//        Library classUnderTest = new Library();
//        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
//    }
    @Test public void rollSomeDice() {
        Roll roll = new Roll();
        int timesToRoll = 124;
        double[] finalRoll = roll.diceRoll(timesToRoll);
        assertEquals(finalRoll.length, timesToRoll);

        boolean diceNumber = false;

        for(int i = 0; i < timesToRoll; i++) { // created w help from Claudio Bailon-Schubert
            if (finalRoll[i] > 0.0d && finalRoll[i] < 7.0d) {
                diceNumber = true;
            } else {
                diceNumber = false;
                break;
            }
        }
        assertTrue("all the numbers are on a standard 1d6", diceNumber);
    }

    @Test public void findDuplicates() {
        DuplicateFinder findTheDuples = new DuplicateFinder();
        Roll roll = new Roll();
        int numberOfDupleChances = 20;
        double[] dupleRoller = roll.diceRoll(numberOfDupleChances);
        boolean testTrue = findTheDuples.duplicatePresent(dupleRoller);

        assertTrue(testTrue);
    }

    @Test public void Averages() {
        Roll roll = new Roll();
        Averages thisAverage = new Averages();
        double[] averageToFind = roll.diceRoll(10000);
        double min = 0;
        double max = 6;
        double numberAverage = (max - min) / 2;

        double averageToTest = thisAverage.averageFinder(averageToFind);
        boolean correctAverage;

        if (averageToTest > numberAverage - 1 && averageToTest < numberAverage + 1) {
            correctAverage = true;
        } else {
            correctAverage = false;
        }

        System.out.println(numberAverage);
        System.out.println(averageToTest);
        assertTrue("it is within the average", correctAverage);
    }

    @Test public void LowestAverage() {
        double[][] weeklyMonthTemperatures = {
          {66.0, 64.0, 58.0, 65.0, 71.0, 57.0, 60.0},
          {57.0, 65.0, 65.0, 70.0, 72.0, 65.0, 51.0},
          {5.0, 4.0, 6.0, 3.0, 9.0, 7.0, 1.0},
          {65.0, 56.0, 55.0, 52.0, 55.0, 62.0, 57.0}
        };

        LowestAverage lowlow = new LowestAverage();
        double[] testlowAverage = {5.0, 4.0, 6.0, 3.0, 9.0, 7.0, 1.0};
        lowlow.lowAverage(weeklyMonthTemperatures);
        assertArrayEquals(testlowAverage, lowlow.lowAverage(weeklyMonthTemperatures), 0);
    }
}