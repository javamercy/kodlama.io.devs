package Kodlama.io.Devs.kodlama.io.webAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.kodlama.io.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.kodlama.io.core.utilities.results.DataResult;
import Kodlama.io.Devs.kodlama.io.core.utilities.results.Result;
import Kodlama.io.Devs.kodlama.io.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {

		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public DataResult<List<ProgrammingLanguage>> getAll() {
		
		
		return this.languageService.getAll();
	}

	@GetMapping("/getbyid")
	public DataResult<ProgrammingLanguage> getById(@RequestParam int id) {

		return this.languageService.getById(id);
	}

	@PostMapping("/add")
	public Result add(@RequestBody ProgrammingLanguage language){

		return this.languageService.add(language);
	}

	@PostMapping("/delete")
	public Result delete(@RequestBody ProgrammingLanguage language) {

		return this.languageService.delete(language);
	}

	@PostMapping("/update")
	public Result update(@RequestBody ProgrammingLanguage language) {

		return this.languageService.update(language);
	}

}
