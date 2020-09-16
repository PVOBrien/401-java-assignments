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

    }
}
