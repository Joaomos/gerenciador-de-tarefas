package gerenciadorDeTarefas;

public class Tarefa {

	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}
	
	public void marcarConcluida() {
		this.concluida = true;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public boolean isConcluida() {
		return concluida;
	}
	 
	public String toString() {
		return (concluida ? "[✔]" : "[ ]") + descricao;
	}
}
