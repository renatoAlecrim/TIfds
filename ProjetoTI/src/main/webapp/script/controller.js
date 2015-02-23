	function enviarLink(metodo){
		var url = "http://localhost:8080/alunos/"+metodo+"/"+document.getElementById('nome').value+"/"+
		document.getElementById('ra').value;
		var req = new XMLHttpRequest();
		req.open("GET", url,true);
		req.send(null);
	}
	
	function add() {
		enviarLink("addAluno")
	}

	function busca() {
		var name = document.getElementById('nome').value;
		var ra = document.getElementById('ra').value;
		if(name==null){
			enviarLink("buscaRa");
		}else{
			if(ra==null){
				enviarLink("buscaNome")
			}else{
				enviarLink("buscaAluno");
			}
		}
	}
	
	function todos() {
		var url = "http://localhost:8080/alunos/listarAlunos"
		var req = new XMLHttpRequest();
		req.open("GET", url,true);
		req.send(null);
	}
