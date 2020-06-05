/*
 * Copyright (C) 2020 HP PC
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
public class Cellule {
    int _info;
    private Cellule _suivant;
    
    public Cellule(){
        this._info = 0;
        this._suivant=null;
    };
    public Cellule(int info,Cellule suiv){
        this._info = info;
        this._suivant = suiv;
    };
    public void setSuivant(Cellule suiv){
        this._suivant = suiv;
    };
    public Cellule getSuivant(){
        return(this._suivant);
    };
    public int getInfo(){
        return(this._info);
    };
};
