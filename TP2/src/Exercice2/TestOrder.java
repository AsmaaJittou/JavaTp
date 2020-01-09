package Exercice2;

public class TestOrder extends Thread {
	int nbr;
	TestOrder (int nbr){ 
		this.nbr= nbr;
		
	}
	
	public void run() {
		for (int i =1;i<=this.nbr;i++) {
			System.out.println(" \n i m the \t"+ i+ "instance \n");
			 new Compteur("Asmaa" ,4).start();
			try {
				Thread.sleep(1000);
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	 public static void main(String[] args) {
		TestOrder order = new TestOrder(5);
		order.start();
		
	  
		  }

}
