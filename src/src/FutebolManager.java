package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FutebolManager {
    Scanner s = new Scanner(System.in);
    List<Time> listaDeTimes = new ArrayList<>();
    Partida partida = new Partida();

    public void menu() {
        System.out.println("Menu:");
        System.out.println("1 - Criar Time");
        System.out.println("2 - Adicionar Jogador");
        System.out.println("3 - Mostrar Info");
        System.out.println("4 - Atualizar Pontos");
        System.out.println("5 - Processar Estado");
        System.out.println("6 - Sair");
    }

    public void start() {
        while (true) {
            menu();
            int op = Integer.parseInt(s.nextLine());

            if (op == 1) {
                System.out.println("Nome do time:");
                String nome = s.nextLine();
                listaDeTimes.add(new Time(nome));
            } else if (op == 2) {
                System.out.println("Nome do time:");
                String nome = s.nextLine();
                Time t = buscarTime(nome);
                if (t == null) {
                    System.out.println("Time não encontrado.");
                } else {
                    try {
                        System.out.println("Nome jogador:");
                        String jn = s.nextLine();
                        System.out.println("Idade:");
                        int idade = Integer.parseInt(s.nextLine());
                        System.out.println("Posição:");
                        String pos = s.nextLine();
                        t.add(jn, idade, pos);
                    } catch (Exception e) {
                        System.out.println("Erro ao adicionar jogador.");
                    }
                }
            } else if (op == 3) {
                for (Time t : listaDeTimes) {
                    System.out.println("Time: " + t.nome);
                    t.mostrar();
                }
            } else if (op == 4) {
                System.out.println("Time:");
                String nome = s.nextLine();
                Time t = buscarTime(nome);
                if (t != null) {
                    System.out.println("Resultado (vitoria/empate/derrota):");
                    String r = s.nextLine();
                    partida.atualizarPontuacao(t, r);
                }
            } else if (op == 5) {
                for (Time t : listaDeTimes) {
                    partida.processar(t);
                }
            } else if (op == 6) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private Time buscarTime(String nome) {
        for (Time t : listaDeTimes) {
            if (t.nome.equalsIgnoreCase(nome)) return t;
        }
        return null;
    }
}
