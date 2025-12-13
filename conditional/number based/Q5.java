
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 100 && n <= 999)
            System.out.println("3 Digit Number");
        else
            System.out.println("Not a 3 Digit Number");
    }
}
