package cryptoSquare;

import java.util.ArrayList;
import java.util.List;

public class Encrpty {
	
	private String str;
	private int c;
	private int r;
	private String[] array,encrptyArray;
	
	
	public Encrpty(String str) {
		this.str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "");
		setCAndR();
		generateArrays();
	}
	
	private void setCAndR() {
		int num = str.length();
		int n = 2;
		while(true) {
			if(n * (n - 1) >= num) {
				break;
			}
			n++;
		}
		this.c = n;
		this.r = n - 1;
		if((c * r) > num){
			for(int i = 0;i < (c * r) - num;i++) {
				this.str +=" ";
			}
		}
		
	}
	
	private void generateArrays() {
		array = new String[this.r];
		
		for(int i = 0; i < r; i++) {
			array[i] = str.substring(i * c, (i+1) * c);
		}
		encrptyArray = new String[this.c];
		for(int i = 0; i < c ; i++) {
			encrptyArray[i] = "";
			for (String string : array) {
				String[] arrayStr = string.split("");
				
				encrptyArray[i] += arrayStr[i];
			}
			
		}
		
		
		
	}
	
	
	public String get() {
		String srt = "";
		for (String strings : encrptyArray) {
			srt += strings;
			srt += "\n";
			
		}
		return  srt ; 
	}

}
