
/**
 * Classe et Objets simples en Java
 */
public class Point{
    private double abs;
    private double ord;

    public Point(){

    }
    public Point(double abs, double ord){
        this.abs = abs;
        this.ord = ord;
    }
    public void initialiser(double abs, double ord){
        this.abs = abs;
        this.ord = ord;
    }
    public void deplacer(double abs, double ord){
        this.abs += abs;
        this.ord += ord;
    }
    public void afficher(){
        System.out.print("Je suis un point de coordonnees " + this.abs + " et " + this.ord);
    }

    public double getAbs() {
        return abs;
    }
    public double getOrd() {
        return ord;
    }
    public void setAbs(double abs) {
        this.abs = abs;
    }
    public void setOrd(double ord) {
        this.ord = ord;
    }
    public static void main(String[] agrs){
        Point a;
        a = new Point();
        a.initialiser(2.3, 4);
        a.afficher();
        a.deplacer(0, 2);
        a.afficher();
    }
}