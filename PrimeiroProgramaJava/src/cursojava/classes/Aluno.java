package cursojava.classes;

import java.util.Objects;

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
	
	
	
	double nota1;
	private String disciplina1;
	double nota2;
	private String disciplina2;
	double nota3;
	private String disciplina3;
	double nota4;
	private String disciplina4;
	
	
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public String getDisciplina2() {
		return disciplina2;
	}

	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}

	public String getDisciplina3() {
		return disciplina3;
	}

	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}

	public String getDisciplina4() {
		return disciplina4;
	}

	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}

	public double getMediaNota() {
		return  (nota1 + nota2 + nota3 + nota4) /4;
	}
	
	
	/*Método que retorna a media do aluno*/
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", matriculaEscolar=" + matriculaEscolar + ", Escola="
				+ Escola + ", nomepai=" + nomepai + ", nomeMae=" + nomeMae + ", nota1=" + nota1 + ", disciplina1="
				+ disciplina1 + ", nota2=" + nota2 + ", disciplina2=" + disciplina2 + ", nota3=" + nota3
				+ ", disciplina3=" + disciplina3 + ", nota4=" + nota4 + ", disciplina4=" + disciplina4 + "]";
	}

	
	

	

	
	
	
	
	
	
}
