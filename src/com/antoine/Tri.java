package com.antoine;
import java.util.Random;


class Tri {


    static Random rand = new Random();


    public static int partitionner(int premier, int dernier){
        int aleatoire = rand.nextInt((dernier - premier)+ 1) + premier;
        return aleatoire;
    }

    public static void triRapide(int tableau[])
    {
        int longueur=tableau.length;
        if (longueur>0)
        {
            triRapide(tableau,0,longueur-1);
        }
    }

    private static void triRapide(int tableau[], int premier, int dernier)
    {
        if (premier!=dernier)
        {
            int pivot=partitionner(premier, dernier);
            triRapide(tableau,premier,pivot);
            triRapide(tableau,pivot+1,dernier);
            fusion(tableau,premier,pivot,dernier);
        }
    }

    private static void fusion(int tableau[],int premier1,int fin1,int dernier2)
    {
        int premier2=fin1+1;

        //copie des elements
        int tableau_premiere_moitie[]=new int[fin1-premier1+1];
        for(int i=premier1;i<=fin1;i++)
        {
            tableau_premiere_moitie[i-premier1]=tableau[i];
        }

        int i=premier1, j=premier2;

        for(int k=premier1;k<=dernier2;k++)
        {
            if (i==premier2) {
                break;
            } else if (j==(dernier2+1)) {
                tableau[k]=tableau_premiere_moitie[i-premier1];
                i++;
            } else if (tableau_premiere_moitie[i-premier1]<tableau[j]) {
                tableau[k]=tableau_premiere_moitie[i-premier1];
                i++;
            } else {
                tableau[k]=tableau[j];
                j++;
            }
        }
    }
}

