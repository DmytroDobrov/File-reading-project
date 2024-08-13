import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the file name. It starts with 'src'");
        Scanner scanner = new Scanner(System.in);//allows to write a file path by oneself
        String FilePath = scanner.nextLine();// variable FilePath saves a written path
        try (BufferedReader ReadingAFile = new BufferedReader(new FileReader(FilePath))) {
            //ReadingAFile is an object of BufferedReader, that is used for reading text files
            String FileLine;

            while ((FileLine = ReadingAFile.readLine()) != null) {
                //this cycle reads every file strings in order to the end, using readLine
                String[] WordsInFile = FileLine.split(" "); //"split" divides letters into words according to spaces

                for (String Word : WordsInFile) {
                    StringBuilder WordToChange = new StringBuilder();

                    for (char Letter : Word.toCharArray()) { //converts words into separate characters
                        //this code changes lower letters into upper and opposite
                        if (Character.isUpperCase(Letter)) {
                            WordToChange.append(Character.toLowerCase(Letter));
                        } else {
                            WordToChange.append(Character.toUpperCase(Letter));

                        }
                    }
                    System.out.print(WordToChange.toString() + " "); //then we convert the letters back into words
                }
            }
        } catch (Exception e) { //this code catches any appeared error and prints error
            System.out.println("Error");
        }

    }
    }
