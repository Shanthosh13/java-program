import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
            System.out.println("Ticket Price: 150");
        else
            System.out.println("Ticket Price: 100");
    }
}
