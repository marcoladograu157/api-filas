package Aula4;

public class Lista<T> extends EstruturaEstatica<T> {

    // Método construtor com parametros o super porque está herdando ...
    public Lista(int capacidade) {
        super(capacidade);
    }

    // Método Construtor sem parametro
    public Lista() {
        super();
    }

    @Override
    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        // desloca elementos para a direita
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }

        elementos[posicao] = elemento;
        tamanho++;

        return true;
    }

}
