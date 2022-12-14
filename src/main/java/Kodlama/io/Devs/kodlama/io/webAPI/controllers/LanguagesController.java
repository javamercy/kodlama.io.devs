package Kodlama.io.Devs.kodlama.io.webAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.kodlama.io.business.abstracts.LanguageService;
import Kodlama.io.Devs.kodlama.io.business.requests.language.CreateLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.language.DeleteLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.language.UpdateLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.responses.language.GetAllLanguagesByDetailsResponse;
import Kodlama.io.Devs.kodlama.io.business.responses.language.GetAllLanguagesResponse;
import Kodlama.io.Devs.kodlama.io.business.responses.language.GetByIdLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {

		this.languageService = languageService;
	}

	@GetMapping("/getallbydetails")
	public List<GetAllLanguagesByDetailsResponse> getAllByDetails() {

		return this.languageService.getAllByDetails();
	}

	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll() {

		return this.languageService.getAll();
	}

	@GetMapping("/getbyid")
	public GetByIdLanguageResponse getById(@RequestParam int id) {

		return this.languageService.getById(id);
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateLanguageRequest createLanguageRequest) throws Exception {

		this.languageService.add(createLanguageRequest);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody DeleteLanguageRequest deleteLanguageRequest) {

		this.languageService.delete(deleteLanguageRequest);
	}

	@PostMapping("/update")
	public void update(@RequestBody UpdateLanguageRequest updateLanguageRequest) {

		this.languageService.update(updateLanguageRequest);
	}

}
