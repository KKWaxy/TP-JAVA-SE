package com.inphb.atelier4;

public class Liste {
 
    private Cellule _tete;
    
    Liste(){
        this._tete = new Cellule();
    };
    
    Liste(Cellule cellule){
        this();
        this._tete.setSuivant(cellule);
    }
    
    void insertEnd(Cellule cellule){
        
        if(this.teteListe().getSuivant()==null){
            this.teteListe().setSuivant(cellule);
        }else{
            Cellule temp = this.teteListe();
            do{
                temp = temp.getSuivant();
            }while(temp.getSuivant()!=null);
            temp.setSuivant(cellule);
        }
    };
    
    Cellule teteListe(){
        return(this._tete);
    }
}
