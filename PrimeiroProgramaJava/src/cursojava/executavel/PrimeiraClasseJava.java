package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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
        
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de dados");
        disciplina1.setNota(80);
        	
        aluno1.getDisciplinas().add(disciplina1);
        
        /*=========================================*/   
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Html5");
        disciplina2.setNota(90);
        
        aluno1.getDisciplinas().add(disciplina2);
        
        /*=========================================*/    
        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Matematica");
        disciplina3.setNota(90);
        
        aluno1.getDisciplinas().add(disciplina3);
        
        /*=========================================*/   
        
        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Geografia");
        disciplina4.setNota(100);
        
        aluno1.getDisciplinas().add(disciplina4);
        
        /*=========================================*/  
        
        
        /*Descrição de um obejto na memoria*/
		
		System.out.println(aluno1.toString());
		System.out.println("Meida do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado());
    	
    	
    	
    	
    	
		
        
        
    }
}
