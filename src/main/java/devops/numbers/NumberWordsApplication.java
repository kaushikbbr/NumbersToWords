package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void execute() {
		while( true ) {
			try {
				System.out.print( "Enter number (0 to exit): " ) ;
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
				if (number == 0) {
					System.out.println("Application stopped.");
					break;
				}	
				String output = numberWords.toWords(number);
				System.out.println( "The number in words is : " + output ) ;
			} catch ( NumberFormatException | IOException | ArrayIndexOutOfBoundsException e ) {
				//System.out.println( e ) ;
				System.out.println( "Invalid Input" ) ;
			}
		}
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
