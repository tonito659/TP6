package com.antoine;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean palindrome(String mot){
        // cette fonction détermine si le mot en entrée esst un palindrome !
        boolean pal = true;
        for (int i=0; i<=mot.length(); i++){
            if (mot.charAt(i)!= mot.charAt(mot.length()-i)){
                pal = false // faut vérifier deux fois on sait jamais...
            }
        }
        return pal;
    }
}
