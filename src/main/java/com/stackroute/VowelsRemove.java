/*Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia
Output:
Place Name without Vowels:0 Ind
Place Name without Vowels:1 Untd Stts*/
package com.stackroute;
        import java.util.Scanner;
public class VowelsRemove{
    public static void main(String[] args) {
        String original, strnew;
        System.out.println("enter the string");
        Scanner scan = new Scanner(System.in);
        original = scan.nextLine();
        System.out.println("Actual string is " + original);
        //replace the vowel by space and print remaining
        strnew = original.replaceAll("[aeiou]", "");
        System.out.println("string is "  + strnew);
    }
}