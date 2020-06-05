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
package com.inphb.atelier4;

/**
 *
 * @author kkwaxy
 */

public class Liste {
 
    private Cellule _tete;
    
    public Liste(){
        this._tete = new Cellule();
    };
    
    public Liste(Cellule cellule){
        this();
        this._tete.setSuivant(cellule);
    }
    
    public void insertEnd(Cellule cellule){
        
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
    
    public Cellule teteListe(){
        return(this._tete);
    }
}
