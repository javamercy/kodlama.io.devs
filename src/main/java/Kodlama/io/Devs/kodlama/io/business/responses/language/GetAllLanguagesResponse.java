package Kodlama.io.Devs.kodlama.io.business.responses.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguagesResponse {
	
	private int id;
	private String name;
}
