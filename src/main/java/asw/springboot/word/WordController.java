package asw.springboot.word;



import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestParam; 

import javax.annotation.PostConstruct;

@RestController
public class WordController {

	/* mappa (dei formati) dei saluti nelle diverse lingue */
	private Map<String, Integer> saluti;

	@PostConstruct
	public void init() {
		/* inizializza la mappa dei saluti */
		saluti = new HashMap<>();
		saluti.put("Johnny Depp", 21);
		saluti.put("Scarlet Johansson", 34);
	}

    /* Restituisce Hello, world!
     * acceduta come GET /helloworld */
	@RequestMapping("/helloworld")
	public String helloworld() {
		return "Hello, world!"; 
	}
	
    /* Restituisce un saluto a "name"
     * acceduta come GET /hello/{name} */
	@RequestMapping("/{attore}")
	public Integer hello(@PathVariable String attore) {
		return saluti.get(attore); 
	}

   
	
}