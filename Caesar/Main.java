import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		try {
			File input = new File("/Users/9652211/eclipse-workspace/Caesar/src/INPUT.txt");
			FileReader reader = new FileReader(input);
			int c;
			String inputString = "";
			while ((c = reader.read()) !=-1) {
				char ch = (char) c;
				inputString = inputString+ch;
			}
			System.out.println(inputString);
			System.out.println(encrypt(inputString, 5));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	public static String encrypt(String s, int shift) {
		String cipher = "";
		for(int i=0; i<s.length(); i++) {
			boolean match = false;
			for(int j=0; j<alphabet.length; j++) {
				if(s.charAt(i)==alphabet[j]) {
					cipher = cipher + alphabet[(j+shift)%alphabet.length];
					match = true;
				}
			}
			if(!match) {
				cipher = cipher + s.charAt(i);
			}
		}
		return cipher;
	}
}
