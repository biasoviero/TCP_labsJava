package lab04.poligonos;

public class TrianguloEquilatero extends Triangulo {
    
    // construtor
    public TrianguloEquilatero(float l1, float l2, float l3) {
        super(l1, l2, l3);
    }

    @Override
    public double calculaArea() {
        return ((Math.sqrt(3) / 4) * Math.pow(getLado1(), 2));
    }

    public void imprimeTipoPoligono() {
        System.out.println("Triângulo equilátero");
    }

}
