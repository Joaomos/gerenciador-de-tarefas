package gerenciadorDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Tarefa> tarefas = new ArrayList<>();
		int opcao;
		
		do {
			System.out.println("\n=== Gerenciador de Tarefas ===");
			System.out.println("1. Adcionar Tarefa");
			System.out.println("2. Listar Tarefa");
			System.out.println("3. Marcar Tarefa como concluída");
			System.out.println("4. Remover Tarefa");
			System.out.println("5. Sair");
			
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcao) {
			case 1: 
				System.out.println("Digite a descrição da tarefa: ");
				String descricao = entrada.nextLine();
				tarefas.add(new Tarefa(descricao));
				System.out.println("Tarefa adicionada com sucesso!");
				break;
				
			case 2:
				System.out.println("\n=== Lista de Tarefas ===");
				if(tarefas.isEmpty()) {
					System.out.println("Nenhuma tarefa cadastrada.");
				} else {
					for (int i = 0; i < tarefas.size(); i++) {
						System.out.println((i + 1) + ". " + tarefas.get(i));
					}
				}
				break;
				
			case 3:
				System.out.println("Digite o número da tarefa concluída: ");
				int numConcluir = entrada.nextInt();
				if (numConcluir > 0 && numConcluir <= tarefas.size()) {
                    tarefas.get(numConcluir - 1).marcarConcluida();
                    System.out.println("Tarefa marcada como concluída!");
                } else {
                    System.out.println("Número inválido.");
                }
				break;
				
			case 4:
				System.out.println("Digite o número da tarefa a ser removida: ");
				int numRemover = entrada.nextInt();
				if (numRemover > 0 && numRemover <= tarefas.size()) {
					tarefas.remove(numRemover - 1);
					System.out.println("Tarefa removida com sucesso!");
				} else {
					System.out.println("Número inválido.");
				}
				break;
				
			case 5:
				System.out.println("Programa encerrado!");
				break;
				
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while(opcao != 5);
		
		entrada.close();
	}
}
