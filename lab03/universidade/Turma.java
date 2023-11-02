package lab03.universidade;
import java.util.ArrayList;

public class Turma {
    private int numAlunos;
    private int numMonitores;
    private Professor professor;
    ArrayList<Monitor> monitores;
    ArrayList<Aluno> alunos;

    // construtor
    public Turma(Professor professor, ArrayList<Monitor> monitores, ArrayList<Aluno> alunos) {
        this.professor = professor;
        this.monitores = monitores;
        this.alunos = alunos;
        this.numAlunos = alunos.size();
        this.numMonitores = monitores.size();
    }

    public Turma(){
        this.professor = new Professor();
        this.monitores = new ArrayList<Monitor>();
        this.alunos = new ArrayList<Aluno>();
        this.numAlunos = 0;
        this.numMonitores = 0;
    }

    // getters
    public int getNumAlunos() {
        return this.numAlunos;
    }

    public int getNumMonitores() {
        return this.numMonitores;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public ArrayList<Monitor> getMonitores() {
        return this.monitores;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    // setters

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public void setNumMonitores(int numMonitores) {
        this.numMonitores = numMonitores;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setMonitores(ArrayList<Monitor> monitores) {
        this.monitores = monitores;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    // operações

    public void adicionaAluno(Aluno aluno) {
        this.alunos.add(aluno);
        this.numAlunos++;
    }

    public void removeAluno(){
        this.alunos.remove(this.numAlunos-1);
        this.numAlunos--;
    }

    public void imprimeAlunos(){
        for (Aluno aluno : this.alunos) {
            aluno.imprime();
        }
    }
}
