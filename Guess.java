import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        int value = new Random().nextInt(10);
        int number;

        while (true) {
            System.out.println("������� �����: ");
            number = new Scanner(System.in).nextInt();
            if (number < value) {
                System.out.println("���������� ���� ������!");
                continue;
            } else if (number > value) {
                System.out.println("���������� ����� ������!");
                continue;
            } else if (number ==value) {
                System.out.println("���������, �� �������! :)");
                break;
            }
        }
    }
}