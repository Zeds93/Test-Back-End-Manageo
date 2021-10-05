package com.example.testBackEnd.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
		@RequestMapping("/")
		@ResponseBody
		public String index() {
			
			return "Saisir un nombre a partir de 1";
			
		}

		@RequestMapping("/{nombre}")
		@ResponseBody
		public Map<Integer,String> afficheFizzBuzz(@PathVariable int nombre) {
			
			HashMap<Integer, String> json = new HashMap<>();
			
			if (nombre <= 0) {
				
				json.put(nombre, "Saisir un nombre valide");

				
			} else {
				
				for (int i = 1; i <= nombre ; i++) { //On fais une boucle que pars de 1 jusq au nombre saisi
					
					if (i%3 == 0 && i%5 == 0){ //Si le nombre est divisible par 3 et 5 on affiche "FizzBuzz"
						
						json.put(i, "FizzBuzz"); 
						
					} else if (i%3 == 0) { //Si le nombre est divisible par 3  affiche "Fizz"
						
						json.put(i, "Fizz"); 
														
					} else if (i%5 == 0) { //Si le nombre est divisible par 5  affiche "Buzz"
						
						json.put(i, "Buzz"); 
						
					} else { //Si le nombre n'est pas divisible ni par 3 ni par 5
						
						json.put(i, ""); 
						
					}
					
				}
				
			}
			
			return json;
		}
		


}
