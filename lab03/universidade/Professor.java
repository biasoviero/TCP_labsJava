package lab03.universidade;

public class Professor {
    private int id;
    private String departamento;

    // construtor
    public Professor(int id, String departamento) {
        this.id = id;
        this.departamento = departamento;
    }

    public Professor(){
        this.id = 0;
        this.departamento = "";
    }

    // getters
    public int getId() {
        return this.id;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
