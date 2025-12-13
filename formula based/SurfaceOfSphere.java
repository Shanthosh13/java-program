import java.util.Scanner;
public class SurfaceOfSphere
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("area of sphere");
	  int l=sc.nextInt();
	  int b=sc.nextInt();
	  int h=sc.nextInt();
	  double surface=2*l*b+2*b*h+2*h*l;
	  double volume = l*b*h;
	  System.out.println("surface:" + surface);
	  System.out.println("volume:" + volume);
	  }
}