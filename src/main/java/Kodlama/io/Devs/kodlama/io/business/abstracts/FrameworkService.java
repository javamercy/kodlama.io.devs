package Kodlama.io.Devs.kodlama.io.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.business.requests.framework.CreateFrameworkRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.framework.DeleteFrameworkRequest;
import Kodlama.io.Devs.kodlama.io.business.responses.framework.GetAllFrameworksResponse;

public interface FrameworkService {

	void add(CreateFrameworkRequest createFrameworkRequest);
	
	void delete(DeleteFrameworkRequest deleteFrameworkRequest);
	
	List<GetAllFrameworksResponse> getAll();

}
