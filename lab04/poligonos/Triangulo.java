package lab04.poligonos;

public  abstract class Triangulo implements Poligono {

    private float lado1;
    private float lado2;
    private float lado3;
    private float base;
    private float altura;

    // construtores

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // getters
    public float getLado1() {
        return this.lado1;
    }

    public float getLado2() {
        return this.lado2;
    }

    public float getLado3() {
        return this.lado3;
    }

    public float getBase() {
        return this.base;
    }

    public float getAltura() {
        return this.altura;
    }

    // setters

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    public static float calculaArea(float base, float altura) {
        return (base * altura) / 2;
    }
// DUVIDAAAA
    public double calculaArea(){
        return this.base * this.altura;
    }

    public abstract void imprimeTipoPoligono();
}
