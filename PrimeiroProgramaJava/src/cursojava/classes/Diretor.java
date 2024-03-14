package cursojava.classes;

/*Classe filha de pessoa que extende de pessoa*/

public class Diretor extends Pessoa	 {
	
	private String registroEducaao;
	private int tempoDirecao;
	private String titulacao;
	
	
	
	public String getRegistroEducaao() {
		return registroEducaao;
	}
	public void setRegistroEducaao(String registroEducaao) {
		this.registroEducaao = registroEducaao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
	@Override
	public String toString() {
		return "Diretor [registroEducaao=" + registroEducaao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomepai=" + nomepai
				+ ", nomeMae=" + nomeMae + "]";
	}
	
	

}
