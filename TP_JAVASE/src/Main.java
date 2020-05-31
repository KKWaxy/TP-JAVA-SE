
import com.inphb.atelier1.Point;
import com.inphb.atelier2.Pile;

public class Main {
    
    public static void main(String args[]){
        //TEST Point
        Point P1 = new Point(50,2);
        P1.afficher();
        System.out.println(Point.nombreInstance());
        
        //TEST PILE
        
        Pile pile1 = new Pile(2);
        pile1.afficher(); 
        System.out.println(pile1.estVide()); //true
        pile1.depiler(); //Génération d'Erreur Pile, Car elle est Vide.
        pile1.empiler(2);
        pile1.empiler(3);
        System.out.println(pile1.sommet());
        pile1.empiler(5); //Génération d'Erreur Pile, Car elle est Pleine.
        pile1.afficher();
        
        System.out.println("Pile Avec liste en argument.");
        int elements[]={1,3};
        Pile pile2 = new Pile(3,elements);
        pile2.afficher();
        System.out.println(pile2.estVide());
        System.out.println(pile2.estPleine());
        System.out.println(pile2.taille());
        pile2.empiler(5);
        pile2.afficher();
        
        
    }    
}