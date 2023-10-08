import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if (num1 + num2 == 0) break; else System.out.println(num1 + num2);
        }
    }
}
