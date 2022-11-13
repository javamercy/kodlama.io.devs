package Kodlama.io.Devs.kodlama.io.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.business.requests.language.CreateLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.language.DeleteLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.language.UpdateLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.responses.language.GetAllLanguagesByDetailsResponse;
import Kodlama.io.Devs.kodlama.io.business.responses.language.GetAllLanguagesResponse;
import Kodlama.io.Devs.kodlama.io.business.responses.language.GetByIdLanguageResponse;

public interface LanguageService {

	void add(CreateLanguageRequest createLanguageRequest) throws Exception;

	void delete(DeleteLanguageRequest createLanguageRequest);

	void update(UpdateLanguageRequest createLanguageRequest);

	List<GetAllLanguagesByDetailsResponse> getAllByDetails();
	
	List<GetAllLanguagesResponse> getAll();

	GetByIdLanguageResponse getById(int id);


}
