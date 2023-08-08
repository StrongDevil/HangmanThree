package src;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Words {
    Scanner scanner=new Scanner((Path.of("src", "words.txt").toFile()));
    Random randomWord = new Random();
   List<String> words = new ArrayList<>();
    String word;


    public Words() throws FileNotFoundException {
        while (scanner.hasNextLine()) {
            word = scanner.nextLine();
            words.add(word);
        }
    }
    public String getWordRandom() {
        return words.get(randomWord.nextInt(words.size()));
    }




}
