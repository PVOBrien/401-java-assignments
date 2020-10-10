package inheritance;

import java.util.ArrayList;

public class Theater extends Business {


  public Theater(String name, String description, int rating) {
    super(name, description, rating);
  }

  ArrayList<String> nowShowing = new ArrayList<>();

  public String toString() {
    return String.format("Business Description\nName: %s\nBusiness Description: %s\nBusiness Rating: %d\nShowing %s", this.getName(), this.getDescription(), this.getRating(), this.nowShowing.toString());
  }

  public void addFilmReview(TheaterReview reviewToAdd) {
    reviewList.add(reviewToAdd);
    updateStarRating();
  }



  public void addFilm(String film) {
    nowShowing.add(film);
    }

  public void removeFilm(String film) {
    nowShowing.remove(film); // how to I confirm via sout that the film was removed?
  }
}