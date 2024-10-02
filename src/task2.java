import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Число является чётным.");
        } else{
            System.out.println("Число не является чётным.");
        }

        scanner.close();
    }

}
