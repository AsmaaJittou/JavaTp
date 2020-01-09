package Exercice5;

public class MainEX5 {
	
	
	public static void main(String[] args) {
		
	FileStatistics test = new FileStatistics("C:\\Users\\RAITOU-JITTOU-99\\Desktop\\TestJAVA\\test.txt");
	
	int caractere = test.getCharCount();
	int mot = test.getWordCount();
	int phrase = test.getSentanceCount();
	
	
	int paragraphe = test. getParagrapheCount();
	/* System.out.println("nbr de caracteres __ :" + caractere);
	 System.out.println("nbr de mots __ :" + mot);
	 System.out.println("nbr de phrases __ :" + phrase);
	 System.out.println("nbr de paragraphes __ :" + paragraphe);

	 test.saveCounts("C:\\Users\\RAITOU-JITTOU-99\\Desktop\\TestJAVA\\test2.txt");*/
	 
	 	 test.getDictionary();
	}

}
