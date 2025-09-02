package Ado;

import java.util.Scanner;

public class testeFilaHospital {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                iFila.Fila fila = new iFila.Fila();
                int opcao;

                do {
                    System.out.println("\n--- MENU ---");
                    System.out.println("1 - Adicionar Paciente");
                    System.out.println("2 - Chamar próximo");
                    System.out.println("3 - Listar filas");
                    System.out.println("0 - Sair");
                    System.out.print("Escolha: ");
                    opcao = sc.nextInt();
                    sc.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.print("Nome do paciente: ");
                            String nome = sc.nextLine();
                            System.out.print("É prioritário? (s/n): ");
                            char resp = sc.nextLine().toLowerCase().charAt(0);
                            fila.adicionar(nome, resp == 's');
                            try {
                                fila.adicionar(nome,resp == 's');
                            }catch (IllegalArgumentException e){
                                System.out.println("Erro"+e.getMessage());
                            }

                            break;

                        case 2:
                            try {
                                System.out.println(fila.proximo());
                            }catch (IllegalStateException e){
                                System.out.println("Erro"+e.getMessage());
                            }
                            System.out.println(fila.proximo());
                            break;

                        case 3:
                            fila.listar();
                            break;

                        case 0:
                            System.out.println("Encerrando...");
                            break;

                        default:
                            System.out.println("Opção inválida!");
                    }
                } while (opcao != 0);

                sc.close();
            }
        }


