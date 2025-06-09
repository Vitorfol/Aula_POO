package src;

import java.util.ArrayList;
import java.util.List;

public class Time {
    String nome;
    List<Jogador> lista = new ArrayList<>();
    int pontos = 0;

    public Time(String nome) {
        this.nome = nome;
    }

    public void add(String nome, int idade, String posicao) {
        Jogador j = new Jogador(nome, idade, posicao);
        lista.add(j);
        System.out.println("Jogador adicionado: " + nome);
    }

    public void mostrar() {
        for (Jogador j : lista) {
            System.out.println(j.n + " - " + j.p);
            if (j.ativo) {
                System.out.println("Status: ativo");
            } else {
                System.out.println("Status: inativo");
            }
        }
        System.out.println("Total de jogadores: " + lista.size());
        System.out.println("Pontos: " + pontos);
    }
}
