package demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {
	private AlunoRepo repo = new AlunoRepo();
	
	@RequestMapping(value = "/adicionarAluno/{nome}/{ra}",method=RequestMethod.GET)
	public void criarAluno(@PathVariable String nome, @PathVariable int ra){
		  repo.addAluno(new Aluno(ra,nome));
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
