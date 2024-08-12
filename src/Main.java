import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String FilePath = "E:\\JavaProjects\\FileReadingProject\\src\\file.txt";
        try (BufferedReader ReadingAFile = new BufferedReader(new FileReader(FilePath))) {
            String FileLine;

            while ((FileLine = ReadingAFile.readLine()) != null) {
                String[] WordsInFile = FileLine.split("\\s+");

                for (String Word : WordsInFile) {
                    StringBuilder WordToChange = new StringBuilder();

                    for (char Letter : Word.toCharArray()) {

                        if (Character.isUpperCase(Letter)) {
                            WordToChange.append(Character.toLowerCase(Letter));
                        } else {
                            WordToChange.append(Character.toUpperCase(Letter));

                        }
                    }
                    System.out.print(WordToChange.toString() + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
    }
