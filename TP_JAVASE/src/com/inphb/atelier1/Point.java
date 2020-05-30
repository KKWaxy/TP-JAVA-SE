
package com.inphb.atelier1;

/**
 * @author kkwaxy
 */
public class Point {
    int x,y;
    
   Point(){} 
   
   public Point(int x, int y){this.x = x;this.y = y;}
  
   public int abscisse(){return(this.x);}
  
   public int ordonnee(){return(this.y);}
   
   public void deplacer(int x, int y){this.x += x;this.y += y;}
   
   public void afficher(){System.out.println("x="+this.x+" y="+this.y);}
}
