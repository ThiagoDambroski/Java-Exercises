package bobExercise;

public class StringHelper {
	
	private String input;
	
	public StringHelper(String input) {
		this.input = input;
	}
	
	public Questions typeOfInput() {
		String[] arr = this.input.split("");
		if(this.input.toUpperCase().equals(this.input) && !this.input.equals("")) {
			if(arr[arr.length - 1].equals("?")) {
				return Questions.QUESTION_YELL;
			}else {
				return Questions.YELL;
			}
		}else if(arr[arr.length - 1 ].equals("?")) {
			return Questions.QUESTION;
		}else if (input.replaceAll("\\s", "").equals("")) {
			return Questions.NOTHING;
		}else {
			return Questions.ELSE;
		}
	}

}
