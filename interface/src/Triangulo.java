public class Triangulo extends Figura2D {

    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;
    private double base;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double Area() {
        if (getAltura() != 0 && getBase() != 0) {
            return (altura * base) / 2;
        } else {
            throw new Error("Alguma dimensão possui valor igual zero ou não foi informada");
        }
    }

    public double Perimetro() {
        if (getLado1() != 0 && getLado2() != 0 && getLado3() != 0) {
            return lado1 + lado2 + lado3;
        } else {
            throw new Error("Alguma dimensão possui valor igual zero ou não foi informada");
        }
    }
}
