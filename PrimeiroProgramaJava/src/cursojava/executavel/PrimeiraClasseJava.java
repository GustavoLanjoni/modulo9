package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
    public static void main(String[] args) {
    	
    	
    	String nome = JOptionPane.showInputDialog("Qual o nome da aluno?");
    	/*String idade = JOptionPane.showInputDialog("Qual sua idade?");
    	String nascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");
    	String rg = JOptionPane.showInputDialog("Qual seu RG?");
    	String cpf = JOptionPane.showInputDialog("Qual seu CPF?");
    	String matricula = JOptionPane.showInputDialog("Qual a data da matricula escolar?");
    	String escola = JOptionPane.showInputDialog("Qual o nome da  escola?");
    	String mae = JOptionPane.showInputDialog("Qual nome da sua mâe?");
    	String pai = JOptionPane.showInputDialog("Qual nome do seu pai?");*/
    	
  
    	
        /* new Aluno() é uma instancia (Criação de objeto) */
        Aluno aluno1 = new Aluno();
        
        aluno1.setNome(nome);
        /*aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(nascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);	
        aluno1.setMatriculaEscolar(matricula);
        aluno1.setEscola(escola);
        aluno1.setNomeMae(mae);
        aluno1.setNomepai(pai);*/
        
        
       for (int pos = 1; pos <= 4; pos++) {
    	   String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
    	   String notaDisciplina = JOptionPane.showInputDialog("Nota da diciplina "+pos+	" ");
    	   
    	   Disciplina disciplina = new Disciplina();
    	   disciplina.setDisciplina(nomeDisciplina);
    	   disciplina.setNota(Double.valueOf(notaDisciplina));
    	   
    	   aluno1.getDisciplinas().add(disciplina);
       }
       /*Remover uma disciplina*/
        
       int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
       		if (escolha == 0) {
       			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
       			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
       		
       		}
       		
        
        
        /*Descrição de um obejto na memoria*/
		
		System.out.println(aluno1.toString());
		System.out.println("Meida do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado());
    	
    	
    	
    	
    	
		
        
        
    }
}
