import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        int ascii = ch;

        if (ascii % 2 == 0)
            System.out.println("Even ASCII Value");
        else
            System.out.println("Odd ASCII Value");
    }
}
