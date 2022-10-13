package com.spring2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class wellcomeController {

	@RequestMapping(value="/hey")
	public String wellcome() {
		
	
		return "hey User";
		
	} 
	
}
