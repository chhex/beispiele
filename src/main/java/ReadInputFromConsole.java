import java.util.Scanner;

public class ReadInputFromConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next();
        System.out.println(result);
        scanner.close();
    }
}
