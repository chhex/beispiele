import java.util.ArrayList;
import java.util.Scanner;

public class SizeNextLoop {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Give me a size ");
        int n = sn.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            System.out.println("Give me a number ");
            int in = sn.nextInt();
            list.add(in);
        }
        sn.close();
    }
}
