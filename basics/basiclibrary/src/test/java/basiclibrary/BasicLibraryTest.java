/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import static basiclibrary.Averages.averageFinder;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class BasicLibraryTest {

    @Test
    public void rollSomeDice() {
        Roll roll = new Roll();
        int timesToRoll = 8;
        int[] finalRoll = roll.diceRoll(timesToRoll);
        assertEquals(finalRoll.length, timesToRoll);

        boolean diceNumber = false;

        for (int i = 0; i < timesToRoll; i++) { // created w help from Claudio Bailon-Schubert
            if (finalRoll[i] > 0 && finalRoll[i] < 7) {
                diceNumber = true;
            } else {
                diceNumber = false;
                break;
            }
        }
        System.out.println("Are all the rolls of the d6 1 through 6? " + diceNumber);
        assertTrue("all the numbers are on a standard 1d6", diceNumber);
    }

    @Test
    public void findDuplicates() {
        DuplicateFinder findTheDuples = new DuplicateFinder();
        Roll roll = new Roll();
        int numberOfDupleChances = 10;
        int[] dupleRoller = roll.diceRoll(numberOfDupleChances);
        boolean testTrue = findTheDuples.duplicatePresent(dupleRoller);

        assertTrue(testTrue);
    }

    @Test
    public void Averages() {
        int [] testArray = new int[] {1,2,3,4,5};
        assertEquals("This is going to be 3, give or take 1.",3, averageFinder(testArray), 1);
    }

    @Test
    public void LowestAverage() {
        int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
        };

        LowestAverage lowlow = new LowestAverage();
        int[] testlowAverage = new int[]{55, 54, 60, 53, 59, 57, 61};
        assertEquals(Arrays.toString(testlowAverage), Arrays.toString(lowlow.lowAverage(weeklyMonthTemperatures)));
    }

    @Test public void missingTemp () {
        Maps bananaWeather = new Maps();

        int[][] weeklyMonthTemperatures = {
          {66, 64, 58, 65, 71, 57, 60},
          {57, 65, 65, 70, 72, 65, 51},
          {55, 54, 60, 53, 59, 57, 61},
          {65, 56, 55, 52, 55, 62, 57}
        };
        String bananaResult = bananaWeather.weatherReport(weeklyMonthTemperatures);
        System.out.println(bananaResult);
        String testString = "High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69";
        assertEquals(testString, bananaResult);
    }

    @Test public void electionTally () {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        Maps voteCounter = new Maps();

        String winner = "Bush received the most votes!";
        System.out.println(winner);
        assertEquals(winner, voteCounter.tally(votes));
    }
}