
import java.util.Scanner;
public class DivisibleBy3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=a%10;
		if(c%3==0){
		    System.out.println("divisible");
		}
		else{
		    System.out.println("not divisible");
		}
	}
}