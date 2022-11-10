package Kodlama.io.Devs.kodlama.io.webAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.kodlama.io.business.abstracts.FrameworkService;
import Kodlama.io.Devs.kodlama.io.business.requests.framework.CreateFrameworkRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.framework.DeleteFrameworkRequest;
import Kodlama.io.Devs.kodlama.io.business.responses.framework.GetAllFrameworksResponse;

@RestController
@RequestMapping("/api/frameworks")
public class FrameworksController {

	private FrameworkService frameworkService;

	@Autowired
	public FrameworksController(FrameworkService frameworkService) {

		this.frameworkService = frameworkService;
	}

	@GetMapping("/getall")
	public List<GetAllFrameworksResponse> getAll() {

		return this.frameworkService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateFrameworkRequest createFrameworkRequest) {

		this.frameworkService.add(createFrameworkRequest);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody DeleteFrameworkRequest deleteFrameworkRequest) {

		this.frameworkService.delete(deleteFrameworkRequest);
	}

}
