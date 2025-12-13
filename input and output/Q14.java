/*Q14.Write a Java Program to print two numbers with a tab space between them.*/

import java.util.*;
public class Q14
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + "\t" + num2);
    }
}