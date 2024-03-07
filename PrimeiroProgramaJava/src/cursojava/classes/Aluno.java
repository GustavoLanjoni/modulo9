package cursojava.classes;

import java.util.Objects;

/**
 * 
 */
public class Aluno {
	/*Atributos do Aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String matriculaEscolar;
	private String Escola;
	private String nomepai;
	private String nomeMae;
	
	private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
		
	

	public Aluno() {/*Cria os dados na memoria do java Padrão*/
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*Veremos o metodo SETTERS e GETTERS do objeto*/
	/*SETTERS e para adicionar ou receber dados para os atributos*/
	/*GETTERS e para resgatar ou obter o valor do atributo*/
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getMatriculaEscolar() {
		return matriculaEscolar;
	}

	public void setMatriculaEscolar(String matriculaEscolar) {
		this.matriculaEscolar = matriculaEscolar;
	}

	public String getEscola() {
		return Escola;
	}

	public void setEscola(String escola) {
		Escola = escola;
	}

	public String getNomepai() {
		return nomepai;
	}

	public void setNomepai(String nomepai) {
		this.nomepai = nomepai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}	

	
	public double getMediaNota() {
		return  (disciplina.getNota1() + disciplina.getNota2() 
				+ disciplina.getNota3() + disciplina.getNota4()) / 4;
	}
	
	
	/*Método que retorna a media do aluno*/
	
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return "Aluno Aprovado";
		}else {
			return "Aluno Reprevado";
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", matriculaEscolar=" + matriculaEscolar + ", Escola="
				+ Escola + ", nomepai=" + nomepai + ", nomeMae=" + nomeMae + ", disciplina=" + disciplina + "]";
	}

   
	
}