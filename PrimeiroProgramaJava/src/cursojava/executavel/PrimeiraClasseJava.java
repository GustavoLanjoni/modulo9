package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.naming.ldap.HasControls;
import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
    public static void main(String[] args) {
    	
    	String usuario = JOptionPane.showInputDialog("Infome login");    	
    	String senha = JOptionPane.showInputDialog("Infome o senha");
    	
    	if (usuario.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
    	
    	
    	List<Aluno> alunos = new ArrayList<Aluno>();
    	
    	/*E uma lista também que dentro dela temos uma chave que indentifica uma sequencia de valores também*/
    	HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
    	
    
    	
    	/*Define a quantidade de alunos*/
    	
    	for (int qtd = 1; qtd <=3; qtd++) {
    	
    	String nome = JOptionPane.showInputDialog("Qual o nome da aluno?"+qtd+"");
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
        
             /*Define a quantidade de discplina*/
        
       for (int pos = 1; pos <= 1; pos++) {
    	   String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
    	   String notaDisciplina = JOptionPane.showInputDialog("Nota da diciplina "+pos+	" ");
    	   
    	   Disciplina disciplina = new Disciplina();
    	   disciplina.setDisciplina(nomeDisciplina);
    	   disciplina.setNota(Double.valueOf(notaDisciplina));
    	   
    	   aluno1.getDisciplinas().add(disciplina);
       }
       /*Remover uma disciplina*/
        
       int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
       		if (escolha == 0) {/*Opção 	Sim e Zero*/
       			
       			int continuarRemover = 0;
       			while(continuarRemover == 0) {
       			
       			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
       			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
       			continuarRemover = JOptionPane.showConfirmDialog(null,"Continue removendo");
       			
       			
       			
       			    
       		    }
       		}
       		alunos.add(aluno1);
    	}   
    	
    	maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
    	maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
    	maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
    	
    	
    	for (Aluno aluno : alunos) {/*Separado em listas*/
    		if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
    			maps.get(StatusAluno.APROVADO).add(aluno);
    			
    		}else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
    			maps.get(StatusAluno.RECUPERACAO).add(aluno);
    		}else  {
    			maps.get(StatusAluno.REPROVADO).add(aluno);
    		}
    	}
    	
    	System.out.println("------------------- Lista dos aprovados -------------------");
    	for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
    		System.out.println(aluno.getNome() + " " + "Resultado: " + aluno.getAlunoAprovado() + "Com media de: " + " " + " " + aluno.getMediaNota());
    	}
    	System.out.println("------------------- Lista dos Recuperação -------------------");
    	for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
    		System.out.println(aluno.getNome() + " " + "Resultado: " + aluno.getAlunoAprovado() + "Com media de:  " + " " + aluno.getMediaNota());
    	}
    	System.out.println("------------------- Lista dos Reprovados -------------------");
    	for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
    		System.out.println(aluno.getNome() + " " + "Resultado: " + aluno.getAlunoAprovado() + "Com media de: " + " " + aluno.getMediaNota());
    	}
     }
   }
}
