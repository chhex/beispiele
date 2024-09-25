import java.util.ArrayList;
import java.util.Scanner;

public class SizeNextIntLoop {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Give me a size ");
        int n = sn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Give me a number ");
            int in = sn.nextInt();
            list.add(in);
        }
        System.out.println(list);
        sn.close();
    }
}
