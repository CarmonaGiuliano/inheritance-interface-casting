class Teste {

    public static void main(String[] args) {


        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(2);
        cilindro.setRaioDaBase(0.5);
        cilindro.setNome("cilindro");
        figuras[0] = cilindro;
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(3);
        quadrado.setNome("quadrado");
        figuras[1] = quadrado;
        Piramade piramade = new Piramade("triangular");
        piramade.setAltura(5.0);
        piramade.setNome("piramede");
        figuras[2] = piramade;
        Circulo circulo = new Circulo();
        circulo.setRaio(2.5);
        circulo.setNome("circulo");
        figuras[3] = circulo;
        for (var figura : figuras) {
            if (figura instanceof Figura2D) {
                System.out.println(figura.getNome() + " " + "possui área:");
                System.out.println(((Figura2D) figura).Area());
            } else if (figura instanceof Figura3D) {
                System.out.println(figura.getNome() + " " + "possui volume:");
                System.out.println(((Figura3D) figura).Volume());
            }

        }
    }
}