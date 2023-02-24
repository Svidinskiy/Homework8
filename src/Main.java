import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int [] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\n");

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(fractionalNumbers[i]);
        }

        System.out.println("\n");

        char[] symbols = {'J', 'a', 'v', 'a'};
        System.out.println(symbols);

        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] numbers2 = new int [3];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers2[i]);
            if (i < numbers2.length - 1){
                System.out.print(", ");
            }
        }

        System.out.print("\n");

        double[] fractionalNumbers2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(fractionalNumbers2[i]);
            if (i < fractionalNumbers2.length - 1){
                System.out.print(", ");
            }
        }

        System.out.print("\n");

        char[] symbols2 = {'J', 'a', 'v', 'a'};
        for (int i = 0; i < 4; i++) {
            System.out.print(symbols2[i]);
            if (i < symbols2.length - 1){
                System.out.print(", ");
            }
        }


        System.out.println("\n");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int [] numbers3 = new int [3];
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i < numbers3.length - 1){
                System.out.print(", ");
            }
            System.out.print(numbers3[i]);
        }

        System.out.print("\n");

        double[] fractionalNumbers3 = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            if (i < fractionalNumbers3.length - 1){
                System.out.print(", ");
            }
            System.out.print(fractionalNumbers3[i]);
        }

        System.out.print("\n");

        char[] symbols3 = {'J', 'a', 'v', 'a'};
        for (int i = 3; i >= 0; i--) {
            if (i < symbols3.length - 1){
                System.out.print(", ");
            }
            System.out.print(symbols3[i]);
        }

        System.out.println("\n");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] evenNumbersOnly = {3, 6, 2, 1, 5, 8, 7};
        for (int i = 0; i < 7; i++) {
            if (evenNumbersOnly[i] % 2 != 0){
                System.out.print(evenNumbersOnly[i]+1);
            }
            else {
                System.out.print(evenNumbersOnly[i]);
            }
        }

        System.out.println("\n");
    }
}