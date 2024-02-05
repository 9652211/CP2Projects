import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
	
	public static void main(String[] args) {
		String input = "Welcome to the Caesar Cipher!";
		System.out.println(input);
		System.out.println(encrypt(input, 5));
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
