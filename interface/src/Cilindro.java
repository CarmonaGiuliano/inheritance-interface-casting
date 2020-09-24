import java.lang.Math;

public class Cilindro extends Figura3D {

    private double raioDaBase;
    private double altura;


    public double getRaioDaBase() {
        return raioDaBase;
    }

    public void setRaioDaBase(double raioDaBase) {
        this.raioDaBase = raioDaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double Volume() {
        if (getRaioDaBase() != 0 && getAltura() != 0) {
            return Math.pow(getRaioDaBase(), 2) * 3.14 * getAltura();
        } else {
            throw new Error("Alguma dimensão possui valor igual zero ou não foi informada");
        }
    }
}
