package colecao;

import java.util.Scanner;
import repositorios.ListaRepositorioAmostraBiologica;

public class TesteAmostraBiologica {

	public static void main(String[] args) {

		// Scanner para receber dados do Teclado
		Scanner teclado = new Scanner(System.in);

		// Repositórios
		ListaRepositorioAmostraBiologica repAmoBio = new ListaRepositorioAmostraBiologica();

		// Programa - Main

		String opcaoLoopMenu = "Ativo"; // O uso de String facilita para controlar exceções caso o usuário digite uma
										// informação inválida. (Mas o ideal seria usar o Try/Catch)

		while (opcaoLoopMenu != "0") {
			System.out.println("1 - Cadastrar Amostra | 2 - Listar Amostrar | 0 - SAIR \n");
			System.out.print("Informe a Opção Desejada: ");
			opcaoLoopMenu = teclado.next();
			switch (opcaoLoopMenu) {
			case "1":
				teclado.nextLine();
				System.out.println("Cadastrando Amostras Biológicas: \n");
				System.out.println("Informe o Nome Científico da Amostra: ");
				String nomeCientifico = teclado.nextLine();
				System.out.println("Informe o Número de Catálogo da Amostra: ");
				int numeroCatalogo = teclado.nextInt();
				System.out.println("Informe o Número do Exemplares da Amostra: ");
				int numeroExemplares = teclado.nextInt();
				AmostraBiologica amBio = new AmostraBiologica(nomeCientifico, numeroCatalogo, numeroExemplares);
				repAmoBio.addAmostra(amBio);
				break;
			case "2":
				System.out.println("\nLista de Amostras Biológicas Cadastradas: \n");
				repAmoBio.listAmostra();
				System.out.println("\n<--- FIM da Lista ---> \n");
				break;
			case "0":
				System.out.println("\nFinalizando Sistema! Até Mais.");
				opcaoLoopMenu = "0";
				break;
			default:
				System.out.println("\nOpção Inválida! Favor digitar uma Opção do Menu: \n");
				break;
			}
		}
	}

}
