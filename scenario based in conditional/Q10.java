import java.util.Scanner;
class Q10 {
 public static void main(String[] args) {
  String c = new Scanner(System.in).next();

  if(c.equals("Red"))
   System.out.println("Stop");
  else if(c.equals("Yellow"))
   System.out.println("Ready");
  else
   System.out.println("Go");
 }
}
