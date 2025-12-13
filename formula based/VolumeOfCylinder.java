import java.util.Scanner;
public class VolumeOfCylinder
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("area of cylinder");
	  double r=sc.nextInt();
	  double h=sc.nextInt();
	  double surface= 2*3.14*r*r+2*3.14*r*h;
	  double volume= 3.14*r*r*h;
	  System.out.println("surface:" + surface);
	  System.out.println("volume:" + volume);
	  }
}