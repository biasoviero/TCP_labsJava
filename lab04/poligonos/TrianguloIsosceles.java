package lab04.poligonos;

public class TrianguloIsosceles extends Triangulo{
    
    // construtor
    public TrianguloIsosceles(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
    }

    private double calculaAltura() {
        float ladoDiferente, ladoIgual;

        if (getLado1() != getLado2() && getLado1() != getLado3()) {
            ladoDiferente = getLado1();
            ladoIgual = getLado2();
        } else if (getLado2() != getLado1() && getLado2() != getLado3()) {
            ladoDiferente = getLado2();
            ladoIgual = getLado1();
        } else {
            ladoDiferente = getLado3();
            ladoIgual = getLado1();
        }

        setBase(ladoDiferente);

        return Math.sqrt(Math.pow(ladoIgual, 2) - Math.pow(ladoDiferente, 2) / 4);
    }

    @Override
    public double calculaArea() {
        double altura = calculaAltura();
        float base = getBase();
        return (double)(base * altura) / 2;
    }

    public void imprimeTipoPoligono() {
        System.out.println("Triângulo isósceles");
    }

}
