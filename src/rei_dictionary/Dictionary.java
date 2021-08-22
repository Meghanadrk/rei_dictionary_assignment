package rei_dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

	public static void isEnglishWord(String inputWord) throws FileNotFoundException {
		Scanner s = new Scanner(new File( System.getProperty("user.dir")+"//dictionary.txt"));
		ArrayList<String> dictionary = new ArrayList<String>();
		while (s.hasNext()){
			dictionary.add(s.next());
		}
		
		ArrayList <String> matches = new ArrayList <String> ();

        for(String word : dictionary) {

            Boolean nonMatch = true;

            for( char chW : word.toCharArray() ) {

                String w = Character.toString(chW);

                if ( word.length() - word.replace(w, "").length() !=
                		inputWord.length() - inputWord.replace(w, "").length() ) {
                    nonMatch = false;
                    break;
                }
            }
            if (nonMatch) {
               matches.add( word );
            }
        }

        System.out.println(matches);
	}

}
