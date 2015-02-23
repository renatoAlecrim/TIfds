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
	
	@RequestMapping(value = "/addAluno/{nome}/{ra}",method=RequestMethod.POST)
	public String criarAluno(@PathVariable String nome, @PathVariable int ra){
		Aluno novo = new Aluno(nome,ra);  
		repo.addAluno(novo);
		return "Sucesso!";
	}
	
	@RequestMapping(value ="/listarAlunos",method=RequestMethod.GET)
	public List<Aluno> getAlunos(){
		return repo.listarTodos();
	}
    
	@RequestMapping(value = "/buscaNome/{nome}",method=RequestMethod.GET)
	public Aluno buscarAluno(@PathVariable String nome){
		Aluno aluno = null;
	    aluno = repo.buscarAluno(nome);
	    return aluno;
	}
	
	@RequestMapping(value = "/buscaRa/{ra}",method=RequestMethod.GET)
	public Aluno buscarAluno(@PathVariable Integer ra){
		Aluno aluno = null;
	    aluno = repo.buscarAluno(ra);
	    return aluno;
	}
	@RequestMapping(value = "/buscaAluno/{nome}/{ra}",method=RequestMethod.GET)
	public Aluno buscarAluno(@PathVariable String nome, @PathVariable Integer ra){
		Aluno aluno = repo.buscarAluno(nome, ra);
		return aluno;
	}
}