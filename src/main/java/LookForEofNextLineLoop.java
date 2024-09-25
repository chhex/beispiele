import java.util.ArrayList;
import java.util.Scanner;

public class LookForEofNextLineLoop {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Give me Eof text: ");
        var eof = sn.nextLine();
        System.out.println("Enter line: ");
        var text = sn.nextLine();
        ArrayList<String> list = new ArrayList<>();
        while (!text.equals(eof)){
            System.out.println("Adding : " + text);
            list.add(text);
            System.out.println("Enter next line: ");
            text = sn.nextLine();
        }
        System.out.println("Printing all lines: ");
        System.out.println(list);
        System.out.println("finished");
    }
}
