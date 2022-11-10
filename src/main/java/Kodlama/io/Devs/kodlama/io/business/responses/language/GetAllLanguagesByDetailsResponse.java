package Kodlama.io.Devs.kodlama.io.business.responses.language;

import java.util.List;

import Kodlama.io.Devs.kodlama.io.business.responses.framework.GetAllFrameworksResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguagesByDetailsResponse {

	private int id;
	private String name;
	private List<GetAllFrameworksResponse> frameworks;

}
