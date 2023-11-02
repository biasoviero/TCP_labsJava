package lab03.universidade;

public class Aluno {
    private int numeroMatricula;
    private double indiceDesempenho;

    // construtor
    public Aluno(int numeroMatricula, double indiceDesempenho) {
        this.numeroMatricula = numeroMatricula;
        this.indiceDesempenho = indiceDesempenho;
    }

    public Aluno(){
        this.numeroMatricula = 0;
        this.indiceDesempenho = 0.0;
    }

    // getters
    public int getNumeroMatricula() {
        return this.numeroMatricula;
    }

    public double getIndiceDesempenho() {
        return this.indiceDesempenho;
    }

    // setters
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setIndiceDesempenho(double indiceDesempenho) {
        this.indiceDesempenho = indiceDesempenho;
    }

    // operações
    public void aumentaIndiceDesempenho(double aumento) {
        this.indiceDesempenho += aumento;
    }

    public void diminuiIndiceDesempenho(double diminuicao) {
        this.indiceDesempenho -= diminuicao;
    }

    public void imprime(){
        System.out.println("Número de matrícula: " + this.numeroMatricula);
        System.out.println("Índice de desempenho: " + this.indiceDesempenho);
        System.out.println();
    }
}
