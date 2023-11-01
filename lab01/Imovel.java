package lab01;

public class Imovel {

    // atributos
    private int nQuartos;
    private int nBanheiros;
    private boolean temGaragem;
    private String endereco;
    private boolean aluguel;
    private double valorVenda;

    // construtor
    public Imovel(int nQuartos, int nBanheiros, boolean temGaragem, String endereco, boolean aluguel, double valorVenda) {
        this.nQuartos = nQuartos;
        this.nBanheiros = nBanheiros;
        this.temGaragem = temGaragem;
        this.endereco = endereco;
        this.aluguel = aluguel;
        this.valorVenda = valorVenda;
    }

    // getters
    public int getNQuartos() {
        return this.nQuartos;
    }

    public int getNBanheiros() {
        return this.nBanheiros;
    }

    public boolean getTemGaragem() {
        return this.temGaragem;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public boolean getAluguel() {
        return this.aluguel;
    }

    public double getValorVenda() {
        return this.valorVenda;
    }

    // setters

    public void setNQuartos(int nQuartos) {
        this.nQuartos = nQuartos;
    }

    public void setNBanheiros(int nBanheiros) {
        this.nBanheiros = nBanheiros;
    }

    public void setTemGaragem(boolean temGaragem) {
        this.temGaragem = temGaragem;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setAluguel(boolean aluguel) {
        this.aluguel = aluguel;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }


    // operacoes
    public void imprimeDados() {
        System.out.println("Numero de quartos: " + this.nQuartos);
        System.out.println("Numero de banheiros: " + this.nBanheiros);
        System.out.println("Tem garagem: " + this.temGaragem);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Aluguel: " + this.aluguel);
        System.out.println("Valor de venda: " + this.valorVenda);
    }

    public void valoriza(double perc){
        double currValor;
        double newValor;

        currValor = getValorVenda();
        newValor = currValor + perc * currValor;
        setValorVenda(newValor);
    }
 
    double calculaImposto(){
        double venda;
        double impostos;
        double aluguel;

        venda = getValorVenda();
        impostos = venda * 0.18;
        if(getAluguel()){
            aluguel = venda * 0.05;
            impostos += aluguel * 0.12;
        }
        return impostos;
    }
}