package Ado;

import java.util.LinkedList;
import java.util.Queue;

public class iFila {

    // Interface que define os métodos da fila
    interface IFila {
        void adicionar(String nome, boolean prioritario);
        String proximo();
        void listar();
        boolean vazia();
    }

    // Classe Fila (única responsável por controlar tudo)
    static class Fila implements IFila {
        private Queue<String> filaNormal = new LinkedList<>();
        private Queue<String> filaPrioritaria = new LinkedList<>();
        private int contadorPrioritarios = 0;
        private static final String REGEX_NOME = "^[\\p{L}][\\p{L}\\s'\\-]*[\\p{L}]$";

        @Override
        public void adicionar(String nome, boolean prioritario) {
        if (nome == null || nome .trim().isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser vazio !");
        }

        if (prioritario) {
                filaPrioritaria.add(nome + " (PRIORITÁRIO)");
            } else {
                filaNormal.add(nome + " (Normal)");
            }
            System.out.println("Adicionado: " + nome + (prioritario ? " (PRIORITÁRIO)" : " (Normal)"));
        }

        @Override
        public String proximo() {
            if (filaNormal.isEmpty() && filaPrioritaria.isEmpty()){
                throw new IllegalArgumentException("Não a pacientes na fila!");
            }

            if (filaNormal.isEmpty() && filaPrioritaria.isEmpty()) {
                return "Nenhum paciente na fila.";
            }

            // Regra de 3 prioritários para 1 normal
            if (!filaPrioritaria.isEmpty() && (contadorPrioritarios < 3 || filaNormal.isEmpty())) {
                contadorPrioritarios++;
                return "Chamando: " + filaPrioritaria.poll();
            } else if (!filaNormal.isEmpty()) {
                contadorPrioritarios = 0; // reseta contador
                return "Chamando: " + filaNormal.poll();
            } else {
                return "Chamando: " + filaPrioritaria.poll();
            }
        }

        @Override
        public void listar() {
            System.out.println("Fila Prioritária: " + filaPrioritaria);
            System.out.println("Fila Normal: " + filaNormal);
        }

        @Override
        public boolean vazia() {
            return filaNormal.isEmpty() && filaPrioritaria.isEmpty();
        }
    }


}
