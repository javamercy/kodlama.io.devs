package Kodlama.io.Devs.kodlama.io.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.kodlama.io.entities.concretes.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
	

}
