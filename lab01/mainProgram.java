package lab01;

public class mainProgram{
    public static void main(String[] args){
        double impostos;

        Imovel imovel1 = new Imovel(3, 2, true, "Rua 1", true, 100000);
        Imovel imovel2 = new Imovel(3, 2, true, "Rua 1", true, 100000);

        Imovel imovel3 = imovel1;
        double valor = 0;
        imovel3.setValorVenda(valor);
        imovel3.imprimeDados();

        // imovel1 e imovel2 são diferentes porque representam objetos diferentes
        if (imovel1 == imovel2){
            System.out.println("Imoveis iguais");
        } else {
            System.out.println("Imoveis diferentes");
        }

        imovel1.imprimeDados();
        imovel1.valoriza(0.025);
        imovel1.imprimeDados();
        impostos = imovel1.calculaImposto();
        System.out.println("Impostos: " + impostos);
    }
}