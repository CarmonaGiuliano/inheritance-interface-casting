import java.lang.Math;

public class Cubo extends Figura3D {

    private double aresta;

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }


    public double Volume() {
        if (aresta != 0) {


            return Math.pow(aresta, 3);

        } else {

            throw new Error("A dimensão aresta possui valor igual zero ou não foi informada");
        }
    }
}
