package atbashCipher;

public class Cipher {
	
	//26 letters
	private final String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");
	private final String[] invertAlpha = "zyxwvutsrqponmlkjihgfedcba".split("");
	
	
	private String[] decode;
	private int lenght;
	
	
	public Cipher(String decode, int lenght) {
		this.decode = decode.replaceAll("\\s", "").toLowerCase().split("");
		this.lenght = lenght;
	}
	
	public String solveatbashCipher() {
		if(decode.length % lenght != 0) {
			return "Error, the string should be divide in " + lenght + " letters";
		}
		String result = "";
		for (String c : decode) {
		
			int count = 0;
			for (String a : alpha) {

				if(c.equals(a)) {
					result += invertAlpha[count];
					break;
				}
				count++;
			}
		}
		
		
		
		return result;
	}
	
	
	
	

}
