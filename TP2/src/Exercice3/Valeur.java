package Exercice3;

public class Valeur {

	private int valeur;
	Valeur(int valeur){ 
		this.valeur=valeur;
	}
	public int getVal() {
		return(this.valeur);
	}
	
	public String toString() {
		return("la valeur est :\t" +getVal());
	}
}
