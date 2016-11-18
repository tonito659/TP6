package com.antoine;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Antoine on 18/11/2016.
 */
public class Eratosthene {


    public static void eratosthene(int[] tableau) {
        tableau[0]=0;
        tableau[1]=0;
        int j;
        for (int i = 2; (i < tableau.length); i++) {
            for (j=2; (j < tableau.length); j++){
                if (j % (i) == 0) {
                    tableau[j] = 0;
                }
            }
        }
    }

    public static int[] genTableau(int taille) {
        //generation du tableau rempli avec des 1
        int[] tableau = new int[taille+1];
        Arrays.fill(tableau, 1);
        return tableau;
    }

    public static void premiers() {
        // afficher les nombres premiers de 1 à n
        Scanner sc = new Scanner(System.in);
        System.out.print("rentrez un nombre d'entiers n : ");
        int entier = 10; //sc.nextInt();
        int[] crible = genTableau(entier);


        eratosthene(crible);
        System.out.print("la liste des nombres premier est : \n");
        for (int i = 0; i < crible.length; i++) {
            if (crible[i] == 1) {
                System.out.println(i);
            }
        }
    }
}