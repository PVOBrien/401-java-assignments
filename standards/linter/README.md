# java-fundamentals

## Linter
- Takes in a file by command line argument and prints out any instance where there is a missing EOL semicolon where there should be for proper java.

## How to Run

- in the folder that has the gradle files, run ./gradlew run --args "<FILENAME>" replacing the <FILENAME> (including the karets) with the file to check for proper semicolon placement.
- the command line will return a list of each line that does not have a semicolon.