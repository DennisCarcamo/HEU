package heu;

public class Arista {

    private double longitud;
    private Node nodoInicial;
    private Node nodoFinal;

    public Arista() {
    }

    public Arista(Node nodoInicial, Node nodoFinal, double longitud) {
        this.longitud = longitud;
        this.nodoInicial = nodoInicial;
        this.nodoFinal = nodoFinal;
    }

    public Arista(double longitud, Node nodoInicial, Node nodoFinal) {
        this.longitud = longitud;
        this.nodoInicial = nodoInicial;
        this.nodoFinal = nodoFinal;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Node getNodoInicial() {
        return nodoInicial;
    }

    public void setNodoInicial(Node nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public Node getNodoFinal() {
        return nodoFinal;
    }

    public void setNodoFinal(Node nodoFinal) {
        this.nodoFinal = nodoFinal;
    }

    @Override
    public String toString() {
        return nodoInicial + " = "+longitud + " hacia " + nodoFinal;
    }
}
