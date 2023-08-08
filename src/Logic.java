package src;

import com.sun.jdi.Value;

import java.io.FileNotFoundException;

public class Logic {
    Words wordes = new Words();

    public Logic() throws FileNotFoundException {
    }

    public void paintesWords() {
        String MainWord = wordes.getWordRandom();
        System.out.println(MainWord);
        String paintWord = "*".repeat(MainWord.length());
        System.out.println(paintWord);
        char[] WordMain = MainWord.toCharArray();
        System.out.println("vvedi ey");
        Character inputcharacter = Main.getLetter();
        checkInforWord(inputcharacter);
        System.out.println(inputcharacter);
        for (int i = 0; i < WordMain.length; i++) {

        }
    }

    protected void checkInforWord(char dd) {
        String alfa="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
String beta=String.valueOf(dd);
            if (alfa.contains(beta)) {
               System.out.println(" ");
            } else {
                System.out.println("Ты че ввел??");
            }

        }
    }



