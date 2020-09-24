import java.lang.Math;

public class Quadrado extends Figura2D {

    private double lado;


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double Area() {
        if (getLado() != 0) {
            return Math.pow(lado, 2);
        } else {
            throw new Error("O valor da dimensão lado não foi informada ou é igual a zero");
        }
    }

    public double Perimetro(){
        if (getLado() != 0) {
            return 4*lado;
        } else {
            throw new Error("O valor da dimensão lado não foi informada ou é igual a zero");
        }
    }
}
