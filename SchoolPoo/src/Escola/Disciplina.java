package Escola;

import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private int cargaHoraria;
	private ArrayList<Professor> professores;
	private ArrayList<Turma> turmas;
	
	public Disciplina() {
		professores = new ArrayList<Professor>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria >= 0) {
			this.cargaHoraria = cargaHoraria;
		}
	}
	public void adicionarProfessor(Professor professor ) {
		professores.add(professor);
	}
	
	
	public void excluirProfessor(Professor professor) {
		professores.remove(professor);
	}
	
	public int quantidadePrfessores() {
		return professores.size();
	}

	public Professor getProfessor(int posicao) {
		return professores.get(posicao);
	}
}
