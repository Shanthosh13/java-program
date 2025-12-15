import java.util.Scanner;
class Q8 {
 public static void main(String[] args) {
  int pin = new Scanner(System.in).nextInt();
  if(pin == 1234)
   System.out.println("Access Granted");
  else
   System.out.println("Wrong PIN");
 }
}
