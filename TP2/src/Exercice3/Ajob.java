package Exercice3;

public class Ajob implements Runnable{
     private Valeur myVal;
     private int i;
	public Ajob(Valeur myVal , int i ) {
		this.myVal= myVal;
		this.i=i;
	}
	public void run() {
		
	for(int i=0; i<this.i;i++) {
		add(this.myVal.getVal());
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	void add(int i) {
		this.i+=i;
	}
	
}
