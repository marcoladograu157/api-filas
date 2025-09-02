package Aula4;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import java.util.Collection;
public class main {
    public static void main(String[] args) {
        Queue<Integer> fila = new Queue<>() {
            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return 0;
            }

            @Override
            public Integer poll() {
                return 0;
            }

            @Override
            public Integer element() {
                return 0;
            }

            @Override
            public Integer peek() {
                return 0;
            }

            @Override
            public int size() {
                throw new UnsupportedOperationException("Not supported yet.");
//To change body of generated methods, choose Tools | Templates.

        /*
        Fila<Integer> fila = new Fila<Integer> () ;
        fila.enfileira (1);
        fila.enfileira (2);
        fila.enfileira (3);


      Stack<Integer> stack = new Stack<Integer>();

        //Método/ API STACK Teste

        System.out.println(stack.isEmpty());
        //Método para empilhar

        stack.push(1);
        stack.push(2);
        stack.push(3);

        //Método para verificar o tamanho

        System.out.println(stack.size());

        //Método toString para exibir a pilha
        System.out.println(stack);

        //Método para verificar o topo
        System.out.println((stack.peek()));

        //Método para desempliar
        System.out.println(stack.pop());

        //Método toString para exibir a pilha
        System.out.println(stack);


        // para espiar a fila
        System.out.println(fila.espiar());
            if(fila.espiar()== null){
                System.out.println("Ninguem esta na fila");
            } else {
              System.out.println("o elemento da primeira posição é " + fila.espiar());
          }


        System. out.println (fila.toString () );

// Vamos desenfileirar um elemento
        System. out.println (fila.desenfileira () ) ;

        System.out.println(fila.toString());
//Vamos visualizar a fila novamente apos remover um elemento

         */
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }
        };
    }
}