
public class LambdaExpressions{
	public static void main(String[] args){

		//this is the main thread
		
		// making the code efficient and reducing number of lines
		// Note*: runnable do not have a start method unlike thread class
		Thread t1 = new Thread(()->{
			
				for (int i=1; i<=5; i++){
					System.out.println("Hi");
					try{Thread.sleep(500);}catch(Exception e){};// wait for half second...pause mai thread for half second
					}
				
			});

		Thread t2 = new Thread(() ->
		{
				for (int i=1; i<=5; i++){
					System.out.println("Hello");
					try{Thread.sleep(500);}catch(Exception e){};// wait for half second...pause mai thread for half second
					}		
		});

		t1.start();
		t2.start();

	}

}
