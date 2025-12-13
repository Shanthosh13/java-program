/*Q6.Write a Java Program to print the given fractional number in 2 digit decimal format.*/

import java.util.*;
public class Q6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double frac = sc.nextDouble();
        System.out.printf("%.2f", frac);
    }
}