package demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/app")
public class AppController {
	
	@RequestMapping(value="/hello")
	public String sayHello(){
		return 	"Hello World";

	}
	
	@RequestMapping(value="/hello/{var}", method=RequestMethod.GET)
	public String sayHello(@PathVariable String var){
		return 	"Hello "+var;

	}
}
