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
		Aluno novo = new Aluno(nome,ra);  
		repo.addAluno(novo);
	}
	
	@RequestMapping(value ="/listarAlunos",method=RequestMethod.POST)
	public ArrayList getAlunos(){
		
	}
    
	@RequestMapping(value = "/buscaAluno/{nome}")
	public String buscarAluno(@PathVariable String nome){
		Aluno aluno = null;
	    aluno = repo.buscarAluno(nome);
	    return aluno.getNome();
	}
	
	public String buscarAluno(int ra){
		Aluno aluno = null;
	    aluno = repo.buscarAluno(ra);
	    return aluno.getNome();
	}
	public Aluno buscarAluno(String nome, int ra){
		
	}
}
