import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double discount;

        if (amount >= 5000)
            discount = amount * 0.20;
        else if (amount >= 2000)
            discount = amount * 0.10;
        else
            discount = 0;

        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + (amount - discount));
    }
}
