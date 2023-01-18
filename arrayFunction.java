import java.util.Scanner;

public class arrayFunction {
    public static void main(String[] args) {
        //4. Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходе
        //выполнения программы.
        int [] array = new int[10];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите значения массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc1.nextInt();
            System.out.println(array[i] + " ");
        }
        sc1.close();
    }
}
