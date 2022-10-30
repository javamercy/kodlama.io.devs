package Kodlama.io.Devs.kodlama.io.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.kodlama.io.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.kodlama.io.core.utilities.results.DataResult;
import Kodlama.io.Devs.kodlama.io.core.utilities.results.ErrorResult;
import Kodlama.io.Devs.kodlama.io.core.utilities.results.Result;
import Kodlama.io.Devs.kodlama.io.core.utilities.results.SuccessDataResult;
import Kodlama.io.Devs.kodlama.io.core.utilities.results.SuccessResult;
import Kodlama.io.Devs.kodlama.io.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.kodlama.io.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public Result add(ProgrammingLanguage language) {

		if (checkIfNameEmpty(language)) {
			return new ErrorResult("Name cannot be empty!");
		}

		if (checkIfNameExists(language)) {

			return new ErrorResult("Name already exists!");
		}

		languageRepository.add(language);
		return new SuccessResult("Programa dili başarıyla eklendi.");

	}

	@Override
	public Result delete(ProgrammingLanguage language) {

		languageRepository.delete(language);
		return new SuccessResult("Silme işlemi başarılı!");

	}

	@Override
	public Result update(ProgrammingLanguage language) {

		languageRepository.update(language);
		return new SuccessResult("Güncelleme işlemi başarılı");

	}

	@Override
	public DataResult<List<ProgrammingLanguage>> getAll() {

		return new SuccessDataResult<List<ProgrammingLanguage>>(languageRepository.getAll(), "Data listelendi.");

	}

	@Override
	public DataResult<ProgrammingLanguage> getById(int id) {

		return new SuccessDataResult<ProgrammingLanguage>(languageRepository.getById(id),
				"Data filtreye göre listelendi.");
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
