package Kodlama.io.Devs.kodlama.io.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageRequest {

	private int id;
	private String name;
}
