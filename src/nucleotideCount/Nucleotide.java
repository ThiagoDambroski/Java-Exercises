package nucleotideCount;

public class Nucleotide {
	
	private int A,C,G,T;
	private String string;
	
	public Nucleotide(String string) {
		this.string = string;
	}

	public int getA() {
		return A;
	}


	public int getC() {
		return C;
	}

	

	public int getG() {
		return G;
	}

	

	public int getT() {
		return T;
	}

	
	public String readingString() {
		if(!this.string.matches("[ACGT]+")) {
			return "Error";
		}
		String[] array = this.string.toUpperCase().split("");
		for (String s : array) {
			switch (s) {
			case "A": {
				this.A++;
				break;
			}case "C": {
				this.C++;
				break;
			}case "G": {
				this.G++;
				break;
			}case "T": {
				this.T++;
				break;
			}
			
			}
		}
	
		
		return String.format("'A': %d 'C': %d 'G': %d 'T' %d  ", A,C,G,T);
	}

	
	
	
}
