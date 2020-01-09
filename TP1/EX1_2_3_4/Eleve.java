package EX1_2_3_4;

import java.util.ArrayList;

public  class Eleve implements Comparable<Eleve> {
		private String nom;
		private ArrayList<Integer> notes ;
		private double moyenne;
		
		
		public Eleve(String nom , ArrayList<Integer> notes) {
			super();
			this.nom = nom;
			this.notes = notes;
			this.moyenne=0;
			
			}	
		/***********************GETTERS*************************/
	
		public String getNom() {
			return nom;
		}
		public ArrayList<Integer> getListeNote() {
			return notes;
		}
		/**********************METHODS*************************/
		public void ajouterNote(Integer nt) {
			   this.notes.add(nt);
		
		}
		
		public double getMoyenne() {
			int tfo = 0 ;
			for (Integer nt : this.notes) {
				tfo+=nt;
			this.moyenne = tfo/this.notes.size();	
			}
			
		return this.moyenne;
	}
		
		
		public String toString() {
			return "Eleve [nom=" + nom + ", notes=" + notes + "size"+ notes.size() +", moyenne=" + this.moyenne + "]";
		}
		
		@Override	
		public int compareTo(Eleve autreEleve) {
		
			if(this.moyenne < autreEleve.moyenne) 
				return -1;
			else if(this.moyenne  > autreEleve.moyenne) 
				return 1;
			else 
			return 0; 
			
		}
		
		
	
			
		
	
			
	}


