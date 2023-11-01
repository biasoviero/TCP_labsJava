package TCP_labsJava.lab02.src.teste;
import java.util.ArrayList;
import java.util.Scanner;

import TCP_labsJava.lab02.src.posicoes.PosicaoMapa4x4;

public class AplicacaoTestaPosicoes {
    public static final int MAP_WIDTH = 4;
    public static final int MAP_HEIGHT = 5;

    public static void main(String[] args){

        PosicaoMapa4x4 p1, p2, p3;
        p1 = new PosicaoMapa4x4();
        p2 = new PosicaoMapa4x4();
        int x, y;
        ArrayList<PosicaoMapa4x4> posicoes = new ArrayList<PosicaoMapa4x4>();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite um valor válido para x (x deve pertencer a [0,4) ) para inicializar 1º objeto: ");
            x = scanner.nextInt();
        }while(!p1.setX(x));


        do{
            System.out.println("Digite um valor válido para y (y deve pertencer a [0,4) ) para inicializar 1º objeto: ");
            y = scanner.nextInt();
        }while(!p1.setY(y));

        p1.imprime();
        System.out.println();
        
        do{
            System.out.println("Digite um valor válido para x (x deve pertencer a [0,4) ) para inicializar 2º objeto: ");
            x = scanner.nextInt();
        }while(!p2.setX(x));

        do{
            System.out.println("Digite um valor válido para y (y deve pertencer a [0,4) ) para inicializar 2º objeto: ");
            y = scanner.nextInt();
        }while(!p2.setY(y));

        p2.imprime();
        System.out.println();

        System.out.println("Distancia entre p1 e p2: " + p1.distancia(p2));
        System.out.println();

        p3 = p1.copy();

        if (PosicaoMapa4x4.estaoMesmaPosicao(p2, p3)){
            System.out.println("p2 e p3 estão na mesma posição");
        } else {
            System.out.println("p2 e p3 estão em posições diferentes");
        }

        if (PosicaoMapa4x4.estaoMesmaPosicao(p1, p3)){
            System.out.println("p1 e p3 estão na mesma posição");
        } else {
            System.out.println("p1 e p3 estão em posições diferentes");
        }

        if (PosicaoMapa4x4.estaoMesmaPosicao(p1, p2)){
            System.out.println("p1 e p2 estão na mesma posição");
        } else {
            System.out.println("p1 e p2 estão em posições diferentes");
        }

        posicoes.add(p1);
        posicoes.add(p2);
        posicoes.add(p3);

        imprimeMapa(posicoes);

        scanner.close();
    }

    private static void imprimeMapa(ArrayList<PosicaoMapa4x4> pos){
        ArrayList<ArrayList<Character>> matriz = new ArrayList<ArrayList<Character>>();

        // initializae matrix 
        // y é o número da sublista
        // x é o número do elemento na sublista
        for (int i = 0; i < MAP_HEIGHT; i++){
            ArrayList<Character> row = new ArrayList<Character>();
            for (int j = 0; j < MAP_WIDTH; j++){
                row.add('-');
            }
            matriz.add(row);
        }

        // set posições ocupadas
        for (PosicaoMapa4x4 i : pos){
            matriz.get(i.getY()).set(i.getX(), 'X');
        }

        // imprime matriz
        System.out.println();
        for (int i = 0; i < MAP_HEIGHT; i++){
            for (int j = 0; j < MAP_WIDTH; j++){
                System.out.print(matriz.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
