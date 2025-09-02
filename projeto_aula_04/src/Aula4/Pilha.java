package Aula4;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public  void empilha(T elemento){
        // Dessa forma estamos reutilizando o códicon classe pai que foi criado a herança
        super.adiciona(elemento);
    }



}
