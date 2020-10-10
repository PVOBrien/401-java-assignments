package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
  @Test public void testReviewConstructor() {
    Review newReview = new Review("Serafina", "Paul O'Brien",3);
    assertEquals("Here are it's stars", 3, newReview.stars);
  }

  @Test public void testReviewString(){
    Review newReview = new Review("Serafina", "Paul O'Brien",1);
    assertEquals("This is the name of the restaurant:", "Paul O'Brien", newReview.author);
  }
}
