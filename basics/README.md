# Methods

## Main
  runs the program

## pluralize
  takes a string and an integer, and returns it with a sentence with proper grammar for the integer count.

## flipNHeads
  uses __Math.Random__ to approximate heads or tails, and then returns the total times of "flips" it took to get the _n_ heads in a row.

## clock
  Prints out a read of the time, one second at a time. Uses:

    java.time.LocalDateTime
    java.time.format.DateTimeFormatter
    java.time.format.DateTimeFormatterBuilder
  
  to do so.

+++++ 2020-09-15 || Dice, Duplicates, Averages, and Lowest Average || +++++

# Methods

## BasicLibraryTest
  where all things - tests, in this case - run.

## Averages
  finds the average of a passed in array of numbers (double, in my case)

## DuplicateFinder
  finds if there are any duplicates within arg array (of doubles, in this case)

## LowestAverage
  returns the array with the lowest average of a provided array of arrays (of doubles). also uses Averages() to find the average of each array.

## Roll
  takes in a number, returns an array of random numbers - in this case 1 through 6. Could be made to be dynamic, but is not currently.