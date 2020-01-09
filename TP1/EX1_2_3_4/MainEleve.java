package EX1_2_3_4;

import java.util.ArrayList;

public class MainEleve {
	 @SuppressWarnings("null")
	public static void main(String[] args) {
		 ArrayList<Integer> note1 = new  ArrayList<Integer> (); 
		 ArrayList<Integer> note2 = new  ArrayList<Integer> () ;
		 
		 note1.add(20);
		 note1.add(10);
		 note2.add(10);
		 note2.add(5);
		 
		 Eleve e1 = new Eleve("Asmaa",note1);
		 Eleve e2 = new Eleve("Soufiane", note2);
		 
			System.out.print(e1.compareTo(e2));
			System.out.print(e2.getMoyenne());
			/*  System.out.print(e1.toString());*/
		
		 
		
	 }
}
