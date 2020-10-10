package inheritance;

public class Review {

  String body;
  String author;
  int stars;

  public Review(String body, String author, int theStars) {
    this.body = body;
    this.author = author;
    this.stars = theStars;
  }

  public String toString() {
    return String.format("By Author: %s \nBody: \n%s", author, body);
  }
}