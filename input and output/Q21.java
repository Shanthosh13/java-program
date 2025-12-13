/*Q21.Write a Java Program to print your roll number and name in the format: Roll No: 123, Name: John cena*/

import java.util.*;
public class Q21
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
         sc.nextLine();
        String name= sc.nextLine();
       
        System.out.println("Roll No: " + roll + ", Name: " + name);
    }
}