package inheritance;

public class Business { // the analog to "Shop"

  private String name;
  private String description;
  private int rating; // is Dollar Signs

  public Business(String name, String description, int rating) {
    this.name = name;
    this.description = description;
    this.rating = rating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int dollarSigns) {
    this.rating = dollarSigns;
  }

  public String toString() {
    return String.format("Business Description\nName: %s\nBusiness Description: %s\nBusiness Rating: %d", this.getName(), this.getDescription(), this.getRating());
  }
}
