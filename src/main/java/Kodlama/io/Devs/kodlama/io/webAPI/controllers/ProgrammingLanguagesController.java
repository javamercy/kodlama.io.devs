package Kodlama.io.Devs.kodlama.io.webAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.kodlama.io.business.abstracts.ProgrammingLanguageService;
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
	public List<ProgrammingLanguage> getAll() {

		return languageService.getAll();
	}

	@GetMapping("/getbyid{id}")
	public ProgrammingLanguage getById(@PathVariable(value = "id") int id) {

		return languageService.getById(id);
	}

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void add(@RequestBody ProgrammingLanguage language) throws Exception {

		languageService.add(language);
	}

	@PostMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@RequestBody ProgrammingLanguage language) {

		languageService.delete(language);
	}

	@PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody ProgrammingLanguage language) {

		languageService.update(language);
	}

}
