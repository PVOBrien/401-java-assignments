package inheritance;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TheaterTest {
  @Test public void theaterCreationTest() {
    Theater alamo = new Theater("Alamo", "Where you see great films", 5);

    assertEquals("There is a theater with the name Alamo.", "Alamo", alamo.getName());
    assertEquals("There is a theater with the name Alamo.", "Where you see great films", alamo.getDescription());
    assertEquals("There is a theater with the name Alamo.", 5, alamo.getRating());
  }

  @Test public void nowShowingTest() {
    Theater alamo = new Theater("Alamo", "Where you see great films", 5);

    alamo.addFilm("Titanic");
    alamo.addFilm("Gladiator");
    alamo.addFilm("The Fellowship of the Rings");

    assertEquals("There are films playing.", "Titanic", (alamo.nowShowing.get(0)));
    assertEquals("There are films playing.", "Gladiator", (alamo.nowShowing.get(1)));
    assertEquals("There are films playing.", "The Fellowship of the Rings", (alamo.nowShowing.get(2)));
  }

  @Test public void nowShowingLessTest() {
    Theater alamo = new Theater("Alamo", "Where you see great films", 5);

    alamo.addFilm("Titanic");
    alamo.addFilm("Gladiator");
    alamo.addFilm("The Fellowship of the Rings");

    assertEquals("There are films playing.", "Titanic", (alamo.nowShowing.get(0)));

    assertEquals("There are now 2 films playing.", 3, (alamo.nowShowing.size()));

    alamo.removeFilm("Titanic");

    assertEquals("There are now 2 films playing.", 2, (alamo.nowShowing.size()));
  }

  @Test public void theaterReviewsTest() {

    Theater alamo = new Theater("Alamo", "Where you see great films", 5);

    alamo.addFilm("Titanic");
    alamo.addFilm("Gladiator");
    alamo.addFilm("The Fellowship of the Rings");

    TheaterReview aNewTheaterReview = new TheaterReview("whatamovie!",
      "Paul",
      5,
      "Gladiator");

    Review justTheTheaterReview = new Review("Yo Ya","Hey, YO!", 2);

    alamo.addReview(justTheTheaterReview);
    alamo.addFilmReview(aNewTheaterReview);

    System.out.println(alamo.reviewList.get(1));
    System.out.println(alamo.reviewList.get(0));

    assertNotNull("Here are movies and theater review", alamo.reviewList);
    assertNotNull("Here are movies and theater review", (TheaterReview) alamo.reviewList.get(1)); // TODO how to get to movie?

  }
}
