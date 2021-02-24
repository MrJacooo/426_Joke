package ch.bbw.jokebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.bbw.jokebook.service.DatabaseService;

@Controller
public class MainController {

	private DatabaseService databaseService;

	@Autowired
	public MainController(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}
	
	@GetMapping("/")
	public String homepage(Model model) {
		model.addAttribute("jokelist", databaseService.getJokes());
		return "index";
	}

}
