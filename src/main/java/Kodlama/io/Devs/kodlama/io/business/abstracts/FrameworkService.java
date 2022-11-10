package Kodlama.io.Devs.kodlama.io.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.business.requests.framework.CreateFrameworkRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.framework.DeleteFrameworkRequest;
import Kodlama.io.Devs.kodlama.io.business.requests.framework.UpdateFrameworkRequest;
import Kodlama.io.Devs.kodlama.io.business.responses.framework.GetAllFrameworksResponse;
import Kodlama.io.Devs.kodlama.io.business.responses.framework.GetByIdFrameworkResponse;

public interface FrameworkService {

	void add(CreateFrameworkRequest createFrameworkRequest);

	void update(UpdateFrameworkRequest updateFrameworkRequest);

	void delete(DeleteFrameworkRequest deleteFrameworkRequest);

	List<GetAllFrameworksResponse> getAll();

	GetByIdFrameworkResponse getById(int id);

}
