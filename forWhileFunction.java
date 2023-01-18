public class forWhileFunction {
    public static void main(String[] args) {
        //2. Напечатать числа с помощью цикла for следующим образом:
        //10 10.4
        //11 11.4
        //...
        //25 25.4
        for (int i = 10; i <= 25; i++) {
            System.out.println(i + " " + i +".4");
        }

        //3. Найти максимальное из натуральных чисел, не превышающих 5000, которое нацело
        //делится на 39. Используйте цикл с пост- или предусловием
        int a = 39;
        int c = 0;
        while (a < 5000) {
            int b = a / 39;
            a = a + 39;
            c = b;
        }
        System.out.println("Максимальное число = " + c * 39);
    }
}
