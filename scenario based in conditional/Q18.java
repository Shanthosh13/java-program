import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters = sc.nextInt();
        int bill = 0;

        if (liters > 1000) {
            if (liters <= 3000)
                bill = ((liters - 1000) / 1000) * 5;
            else
                bill = (2000 / 1000) * 5 + ((liters - 3000) / 1000) * 10;
        }

        System.out.println("Water Bill: " + bill);
    }
}
