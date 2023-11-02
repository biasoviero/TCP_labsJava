package lab03.universidade;

public class Monitor {
    private int semestreAtual;
    private boolean temExperiencia;

    // construtor
    public Monitor(int semestreAtual, boolean temExperiencia) {
        this.semestreAtual = semestreAtual;
        this.temExperiencia = temExperiencia;
    }

    public Monitor(){
        this.semestreAtual = 0;
        this.temExperiencia = false;
    }

    // getters
    public int getSemestreAtual() {
        return this.semestreAtual;
    }

    public boolean getTemExperiencia() {
        return this.temExperiencia;
    }

    // setters
    public void setSemestreAtual(int semestreAtual) {
        this.semestreAtual = semestreAtual;
    }

    public void setTemExperiencia(boolean temExperiencia) {
        this.temExperiencia = temExperiencia;
    }
}
