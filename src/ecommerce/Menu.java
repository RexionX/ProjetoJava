package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.model.Carrinho;
import ecommerce.model.Produto;

public class Menu {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);
			Carrinho carrinho = new Carrinho();
			
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
				}

				switch (opcao) {
					case 1:
						System.out.println("Ver Sacola\n");
						
						break;
					case 2:
						System.out.println("Escolher Produto\n");
						System.out.println("Colocar no Carrinho\n\n");
						escolherProduto();
						
	                    int produtoEscolhido;
	                    
	                    try {
	                        produtoEscolhido = leia.nextInt();
	                    }catch (InputMismatchException e) {
	                        System.out.println("Por favor, insira um número válido");
	                        leia.nextLine();
	                        continue;
	                    }
	                    adicionarProdutoAoCarrinho(carrinho, produtoEscolhido);
	                    

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
				
				private static int lerOpcao() {
			        try {
			            return leia.nextInt();
			        } catch (InputMismatchException e) {
			            System.out.println("Por favor, insira um número válido");
			            leia.nextLine();
			            
			            return -1;
			        }
			            
				    public static void escolherProduto() {
				        System.out.println("Produtos Disponíveis:");
				        System.out.println("1 - Colar R$60");
				        System.out.println("2 - Pulseira R$40");
				        System.out.println("3 - Brinco R$30");
				        System.out.println("0 - Voltar");

				        int escolhaProduto = leia.nextInt();

				        private static void adicionarProdutoAoCarrinho(Carrinho carrinho, int escolhaProduto) {
				        switch (escolhaProduto) {
				            case 1:
				                carrinho.adicionarItem(new Produto("Colar", 60.0));
				                break;
				            case 2:
				                carrinho.adicionarItem(new Produto("Pulseira", 40.0));
				                break;
				            case 3:
				                carrinho.adicionarItem(new Produto("Brinco", 30.0));
				                break;
				            case 0:
				                break;
				            default:
				                System.out.println("Opção Inválida!");
				        }
				    }

				    public static void finalizarCompra() {
				        carrinho.finalizarCompra();
				        sobre();
				        sair();
				    }

				    public static void sair() {
				        System.out.println("\nEscolha e leve!");
				        System.exit(0);
				    }
			
		}
	    



