package demo;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepo {

	List<Aluno> repo = new ArrayList<Aluno>();
	
	public void addAluno(Aluno novo){
		repo.add(novo);
	}
	
	public List<Aluno> listarTodos(){
		return this.repo;
	}
	
	public Aluno buscarAluno(String nome){
		Aluno aluno = null;
		for (Aluno al : repo) {
			if(al.getNome().equals(nome)){
				aluno = al;
			}
		}
		return aluno;
	}

	public Aluno buscarAluno(Integer ra){
		Aluno aluno = null;
		for (Aluno al : repo) {
			if(al.getRa().equals(ra)){
				aluno = al;
			}
		}
		return aluno;
	}

	public Aluno buscarAluno(String nome, Integer ra){
		Aluno aluno = null;
		for (Aluno al : repo) {
			if(al.getNome().equals(nome) &&
				al.getRa().equals(ra)){
				
				aluno = al;
			}
		}
		return aluno;
	}
}
