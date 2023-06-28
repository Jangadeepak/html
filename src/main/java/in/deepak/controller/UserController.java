package in.deepak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String loadhomepage() {
		
		
		return "home";
		
	}
 
	
	@GetMapping("/index")
	public String loadindex() {
		
		
		return "index";
	}
	
	@GetMapping("/load")
	public String loaddata() {
		
		
		return "data";
	}
	
}
