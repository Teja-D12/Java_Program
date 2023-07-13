package Decoderr;
import java.util.*;
public class Decoder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char a=scan.next().charAt(0);
		int unicodeValue=Decoder(a);
			System.out.println("unicode value of " + a + unicodeValue);
		
		
	}
	public static char Decoder(char a)
	{
		return(char)a;
	
	}
}
