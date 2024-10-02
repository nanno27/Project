import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double multi = num1 * num2;
        double div = num1 / num2;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + sub);
        System.out.println("Умножение: " + multi);
        if (num2 != 0) {
            System.out.println("Деление: " + div);
        } else {
            System.out.println("На ноль делить нельзя");
        }

        scanner.close();
    }
}
