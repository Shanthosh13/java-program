/*Q12.Write a Java Program to print the character for given ASCII value.*/

import java.util.*;
public class Q12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ascii = sc.nextInt();
        System.out.println((char)ascii);
    }
}