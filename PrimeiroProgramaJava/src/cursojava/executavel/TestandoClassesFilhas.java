package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo ");	
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("48753468");
		diretor.setIdade(65);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Programador");
		secretario.setIdade(25);
				
				System.out.println(aluno);
				System.out.println(diretor);
				System.out.println(secretario);
				
		
		System.out.println(aluno.pessoaMaiorIdade() + " " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
				
	}

}
