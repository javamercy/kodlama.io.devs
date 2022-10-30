package Kodlama.io.Devs.kodlama.io.core.utilities.results;

public class Result {

	public boolean success;
	public String message;

	public Result(boolean success, String message) {

		this(success);
		this.message = message;
	}

	public Result(boolean success) {
		this.success = success;
	}
}
