package inheritance;

public class TheaterReview extends Review {

  String movie;

  public TheaterReview(String body, String author, int theStars, String movie) {
    super(body, author, theStars);
    this.movie = movie;
  }

  public String toString() {
    return String.format("By Author: %s \nAbout: %s\nBody: \n%s", author, movie, body);
  }
}
