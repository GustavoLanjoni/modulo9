package cursojava.classes;

import java.util.Objects;

/*Essa classe Disciplina servira para todos os objetos e instancias de notas e materias*/
public class Disciplina {
	
	double nota;
	private String disciplina;
	
	/*SETTER e GETTER*/
	
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	/*Equals e hashCode*/
	
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	 /*ToString()*/
	
		
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}
	
	
	
	
	
	

}
