package ecommerce;

import java.util.Scanner;

public class Menu {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);

			int opcao;

			while (true) {

				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("             Vic's Acessórios                        ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Sacola                               ");
				System.out.println("            2 - Escolher Produto                     ");     
				System.out.println("            3 - Finalizar                            ");
				System.out.println("            4 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     ");

				opcao = leia.nextInt();

				if (opcao == 4) {
					System.out.println("\nEscolha e leve!");
					sobre();
				}

				switch (opcao) {
					case 1:
						System.out.println("Ver Sacola\n");

						break;
					case 2:
						System.out.println("Escolher Produto\n");

						break;
					case 3:
						System.out.println("Finalizar\n");

						break;
					case 4:
						System.out.println("Sair\n");

					
					default:
						System.out.println("\nOpção Inválida!\n");
						break;
				}
			}
		}
	    
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: ");
			System.out.println("Generation Brasil - generation@generation.org");
			System.out.println("github.com/conteudoGeneration");
			System.out.println("*********************************************************");
		}
	}

