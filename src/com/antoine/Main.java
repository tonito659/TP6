package com.antoine;

import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
	// write your code here
        palindrome();
    }

    public static boolean isPalindrome(String phrase){
        // cette fonction détermine si le mot en entrée esst un palindrome !
        boolean pal = true;
        for (int i=0; i < phrase.length()-1; i++){
            if (phrase.charAt(i)!= phrase.charAt(phrase.length()-i-1)){
                pal = false;
            }
        }
        return pal;
    }
    public static void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une phrase: ");
        String phrase = sc.nextLine();

        if (isPalindrome(phrase))
            {System.out.print("c'est un palindrome");
        }else{
            System.out.print("ce n'est pas un palindrome");
        }
    }
}
