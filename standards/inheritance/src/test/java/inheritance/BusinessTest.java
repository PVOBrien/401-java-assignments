package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class BusinessTest {
  @Test public void testBusiness() {
    Business newBusiness = new Business("Panda Express", "American Chinese", 3);
    assertEquals("A new business' name.", "Panda Express", newBusiness.getName());
    assertEquals("A new business' description.", "American Chinese", newBusiness.getDescription());
    assertEquals("A new business' rating.", 3, newBusiness.getRating());
  }
}
