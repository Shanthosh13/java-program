import java.util.Scanner;
public class SurfaceAreaOfCube
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cube value");
		int a=sc.nextInt();
		double surface = 6*a*a;
		double volume = a*a*a;
		double perimeter = 12*a;
		System.out.println("surface value:"+ surface);
		System.out.println("volume:"+ volume);
		System.out.println("perimeter:"+ perimeter);
	}
}