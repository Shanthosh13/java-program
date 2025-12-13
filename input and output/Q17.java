/*Q17.Write a Java Program to print two words in double quotes.*/

import java.util.*;
public class Q17
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        System.out.println("\"" + word1 + "\"  \"" + word2 + "\"");
    }
}