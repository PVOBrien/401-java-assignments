package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

  @Test public void testShopConstructor() {
    Shop newShop = new Shop("Fred Meyer", "A place to get stuffs.", 4);
    assertEquals("Name should be Serafina", "Fred Meyer", newShop.getName());
  }

  @Test public void testShopString() {
    Shop newShop = new Shop("WinCo", "Get that other stuff.", 5);
    assertEquals("Here's the toString result.", "Business Description\nName: WinCo\nBusiness Description: Get that other stuff.\nBusiness Rating: 5", newShop.toString());
  }

  @Test public void testRestaurantReviewAdd() {
    Shop newShop = new Shop("Fred Meyer", "A place to get stuffs.", 5);
    Review newReview = new Review("Great stuff!", "PVOVideo", 2);
    Review secondReview = new Review("Goods stuff!", "PalOB.", 2);
    newShop.addReview(newReview);
    newShop.addReview(secondReview);
    assertEquals("Average reviews should be 2.", 2, newShop.getRating());
    assertEquals("this is the body", "PVOVideo", newShop.reviewList.get(0).author); // TODO how to get movie?!
  }
}
