import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        int value = new Random().nextInt(10);
        int number;

        while (true) {
            System.out.println("Введите число: ");
            number = new Scanner(System.in).nextInt();
            if (number < value) {
                System.out.println("Загаданное чило больше!");
                continue;
            } else if (number > value) {
                System.out.println("Загаданное число меньше!");
                continue;
            } else if (number ==value) {
                System.out.println("Поздравлю, Вы угадали! :)");
                break;
            }
        }
    }
}