package cryptoSquare;

public class Main {

	public static void main(String[] args) {
		String str = "If man was meant to stay on the ground, god would have given us roots.";
		Encrpty en = new Encrpty(str);
		System.out.println(en.get());

	}

}
