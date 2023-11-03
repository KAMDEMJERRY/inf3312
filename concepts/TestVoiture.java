package inf3312.concepts;

public class TestVoiture {
    public static void main(String[] args){
        // une premiere voiture
        // voiture est accessible depuis cette classe du meme package
        Voiture maVoiture;
        maVoiture = new Voiture("Ford", 15, false, 0);
        maVoiture.demarre();
        maVoiture.accelere(120);
        //creation de la seconde voiture
        Voiture maVoitureCopie;
        maVoitureCopie = new Voiture("MercedezBenz", 12, false, 1);
        maVoiture.afficher();
        System.out.println("\n");
        maVoitureCopie.afficher();
        System.out.println("\n");
        //affectation
        maVoiture=maVoitureCopie;
        maVoitureCopie.accelere(3);

        System.out.println("\n---Apres affectation--\n");
        maVoiture.afficher();
        System.out.println("\n");
        maVoitureCopie.afficher();
    }
    
}
