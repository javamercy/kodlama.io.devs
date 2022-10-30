package Kodlama.io.Devs.kodlama.io.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	void add(ProgrammingLanguage language);

	void update(ProgrammingLanguage language);

	void delete(ProgrammingLanguage language);

	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(int id);
}
