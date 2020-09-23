# Restaurant & Review (about inheritance)

## Overview

  Includes classes for restaurants and reviews, both include a respective constructor, and for restaurants a way to add reviews to restaurants, and update the restaurants' star rating when a new review is added.
  Updated with a super class for businesses, which restaurants, shops, and theatres extend from.
  The theater class has both a review (extended from superclass restaurant), and a Film Review. Both go into the reviewarray, and all is stored, but I don't know how to pull out the film name from it.
  The theater class also has an additional addFilm and removeFilm method that does either respective action to films "nowShowing"
  
## Testing

  Each method has a test or two to ensure correct function when called by means of assertEquals().
  This can be confirmed by running ./gradlew test.