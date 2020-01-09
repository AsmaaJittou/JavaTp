package Exercice2;

public class Compteur  extends Thread{
    String name; 
    int maxValue;
    
	public Compteur(String name, int maxValue) {
		this.name = name;
		this.maxValue = maxValue;
	}
	
	   public void run() { 
       	try {
   			for(int i=1;i <=maxValue;i++) {
   				System.out.print("le nom est :"+ this.name+", la valeur est : " +i +"\n");
   				Thread.sleep(100);
   			}
   		}catch(InterruptedException e){
   			return;
   			
   		}
       	
       
       }
	   public static void main(String[] args) {
		   new Compteur("Asmaa" ,4).start();
	  
		  }
  
}



