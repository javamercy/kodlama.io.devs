package Kodlama.io.Devs.kodlama.io.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.kodlama.io.business.abstracts.LanguageService;
import Kodlama.io.Devs.kodlama.io.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.DeleteLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.kodlama.io.business.responses.SingleLanguageResponse;
import Kodlama.io.Devs.kodlama.io.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.kodlama.io.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {

		if (checkIfNameEmpty(createLanguageRequest)) {

		}

		if (checkIfNameExists(createLanguageRequest)) {

		}

		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		this.languageRepository.save(language);

	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {

	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {

	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {

		List<Language> languages = this.languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<GetAllLanguagesResponse>();

		for (Language language : languages) {

			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();

			responseItem.setId(language.getId());
			responseItem.setName(language.getName());

			languagesResponse.add(responseItem);
		}

		return languagesResponse;

	}

	@SuppressWarnings("deprecation")
	@Override
	public SingleLanguageResponse getById(int id) {

		SingleLanguageResponse singleLanguageResponse = new SingleLanguageResponse();

		singleLanguageResponse.setName(languageRepository.getById(id).getName());
		singleLanguageResponse.setId(languageRepository.getById(id).getId());

		return singleLanguageResponse;

	}

	private boolean checkIfNameExists(CreateLanguageRequest createLanguageRequest) {

		for (var languageToCheck : this.languageRepository.findAll()) {
			if (languageToCheck.getName().equals(createLanguageRequest.getName())) {

				return true;
			}
		}

		return false;
	}

	private boolean checkIfNameEmpty(CreateLanguageRequest createLanguageRequest) {

		return createLanguageRequest.getName().isBlank();

	}

}
