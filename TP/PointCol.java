import java.util.Random;

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

    @Override
    public void afficher(){
        super.afficher();
        System.out.println(" et de couleur " + this.couleur);
    }

    public static void main(String[] args){

        Point[] tableauPoints = new Point[5];

        int len = tableauPoints.length;

        for (int i = 0; i < len; i++){

            Random random = new Random();

            double abs = random.nextDouble();

            double ord = random.nextDouble();
            
            byte[] couleur = new byte[1];
            random.nextBytes(couleur);

            Point p = new Point(abs, ord);

            PointCol  pCol =  new PointCol(abs, ord, couleur[0]);

            tableauPoints[i] = (i%2 == 0) ? p : pCol;
        }

        for (int i = 0; i < len; i++){
            tableauPoints[i].afficher();
        }
    }
    
}
