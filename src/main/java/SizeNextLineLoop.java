import java.util.ArrayList;
import java.util.Scanner;

public class SizeNextLineLoop {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Give me a size ");
        int n = sn.nextInt();
        sn.nextLine();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++){
            System.out.println("Give me a line: ");
            String line = sn.nextLine();
            list.add(line);
        }
        System.out.println(list);
        sn.close();
    }
}
