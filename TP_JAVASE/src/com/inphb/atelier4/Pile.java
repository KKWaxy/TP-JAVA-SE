package com.inphb.atelier4;

public class Pile extends Liste {
    
    private int _taille;
    
    public Pile(){
        super();
        this._taille=0;
    };
  
    public boolean estVide(){
        return(this.teteListe().getSuivant()==null);
    };

    public Cellule sommet(){
        
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
    
    public int taille(){
        return(this._taille);
    }
    
    public void empiler(Cellule element){
        this._taille++;
        this.insertEnd(element);
    }
   
    public void depiler(){
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
