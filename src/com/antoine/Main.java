package com.antoine;

import java.util.Scanner;



class Main {

    static int [] tableau = {8,6,5,69,6,2,53,1,53,6,28,6,3,3,56,2,8,3};


    public static void main(String[] args) {
	// write your code here
        Eratosthene.premiers();
        Tri.triRapide(tableau);
    }

    private static boolean isPalindrome(String phrase){
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
