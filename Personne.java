package testpersonne;

public class Personne {
    // Attribut(s) 
    // ( !!! Provisoirement avoir une portée PUBLIC ) 
    public String nom;
    public char sexe;
    public int age;
    
    // Constructeur(s)
    public Personne () {
        nom = new String("");
        sexe = ' ';
        age = 0;
    }
    
    // Méthode(s)
    public void Affiche() {
        System.out.println("NOM    : " + nom);
        System.out.println("AGE    : " + sexe);
        System.out.println("SEXE   : " + age);
        System.out.println("\n");
    }
}
