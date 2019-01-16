
package testpersonne;

public class TestPersonne {

    public static void main(String[] args) {
        
        // Instancier la Classe Personne
        Personne Eleve1 = new Personne();
        Personne Eleve2 = new Personne();
        
        // Assigner des informations à l'object Eleve1
        Eleve1.nom = "Anais FICHER";
        Eleve1.age = 22;
        Eleve1.sexe = 'F';
        
        Eleve2.nom = "luc DUNAND";
        Eleve2.age = 18;
        Eleve2.sexe = 'M';
        
        // Affichage des informations de l'object Eleve1
        // System.out.println("NOM    : " + Eleve1.nom);
        // System.out.println("AGE    : " + Eleve1.age);
        // System.out.println("SEXE   : " + Eleve1.sexe);
        
        //System.out.println("\n");
        
        // Affichage des informations de l'object Eleve2
        //System.out.println("NOM    : " + Eleve2.nom);
        //System.out.println("AGE    : " + Eleve2.age);
        //System.out.println("SEXE   : " + Eleve2.sexe);
        
        // Affichage des informations de l'object Eleve1
        Eleve1.Affiche();
        
        // Affichage des informations de l'object Eleve2
        Eleve2.Affiche();
    }
    
}
