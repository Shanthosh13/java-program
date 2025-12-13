import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 10 == b % 10)
            System.out.println("Same Last Digit");
        else
            System.out.println("Different Last Digit");
    }
}
