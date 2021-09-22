package application;

import Escola.Disciplina;
import Escola.Professor;

public class AssociacaoMuitosparaMuitos {
	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Matematica");
		disciplina1.setCargaHoraria(80);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Portugu�s");
		disciplina2.setCargaHoraria(80);
		
		Professor professor1 = new Professor();
		professor1.setNome("J�o");
		professor1.setMatricula(123);
		professor1.setFormacaoAcademica("Licenciado");
		professor1.setSalario(10);
		
		Professor professor2 = new Professor();
		professor2.setNome("Maria");
		professor2.setMatricula(999);
		professor2.setFormacaoAcademica("Licenciado");
		professor2.setSalario(30);
		
		//rela��o J�o com matematica
		professor1.adicionalDisciplina(disciplina1);
		disciplina1.adicionarProfessor(professor1);
		//rela��o J�o com portugues
		professor1.adicionalDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor1);
		
		//rela��o Maria com portugues
		professor2.adicionalDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor2);
		
		//Listar as disciplinas do professor J�o
		System.out.println("\n\nDisciplionas do J�o");
		for(int i=0; i < professor1.quantiudadeDisciplinas(); i++) {
			//Disciplina disciplina = professor1.getDisciplina(i);
			//System.out.println(disciplina.getNome());
			System.out.println(professor1.getDisciplina(i).getNome());
		}
		// Listar os professores de disciplinas Portugues
		System.out.println("\n\nProfessores de portugu�s");
		for(int i=0; i < disciplina2.quantidadePrfessores(); i++ ) {
			System.out.println(disciplina2.getProfessor(i).getNome());
		}
	}
}
