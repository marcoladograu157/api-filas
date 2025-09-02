package Aula4;

public class Fila<T> extends EstruturaEstatica<T> {

        public Fila(){

            super();
        }


        public  Fila(int capacidade){
            super( capacidade);
        }
        public  void enfileira(T elemento){

            //this.aumentarCapacidade();
            //this.elementos[this.tamanho] = elemento;
            //this.tamanho++

            this.adiciona(elemento);

        }

        public T espiar (){
            if(this.estaVazio()){
                return null;
            }
            return this.elementos[0];
        }

        public T desenfileira(){
            if( this.estaVazio()){
                return null;
            }
            // criaremos uma constante para isso
            final int POS = 0;

                    T elementoASerRemovido = this.elementos[POS];
            this.remove(POS);
            return elementoASerRemovido;
        }

}
