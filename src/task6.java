import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int fibValue = fib(num);
        System.out.println(num + " число в последовательности Фибонначи: " + fibValue);

        scanner.close();
    }

    public static int fib(int num) {
        if (num == 0){
            return 0;
        }else if (num == 1){
            return 1;
        }else{
            return fib(num - 1) + fib(num - 2);
        }
    }
}
