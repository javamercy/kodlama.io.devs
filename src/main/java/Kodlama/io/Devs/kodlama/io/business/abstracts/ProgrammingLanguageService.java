package Kodlama.io.Devs.kodlama.io.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.core.utilities.results.DataResult;
import Kodlama.io.Devs.kodlama.io.core.utilities.results.Result;
import Kodlama.io.Devs.kodlama.io.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	Result add(ProgrammingLanguage language);

	Result delete(ProgrammingLanguage language);

	Result update(ProgrammingLanguage language);

	DataResult<List<ProgrammingLanguage>> getAll();

	DataResult<ProgrammingLanguage> getById(int id);

}
