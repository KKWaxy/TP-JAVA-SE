
import com.inphb.atelier1.Point;
import com.inphb.atelier2.Pile;
import com.inphb.atelier3.Matrice;
import java.util.Arrays;

public class Main {
    
    public static void main(String args[]){
        // -------------------- TEST Point ----------------------
        Point P1 = new Point(50,2);
        P1.afficher();
        System.out.println(Point.nombreInstance());
        
        //-------------------- TEST PILE -----------------------
        
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
        
        // -------------------- MATRICE ----------------------
        System.out.println("MATRICE");
        
        //Initialisation du tableau à  multidimentionnel.
        float j[][] = {{4,1},{2,5}};
        float k[][] = {{5,4,6},{5,6,3}};
        //On crée une nouvelle matrice à partir du tableau primitif multidimentionel.
        Matrice matrice1 = new Matrice(j);
        System.out.println("Matrice 1:");
        matrice1.afficher();
        System.out.println("\n");
        
        //On crée une deuxième matrice à partir de la première matrice.
        Matrice matrice2 = new Matrice(matrice1);
        System.out.println("Matrice 2:");
        matrice2.afficher();
        System.out.println("\n");
        
        //On Somme les deux matrice pour avoir une troisième matrice.
        Matrice matrice3 = Matrice.addition(matrice2, matrice2);
        System.out.println("Matrice 3:");
        matrice3.afficher();
        System.out.println("\n");
        
        // On somme la première matrice1 et matrice3 qu'on stock dans matrice1.
        matrice1.additionMatrice(matrice3);
        System.out.println("Matrice 1:");
        matrice1.afficher();
        System.out.println('\n');
        
        //On fait le produit des deux matrice pour avoir une autre matrice.
        Matrice matrice4 = Matrice.produit(matrice3, matrice1);
        System.out.println("Matrice 4:");
        matrice4.afficher();
        System.out.println("\n");
        
        //Matrice non carree
        Matrice matrice5 = new Matrice(k);
        System.out.println("Matrice 5:");
        matrice5.afficher();
        System.out.println("\n");
        
        //On fait le produit des deux matrice pour avoir une autre matrice.
        Matrice matrice6 = Matrice.produit(matrice2, matrice5);
        System.out.println("Matrice 6:");
        matrice6.afficher();
        System.out.println("\n");
        
        // On fait le produit la première matrice6 et matrice5 qu'on stock dans matrice6.
        matrice2.produitMatrice(matrice6);
        System.out.println("Matrice 2:");
        matrice2.afficher();
        System.out.println('\n');
    }    
}