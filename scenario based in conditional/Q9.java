import java.util.Scanner;
class Q9 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int amt = sc.nextInt();
  int bal =  sc.nextInt();

  if(amt <= bal && amt % 100 == 0)
   System.out.println("Withdrawal Allowed");
  else
   System.out.println("Invalid Transaction");
 }
}
