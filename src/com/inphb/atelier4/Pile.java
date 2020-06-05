package com.inphb.atelier4;

public class Pile extends Liste {
    
    private int _taille;
    
    Pile(){
        super();
        this._taille=0;
    };
    
    Pile(Cellule cellule){
        super(cellule);
    }
    boolean estVide(){
        return(this.teteListe().getSuivant()==null);
    };

    Cellule sommet(){
        
        if(this.estVide()){
            System.err.println("Vous avez une pile vide.");
            return(null);
        }else{
            Cellule temp = this.teteListe();
            do{
               temp = temp.getSuivant();
            }while(temp.getSuivant()!=null);
            return(temp);
        }
    }
    
    int taille(){
        return(this._taille);
    }
    
    void empiler(Cellule element){
        this._taille++;
        this.insertEnd(element);
    }
   
    void depiler(){
        if(this.estVide()){
            System.err.println("Vous avez une pile vide.");
        }else{
            Cellule temp = this.teteListe();
            do{
               temp = temp.getSuivant();
            }while(temp.getSuivant().getSuivant()!=null);
            temp.setSuivant(null);
            this._taille--;
        }
    }
}
