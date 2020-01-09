package Exercice3;


public class Test {

	
	public static void main(String[] args) throws InterruptedException {
		  Valeur myVal = new Valeur(2);
		  Ajob job1 = new Ajob(myVal, 1);
		  Ajob job2 = new Ajob(myVal, -1);
		  new Thread(job1).start();
		  new Thread(job2).start();
		  myVal.toString();
		}
}
