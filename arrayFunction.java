import java.util.Arrays;
import java.util.Scanner;

public class arrayFunction {
    public static void main(String[] args) {
        //4. Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходе
        //выполнения программы.
        int [] array = new int[10];
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите значение " + (i+1) + " массива:");
            array[i] = sc1.nextInt();

        }
        System.out.println(Arrays.toString(array));
        sc1.close();
    }
}
