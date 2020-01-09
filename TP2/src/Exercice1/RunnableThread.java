package Exercice1;

public class RunnableThread implements Runnable{
	private String str; 
	public RunnableThread(String str){
		this.str=str;
			
		}
		 
	  public  void  print() {
		  if(this.str=="A") {
	        	try { 
	    			for(int i=1;i <= 1000;i++) {
	    				System.out.print(" \n Thred A : \t" +i+ " \n");
	    				Thread.sleep(1000);
	    			}
	    		}catch(InterruptedException e){
	    			return;
	    			
	    		}
				}
				else if(this.str=="B") { 
					try {
		    			for(int i=1000;i >= 1;i--) {
		    				System.out.print(" \n Thread B  : \t " +i+ "\n");
		    				Thread.sleep(1000);
		    			}
		    		}catch(InterruptedException e){
		    			return;
		    			
		    		}
				}
	  }
	   
		public  void run(){
			this.print();
			
		}

		public static void main(String[] args) throws InterruptedException {
			Runnable A = new RunnableThread("A");
			Thread tfo =new Thread(A);
			tfo.start();
			tfo.join();
			
			Runnable B = new RunnableThread("B");
			new Thread(B).start();
			}
}





