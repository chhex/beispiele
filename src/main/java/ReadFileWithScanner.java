import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/test/resources/test.txt"));
        if (scanner.hasNext()) {
            System.out.println("Has next");
        }
        var next = scanner.next();
        System.out.println(next);
        if (scanner.hasNext()) {
            System.out.println("Has some more");
        }
        next = scanner.next();
        System.out.println(next);
        if (!scanner.hasNext()) {
            System.out.println("No more in file");
        }
    }
}
