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
package com.inphb.atelier2;

import java.util.Arrays;

/**
 *
 * @author kkwaxy
 */
public class Pile {
    
    private int sommet=-1;
    private int taille;
    private int liste[];
    
    public Pile(){};
   
    public Pile(int taille){
        this.taille = taille;
        this.liste = new int[this.taille];
    };
   
    public Pile(int taille, int elements[]){
        this(taille);
        if(elements.length!=0){
            for(int element:elements){
                this.sommet++;
                this.liste[this.sommet]=element;
            }
        } 
    }
   
    public boolean estPleine(){
        return(this.taille==this.sommet+1); //On test si l'indice du sommet+1 vaut la taille de la liste interne.
    };
   
    public boolean estVide(){
        return(this.sommet==-1);
    };
    
    public int sommet(){
        return(this.liste[this.sommet]);
    }
    
    public int taille(){
        return(this.taille);
    }
    
    public void empiler(int element){
        if (this.estPleine()){
            System.err.println("Erreur Pile: La pile est pleine; IMPOSSIBLE d'empiler");
      }else{
        this.sommet++;
        this.liste[this.sommet]=element; //Element de aura pour indice sommet dans la liste interne.
        }
    }
   
    public int depiler(){
        if(this.estVide()){
            System.err.println("Erreur Pile: La Pile est Vide; IMPOSSIBLE de depiler.");
            return -1;
        }else{
            int element = this.liste[this.sommet]; 
            this.sommet--;
            return(element);
        }
    }
    
    /**
     *
     * @description:En cas de Pile vide il renvoie une liste vide.
     */
    public void afficher(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(this.liste,0,sommet+1))); 
    }
}
