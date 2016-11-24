package com.antoine;
import java.util.Random;


class Tri {


    static Random rand = new Random();


    public static int partitionner(int premier, int dernier){
        int aleatoire = rand.nextInt((dernier - premier)+ 1) + premier;
        return aleatoire;
    }


    public static void triRapide( int[] tableau){

    }
}

