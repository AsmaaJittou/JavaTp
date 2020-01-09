package Exercice1;


public class ThreadCompte extends Thread{
	
	private String str;
	ThreadCompte(String str){
		this.str=str;
	}
	 public void print() {
		 if(this.str=="A") {
	        	try { 
	    			for(int i=1;i <= 4;i++) {
	    				System.out.print(" \n Thred A : \t" +i+ " \n");
	    				Thread.sleep(1000);
	    			}
	    		}catch(InterruptedException e){
	    			return;
	    			
	    		}
				}
				else if(this.str=="B") { 
					try {
		    			for(int i=4;i >= 1;i--) {
		    				System.out.print(" \n Thread B  : \t " +i+ "\n");
		    				Thread.sleep(1000);
		    			}
		    		}catch(InterruptedException e){
		    			return;
		    			
		    		}
				}
	 }
	public void run() {
		  this.print();
		
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadCompte tA = new ThreadCompte("A");
		ThreadCompte tB = new ThreadCompte("B");
		  tA.start();
		  
		  tB.start();
		
		}
}
	



