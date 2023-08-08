package src;

import src.Words;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scannerStartGame =new Scanner(System.in);

    char starter;
    public static void main(String[] args) throws FileNotFoundException {

        Logic logic=new Logic();
        logic.paintesWords();
        Main main=new Main();
        main.startGame();
    }
    private void startGame() throws FileNotFoundException {
        while (true) {
            System.out.println("бля начала игры введите 1");
            System.out.println("оля коонца игры введите 2" +
                    " ");
            starter = getLetter();
            checkIn(starter);
            if (starter == '1') {
                System.out.println("game go");

            }
            if (starter == '2') {
                System.out.println("game finish");
            }
            scannerStartGame.close();
            System.exit(0);
        }
    }
    static char getLetter(){
        return scannerStartGame.nextLine().toLowerCase(Locale.ROOT).charAt(0);
    }
    protected void checkIn(char dd){
        int b=1;
        int a=2;
        int c;
        try{
            c=Integer.parseInt(String.valueOf(dd));
            if (c == b|c==a){
                System.out.println(" ");
            }else {
                System.out.println("Ввод ошибочный");
                System.out.println("Введите число ОДИН или ДВА!");
            }
        }catch (NumberFormatException exception){
            System.out.println("Вводите ПАЖАЛСТА  числа!");
        }
    }
}
