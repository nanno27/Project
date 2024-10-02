import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        char[] array = string.toCharArray();
        String newString = "";
        for (int i = array.length - 1; i >= 0; i--) {
            newString = newString + array[i];
        }
        System.out.println("Развернутая строка:" + newString);

        scanner.close();
    }
}
