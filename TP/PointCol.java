public class PointCol extends Point{
    byte couleur;

    public PointCol(){

    }

    public PointCol(double abs, double ord, byte couleur){
        super(abs, ord);
        this.couleur = couleur;
    }

    public void colorer(byte couleur){
        this.couleur = couleur;
    }
    public byte getCouleur() {
        return couleur;
    }
    public void setCouleur(byte couleur) {
        this.couleur = couleur;
    }
    public void afficheCol(){
        afficher();
        System.out.println(" et de couleur " + this.couleur);
    }

    public static void main(String[] args){
        double abs = 2;

        double ord = 3;

        byte couleur = 1;

        PointCol pcol = new PointCol(abs, ord , couleur);
    
        pcol.afficheCol();
        pcol.deplacer(abs, ord);
        pcol.afficheCol();
    }
}
