package Kodlama.io.Devs.kodlama.io.dataAccess.concretes.inMemory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.kodlama.io.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.kodlama.io.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;

	public InMemoryProgrammingLanguageRepository() {

		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "Java"));
		languages.add(new ProgrammingLanguage(2, "JavaScript"));
		languages.add(new ProgrammingLanguage(3, "C#"));
		languages.add(new ProgrammingLanguage(4, "Python"));
		languages.add(new ProgrammingLanguage(5, "Ruby"));
	}

	@Override
	public void add(ProgrammingLanguage language) {

		languages.add(language);

	}

	@Override
	public void update(ProgrammingLanguage language) {

		var index = languages.indexOf(language);

		var languageToUpdate = languages.get(index);

		languageToUpdate.setName(language.getName());

	}

	@Override
	public void delete(ProgrammingLanguage language) {

		languages.remove(language);

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		for (var language : languages) {

			if (language.getId() == id) {

				return language;

			}
		}

		return null;
	}

}
