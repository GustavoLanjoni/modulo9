package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
    public static void main(String[] args) {
    	
    	
    	String nome = JOptionPane.showInputDialog("Qual o nome da aluno?");
    	String idade = JOptionPane.showInputDialog("Qual sua idade?");
    	String nascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");
    	String rg = JOptionPane.showInputDialog("Qual seu RG?");
    	String cpf = JOptionPane.showInputDialog("Qual seu CPF?");
    	String matricula = JOptionPane.showInputDialog("Qual a data da matricula escolar?");
    	String escola = JOptionPane.showInputDialog("Qual o nome da  escola?");
    	String mae = JOptionPane.showInputDialog("Qual nome da sua mâe?");
    	String pai = JOptionPane.showInputDialog("Qual nome do seu pai?");
    	
    	String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
    	String nota1 = JOptionPane.showInputDialog("Qual sua nota1?");
    	
    	String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
    	String nota2 = JOptionPane.showInputDialog("Qual sua nota2?");
    	
    	String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
    	String nota3 = JOptionPane.showInputDialog("Qual sua nota3?");
    	
    	String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
    	String nota4 = JOptionPane.showInputDialog("Qual sua nota4?");
    	
    	
    	
    	
        /* new Aluno() é uma instancia (Criação de objeto) */
        Aluno aluno1 = new Aluno();
        
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(nascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setMatriculaEscolar(matricula);
        aluno1.setEscola(escola);
        aluno1.setNomeMae(mae);
        aluno1.setNomepai(pai);
        
      
        	
        
        
        /*Descrição de um obejto na memoria*/
		
		System.out.println(aluno1.toString());
		System.out.println("Meida do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado());
    	
    	
    	
    	
    	
		
        
        
    }
}
