import java.util.Scanner;
class Q7 {
 public static void main(String[] args) {
  int u = new Scanner(System.in).nextInt();
  int bill = 0;

  if(u <= 100)
   bill = 0;
  else if(u <= 300)
   bill = (u - 100) * 5;
  else
   bill = (200 * 5) + (u - 300) * 10;

  if(u > 500)
   bill += 100;

  System.out.println(bill);
 }
}
