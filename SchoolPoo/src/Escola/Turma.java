package Escola;

import java.util.ArrayList;

public class Turma {
	

	private String sigla;
	private int ano;

	private ArrayList<Aluno>alunos;
	private ArrayList<Professor> professores;
	private ArrayList<Disciplina> disciplinas;
	
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	 public void AdicionarAluno(Aluno aluno){
			alunos.add(aluno);
	}
	 public int quantidadeAlunos() {
		 return alunos.size();
	 }
	 
	 public void excluirAluno(Aluno aluno) {
		 alunos.remove(aluno);
	 }
	
	 public Aluno getAluno(int posicao) {
		 return alunos.get(posicao);
	 }
	 
}
