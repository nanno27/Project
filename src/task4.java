import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arrLenght = scanner.nextInt();
        System.out.print("Введите элементы массива: ");
        int[] arr = new int[arrLenght];
        for (int i = 0; i < arrLenght; i++){
            arr[i] = scanner.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        double sum = 0;
        double average = 0;

        for (int i = 1; i < arrLenght; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 1; i < arrLenght; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arrLenght; i++){
            sum += arr[i];
        }
        
        average = sum / arr.length;

        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Среднее-арифметическое значение массива: " + average);

        scanner.close();
    }

}
