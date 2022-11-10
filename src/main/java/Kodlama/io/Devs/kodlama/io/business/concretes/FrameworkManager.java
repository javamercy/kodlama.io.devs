package Kodlama.io.Devs.kodlama.io.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.kodlama.io.business.abstracts.FrameworkService;
import Kodlama.io.Devs.kodlama.io.business.abstracts.LanguageService;
import Kodlama.io.Devs.kodlama.io.business.requests.framework.CreateFrameworkRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.framework.DeleteFrameworkRequest;
import Kodlama.io.Devs.kodlama.io.business.responses.framework.GetAllFrameworksResponse;
import Kodlama.io.Devs.kodlama.io.business.responses.language.GetByIdLanguageResponse;
import Kodlama.io.Devs.kodlama.io.dataAccess.abstracts.FrameworkRepository;
import Kodlama.io.Devs.kodlama.io.entities.concretes.Framework;
import Kodlama.io.Devs.kodlama.io.entities.concretes.Language;

@Service
public class FrameworkManager implements FrameworkService {

	private FrameworkRepository frameworkRepository;
	private LanguageService languageService;

	@Autowired
	public FrameworkManager(FrameworkRepository frameworkRepository, LanguageService languageService) {

		this.frameworkRepository = frameworkRepository;
		this.languageService = languageService;
	}

	public void add(CreateFrameworkRequest createFrameworkRequest) {

		Framework framework = new Framework();
		framework.setName(createFrameworkRequest.getName());

		GetByIdLanguageResponse languageResponse = this.languageService.getById(createFrameworkRequest.getLanguageId());

		Language languageToMap = new Language();
		languageToMap.setId(languageResponse.getId());
		languageToMap.setName(languageResponse.getName());

		framework.setLanguage(languageToMap);

		this.frameworkRepository.save(framework);

	}

	@Override
	public List<GetAllFrameworksResponse> getAll() {

		List<GetAllFrameworksResponse> getAllFrameworksResponses = new ArrayList<GetAllFrameworksResponse>();

		List<Framework> frameworks = this.frameworkRepository.findAll();

		for (Framework framework : frameworks) {

			GetAllFrameworksResponse responseItem = new GetAllFrameworksResponse();
			responseItem.setId(framework.getId());
			responseItem.setLanguageId(framework.getLanguage().getId());
			responseItem.setName(framework.getName());

			getAllFrameworksResponses.add(responseItem);
		}

		return getAllFrameworksResponses;
	}

	@Override
	public void delete(DeleteFrameworkRequest deleteFrameworkRequest) {

		this.frameworkRepository.deleteById(deleteFrameworkRequest.getId());

	}

}
