package bobExercise;

public class Bob {
	
	private StringHelper helper;
	
	public Bob(String input) {
		helper = new StringHelper(input);
	}
	
	public String response() {
		String response = null;
		
		switch (helper.typeOfInput()) {
		case QUESTION: {
			response = "Sure.";	
			break;
		}
		case QUESTION_YELL: {
			response = "Whoa, chill out!";
			break;
		}
		case YELL: {
			response = "Calm down, I know what I'm doing!";
			break;
		}case NOTHING: {
			response = "Fine. Be that way!";
			break;
		}case ELSE: {
			response = "Whatever.";
			break;
		}
		
		}
		return response;
	}

}
