package demo;

import java.util.List;

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
	public List<Aluno> getAlunos(){
		return repo.listarTodos();
	}
    
	@RequestMapping(value = "/buscaAluno/{nome}",method=RequestMethod.POST)
	public String buscarAluno(@PathVariable String nome){
		Aluno aluno = null;
	    aluno = repo.buscarAluno(nome);
	    return aluno.getNome();
	}
	
	@RequestMapping(value = "/buscaAluno/{ra}",method=RequestMethod.POST)
	public String buscarAluno(int ra){
		Aluno aluno = null;
	    aluno = repo.buscarAluno(ra);
	    return aluno.getNome();
	}
	@RequestMapping(value = "/buscaAluno/{nome}/{ra}",method=RequestMethod.POST)
	public Aluno buscarAluno(String nome, int ra){
		return repo.buscarAluno(nome, ra);
	}
}
