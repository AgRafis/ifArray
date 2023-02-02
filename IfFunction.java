import java.util.Scanner;

public class IfFunction {
    public static void main(String[] args) {
        //1. Составить программу, которая уменьшает первое введенное число в два раза, если оно
        //больше второго введенного числа по абсолютной величине.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int fir = sc.nextInt();

        System.out.println("Введите второе число:");
        int sec = sc.nextInt();
        sc.close();

        if (Math.abs(fir) > Math.abs(sec)) {
            int res = fir/2;
            System.out.printf("Первое уменьшенное в 2 раза число равна: %d \n", res);
        }
        else {
            System.out.println("Первое число должно быть больше второго числа!");
        }
    }
}
