package Kodlama.io.Devs.kodlama.io.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.kodlama.io.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
	

}
