import java.util.Scanner;
public class CalculateFahrenheitToCelsius
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    double f=sc.nextDouble();
		double c=((f-32)* 5.0 / 9.0);
		System.out.println(c);
	}
}