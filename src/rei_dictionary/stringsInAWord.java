package rei_dictionary;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class stringsInAWord {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a String : ");
		String inputWord= sc.next();
		Dictionary.isEnglishWord(inputWord);
		sc.close();

	}

}
