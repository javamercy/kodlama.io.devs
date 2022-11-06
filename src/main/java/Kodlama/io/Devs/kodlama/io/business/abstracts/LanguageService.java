package Kodlama.io.Devs.kodlama.io.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.DeleteLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.UpdateLanguageRequest;
import Kodlama.io.Devs.kodlama.io.business.responses.GetAllLanguagesResponse;
import Kodlama.io.Devs.kodlama.io.business.responses.SingleLanguageResponse;

public interface LanguageService {

	void add(CreateLanguageRequest createLanguageRequest);

	void delete(DeleteLanguageRequest createLanguageRequest);

	void update(UpdateLanguageRequest createLanguageRequest);

	List<GetAllLanguagesResponse> getAll();

	SingleLanguageResponse getById(int id);

}
