package com.booklot.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

	@RequestMapping("/trial")
	public String trialPage() {
		return "Here we are";
	}

}
