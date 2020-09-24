import java.lang.Math;



public class Circulo extends Figura2D {

    private double raio;


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double Area(){
        if (getRaio() != 0) {
            return Math.pow(raio, 2)*3.14;
        } else {
            throw new Error("O valor da dimensão raio não foi informada ou é igual a zero");
        }
    }

    public double Perimetro(){
        if (getRaio() != 0) {
            return 2*3.14*raio;
        } else {
            throw new Error("O valor da dimensão raio não foi informada ou é igual a zero");
        }
    }

}

