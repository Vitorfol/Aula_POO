package src;

public class Jogador {
    String n; 
    int i;    
    String p; 
    boolean ativo;

    public Jogador(String n, int i, String p) {
        this.n = n;
        this.i = i;
        this.p = p;
        this.ativo = true;
    }

    public void x() {
        if (ativo) {
            System.out.println(n + " está disponível.");
        } else {
            System.out.println(n + " está lesionado.");
        }
    }
}
