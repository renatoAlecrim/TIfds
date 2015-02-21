package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {
	private AlunoRepo repo = new AlunoRepo();
	
	@RequestMapping(value = "/addAluno{nome}{ra}",method=RequestMethod.GET)
	public void addAluno(){
	   String nome;
	   int ra;
	   Aluno novo = new Aluno(ra,nome);
	   repo.addAluno(novo);	   
	}
	
	public ArrayList getAlunos(){
		
	}

	public Aluno buscarAluno(String nome){
		
	}
	
	public Aluno buscarAluno(int ra){
		
	}
	public Aluno buscarAluno(String nome, int ra){
		
	}
}
