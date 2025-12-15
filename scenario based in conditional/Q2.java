import java.util.Scanner;
class Q2 {
 public static void main(String[] args) {
  int age = new Scanner(System.in).nextInt();
  if(age >= 18)
   System.out.println("Eligible to Vote");
  else
   System.out.println("Not Eligible");
 }
}
