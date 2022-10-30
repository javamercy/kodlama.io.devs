package Kodlama.io.Devs.kodlama.io.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.kodlama.io.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.kodlama.io.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.kodlama.io.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public void add(ProgrammingLanguage language) throws Exception {

		if (checkIfNameEmpty(language)) {
			throw new Exception("Name cannot be empty!");
		}

		if (checkIfNameExists(language)) {

			throw new Exception("Name already exists!");
		}

		languageRepository.add(language);

	}

	@Override
	public void delete(ProgrammingLanguage language) {

		languageRepository.delete(language);

	}

	@Override
	public void update(ProgrammingLanguage language) {

		languageRepository.update(language);

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return languageRepository.getById(id);
	}

	private boolean checkIfNameExists(ProgrammingLanguage language) {

		for (var languageToCheck : languageRepository.getAll()) {
			if (languageToCheck.getName().equals(language.getName())) {

				return true;
			}
		}

		return false;
	}

	private boolean checkIfNameEmpty(ProgrammingLanguage language) {

		return language.getName().isBlank();

	}

}
