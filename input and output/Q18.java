/*Q18.Write a Java Program to print your date of birth in the format DD/MM/YYYY.*/

import java.util.*;
public class Q18
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DD = sc.nextInt();
        int MM = sc.nextInt();
        int YYYY = sc.nextInt();
        System.out.printf("%02d/%02d/%04d", DD, MM, YYYY);
    }
}