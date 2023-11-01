package lab02.posicoes;

public class PosicaoMapa4x4 {
    private int x;
    private int y;
    private static int numPosicoesOcupadas;

    // constructor
    public PosicaoMapa4x4(int x, int y) {
        this.x = x;
        this.y = y;
        PosicaoMapa4x4.numPosicoesOcupadas = 0;
    }

    public PosicaoMapa4x4(){
        reset();
    }

    // getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public static int getNumPosicoesOcupadas() {
        return numPosicoesOcupadas;
    }

    // setters
    public boolean setX(int x) {
        if (x >= 0 && x < 4){
            this.x = x;
            return true;
        }
        reset();
        return false;
    }

    public boolean setY(int y) {
        if (y >= 0 && y < 4){
            this.y = y;
            return true;
        }
        reset();
        return false;
    }

    public PosicaoMapa4x4 copy(){
        return new PosicaoMapa4x4(this.x, this.y);
    }

    public void imprime(){
        System.out.println("Posicao: (" + this.x + "," + this.y + ")");
    }

    public double distancia(PosicaoMapa4x4 p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    private void reset(){
        this.x = 0;
        this.y = 0;
    }

    public static boolean estaoMesmaPosicao(PosicaoMapa4x4 p1, PosicaoMapa4x4 p2){
        return p1.x == p2.x && p1.y == p2.y;
    }

}
