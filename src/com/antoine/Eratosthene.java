package com.antoine;

import java.util.Scanner;

class Eratosthene {


    private static void eratosthene(int[] tableau) {
        tableau[1]=0;
        int j;
        for (int i = 2; (i < tableau.length); i++) {
            j = i+i;
            if (tableau[i] != 0 ){
                while (j < tableau.length) {
                    tableau[j] = 0;
                    j=j+i;
                }
            }
        }
    }

    private static int[] genTableau(int taille) {
        //generation du tableau rempli avec des 1
        int[] tableau = new int[taille+1];
        for (int i=0; i<tableau.length; i++){
            tableau[i] = i;
        }
        return tableau;
    }

    public static void premiers() {
        // afficher les nombres premiers de 1 à n
        Scanner sc = new Scanner(System.in);
        System.out.print("rentrez un nombre d'entiers n : ");
        int entier = sc.nextInt();
        int[] crible = genTableau(entier);


        eratosthene(crible);
        System.out.print("la liste des nombres premier est : \n");
        for (int i = 0; i < crible.length; i++) {
            if (crible[i] != 0) {
                System.out.println(i);
            }
        }
    }
}
