package Kodlama.io.Devs.kodlama.io.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	void add(ProgrammingLanguage language) throws Exception;

	void delete(ProgrammingLanguage language);

	void update(ProgrammingLanguage language);

	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(int id);

}
