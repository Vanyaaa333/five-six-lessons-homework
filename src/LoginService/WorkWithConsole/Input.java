package LoginService.WorkWithConsole;

import java.util.Scanner;
public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        String input = scanner.nextLine();
        if (input.isBlank()) {
            System.out.println("Введена пустая строка. Повторите ввод.");
        }
        return input;
    }

    public static String getString(String message) {
        System.out.println(message);
        return getString();
    }

    public static int getInt() {
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        System.out.println(String.format("Ввод [%s] не является числом. Повторите ввод.", scanner.next()));
        return getInt();
    }

    public static int getInt(String message){
        System.out.println(message);
        return getInt();
    }

}
