package src;

import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

public class Logic {
    Scafflod scafflod=new Scafflod();
    int errorsNumbers=0;
    Words wordes = new Words();
    private  boolean flag=true;
    static List<Character> errors=new ArrayList<>();

    public Logic() throws FileNotFoundException {
    }

    public void paintesWords() {

        String MainWord = wordes.getWordRandom();
        char[] MainWordChar = MainWord.toCharArray();
        System.out.println(MainWord);
        String paintWord = "*".repeat(MainWord.length());
        while (flag) {

        char[] paintWordChar = paintWord.toCharArray();

        char[] WordMain = MainWord.toCharArray();
        System.out.println("vvedi ey");
        Character inputcharacter = Main.getLetter();
        checkInforWord(inputcharacter);
        System.out.println(inputcharacter);

            if (MainWord.contains(String.valueOf(inputcharacter))) {
                for (int i = 0; i < MainWordChar.length; i++) {
                    if (WordMain[i] == inputcharacter) {
                        paintWordChar[i] = inputcharacter;
                        paintWord = new String(paintWordChar);
                        System.out.println(paintWord);

                }

                }
            }else {
                if (errors.contains(inputcharacter)) {
                    System.out.println(" Эта буква уже была опробована");
                }else {
                    errors.add(inputcharacter);
                    errorsNumbers++;
                    scafflod.drawHangman(errorsNumbers);
                }

            }if (errorsNumbers==6){
                System.out.println(" Вы проиграли!");

                flag=false;
                break;
            }else {
             if (MainWord == paintWord){
                 System.out.println(" Ты победил!");
                 flag=false;
                 break;
                }
            }

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



