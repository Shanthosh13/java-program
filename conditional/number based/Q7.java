import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   
        int b= sc.nextInt(); 
         int c= sc.nextInt(); 
          if(a<=b && a<=c){
              System.out.println("Smallest : "+a);
             
          }else if(c<=a&&c<=b){
              System.out.println("Smallest : "+c);
          }
 
          else{
              System.out.println("Smallest : "+b);
          }
 
    }
}

