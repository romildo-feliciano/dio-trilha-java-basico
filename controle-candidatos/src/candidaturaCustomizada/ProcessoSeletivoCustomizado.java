package candidaturaCustomizada;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCustomizado {
    private static final double SALARIO_BASE = 2000.0;

    public static void main(String[] args) {
        System.out.println("Iniciando Processo Seletivo...\n");

        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        // Seleciona os candidatos
        List<String> selecionados = selecaoCandidatos(candidatos);
        
        // Imprime os selecionados
        imprimirSelecionados(selecionados);
        
        // Faz as ligações
        for (String candidato : selecionados) {
            entrandoEmContato(candidato);
        }
    }

    // Método para selecionar candidatos
    static List<String> selecaoCandidatos(String[] candidatos) {
        List<String> selecionados = new ArrayList<>();
        int candidatoAtual = 0;

        while (selecionados.size() < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou um salário de R$%.2f%n", candidato, salarioPretendido);

            // Analisando o candidato antes de tomar a decisão
            analisarCandidato(salarioPretendido);

            if (SALARIO_BASE >= salarioPretendido) {
                System.out.printf("Candidato %s selecionado para a vaga.%n", candidato);
                selecionados.add(candidato);
            }

            candidatoAtual++;
        }
        return selecionados;
    }

    // Método para imprimir a lista de candidatos selecionados
    static void imprimirSelecionados(List<String> selecionados) {
        System.out.println("\nLista de candidatos selecionados:");

        for (int i = 0; i < selecionados.size(); i++) {
            System.out.printf("%d - %s%n", i + 1, selecionados.get(i));
        }
    }

    // Método para analisar candidato (com base no salário)
    static void analisarCandidato(double salarioPretendido) {
        if (SALARIO_BASE > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (SALARIO_BASE == salarioPretendido) {
            System.out.println("Ligar para o candidato com uma contraproposta.");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }

    // Método para tentar entrar em contato com um candidato
    static void entrandoEmContato(String candidato) {
        int tentativas = 0;
        boolean atendeu = false;

        while (tentativas < 3 && !(atendeu = atender())) {
            tentativas++;
        }

        if (atendeu) {
            System.out.printf("Conseguimos contato com %s após %d tentativa(s).%n", candidato, tentativas + 1);
        } else {
            System.out.printf("Não conseguimos contato com %s após %d tentativas.%n", candidato, tentativas);
        }
    }

    // Método que simula o salário pretendido de um candidato
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método que simula a tentativa de atender a ligação
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
