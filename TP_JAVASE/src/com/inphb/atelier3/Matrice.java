/*
 * Copyright (C) 2020 kkwaxy
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.inphb.atelier3;

import java.util.Arrays;

/**
 *
 * @author kkwaxy
 */
public class Matrice {
    
    private int ligne;
    private int colonne;
    private float matrice[][];
    
    public Matrice(){}
    
    private Matrice(int ligne, int colonne){
        this.ligne = ligne;
        this.colonne = colonne;
        this.matrice = new float[ligne][colonne];
    }
    
    public Matrice(float[][] tableau){
        this.ligne = tableau.length;
        this.colonne = tableau[tableau.length-1].length;
        this.matrice = tableau;
    }
    
    public Matrice(Matrice matrice){
        this(matrice.matrice);
    }
   
    public int[] dimension(){
        int[] dimension = {this.ligne,this.colonne};
        return(dimension);
    }
    
    public static boolean estMatriceCarree(Matrice matrice){
        return(matrice.ligne==matrice.colonne);
    };
    
    //Le Résultat de la somme est une autre matrice.
    public static Matrice addition(Matrice matriceA, Matrice matriceB){
      if(estMatriceCarree(matriceA) && estMatriceCarree(matriceB)){
        if(matriceA.colonne==matriceB.colonne){
            Matrice matriceSomme = new Matrice(matriceA.ligne, matriceA.colonne);
            for(int i=0;i<matriceA.ligne;i++){
               for(int j=0;j<matriceA.colonne;j++){
                   matriceSomme.matrice[i][j]= (float) matriceA.matrice[i][j]+matriceB.matrice[i][j];
               }
            }
            return(matriceSomme);
        }else{
            System.err.println("Error MatriceDimension: Les deux matrices ne sont pas de même dimension. IMPOSSIBLE de sommer.");
            return(new Matrice(0,0));
        }
        
      }else{
        System.err.println("Error MatriceNature: Les deux matrices ne sont pas des matrices carree. IMPOSSIBLE de sommer. ");
        return(new Matrice(0,0));
      }
    };
    
    //Le Résultat du produit est une autre matrice.
    public static Matrice produit(Matrice matriceA, Matrice matriceB){
        if(matriceA.colonne==matriceB.ligne){
            Matrice matriceProduit = new Matrice(matriceA.ligne, matriceB.colonne);
            for(int i=0;i<matriceA.ligne;i++){
               for(int j=0;j<matriceB.colonne;j++){
                   for(int k=0;k<matriceA.colonne;k++){
                        matriceProduit.matrice[i][j] += matriceA.matrice[i][k] * matriceB.matrice[k][j];
                   }      
               }
            }
            return(matriceProduit);
        }else{
            System.err.println("Erreur Dimension marice: IMPOSSIBLE de faire le produit.");
            return(new Matrice(0,0));
        }
    }
    public void afficher(){
        System.out.print('[');
        for(float[] i:this.matrice){System.out.println(Arrays.toString(i));}
        System.out.print(']');
    }
    
    //Le Résultat de la somme est la Matrice courante.
    public void additionMatrice(Matrice matrice){
        Matrice somme = addition(this,matrice);
        this.matrice = somme.matrice;
        this.ligne = somme.ligne;
        this.colonne = somme.colonne;
    };
    
    public void produitMatrice(Matrice matrice){
        Matrice produit = produit(this,matrice);
        this.matrice = produit.matrice;
        this.ligne = produit.ligne;
        this.colonne = produit.colonne;
    }
    
}
