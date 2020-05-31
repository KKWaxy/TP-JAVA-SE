
package com.inphb.atelier1;

/**
 * @author kkwaxy
 */
public class Point {
    
   private int x,y;
   
   private static int compte=0; 
   
   Point(){compte+=1;} 
   
   public Point(int x, int y){this.x = x;this.y = y;compte+=1;};
   
   //public Point(Point point){this.x=point.x;this.y=point.y;compte+=1;};
   
   public Point(Point point){this(point.x,point.y);compte+=1;};
   
   public static int nombreInstance(){return(compte);};
   
   public int abscisse(){return(this.x);}
  
   public int ordonnee(){return(this.y);}
   
   public void deplacer(int x, int y){this.x += x;this.y += y;}
   
   public void afficher(){System.out.println("x="+this.x+" y="+this.y);}
}