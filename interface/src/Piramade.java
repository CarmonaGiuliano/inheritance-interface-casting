import java.lang.Math;
import java.util.Scanner;


public class Piramade extends Figura3D  {

    private double altura;
    private String tipo;



    Piramade(String tipo){
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double Volume() {
        if (getAltura() != 0) {
            Scanner scan = new Scanner(System.in);
            if (getTipo().equalsIgnoreCase("quadrangular")) {
                System.out.println("Digite o lado da base");
                double ladoBs = scan.nextDouble();
                return Math.pow(ladoBs, 2) * altura;
            } else if (getTipo().equalsIgnoreCase("retangular")) {
                System.out.println("Digite os lados da base");
                double lado1Bs = scan.nextDouble();
                double lado2Bs = scan.nextDouble();
                return lado1Bs * lado2Bs * altura;
            } else if (getTipo().equalsIgnoreCase("triangular")) {
                System.out.println("Digite um lado da base");
                double ladoBs = scan.nextDouble();
                System.out.println("Digite a altura relativa a este lado");
                double alturaBs = scan.nextDouble();
                return ladoBs * alturaBs * altura / 2;
            } else {
                throw new Error("Tipo invalido, informe somente o tipos quadrangular, triangular ou retangular");
            }
        } else {
            throw new Error("A dimensão altura possui valor igual zero ou não foi informada");
        }
    }
}
