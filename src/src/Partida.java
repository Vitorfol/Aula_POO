package src;

public class Partida {
    public void atualizarPontuacao(Time time, String resultado) {
        if (resultado.equals("vitoria")) {
            time.pontos += 3;
        } else if (resultado.equals("empate")) {
            time.pontos += 1;
        } else if (resultado.equals("derrota")) {
            time.pontos += 0;
        } else {
            System.out.println("Resultado inválido.");
        }
    }

    public void processar(Object obj) { 
        if (obj instanceof Time) {
            Time t = (Time) obj;
            switch (t.pontos) {
                case 0:
                    System.out.println("Time em má fase.");
                    break;
                case 3:
                    System.out.println("Time razoável.");
                    break;
                default:
                    System.out.println("Time competitivo.");
            }
        }
    }
}