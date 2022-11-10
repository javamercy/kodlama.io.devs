package Kodlama.io.Devs.kodlama.io.business.responses.framework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllFrameworksResponse {

	private int id;
	private int languageId;
	private String name;
}
